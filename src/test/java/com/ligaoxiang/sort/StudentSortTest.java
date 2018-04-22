package com.ligaoxiang.sort;

import com.ligaoxiang.entity.Student;
import com.ligaoxiang.utils.CsvUtil;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class StudentSortTest {
    private StudentSort sort = null;
    private CsvUtil csvUtil = null;
    private List<Student> list = null;

    @Before
    public void setUp() {
        csvUtil = new CsvUtil();
        sort = new StudentSort();
        list = new LinkedList<>();
        list.add(new Student("02", "张三", 18, 90.0));
        list.add(new Student("04", "王五", 24, 80.0));
        list.add(new Student("01", "李四", 20, 85.0));
        list.add(new Student("03", "马六", 15, 87.5));
        list.add(new Student("05", "周七", 22, 98.0));
        csvUtil.writeCSV(list, "CsvFiles/studentSortTest/未排序.csv");
    }

    @Test
    public void sortByStudentID() {
        List<Student> list1 = csvUtil.readCSV("CsvFiles/studentSortTest/未排序.csv");
        sort.sortByStudentID(list1, true);
        // 输出到文件
        csvUtil.writeCSV(list1, "CsvFiles/studentSortTest/学号升序排序.csv");
        // 输出到控制台
        System.out.println("\n学号升序排序:");
        for(Student student: list1) {
            System.out.println(student);
        }

        List<Student> list2 = csvUtil.readCSV("CsvFiles/studentSortTest/未排序.csv");
        sort.sortByStudentID(list2, false);
        // 输出到文件
        csvUtil.writeCSV(list2, "CsvFiles/studentSortTest/学号降序排序.csv");
        // 输出到控制台
        System.out.println("\n学号降序排序:");
        for(Student student: list2) {
            System.out.println(student);
        }
    }

    @Test
    public void sortByAge() {
        List<Student> list1 = csvUtil.readCSV("CsvFiles/studentSortTest/未排序.csv");
        sort.sortByAge(list1, true);
        // 输出到文件
        csvUtil.writeCSV(list1, "CsvFiles/studentSortTest/年龄升序排序.csv");
        // 输出到控制台
        System.out.println("\n年龄升序排序:");
        for(Student student: list1) {
            System.out.println(student);
        }

        List<Student> list2 = csvUtil.readCSV("CsvFiles/studentSortTest/未排序.csv");
        sort.sortByAge(list2, false);
        // 输出到文件
        csvUtil.writeCSV(list2, "CsvFiles/studentSortTest/年龄降序排序.csv");
        // 输出到控制台
        System.out.println("\n年龄降序排序:");
        for(Student student: list2) {
            System.out.println(student);
        }
    }

    @Test
    public void sortByScore() {
        List<Student> list1 = csvUtil.readCSV("CsvFiles/studentSortTest/未排序.csv");
        sort.sortByScore(list1, true);
        // 输出到文件
        csvUtil.writeCSV(list1, "CsvFiles/studentSortTest/成绩升序排序.csv");
        // 输出到控制台
        System.out.println("\n成绩升序排序:");
        for(Student student: list1) {
            System.out.println(student);
        }

        List<Student> list2 = csvUtil.readCSV("CsvFiles/studentSortTest/未排序.csv");
        sort.sortByScore(list2, false);
        // 输出到文件
        csvUtil.writeCSV(list2, "CsvFiles/studentSortTest/成绩降序排序.csv");
        // 输出到控制台
        System.out.println("\n成绩降序排序:");
        for(Student student: list2) {
            System.out.println(student);
        }
    }

}
