package pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "teacher_class", schema = "se_web", catalog = "")
public class TeacherClass {
    private int classId;
    private int teacherId;

    @Id
    @Column(name = "class_id", nullable = false)
    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    @Basic
    @Column(name = "teacher_id", nullable = false)
    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeacherClass that = (TeacherClass) o;
        return classId == that.classId &&
                teacherId == that.teacherId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(classId, teacherId);
    }
}
