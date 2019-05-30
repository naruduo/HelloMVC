package pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "course_chapters", schema = "se_web", catalog = "")
public class CourseChapters {
    private int unitId;
    private String unitName;
    private String unitDesc;

    @Id
    @Column(name = "unit_id", nullable = false)
    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    @Basic
    @Column(name = "unit_name", nullable = false, length = 15)
    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Basic
    @Column(name = "unit_desc", nullable = false, length = 255)
    public String getUnitDesc() {
        return unitDesc;
    }

    public void setUnitDesc(String unitDesc) {
        this.unitDesc = unitDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseChapters that = (CourseChapters) o;
        return unitId == that.unitId &&
                Objects.equals(unitName, that.unitName) &&
                Objects.equals(unitDesc, that.unitDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitId, unitName, unitDesc);
    }
}
