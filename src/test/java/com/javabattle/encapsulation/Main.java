package com.javabattle.encapsulation;

public class Main {
  public static void main(String[] args) {
    //creating object with default constructor and
    // invoking another constructor for initialising age;
    Student student = new Student();
    System.out.println(student);

    Student student1 = new Student(30);
    System.out.println(student1);

    Student student2 = new Student("Shiv", 4);
    System.out.println(student2);

    Student student3 = new Student(student2);
    System.out.println(student3);

    //setting value for name
    System.out.println(student1.getName());
    student1.setName("Saurabh");
    System.out.println(student1);

    //updating value for name
    student2.setName("Neha");
    System.out.println(student2.getName());
    System.out.println(student2);
  }

}
