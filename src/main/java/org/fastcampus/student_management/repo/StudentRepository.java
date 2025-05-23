package org.fastcampus.student_management.repo;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.fastcampus.student_management.domain.Student;

// Repository 레어이는 데이터 접근만 담당
public class StudentRepository {

  private final Map<String, Student> studentMap = new HashMap<>();

  public void save(Student student) {
    studentMap.put(student.getName(), student);
  }

  public Optional<Student> findByName(String name) {
    return Optional.ofNullable(studentMap.get(name));
  }
}
