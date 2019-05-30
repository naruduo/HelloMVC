package pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Homework {
    private int hwId;
    private String teacherName;
    private String address;
    private Timestamp releaseTime;
    private Timestamp deadline;

    @Id
    @Column(name = "hw_id", nullable = false)
    public int getHwId() {
        return hwId;
    }

    public void setHwId(int hwId) {
        this.hwId = hwId;
    }

    @Basic
    @Column(name = "teacher_name", nullable = false, length = 10)
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Basic
    @Column(name = "address", nullable = false, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "release_time", nullable = false)
    public Timestamp getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Timestamp releaseTime) {
        this.releaseTime = releaseTime;
    }

    @Basic
    @Column(name = "deadline", nullable = false)
    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Homework homework = (Homework) o;
        return hwId == homework.hwId &&
                Objects.equals(teacherName, homework.teacherName) &&
                Objects.equals(address, homework.address) &&
                Objects.equals(releaseTime, homework.releaseTime) &&
                Objects.equals(deadline, homework.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hwId, teacherName, address, releaseTime, deadline);
    }
}
