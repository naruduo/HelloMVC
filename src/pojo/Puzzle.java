package pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Puzzle {
    private int puzzleId;
    private String description;
    private int puzzlerId;
    private Timestamp time;

    @Id
    @Column(name = "puzzle_id", nullable = false)
    public int getPuzzleId() {
        return puzzleId;
    }

    public void setPuzzleId(int puzzleId) {
        this.puzzleId = puzzleId;
    }

    @Basic
    @Column(name = "description", nullable = false, length = 255)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "puzzler_id", nullable = false)
    public int getPuzzlerId() {
        return puzzlerId;
    }

    public void setPuzzlerId(int puzzlerId) {
        this.puzzlerId = puzzlerId;
    }

    @Basic
    @Column(name = "time", nullable = false)
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Puzzle puzzle = (Puzzle) o;
        return puzzleId == puzzle.puzzleId &&
                puzzlerId == puzzle.puzzlerId &&
                Objects.equals(description, puzzle.description) &&
                Objects.equals(time, puzzle.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(puzzleId, description, puzzlerId, time);
    }
}
