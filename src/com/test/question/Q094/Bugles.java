package com.test.question.Q094;

import java.util.Calendar;

class Bugles {
    private int price;
    private int weight;
    private Calendar creationTime;
    private int expiration;

    // 용량 상수
    private static final int SIZE_300G = 300;
    private static final int SIZE_500G = 500;
    private static final int SIZE_850G = 850;

    // 가격 상수
    private static final int PRICE_300G = 850;
    private static final int PRICE_500G = 1200;
    private static final int PRICE_850G = 1950;

    // 생성자
    public Bugles() {
    }

    // Setter
    public void setSize(int weight) {
        this.weight = weight;
        switch (weight) {
            case SIZE_300G:
                this.price = PRICE_300G;
                this.expiration = 7;
                break;
            case SIZE_500G:
                this.price = PRICE_500G;
                this.expiration = 10;
                break;
            case SIZE_850G:
                this.price = PRICE_850G;
                this.expiration = 15;
                break;
            default:
                System.out.println("유효하지 않은 용량입니다.");
                break;
        }
    }

    public void setCreationTime(String dateString) {
        // 생산일자를 Calendar 객체로 변환
        String[] dateArr = dateString.split("-");
        int year = Integer.parseInt(dateArr[0]);
        int month = Integer.parseInt(dateArr[1]) - 1; // Calendar 클래스에서 월은 0부터 시작
        int day = Integer.parseInt(dateArr[2]);
        this.creationTime = Calendar.getInstance();
        this.creationTime.set(year, month, day);
    }

    // Getter
    public int getPrice() {
        return price;
    }

    public int getExpiration() {
        // 유통기한 계산
        Calendar today = Calendar.getInstance();
        today.set(Calendar.HOUR_OF_DAY, 0);
        today.set(Calendar.MINUTE, 0);
        today.set(Calendar.SECOND, 0);
        today.set(Calendar.MILLISECOND, 0);
        
        Calendar expirationDate = (Calendar) creationTime.clone();
        expirationDate.add(Calendar.DATE, expiration);

        int daysRemaining = (int) ((expirationDate.getTimeInMillis() - today.getTimeInMillis()) / (1000 * 60 * 60 * 24));

        return daysRemaining;
    }

    // 메소드
    public void eat() {
        int daysRemaining = getExpiration();
        if (daysRemaining > 0) {
            System.out.println("과자를 맛있게 먹습니다.");
        } else {
            System.out.println("유통기한이 지나 먹을 수 없습니다.");
        }
    }
}