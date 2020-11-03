package com.demo.demo;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.util.Iterator;

/**
 * @author Jiang
 * @version V1.0
 * @Package com.demo.demo
 * @date 2020/10/20 21:54
 */
@SpringBootTest
public class ExcelTest {

    @Test
    public void test1(){
        try {
            FileInputStream inputStream = new FileInputStream("C:\\Users\\___________Lock\\Desktop\\FirstTests.xlsx");
            XSSFWorkbook sheets = new XSSFWorkbook(inputStream);
            Iterator<Sheet> iterator = sheets.sheetIterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next().getSheetName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
