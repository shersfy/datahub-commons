package org.shersfy.datahub.commons.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;
import org.shersfy.datahub.commons.utils.FileUtil.FileSizeUnit;

public class TestCases {
    
    @Test
    public void test01() throws IOException{
        String filename = "C:\\Users\\shers\\Desktop\\kafka-logs\\application.2018-08-14.log";
        File file = new File(filename);
        
        StringBuilder cache = new StringBuilder(0);
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
        int read = 0;
        while(reader.ready()) {
            read++;
            cache.append(reader.readLine()).append("\n");
            if(read%100==0) {
                double size = FileSizeUnit.countSize(cache.toString().getBytes().length, FileSizeUnit.MB);
                System.out.println(size+" mb");
            }
        }
        reader.close();
    }
    

}
