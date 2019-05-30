package pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "test_score", schema = "se_web", catalog = "")
public class TestScore {
    private int stuId;
    private Integer grade;
    private Timestamp time;

    @Id
    @Column(name = "stu_id", nullable = false)
    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    @Basic
    @Column(name = "grade", nullable = true)
    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Basic
    @Column(name = "time", nullable = true)
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestScore testScore = (TestScore) o;
        return stuId == testScore.stuId &&
                Objects.equals(grade, testScore.grade) &&
                Objects.equals(time, testScore.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuId, grade, time);
    }
}
