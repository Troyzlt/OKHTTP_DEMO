import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import okhttp3.*;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @author jerry.hu 补充规约
 */
public class OkHttpUtils {

    private static final OkHttpClient OK_HTTP_CLIENT = new OkHttpClient.Builder().connectTimeout(120, TimeUnit.SECONDS)
            .readTimeout(120, TimeUnit.SECONDS).writeTimeout(120, TimeUnit.SECONDS).build();

    public static Response syncCall(Request request) throws Exception {

        try {
            return OK_HTTP_CLIENT.newCall(request).execute();

        } catch (IOException e) {
            throw new RuntimeException("Http服务请求异常");
        }
    }

    public String POSTRequest(String url, JSONObject requestBody) throws Exception {
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"),requestBody.toJSONString());
        Request request = new Request.Builder().url(url).post(body).build();
        Response response = OkHttpUtils.syncCall(request);
        String string = response.body().string();
        return string;
    }

    public String GETRequest(String url, Map<String, String> paramMap) throws Exception {
        String param;
        if (Objects.isNull(paramMap) || paramMap.size() == 0){
            param = "";
        }else {
            param = "?";
        }
        List<String> strings = new ArrayList<String>(paramMap.keySet());
        for (int i = 0; i < strings.size(); i++) {
            if (i == 0){
                param += strings.get(i) + "=" + paramMap.get(strings.get(i));
            }else {
                param += "&" + strings.get(i) + "=" + paramMap.get(strings.get(i));
            }
        }
        url += param;
        Request request = new Request.Builder().header("cookie", "store_link_token=2.00079b389992acbb021632862bdb48e669").url(url).get().build();
        Response response = OkHttpUtils.syncCall(request);
        String string = response.body().string();
        return string;
    }

    public String GETRequest2(String url, Map<String, String> paramMap) throws Exception {
        String param;
        if (Objects.isNull(paramMap) || paramMap.size() == 0){
            param = "";
        }else {
            param = "?";
        }
        if (Objects.nonNull(paramMap) && paramMap.size() != 0){
            List<String> strings = new ArrayList<String>(paramMap.keySet());
            for (int i = 0; i < strings.size(); i++) {
                if (i == 0){
                    param += strings.get(i) + "=" + paramMap.get(strings.get(i));
                }else {
                    param += "&" + strings.get(i) + "=" + paramMap.get(strings.get(i));
                }
            }
        }
        url += param;
        Request request = new Request.Builder().header("cookie", "store_link_token=2.003d1110f6a826936d2cb8ae44ccdd044d").url(url).get().build();
        Response response = OkHttpUtils.syncCall(request);
        String string = response.body().string();
        return string;
    }

    public String GETRequest3(String url, Map<String, String> paramMap) throws Exception {
        String param;
        if (Objects.isNull(paramMap) || paramMap.size() == 0){
            param = "";
        }else {
            param = "?";
        }
        if (Objects.nonNull(paramMap) && paramMap.size() != 0){
            List<String> strings = new ArrayList<String>(paramMap.keySet());
            for (int i = 0; i < strings.size(); i++) {
                if (i == 0){
                    param += strings.get(i) + "=" + paramMap.get(strings.get(i));
                }else {
                    param += "&" + strings.get(i) + "=" + paramMap.get(strings.get(i));
                }
            }
        }
        url += param;
        Request request = new Request.Builder().header("cookie", "store_link_token=2.0013153e95860be6cd02bc802779c50ee7").url(url).get().build();
        Response response = OkHttpUtils.syncCall(request);
        String string = response.body().string();
        return string;
    }


    public List<String> batchGET(String url, List<Map<String, String>> paremMaps){
        List<String> resultList = Lists.newArrayList();
        paremMaps.forEach(map -> {
            try {
                System.out.println(this.GETRequest(url, map));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        JsonToExcel.Export2Excel(JSONArray.parseArray(resultList.toString()));
        return resultList;
    }

    public List<String> batchPOST(String url, List<JSONObject> requestBodyList){
        List<String> resultList = Lists.newArrayList();
        requestBodyList.forEach(body -> {
            try {
                resultList.add(this.POSTRequest(url, body));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        return resultList;
    }
}
