package raisetech.StudentManagement.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import raisetech.StudentManagement.data.StudentCourses;

@Mapper
public interface StudentCourseRepository {

  @Select("SELECT * FROM students_courses")
  List<StudentCourses> findAllCourse();
}
