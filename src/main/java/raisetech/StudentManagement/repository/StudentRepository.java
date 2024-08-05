package raisetech.StudentManagement.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import raisetech.StudentManagement.data.Student;
import raisetech.StudentManagement.data.StudentCourses;

@Mapper
public interface StudentRepository {

  @Select("SELECT * FROM students")
  List<Student> search();

  @Select("SELECT * FROM students_courses")
  List<StudentCourses> searchStudentsCourses();

  @Select("SELECT * FROM students WHERE age BETWEEN #{startAge} AND #{endAge}")
  List<Student> findStudentsInAgeRange(int startAge, int endAge);

  @Select("SELECT s.* " +
      "FROM students s " +
      "JOIN students_courses sc ON s.id = sc.student_id " +
      "WHERE sc.course_name = #{courseName}")
  List<Student> findStudentsByCourseName(String courseName);
}

