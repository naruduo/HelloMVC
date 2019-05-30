package pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "exp_doc", schema = "se_web", catalog = "")
public class ExpDoc {
    private int expDocId;
    private int stuId;
    private String address;
    private Timestamp subTime;
    private Integer score;

    @Id
    @Column(name = "exp_doc_id", nullable = false)
    public int getExpDocId() {
        return expDocId;
    }

    public void setExpDocId(int expDocId) {
        this.expDocId = expDocId;
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
    @Column(name = "address", nullable = false, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "sub_time", nullable = true)
    public Timestamp getSubTime() {
        return subTime;
    }

    public void setSubTime(Timestamp subTime) {
        this.subTime = subTime;
    }

    @Basic
    @Column(name = "score", nullable = true)
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExpDoc expDoc = (ExpDoc) o;
        return expDocId == expDoc.expDocId &&
                stuId == expDoc.stuId &&
                Objects.equals(address, expDoc.address) &&
                Objects.equals(subTime, expDoc.subTime) &&
                Objects.equals(score, expDoc.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expDocId, stuId, address, subTime, score);
    }
}
