package com.test.question.Q095;

class Employee {
    private String name;
    private String department;
    private String position;
    private String tel;
    private Employee boss;

    // 기본 생성자
    public Employee() {
    }

    // Setter
    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 5) {
            this.name = name;
        } else {
            System.out.println("이름은 한글 2~5자 이내로 입력해주세요.");
        }
    }

    public void setDepartment(String department) {
        String[] validDepartments = {"영업부", "기획부", "총무부", "개발부", "홍보부"};
        boolean isValidDepartment = false;
        for (String validDept : validDepartments) {
            if (validDept.equals(department)) {
                isValidDepartment = true;
                break;
            }
        }

        if (isValidDepartment) {
            this.department = department;
        } else {
            System.out.println("올바른 부서를 입력해주세요.");
        }
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTel(String tel) {
        if (tel.matches("010-\\d{4}-\\d{4}")) {
            this.tel = tel;
        } else {
            System.out.println("올바른 연락처 형식을 입력해주세요. (010-XXXX-XXXX)");
        }
    }

    public void setBoss(Employee boss) {
        if (boss == null || boss.getDepartment().equals(this.department)) {
            this.boss = boss;
        } else {
            System.out.println("같은 부서가 아닌 직원만 직속 상사로 설정할 수 있습니다.");
        }
    }

    // Getter
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public String getTel() {
        return tel;
    }

    public Employee getBoss() {
        return boss;
    }

    // 직원 정보 확인 메소드
    public void info() {
        System.out.println("[" + name + "]");
        System.out.println("- 부서: " + department);
        System.out.println("- 직위: " + position);
        System.out.println("- 연락처: " + tel);
        if (boss == null) {
            System.out.println("- 직속상사: 없음");
        } else {
            System.out.println("- 직속상사: " + boss.getName() + "(" + boss.getDepartment() + " " + boss.getPosition() + ")");
        }
    }
}