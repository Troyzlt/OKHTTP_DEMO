import com.google.common.collect.Lists;

import java.util.List;

public class main3 {
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


        while (true){
            String s = utils.GETRequest3("http://i.shandian.test.lianjia.com/server/user/info", null);
            System.out.println(s);
        }

//        standardDateToDate("AUG-18");

    }
}
