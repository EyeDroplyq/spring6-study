package com.lyq.spring6.iocXml;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: lyq
 * @createDate: 8/5/2023
 * @version: 1.0
 */
public class Student {
    private Integer studentId;
    private String studentName;
    private Map<String,Teacher> teacherMap;
    private List<Lesson> lessonList;
    public void run(){
        System.out.print(studentName+"has many teachers like:");
        System.out.println(teacherMap);
        System.out.println(studentName+" student's lessons has:"+lessonList);
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
