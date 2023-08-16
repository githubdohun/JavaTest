package com.test.question.Q098;

class Student {
    private String name;
    private int age;
    private int grade;
    private int classNumber;
    private int number;

    // 기본 생성자
    public Student() {
        this.name = "미정";
        this.age = 0;
        this.grade = 0;
        this.classNumber = 0;
        this.number = 0;
    }

    // 생성자 오버로딩 1
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 생성자 오버로딩 2
    public Student(int grade, int classNumber, int number) {
        this.grade = grade;
        this.classNumber = classNumber;
        this.number = number;
    }

    // 생성자 오버로딩 3
    public Student(String name, int age, int grade, int classNumber, int number) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.classNumber = classNumber;
        this.number = number;
    }

    public String info() {
        String ageString = age == 0 ? "미정" : age + "세";
        String gradeString = grade == 0 ? "미정" : String.valueOf(grade);
        String classNumberString = classNumber == 0 ? "미정" : String.valueOf(classNumber);
        String numberString = number == 0 ? "미정" : String.valueOf(number);
        return name + "(나이 : " + ageString + ", 학년 : " + gradeString + ", 반 : " + classNumberString + ", 번호 : " + numberString + ")";
    }
}