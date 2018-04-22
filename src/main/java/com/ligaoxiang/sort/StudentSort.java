package com.ligaoxiang.sort;

import com.ligaoxiang.entity.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSort {
    /**
     * 根据学号排序
     * @param list
     * @param isAscending
     */
    public void sortByStudentID(List<Student> list, boolean isAscending) {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(isAscending) {
                    return o1.getStudentID().compareTo(o2.getStudentID());
                }
                else {
                    return o2.getStudentID().compareTo(o1.getStudentID());
                }
            }
        });
    }

    /**
     * 根据年龄排序
     * @param list
     * @param isAscending
     */
    public void sortByAge(List<Student> list, boolean isAscending) {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (isAscending) {
                    return o1.getAge() - o2.getAge();
                }
                else {
                    return o2.getAge() - o1.getAge();
                }

            }
        });
    }

    /**
     * 根据成绩排序
     * @param list
     * @param isAscending
     */
    public void sortByScore(List<Student> list, boolean isAscending) {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (isAscending) {
                    return (int) (o1.getScore() - o2.getScore());
                }
                else {
                    return (int) (o2.getScore() - o1.getScore());
                }
            }
        });
    }
}
