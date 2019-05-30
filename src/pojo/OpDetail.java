package pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "op_detail", schema = "se_web", catalog = "")
public class OpDetail {
    private int logId;
    private int stuId;
    private String stuName;
    private String opDetail;

    @Id
    @Column(name = "log_id", nullable = false)
    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
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
    @Column(name = "op_detail", nullable = false, length = 255)
    public String getOpDetail() {
        return opDetail;
    }

    public void setOpDetail(String opDetail) {
        this.opDetail = opDetail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OpDetail opDetail1 = (OpDetail) o;
        return logId == opDetail1.logId &&
                stuId == opDetail1.stuId &&
                Objects.equals(stuName, opDetail1.stuName) &&
                Objects.equals(opDetail, opDetail1.opDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logId, stuId, stuName, opDetail);
    }
}
