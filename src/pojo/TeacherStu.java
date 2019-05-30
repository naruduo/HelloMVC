package pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "teacher_stu", schema = "se_web", catalog = "")
@IdClass(TeacherStuPK.class)
public class TeacherStu {
    private int stuId;
    private int teacherId;
    private String data;

    @Id
    @Column(name = "stu_id", nullable = false)
    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    @Id
    @Column(name = "teacher_id", nullable = false)
    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Basic
    @Column(name = "data", nullable = true, length = 255)
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeacherStu that = (TeacherStu) o;
        return stuId == that.stuId &&
                teacherId == that.teacherId &&
                Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuId, teacherId, data);
    }
}
