package pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class TeacherStuPK implements Serializable {
    private int stuId;
    private int teacherId;

    @Column(name = "stu_id", nullable = false)
    @Id
    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    @Column(name = "teacher_id", nullable = false)
    @Id
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
        TeacherStuPK that = (TeacherStuPK) o;
        return stuId == that.stuId &&
                teacherId == that.teacherId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuId, teacherId);
    }
}
