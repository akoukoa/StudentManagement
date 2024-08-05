package raisetech.StudentManagement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentCourse {

  private String id;
  private String studentId;
  private String courseName; // 追加: コース名
  private String courseStartAt;
  private String courseEndAt;
}
