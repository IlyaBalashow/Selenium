package pur_eb.emc_test.lib;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GenerateDocNum {

    public static String generateDocNum(String docNumCounterPath, String docNumPath) throws Exception {
        //Создание объекта BufferedReader
        BufferedReader reader = new BufferedReader(new FileReader(docNumCounterPath));

        //Читаем и разделяем номер на части, где docNum_a = ДДММ, а docNum_b - двузначный счетчик в разрезе дня
        String docNumCounter = reader.readLine();
        String docNum_a = docNumCounter.substring(0, 4);
        String docNum_b = docNumCounter.substring(4);

        String docNum;

        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMM");

        if (docNum_a.equals(dateFormat.format(new Date()))) {
            if (Integer.valueOf(docNum_b) < 9) {
                docNum = docNum_a + 0 + (Integer.valueOf(docNum_b) + 1);
            } else {
                docNum = docNum_a + (Integer.valueOf(docNum_b) + 1);
            }
        } else {
            docNum_a = dateFormat.format(new Date());
            docNum_b = "01";
            docNum = docNum_a + docNum_b;
        }
        System.out.println(docNum);

        //Создание объекта BufferedWriter
        BufferedWriter writer = new BufferedWriter(new FileWriter(docNumCounterPath));
        BufferedWriter writer_2 = new BufferedWriter(new FileWriter(docNumPath));

        //Запишем в файл
        writer.write(docNum);
        writer_2.write(docNum);

        reader.close();
        writer.close();
        writer_2.close();

        return docNum;
    }
}
