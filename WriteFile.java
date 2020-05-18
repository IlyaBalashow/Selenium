package pur_eb.emc_test.lib;

import java.io.BufferedWriter;

public class WriteFile {

    public static String readFile(String filePath, String value) throws Exception {
        //Создание объекта BufferedWriter
        BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(filePath));

        //Записываем
        writer.write(value);
        writer.close();

        return value;
    }
}
