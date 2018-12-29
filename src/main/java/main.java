import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.hash.Hashing;
import com.google.common.io.BaseEncoding;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class main {

    public static void main(String[] args) throws Exception {
//        Map<String, String[]> map = new HashMap<>();
//        map.put("grant_type", new String[]{"client_credentials"});
//        map.put("client_id", new String[]{"store_ebs_serverDuuYmsyjY1kIRM"});
//        map.put("nonce", new String[]{"ef30f9a0-e67b-42dc-9253-4d1e908def5b"});
//        map.put("timestamp", new String[]{"1535513431154"});
//        String get = calculateSignature("Ue5I1nLlyQv-H91BbZw1vE9Cku2oRynQm6ujyBxlQX-elzTor2evP7g1Ku4gDq8o", "/v1/oauth/token", "POST", map);
//        System.out.println(get);

        OkHttpUtils utils = new OkHttpUtils();

        List<String> list = Lists.newArrayList();



        List<Map<String, String>> params = Lists.newArrayList();

        list.forEach(code -> {
            Map map = Maps.newHashMap();
            map.put("paymentPlanCode", code);
            map.put("status", "1");
            params.add(map);
        });

        List<String> strings = utils.batchGET("http://i.shandian.lianjia.com/admin/updatePaymentStatus", params);

//        standardDateToDate("AUG-18");

    }

    public static Date standardDateToDate(String periodName){
        String[] split = periodName.split("-");
        int year = Integer.parseInt("20" + split[1]);
        int month = Month.getMonthByDesc(split[0]).getMonth();
        LocalDate of = LocalDate.of(year, month, 1);
        System.out.println(of);
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime zdt = of.atStartOfDay(zoneId);
        return Date.from(zdt.toInstant());
    }

    private static String calculateSignature(String clientSecret, String requestPath,
                                             String httpMethod, Map<String, String[]> requestParams) {
        // requestParams包括公共参数(nonce,timestamp)和请求参数
        // 第一步，将所有参数按字典顺序排序排序并拼接
        int paramSize = requestParams.size();
        String[] paramNames = requestParams.keySet().toArray(new String[paramSize]);
        Arrays.sort(paramNames);

        StringBuilder sb =
                new StringBuilder(paramSize * 30 + requestPath.length() + httpMethod.length());
        sb.append(requestPath).append(httpMethod.toUpperCase());
        // 拼接所有字符串
        for (String paramName : paramNames) {
            sb.append(paramName).append('=');
            String[] valueArr = requestParams.get(paramName);
            if (valueArr == null || valueArr.length == 0) {
                sb.append("&");
                continue;
            }
            // 多个参数值，用英文逗号连接
            for (int i = 0; i < valueArr.length; i++) {
                // 如果值为null，则转换为空字符串
                sb.append(Strings.nullToEmpty(valueArr[i]));
                if ((i + 1) != (valueArr.length)) {
                    sb.append(',');
                }
            }
            sb.append("&");
        }

        // 2. 将拼接的字符串用HMAC-SHA256加密，使用guava的hmac
        byte[] mac = Hashing.hmacSha256(clientSecret.getBytes(StandardCharsets.UTF_8))
                .hashString(sb.subSequence(0, sb.length() - 1), StandardCharsets.UTF_8).asBytes();

        // 3. 使用Base64URL将字节数组转换为字符串
        return BaseEncoding.base64Url().encode(mac);
    }
}
