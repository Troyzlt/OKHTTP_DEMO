import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class main2 {
    public static void main(String[] args) throws Exception {
//        Map<String, String[]> map = new HashMap<>();
//        map.put("grant_type", new String[]{"client_credentials"});
//        map.put("client_id", new String[]{"store_ebs_serverDuuYmsyjY1kIRM"});
//        map.put("nonce", new String[]{"ef30f9a0-e67b-42dc-9253-4d1e908def5b"});
//        map.put("timestamp", new String[]{"1535513431154"});
//        String get = calculateSignature("Ue5I1nLlyQv-H91BbZw1vE9Cku2oRynQm6ujyBxlQX-elzTor2evP7g1Ku4gDq8o", "/v1/oauth/token", "POST", map);
//        System.out.println(get);

        double sum = 5381.81 + 5381.82;
        BigDecimal bigDecimal = new BigDecimal("5381.81");
        BigDecimal bigDecimal2 = new BigDecimal("5381.82");
        System.out.println(sum);
        System.out.println(bigDecimal.add(bigDecimal2));
//        standardDateToDate("AUG-18");
        System.out.println(StringUtils.isBlank(""));

    }
}
