package pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hibernate_sequence", schema = "se_web", catalog = "")
public class HibernateSequence {
    private Long nextVal;

    @Basic
    @Column(name = "next_val", nullable = true)
    public Long getNextVal() {
        return nextVal;
    }

    public void setNextVal(Long nextVal) {
        this.nextVal = nextVal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HibernateSequence that = (HibernateSequence) o;
        return Objects.equals(nextVal, that.nextVal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nextVal);
    }
}
