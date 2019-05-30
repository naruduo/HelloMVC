package pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "teaching_program", schema = "se_web", catalog = "")
public class TeachingProgram {
    private int teachOutlineId;
    private String address;

    @Id
    @Column(name = "teach_outline_id", nullable = false)
    public int getTeachOutlineId() {
        return teachOutlineId;
    }

    public void setTeachOutlineId(int teachOutlineId) {
        this.teachOutlineId = teachOutlineId;
    }

    @Basic
    @Column(name = "address", nullable = false, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeachingProgram that = (TeachingProgram) o;
        return teachOutlineId == that.teachOutlineId &&
                Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teachOutlineId, address);
    }
}
