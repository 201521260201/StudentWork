package com.ligaoxiang.utils;

import com.ligaoxiang.entity.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class CsvUtilTest {
    private CsvUtil csvUtil = null;
    private List<Student> list = null;

    @Before
    public void setUp() {
        csvUtil = new CsvUtil();
        list = new LinkedList<>();
        list.add(new Student("02", "张三", 18, 90.0));
        list.add(new Student("04", "王五", 24, 80.0));
        list.add(new Student("01", "李四", 20, 85.0));
        list.add(new Student("03", "马六", 15, 87.5));
        list.add(new Student("05", "周七", 22, 98.0));
        csvUtil.writeCSV(list, "CsvFiles/csvUtilTest/测试题目.csv");
    }

    @Test
    public void readCSV() {
        List<Student> read1 = csvUtil.readCSV("CsvFiles/csvUtilTest/测试题目.csv");
        assertEquals(list, read1);
        System.out.println("\n读取文件的测试结果:");
        for(Student student: read1) {
            System.out.println(student);
        }

        List<Student> read2 = csvUtil.readCSV("CsvFiles/csvUtilTest/不存在.csv");
        assertEquals(new LinkedList<Student>(), read2);
        System.out.println("\n读取文件的测试结果:");
        for(Student student: read2) {
            System.out.println(student);
        }
    }

    @Test
    public void writeCSV() {
        List<Student> writeList = new LinkedList<>();
        writeList.add(new Student("01", "一一", 22, 90.0));
        writeList.add(new Student("03", "二二", 21, 95.0));
        writeList.add(new Student("02", "三三", 24, 80.0));
        csvUtil.writeCSV(writeList, "CsvFiles/csvUtilTest/写入文件测试.csv");
        List<Student> readList = csvUtil.readCSV("CsvFiles/csvUtilTest/写入文件测试.csv");
        assertEquals(writeList, readList);
        System.out.println("\n写入文件的测试结果:");
        for(Student student: readList) {
            System.out.println(student);
        }
    }
}
