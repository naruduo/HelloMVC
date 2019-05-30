package pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "notification_view", schema = "se_web", catalog = "")
@IdClass(NotificationViewPK.class)
public class NotificationView {
    private int notificationId;
    private int stuId;
    private boolean status;

    @Id
    @Column(name = "notification_id", nullable = false)
    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    @Id
    @Column(name = "stu_id", nullable = false)
    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationView that = (NotificationView) o;
        return notificationId == that.notificationId &&
                stuId == that.stuId &&
                status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationId, stuId, status);
    }
}
