package com.lyq.spring6.iocXml;

/**
 * @description:
 * @author: lyq
 * @createDate: 8/5/2023
 * @version: 1.0
 */
public class Lesson {
    private String lessonName;

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonName='" + lessonName + '\'' +
                '}';
    }
}
