package pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Exp {
    private int expId;
    private String expAddress;
    private int teacherId;
    private Timestamp releaseTime;
    private Timestamp deadline;

    @Id
    @Column(name = "exp_id", nullable = false)
    public int getExpId() {
        return expId;
    }

    public void setExpId(int expId) {
        this.expId = expId;
    }

    @Basic
    @Column(name = "exp_address", nullable = false, length = 255)
    public String getExpAddress() {
        return expAddress;
    }

    public void setExpAddress(String expAddress) {
        this.expAddress = expAddress;
    }

    @Basic
    @Column(name = "teacher_id", nullable = false)
    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
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
        Exp exp = (Exp) o;
        return expId == exp.expId &&
                teacherId == exp.teacherId &&
                Objects.equals(expAddress, exp.expAddress) &&
                Objects.equals(releaseTime, exp.releaseTime) &&
                Objects.equals(deadline, exp.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expId, expAddress, teacherId, releaseTime, deadline);
    }
}
