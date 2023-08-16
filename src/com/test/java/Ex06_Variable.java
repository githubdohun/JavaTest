package com.test.java;

public class Ex06_Variable {
	public static void main(String[] args) {
		
		
		//목표- 자료형 + 변수 + 리터럴

		//1. 주변의 데이터 검색 > ex) 몸무게 > 저장할 변수 생성
		//2. 형태 + 길이 > 자료형 결정 > double
		//3. 변수 생성 + 값 대입
		//4. 출력
		//5. 각 자료형 9 X 10회
		
		// --------------------------------------------------------------
		
		//정수형(byte)
		byte korScore;
		korScore = 100;
		System.out.println("본인의 국어 점수는 " + korScore + " 입니다."); 
		
		byte mathScore;
		mathScore = 95;
		System.out.println("본인의 수학 점수는 " + mathScore + " 입니다.");
		
		byte socScore;
		socScore = 90;
		System.out.println("본인의 사회 점수는 " + socScore + " 입니다.");
		
		byte sciScore;
		sciScore = 85;
		System.out.println("본인의 과학 점수는 " + sciScore + " 입니다.");
		
		byte engScore;
		engScore = 80;
		System.out.println("본인의 영어 점수는 " + engScore + " 입니다.");
		
		byte cumputerScore = 75;
		System.out.println("본인의 정보처리기사 실기 점수는 " + cumputerScore + " 입니다.");
		
		byte age;
		age = 26;
		System.out.println("본인의 나이는 " + age + " 입니다.");
		
		 
		byte  temperatures = 29;
		System.out.println("현재 온도는 " + temperatures + "도 입니다.");
		
		byte gameScore = 97;
		System.out.println("본인의 게임 점수는 " + gameScore + " 입니다.");
		
		byte singScore = 94;
		System.out.println("본인의 노래방 점수는 " + singScore + " 입니다.");
		
		//정수형(short)
		short productStock;
		productStock = 300;
		System.out.println("현재 재고 수량은 " + productStock + " 입니다.");
		
		short carSpeed = 120;
		System.out.println("차량 속도는 " + carSpeed + "km/h 입니다.");
		
		short minutes = 30;
		System.out.println("경과 시간은 " + minutes + "분 입니다.");
		
		short fileSizeKB;
		fileSizeKB = 1024;
		System.out.println("파일 크기는 " + fileSizeKB + "KB 입니다.");
		
		short portNumber;
		portNumber = 8080;
		System.out.println("서버 포트 번호는 " + portNumber + " 입니다.");
		
		short studentAll;
		studentAll = 300;
		System.out.println("총 학생 수는 " + studentAll + "명 입니다.");
		
		short postalCode;
		postalCode = 12345;
		System.out.println("우편 번호는 " + postalCode + " 입니다.");
		
		short membershipLevel;
		membershipLevel = 1;
		System.out.println("당신의 회원 등급은 " + membershipLevel + " 등급 입니다.");
		
		short distance;
		distance = 700;
		System.out.println("목적지까지 거리는 " + distance + "m 입니다.");
		
		short orderNymber;
		orderNymber = 17483;
		System.out.println("주문 번호는 " + orderNymber + " 입니다.");
		
		//정수형(int)
		int koreaPopulation;
		koreaPopulation = 51558034;
		System.out.println("대한민국의 총 인구수는 " + koreaPopulation + "명 입니다.");
		
		int usaPopulation;
		usaPopulation = 339996576;
		System.out.println("미국의 총 인구수는 " + usaPopulation + "명 입니다.");
		
		int jpPopulation;
		jpPopulation = 123491891;
		System.out.println("일본의 총 인구수는 " + jpPopulation + "명 입니다.");
		
		int orderQuantity;
		orderQuantity = 200000;
		System.out.println("주문 수량은 " + orderQuantity + "KB 입니다.");
		
		int hour = 9;
		int minute = 52;
		int second = 45;
		System.out.println("지금 시간은 " + hour + " 시 " + minute + " 분 " + second + " 초 입니다.");
		
		int serialNumber;
		serialNumber = 123456;
		System.out.println("일렬 번호는 " + serialNumber + " 입니다.");
		
		int step;
		step = 11300;
		System.out.println("오늘 하루 걸음 수는 " + step + "걸음 입니다.");
		
		int floor;
		floor = 8;
		System.out.println("쌍용교육센터 층수는 " + floor + "층 입니다.");
		
		int viewershipRate;
		viewershipRate = 13;
		System.out.println("시청률은 " + viewershipRate + "% 입니다.");
		
		int foodPrice;
		foodPrice = 17000;
		System.out.println("주문하신 음식 가격은 " + foodPrice + "원 입니다.");
		
		//정수형(long)
		long worldPopulation;
		worldPopulation = 8048749108L;
		System.out.println("세계 인구수는 " + worldPopulation + "명 입니다.");
		
		long accountBalance;
		accountBalance = 23456782L;
		System.out.println("계좌 잔액은 " + accountBalance + "원 입니다.");
		
		long totalSales;
		totalSales = 346843212L;
		System.out.println("총 누적 판매량은 " + totalSales + "개 입니다.");
		
		long visitorsCount;
		visitorsCount = 5300000L;
		System.out.println("누적 방문자 수는 " + visitorsCount + "명 입니다.");
		
		long packetCount;
		packetCount = 10000000000L;
		System.out.println("네트워크 패킷의 수는 " + packetCount + "개 입니다.");
		
		long playTime;
		playTime = 4L;
		System.out.println("게임 플레이 타임은 " + playTime + "시간 입니다.");
		
		long year;
		year = 346843212L;
		System.out.println("총 누적 판매량은 " + year + "개 입니다.");
		
		long bodyTemperature;
		bodyTemperature = 36L;
		System.out.println("당신의 체온은 " + bodyTemperature + "도 입니다.");
		
		long birthYear = 1998L;
        long birthMonth = 12L;
        long birthDay = 28L;

		System.out.println("제 생년월일은 " + birthYear + "년" + birthMonth + "월" + birthDay + "일 입니다.");
		
		long pendingJobs;
		pendingJobs = 25L;
		System.out.println("작업 수는 " + pendingJobs + "개 입니다.");
		
		
		
		
		// --------------------------------------------------------------
		
		//2. 실수형(float)
		float itemPrice = 19.99f;
		System.out.println("물건의 가격은 " + itemPrice + " 원입니다.");
		
		
		float height = 180.3f;
		System.out.println("당신의 키는 " + height + " cm입니다.");
		
		float weight = 68.2f;
		System.out.println("당신의 몸무게는 " + weight + " kg입니다.");
		
		float eyesight = -4.0f;
		System.out.println("제 시력은 " + eyesight + " 입니다.");
		
		float speed = 50.5f;
		System.out.println("당신의 속도는 " + speed + " km/h 입니다.");

		float bodyTemperature1 = 36.5f;
		System.out.println("당신의 체온온 " + bodyTemperature1 + " 도 입니다.");

		float discountRate = 15.5f;
		System.out.println("할인율은 " + discountRate + " %입니다.");

		float bmi = 22.3f;
		System.out.println("당신의 신체 질량 지수는 " + bmi + " 입니다.");

		float vacationDays = 7.5f;
		System.out.println("당신의 연차 일수는 " + vacationDays + " 일 입니다.");

		float poolWaterTemperature = 28.3f;
		System.out.println("수영장 물의 온도는 " + poolWaterTemperature + " 도 입니다.");

		//실수형(double)
		double pi = 3.14159265359;
		System.out.println("원주율은 " + pi + " 입니다.");

		double exchangeRate = 1.25;
		System.out.println("환율 " + exchangeRate + " 입니다.");

		double windChillTemperature = -10.5;
		System.out.println("체감 온도는 " + windChillTemperature + " 도 입니다.");

		double interestRate = 3.5;
		System.out.println("대출 이자율은 " + interestRate + "% 입니다.");

		double mileage = 357.5;
		System.out.println("주행 거리는 " + mileage + " km 입니다.");

		double earthRadius = 6371.0;
		System.out.println("지구의 반지름은 " + earthRadius + " km 입니다.");

		double calorieConsumption = 250.75;
		System.out.println("소비 칼로리는 " + calorieConsumption + " kcal 입니다.");

		double bidPrice = 1000.5;
		System.out.println("경매 입찰가는 " + bidPrice + " 원입니다.");

		double averageSpeed = 56.8;
		System.out.println("당신의 평균 속도는 " + averageSpeed + " km/h 입니다.");

		double batteryCapacity = 87.65;
		System.out.println("베터리 용량은 " + batteryCapacity + " % 입니다.");

		// --------------------------------------------------------------
		
		//문자형(char)
		// 성별을 나타내는 변수
        char gender = 'M';
        System.out.println("당신의 성별은 " + gender + "입니다");
        
        // 학점을 나타내는 변수
        char grade = 'A';
        System.out.println("당신의 학점은 " + grade + "입니다");
        
        // 혈액형을 나타내는 변수
        char bloodType = 'O';
        System.out.println("당신의 혈액형은 " + bloodType + "형 입니다");
        
        // 알파벳 대문자를 나타내는 변수
        char uppercaseLetter = 'G';
        System.out.println(uppercaseLetter);
        
        // 알파벳 소문자를 나타내는 변수
        char lowercaseLetter = 'm';
        System.out.println(lowercaseLetter);
        
        //숫자를 나타내는 변수
        char digit = '5';
        System.out.println(digit);
        
        // 특수문자를 나타내는 변수
        char specialChar = '$';
        System.out.println(specialChar);
        
        // 공백을 나타내는 변수
        char space = ' ';	
        System.out.println(space);
        
        // 탭을 나타내는 변수
        char tab = '\t';
        System.out.println( tab);
	     // 줄바꿈을 나타내는 변수
        
        char newline = '\n';
        System.out.println(newline);
        
        // --------------------------------------------------------------
        
      //논리형(boolean)
     // 회원 가입 여부를 나타내는 변수
        boolean isRegistered = true;
        System.out.println(isRegistered);
        
        // 로그인 상태를 나타내는 변수
        boolean isLoggedIn = false;
        System.out.println(isLoggedIn);
        
        // 결제 완료 여부를 나타내는 변수
        boolean isPaymentCompleted = true;
        System.out.println(isPaymentCompleted);
        
        // 알림 설정 여부를 나타내는 변수
        boolean isNotificationEnabled = false;
        System.out.println(isNotificationEnabled);
        
        // 배송 상태를 나타내는 변수
        boolean isShipped = true;
        System.out.println(isShipped);
        
        // 상품 재고 여부를 나타내는 변수
        boolean isProductAvailable = true;
        System.out.println(isProductAvailable);
        
        // 이메일 구독 상태를 나타내는 변수
        boolean isSubscribed = false;
        System.out.println(isSubscribed);
        
        // 암호화된 데이터 여부를 나타내는 변수
        boolean isEncrypted = true;
        System.out.println(isEncrypted);
        
        // GPS 기능 활성화 여부를 나타내는 변수
        boolean isGpsEnabled = true;
        System.out.println(isGpsEnabled);
        
        // 유효한 로그인 정보 여부를 나타내는 변수
        boolean isValidLogin = false;
        System.out.println(isValidLogin);
        
        // --------------------------------------------------------------
        //참조형(String)
        
        // 이름을 나타내는 변수
        String name = "이도훈";
        System.out.println(name);
        
        // 이메일 주소를 나타내는 변수
        String email = "sjw05345@naver.com";
        System.out.println(email);
        
        // 주소를 나타내는 변수
        String address = "경기도 광주시";
        System.out.println(address);
        
        // 전화번호를 나타내는 변수 
        String phoneNumber = "010-4940-1301";
        System.out.println(phoneNumber);
        
        // 사용자명을 나타내는 변수
        String username = "user123";
        System.out.println(username);
      
        // 비밀번호를 나타내는 변수
        String password = "password123";
        System.out.println(password);
        
        // 상품명을 나타내는 변수
        String productName = "Smartphone";
        System.out.println(productName);
        
        // 팀 이름을 나타내는 변수
        String teamName = "Alpha Squad";
        System.out.println(teamName);
        
        // 웹사이트 제목을 나타내는 변수
        String websiteTitle = "쌍용교육센터";
        System.out.println(websiteTitle);
        
        // 메모 내용을 나타내는 변수
        String memo = "취업하자.";
        System.out.println(memo);
        
	}
}
