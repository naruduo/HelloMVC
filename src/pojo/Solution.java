package pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Solution {
    private int solutionId;
    private int puzzleId;
    private String content;
    private int soluerId;
    private Timestamp time;
    private int likeFreq;

    @Id
    @Column(name = "solution_id", nullable = false)
    public int getSolutionId() {
        return solutionId;
    }

    public void setSolutionId(int solutionId) {
        this.solutionId = solutionId;
    }

    @Basic
    @Column(name = "puzzle_id", nullable = false)
    public int getPuzzleId() {
        return puzzleId;
    }

    public void setPuzzleId(int puzzleId) {
        this.puzzleId = puzzleId;
    }

    @Basic
    @Column(name = "content", nullable = false, length = 255)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "soluer_id", nullable = false)
    public int getSoluerId() {
        return soluerId;
    }

    public void setSoluerId(int soluerId) {
        this.soluerId = soluerId;
    }

    @Basic
    @Column(name = "time", nullable = false)
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Basic
    @Column(name = "like_freq", nullable = false)
    public int getLikeFreq() {
        return likeFreq;
    }

    public void setLikeFreq(int likeFreq) {
        this.likeFreq = likeFreq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Solution solution = (Solution) o;
        return solutionId == solution.solutionId &&
                puzzleId == solution.puzzleId &&
                soluerId == solution.soluerId &&
                likeFreq == solution.likeFreq &&
                Objects.equals(content, solution.content) &&
                Objects.equals(time, solution.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(solutionId, puzzleId, content, soluerId, time, likeFreq);
    }
}
