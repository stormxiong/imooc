package com.imooc.collectionDemo;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by xiongpc on 2017/8/3.
 */
public class Student {

    private String id;
    private String name;

    private Set course;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.course = new HashSet();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set getCourse() {
        return course;
    }

    public void setCourse(Set course) {
        this.course = course;
    }
}
