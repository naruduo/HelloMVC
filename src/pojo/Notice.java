package pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Notice {
    private int notificationId;
    private String notiContent;
    private int releaserId;
    private Timestamp releaseTime;

    @Id
    @Column(name = "notification_id", nullable = false)
    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    @Basic
    @Column(name = "noti_content", nullable = false, length = 255)
    public String getNotiContent() {
        return notiContent;
    }

    public void setNotiContent(String notiContent) {
        this.notiContent = notiContent;
    }

    @Basic
    @Column(name = "releaser_id", nullable = false)
    public int getReleaserId() {
        return releaserId;
    }

    public void setReleaserId(int releaserId) {
        this.releaserId = releaserId;
    }

    @Basic
    @Column(name = "release_time", nullable = false)
    public Timestamp getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Timestamp releaseTime) {
        this.releaseTime = releaseTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notice notice = (Notice) o;
        return notificationId == notice.notificationId &&
                releaserId == notice.releaserId &&
                Objects.equals(notiContent, notice.notiContent) &&
                Objects.equals(releaseTime, notice.releaseTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationId, notiContent, releaserId, releaseTime);
    }
}
