package Logic1;

public class AnswerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isAsleep) return false;
        if(isMom) return true;
        return !isMorning;
    }

}
