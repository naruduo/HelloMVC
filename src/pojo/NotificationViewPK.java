package pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class NotificationViewPK implements Serializable {
    private int notificationId;
    private int stuId;

    @Column(name = "notification_id", nullable = false)
    @Id
    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    @Column(name = "stu_id", nullable = false)
    @Id
    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationViewPK that = (NotificationViewPK) o;
        return notificationId == that.notificationId &&
                stuId == that.stuId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationId, stuId);
    }
}
