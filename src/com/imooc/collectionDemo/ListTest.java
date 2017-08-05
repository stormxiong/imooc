package com.imooc.collectionDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiongpc on 2017/8/3.
 */
public class ListTest {
    private List courseToSelect;

    public ListTest() {
        this.courseToSelect = new ArrayList();
    }

    public List getCourseToSelect() {
        return courseToSelect;
    }

    public void setCourseToSelect(List courseToSelect) {
        this.courseToSelect = courseToSelect;
    }

    //添加课程
    public void testAdd(){
        Course course1 = new Course("1","数据结构");
        courseToSelect.add(course1);
    }
}
