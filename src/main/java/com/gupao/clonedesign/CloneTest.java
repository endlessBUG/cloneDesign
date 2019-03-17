package com.gupao.clonedesign;

import java.util.ArrayList;

/**
 * * @Package com.gupao.clonedesign
 * * @Description: ${todo}
 * * @author caiwei
 * * @date 2019/3/17
 **/
public class CloneTest {
    public static void main(String[] args) {
        Student student = new Student("测试",18,new ArrayList<String>());
        //浅克隆
        Student student1 = student.easyClone();
        System.out.println("浅克隆结果"+ (student.getHobbies() == student1.getHobbies()));
        //深克隆
        Student student2 = student.deepClone();
        System.out.println("深克隆结果"+ (student.getHobbies() == student2.getHobbies()));
    }
}
