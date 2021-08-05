package com.javabattle.encapsulation;

public class Student {
  String name;
  int age;

  Student() {
    this(25);
    System.out.println("print default constructor");
  }

  public Student(int age) {
    this.age = age;
  }

  public Student(String name1, int age1) {
    name = name1;
    age = age1;
  }

  public Student(Student st){
    name = st.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

}
