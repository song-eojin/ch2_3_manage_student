package org.fastcampus.student_management.domain;

public class Student {

  // 도메인 객체는 final 필드 + 생성자 강제 → 불변 객체에 가깝게 설계됨
  private final String name;
  private final int age;
  private final String address;

  // activated 만 상태 변경을 허용 (활성화/비활성화 용도)
  private boolean activated;

  public Student(String name, int age, String address) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("이름은 필수 입력값입니다.");
    }

    this.name = name;
    this.age = age;
    this.address = address;
    this.activated = true;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getAddress() {
    return address;
  }

  // set 메서드 대신 분명한 역할을 갖는 메서드 사용
  public void activate() {
    if (this.activated) {
      throw new IllegalArgumentException();
    }
    this.activated = true;
  }
  public void deactivate() {
    if (!this.activated) {
      throw new IllegalArgumentException();
    }
    this.activated = false;
  }

  public boolean isActivate() {
    return activated;
  }
}
