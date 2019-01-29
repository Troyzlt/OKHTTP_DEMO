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

        list.add("YTKDFK201808280010");
        list.add("YTKDFK201808280011");
        list.add("YTKDFK201810120001");
        list.add("YTKDFK201808240021");
        list.add("YTKDFK201808240022");
        list.add("YTKDFK201808240023");
        list.add("YTXQFK201808290019");
        list.add("YTXQFK201808290020");
        list.add("YTKDFK201805020008");
        list.add("YTKDFK201811160001");
        list.add("YTKDFK201811160002");
        list.add("YTKDFK201808280043");
        list.add("YTKDFK201808290112");
        list.add("YTKDFK201808290113");
        list.add("YTKDFK201808290114");
        list.add("YTKDFK201808290115");
        list.add("YTKDFK201808290050");
        list.add("YTKDFK201808290051");
        list.add("YTKDFK201808290052");
        list.add("YTKDFK201808280017");
        list.add("YTKDFK201808280018");
        list.add("YTKDFK201808280019");
        list.add("YTXQFK201810110009");
        list.add("YTKDFK201808280020");
        list.add("YTKDFK201808280021");
        list.add("YTKDFK201808280022");
        list.add("YTKDFK201808280023");
        list.add("YTKDFK201811160021");
        list.add("YTKDFK201811160022");
        list.add("YTKDFK201806050001");
        list.add("YTKDFK201808240040");
        list.add("YTKDFK201808240041");
        list.add("YTKDFK201808240042");
        list.add("YTKDFK201808290039");
        list.add("YTKDFK201808290040");
        list.add("YTKDFK201808290041");
        list.add("YTXQFK201808290024");
        list.add("YTXQFK201808290025");
        list.add("YTXQFK201808290026");
        list.add("YTXQFK201808290027");
        list.add("YTKDFK201808290075");
        list.add("YTKDFK201808290076");
        list.add("YTKDFK201808290069");
        list.add("YTKDFK201808290081");
        list.add("YTKDFK201808290082");
        list.add("YTKDFK201808290083");
        list.add("YTKDFK201805020015");
        list.add("YTKDFK201808240032");
        list.add("YTKDFK201808240033");
        list.add("YTKDFK201808240034");
        list.add("YTKDFK201808290084");
        list.add("YTKDFK201808290085");
        list.add("YTKDFK201811140002");
        list.add("YTKDFK201808290031");
        list.add("YTKDFK201808290032");
        list.add("YTKDFK201808290033");
        list.add("YTKDFK201808290087");
        list.add("YTKDFK201808290088");
        list.add("YTKDFK201808290089");
        list.add("YTKDFK201808290055");
        list.add("YTKDFK201808290056");
        list.add("YTKDFK201808290057");
        list.add("YTKDFK201805020018");
        list.add("YTKDFK201808290138");
        list.add("YTKDFK201808290139");
        list.add("YTKDFK201808290001");
        list.add("YTKDFK201808290002");
        list.add("YTKDFK201808290003");
        list.add("YTKDFK201808290004");
        list.add("YTKDFK201808270004");
        list.add("YTKDFK201808280030");
        list.add("YTKDFK201808270001");
        list.add("YTKDFK201808270002");
        list.add("YTKDFK201808270003");
        list.add("YTXQFK201809190001");
        list.add("YTKDFK201808290016");
        list.add("YTKDFK201808290017");
        list.add("YTKDFK201808290022");
        list.add("YTKDFK201808290018");
        list.add("YTKDFK201808290019");
        list.add("YTGQFK201806020013");
        list.add("YTKDFK201808270028");
        list.add("YTXQFK201808240005");
        list.add("YTXQFK201811150002");
        list.add("YTXQFK201811150003");
        list.add("YTXQFK201811150004");
        list.add("YTXQFK201811150005");
        list.add("YTKDFK201808290060");
        list.add("YTKDFK201808290061");
        list.add("YTKDFK201808290062");
        list.add("YTKDFK201808290044");
        list.add("YTKDFK201808290045");
        list.add("YTKDFK201808290046");
        list.add("YTKDFK201808290063");
        list.add("YTKDFK201808290064");
        list.add("YTKDFK201808290065");
        list.add("YTXQFK201808280001");
        list.add("YTKDFK201808270022");
        list.add("YTKDFK201808290120");
        list.add("YTKDFK201808290121");
        list.add("YTKDFK201808290122");
        list.add("YTKDFK201808280035");
        list.add("YTKDFK201808280036");
        list.add("YTKDFK201808280037");
        list.add("YTKDFK201808280061");
        list.add("YTKDFK201808280062");
        list.add("YTXQFK201808280006");
        list.add("YTKDFK201808280063");
        list.add("YTXQFK201808280007");
        list.add("YTGQFK201806020007");
        list.add("YTKDFK201808270037");
        list.add("YTXQFK201808290016");
        list.add("YTXQFK201808290017");
        list.add("YTXQFK201808290018");
        list.add("YTKDFK201808290133");
        list.add("YTKDFK201808290134");
        list.add("YTKDFK201808280001");
        list.add("YTKDFK201808280002");
        list.add("YTKDFK201808280003");
        list.add("YTKDFK201812180001");
        list.add("YTKDFK201812180002");
        list.add("YTKDFK201812180003");
        list.add("YTKDFK201808280012");
        list.add("YTKDFK201808280013");
        list.add("YTKDFK201808280014");
        list.add("YTKDFK201808280015");
        list.add("YTKDFK201808290034");
        list.add("YTKDFK201808290035");
        list.add("YTKDFK201808290036");
        list.add("YTKDFK201808290143");
        list.add("YTKDFK201808290144");
        list.add("YTKDFK201808290145");
        list.add("YTWXFK201808290001");
        list.add("YTWXFK201808290002");
        list.add("YTWXFK201808290003");
        list.add("YTXQFK201808290004");
        list.add("YTXQFK201808290005");
        list.add("YTXQFK201808290006");
        list.add("YTXQFK201808290007");
        list.add("YTXQFK201808290008");
        list.add("YTKDFK201808270014");
        list.add("YTKDFK201808270015");
        list.add("YTKDFK201808270016");
        list.add("YTKDFK201808020001");
        list.add("YTKDFK201808290047");
        list.add("YTKDFK201808290048");
        list.add("YTKDFK201808290049");
        list.add("YTKDFK201808280078");
        list.add("YTKDFK201808280079");
        list.add("YTKDFK201808280080");
        list.add("YTKDFK201808270031");
        list.add("YTGQFK201806020010");
        list.add("YTKDFK201808240001");
        list.add("YTKDFK201811160006");
        list.add("YTKDFK201811160007");
        list.add("YTKDFK201811160008");
        list.add("YTKDFK201811160009");
        list.add("YTKDFK201811160010");
        list.add("YTKDFK201811160015");
        list.add("YTKDFK201811160011");
        list.add("YTKDFK201811160012");
        list.add("YTKDFK201811160013");
        list.add("YTKDFK201811160014");
        list.add("YTXQFK201808240008");
        list.add("YTXQFK201808240009");
        list.add("YTKDFK201808240043");
        list.add("YTKDFK201808240044");
        list.add("YTKDFK201808240045");
        list.add("YTKDFK201808240046");
        list.add("YTKDFK201808240016");
        list.add("YTKDFK201808240017");
        list.add("YTKDFK201808240018");
        list.add("YTKDFK201808280025");
        list.add("YTKDFK201808280026");
        list.add("YTKDFK201808280069");
        list.add("YTKDFK201808280070");
        list.add("YTKDFK201808280071");
        list.add("YTKDFK201808270007");
        list.add("YTKDFK201808270008");
        list.add("YTKDFK201808270009");
        list.add("YTKDFK201808270010");
        list.add("YTKDFK201808270011");
        list.add("YTKDFK201808270012");
        list.add("YTKDFK201808270013");
        list.add("YTKDFK201808280081");
        list.add("YTKDFK201808280082");
        list.add("YTKDFK201808280083");
        list.add("YTKDFK201808280064");
        list.add("YTKDFK201808280065");
        list.add("YTKDFK201808290090");
        list.add("YTKDFK201808290091");
        list.add("YTKDFK201808290092");
        list.add("YTKDFK201808280051");
        list.add("YTKDFK201808280052");
        list.add("YTKDFK201808280053");
        list.add("YTXQFK201808020001");
        list.add("YTKDFK201808280004");
        list.add("YTKDFK201808280005");
        list.add("YTKDFK201808280006");
        list.add("YTKDFK201808240004");
        list.add("YTKDFK201808240005");
        list.add("YTKDFK201808240006");
        list.add("YTXQFK201811160001");
        list.add("YTXQFK201808240001");
        list.add("YTKDFK201808280038");
        list.add("YTKDFK201808280039");
        list.add("YTKDFK201808280040");
        list.add("YTKDFK201810300001");
        list.add("YTKDFK201808240029");
        list.add("YTKDFK201808240030");
        list.add("YTKDFK201808240031");
        list.add("YTKDFK201808280084");
        list.add("YTKDFK201808280085");
        list.add("YTKDFK201808280086");
        list.add("YTKDFK201808280089");
        list.add("YTKDFK201808280090");
        list.add("YTKDFK201808280091");
        list.add("YTKDFK201808240009");
        list.add("YTKDFK201808240010");
        list.add("YTKDFK201808240011");
        list.add("YTKDFK201808290066");
        list.add("YTKDFK201808280075");
        list.add("YTKDFK201808280076");
        list.add("YTKDFK201808280077");
        list.add("YTKDFK201808290155");
        list.add("YTKDFK201808290156");
        list.add("YTKDFK201808290157");
        list.add("YTKDFK201808270034");
        list.add("YTGQFK201806020004");
        list.add("YTXQFK201811160002");
        list.add("YTXQFK201811160003");
        list.add("YTXQFK201811160004");
        list.add("YTXQFK201809190005");
        list.add("YTKDFK201808280056");
        list.add("YTKDFK201808280057");
        list.add("YTKDFK201808280058");
        list.add("YTKDFK201808280059");
        list.add("YTKDFK201808280060");
        list.add("YTKDFK201805020023");
        list.add("YTKDFK201808290093");
        list.add("YTKDFK201808290094");
        list.add("YTKDFK201808290095");
        list.add("YTKDFK201806150001");
        list.add("YTKDFK201808270020");
        list.add("YTKDFK201808270021");
        list.add("YTXQFK201810260001");
        list.add("YTKDFK201808290152");
        list.add("YTKDFK201808290153");
        list.add("YTKDFK201808290154");
        list.add("YTKDFK201808290023");
        list.add("YTKDFK201808290024");
        list.add("YTKDFK201805020001");
        list.add("YTKDFK201808290147");
        list.add("YTKDFK201808290148");
        list.add("YTXQFK201808290014");
        list.add("YTXQFK201808290015");
        list.add("YTXQFK201808240006");
        list.add("YTXQFK201808240007");
        list.add("YTKDFK201811160016");
        list.add("YTKDFK201808280092");
        list.add("YTKDFK201808280093");
        list.add("YTKDFK201808280094");
        list.add("YTKDFK201808290011");
        list.add("YTKDFK201808290012");
        list.add("YTKDFK201808290013");
        list.add("YTKDFK201808280048");
        list.add("YTKDFK201808280049");
        list.add("YTKDFK201808280050");
        list.add("YTXQFK201809280001");
        list.add("YTKDFK201808270025");
        list.add("YTGQFK201806020016");
        list.add("YTXQFK201808290009");
        list.add("YTXQFK201808290010");
        list.add("YTXQFK201808290011");
        list.add("YTXQFK201808290012");
        list.add("YTKDFK201808290125");
        list.add("YTKDFK201808290126");
        list.add("YTKDFK201808290127");
        list.add("YTKDFK201808290096");
        list.add("YTKDFK201808290097");
        list.add("YTKDFK201808290098");
        list.add("YTXQFK201808290001");
        list.add("YTKDFK201810300013");
        list.add("YTKDFK201810300007");
        list.add("YTKDFK201812280001");
        list.add("YTKDFK201808290128");
        list.add("YTKDFK201808290129");
        list.add("YTKDFK201808290099");
        list.add("YTKDFK201808290100");
        list.add("YTKDFK201808290101");
        list.add("YTKDFK201808290117");
        list.add("YTKDFK201808290118");
        list.add("YTKDFK201808290119");
        list.add("YTXQFK201808290033");
        list.add("YTXQFK201808290034");
        list.add("YTXQFK201808290035");
        list.add("YTXQFK201808290036");
        list.add("YTXQFK201808290037");
        list.add("YTXQFK201808290038");
        list.add("YTXQFK201808290039");
        list.add("YTXQFK201809280005");
        list.add("YTXQFK201808290030");
        list.add("YTXQFK201808290031");
        list.add("YTKDFK201805020012");
        list.add("YTKDFK201805020005");
        list.add("YTKDFK201805020002");
        list.add("YTKDFK201808240024");
        list.add("YTKDFK201808240025");


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
