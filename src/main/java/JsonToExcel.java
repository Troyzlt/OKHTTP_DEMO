import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class JsonToExcel {



    public static void Export2Excel(JSONArray jsonArray) {

        HSSFWorkbook workbook = new HSSFWorkbook();// 创建一个Excel文件

        HSSFSheet sheet = workbook.createSheet();// 创建一个Excel的Sheet

        HSSFCellStyle style = workbook.createCellStyle();

        //style.setFillBackgroundColor(HSSFColor.BLUE_GREY.index);

        HSSFRow titleRow = sheet.createRow(0);

        List<JSONObject> jsonObjects = JSONArray.parseArray(jsonArray.toJSONString(), JSONObject.class);

        for (int i = 0; i < jsonObjects.size(); i++) {
            JSONObject jsonObject = jsonObjects.get(i);
            if (i == 0){
                //第一条，生成表头
                ArrayList<String> strings = new ArrayList<>(jsonObject.keySet());
                for (int i1 = 0; i1 < strings.size(); i1++) {
                    titleRow.createCell(i1).setCellValue(strings.get(i1));
                }
                HSSFRow row = sheet.createRow(i + 1);
                for(int i1 = 0; i1 < strings.size(); i1++){
                    row.createCell(i1).setCellValue(jsonObject.get(strings.get(i1)).toString());
                }
            }else {
                ArrayList<String> strings = new ArrayList<>(jsonObject.keySet());
                HSSFRow row = sheet.createRow(i + 1);
                for(int i1 = 0; i1 < strings.size(); i1++){
                    row.createCell(i1).setCellValue(jsonObject.get(strings.get(i1)).toString());
                }
            }
        }

        titleRow.setRowStyle(style);

        try {
            FileOutputStream fos = new FileOutputStream("a.xls");
            workbook.write(fos);
            fos.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }



}