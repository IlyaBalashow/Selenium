package pur_eb.emc_test.lib;

import java.io.BufferedReader;

public class ReadFile {

    public static String readFile(String filePath) throws Exception {
        //Создание объекта BufferedReader
        BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath));

        //Читаем
        String value = reader.readLine();
        reader.close();

        return value;
    }
}
