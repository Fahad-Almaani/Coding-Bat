package Logic1;

public class CaughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if(isBirthday) speed= speed-5;
        if(speed<=60) return 0;
        if(speed<=80) return 1;
        return 2;
    }

}
