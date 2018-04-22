package com.ligaoxiang.utils;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import com.ligaoxiang.entity.Student;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;

public class CsvUtil {

    /**
     * 读取文件内容
     * @param fileName
     * @return
     */
    public List<Student> readCSV(String fileName) {

        List<Student> list = new LinkedList<>();
        try {
            CsvReader cv = new CsvReader(fileName, ',', Charset.forName("UTF-8"));
            cv.readHeaders();
            while (cv.readRecord()) {
                String line = cv.getRawRecord();
                String[] strArray = line.split(",");
                Student student = new Student(strArray[0], strArray[1], Integer.valueOf(strArray[2]), Double.valueOf(strArray[3]));
                list.add(student);
            }
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.out.println("FileNotFoundException" + e);
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("IOException" + e);
        }
        finally {
            return list;
        }

    }

    /**
     * 写入文件
     * @param list
     * @param fileName
     */
    public void writeCSV(List<Student> list, String fileName) {

        try {
            CsvWriter cw = new CsvWriter(fileName, ',', Charset.forName("UTF-8"));
            cw.writeRecord(new String[]{"学号", "姓名", "年龄", "成绩"});
            for (Student student: list) {
                String[] str = new String[]{student.getStudentID(), student.getName(), String.valueOf(student.getAge()), String.valueOf(student.getScore())};
                cw.writeRecord(str);
            }
            cw.close();
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("IOException" + e);
        }

    }
}
