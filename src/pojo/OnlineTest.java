package pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "online_test", schema = "se_web", catalog = "")
public class OnlineTest {
    private int olHwId;
    private String knoType;
    private String question;
    private String choiceA;
    private String choiceB;
    private String choiceC;
    private String choiceD;
    private String answer;
    private int trueFreq;
    private int ansFreq;

    @Id
    @Column(name = "ol_hw_id", nullable = false)
    public int getOlHwId() {
        return olHwId;
    }

    public void setOlHwId(int olHwId) {
        this.olHwId = olHwId;
    }

    @Basic
    @Column(name = "kno_type", nullable = false, length = 20)
    public String getKnoType() {
        return knoType;
    }

    public void setKnoType(String knoType) {
        this.knoType = knoType;
    }

    @Basic
    @Column(name = "question", nullable = false, length = 255)
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Basic
    @Column(name = "choiceA", nullable = false, length = 255)
    public String getChoiceA() {
        return choiceA;
    }

    public void setChoiceA(String choiceA) {
        this.choiceA = choiceA;
    }

    @Basic
    @Column(name = "choiceB", nullable = false, length = 255)
    public String getChoiceB() {
        return choiceB;
    }

    public void setChoiceB(String choiceB) {
        this.choiceB = choiceB;
    }

    @Basic
    @Column(name = "choiceC", nullable = false, length = 255)
    public String getChoiceC() {
        return choiceC;
    }

    public void setChoiceC(String choiceC) {
        this.choiceC = choiceC;
    }

    @Basic
    @Column(name = "choiceD", nullable = false, length = 255)
    public String getChoiceD() {
        return choiceD;
    }

    public void setChoiceD(String choiceD) {
        this.choiceD = choiceD;
    }

    @Basic
    @Column(name = "answer", nullable = false, length = 255)
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Basic
    @Column(name = "true_freq", nullable = false)
    public int getTrueFreq() {
        return trueFreq;
    }

    public void setTrueFreq(int trueFreq) {
        this.trueFreq = trueFreq;
    }

    @Basic
    @Column(name = "ans_freq", nullable = false)
    public int getAnsFreq() {
        return ansFreq;
    }

    public void setAnsFreq(int ansFreq) {
        this.ansFreq = ansFreq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OnlineTest that = (OnlineTest) o;
        return olHwId == that.olHwId &&
                trueFreq == that.trueFreq &&
                ansFreq == that.ansFreq &&
                Objects.equals(knoType, that.knoType) &&
                Objects.equals(question, that.question) &&
                Objects.equals(choiceA, that.choiceA) &&
                Objects.equals(choiceB, that.choiceB) &&
                Objects.equals(choiceC, that.choiceC) &&
                Objects.equals(choiceD, that.choiceD) &&
                Objects.equals(answer, that.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(olHwId, knoType, question, choiceA, choiceB, choiceC, choiceD, answer, trueFreq, ansFreq);
    }
}
