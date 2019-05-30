package pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "hw_answer", schema = "se_web", catalog = "")
public class HwAnswer {
    private int hwAnsId;
    private int stuId;
    private String stuName;
    private Timestamp subTime;
    private String address;
    private int score;

    @Id
    @Column(name = "hw_ans_id", nullable = false)
    public int getHwAnsId() {
        return hwAnsId;
    }

    public void setHwAnsId(int hwAnsId) {
        this.hwAnsId = hwAnsId;
    }

    @Basic
    @Column(name = "stu_id", nullable = false)
    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    @Basic
    @Column(name = "stu_name", nullable = false, length = 10)
    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Basic
    @Column(name = "sub_time", nullable = false)
    public Timestamp getSubTime() {
        return subTime;
    }

    public void setSubTime(Timestamp subTime) {
        this.subTime = subTime;
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
    @Column(name = "score", nullable = false)
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HwAnswer hwAnswer = (HwAnswer) o;
        return hwAnsId == hwAnswer.hwAnsId &&
                stuId == hwAnswer.stuId &&
                score == hwAnswer.score &&
                Objects.equals(stuName, hwAnswer.stuName) &&
                Objects.equals(subTime, hwAnswer.subTime) &&
                Objects.equals(address, hwAnswer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hwAnsId, stuId, stuName, subTime, address, score);
    }
}
