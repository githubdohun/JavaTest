package com.test.question.Q096;

import java.util.Random;

class Box {
    private Macaron[] list = new Macaron[10];

    // 마카롱을 10개 만들어 Box에 담는 메소드
    public void cook() {
        Random random = new Random();
        for (int i = 0; i < list.length; i++) {
            int size = random.nextInt(11) + 5; // 5~15 사이의 크기
            String[] colors = {"red", "blue", "yellow", "white", "pink", "purple", "green"};
            String color = colors[random.nextInt(colors.length)]; // 무작위 색상 선택
            int thickness = random.nextInt(20) + 1; // 1~20 사이의 두께
            list[i] = new Macaron(size, color, thickness);
        }
    }

    // 품질 검사를 수행하는 메소드
    public void check() {
        int passCount = 0;
        int failCount = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].isQualified()) {
                passCount++;
            } else {
                failCount++;
            }
        }
        System.out.println("[박스 체크 결과]");
        System.out.println("QC 합격 개수 : " + passCount + "개");
        System.out.println("QC 불합격 개수 : " + failCount + "개");
    }

    // 마카롱 목록을 출력하는 메소드
    public void list() {
        System.out.println("[마카롱 목록]");
        for (int i = 0; i < 10; i++) {
            String status = list[i].isQualified() ? "합격" : "불합격";
            System.out.println((i + 1) + "번 마카롱 : " + list[i].toString() + " : " + status);
        }
    }
}

class Macaron {
    private int size;
    private String color;
    private int thickness;

    // 생성자
    public Macaron(int size, String color, int thickness) {
        this.size = size;
        this.color = color;
        this.thickness = thickness;
    }

    // 판매 유효 크기인지 확인하는 메소드
    public boolean isValidSize() {
        return size >= 8 && size <= 14;
    }

    // 판매 유효 색상인지 확인하는 메소드
    public boolean isValidColor() {
        return !color.equals("black");
    }

    // 판매 유효 두께인지 확인하는 메소드
    public boolean isValidThickness() {
        return thickness >= 3 && thickness <= 18;
    }

    // 마카롱이 품질 검사를 통과한지 확인하는 메소드
    public boolean isQualified() {
        return isValidSize() && isValidColor() && isValidThickness();
    }

    // toString 오버라이드
    @Override	
    public String toString() {
        return size + "cm(" + color + ", " + thickness + "mm)";
    }
}