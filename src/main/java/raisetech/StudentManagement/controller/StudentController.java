package raisetech.StudentManagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import raisetech.StudentManagement.data.Student;
import raisetech.StudentManagement.data.StudentCourses;
import raisetech.StudentManagement.service.StudentService;

@RestController
public class StudentController {

  private StudentService service;

  @Autowired
  public StudentController(StudentService service) {
    this.service = service;
  }

  @GetMapping("/studentList")
  public List<Student> getStudentList() {
    return service.searchStudentList();
  }

  @GetMapping("/studentsCourseList")
  public List<StudentCourses> getStudentsCourseList() {
    return service.searchStudentsCourseList();
  }

  @GetMapping("/studentsIn30s")
  public List<Student> getStudentsIn30s() {
    return service.getStudentsIn30s();
  }


  @GetMapping("/javaCourseStudents")
  public List<Student> getJavaCourseStudents() {
    return service.getStudentsByJavaCourse();
  }
}
