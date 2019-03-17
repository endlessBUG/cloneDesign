package com.gupao.clonedesign;

import lombok.Data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * * @Package com.gupao.clone
 * * @Description: ${todo}
 * * @author caiwei
 * * @date 2019/3/17
 **/
@Data
public class Student implements Serializable {

    private String name;

    private Integer age;

    private List<String> hobbies;

    public Student() {
    }

    public Student(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public Student easyClone() {
        Student student = new Student();
        student.name = this.name;
        student.age = this.age;
        student.hobbies = this.hobbies;
        return student;
    }

    public Student deepClone() {
        Student student = null;
        try {
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bao);
            oos.writeObject(this);

            ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bai);
            student = (Student) ois.readObject();


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return student;
    }

}
