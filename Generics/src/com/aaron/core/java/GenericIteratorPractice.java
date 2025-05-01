package com.aaron.core.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericIteratorPractice {

    public static void main(String args[]){

        //List<Student> studentList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Aaron",27));
        studentList.add(new Student("James",19));
        studentList.add(new Student("Kevin",22));

//        Iterator studentListIterator = studentList.iterator();
//
//        while(studentListIterator.hasNext()){
//
//            Student s = (Student) studentListIterator.next();
//            // 이렇게 할시 object 를 반환해서 Student type casting 필수
//            System.out.println(s.name);
//        }

        Iterator<Student> studentListIterator = studentList.iterator();

        while(studentListIterator.hasNext()){

            // 이렇게 할시 object 를 반환해서 Student type casting 필수
            System.out.println(studentListIterator.next().name);
        }

    }

}

class Student{

    String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    int age;

}
