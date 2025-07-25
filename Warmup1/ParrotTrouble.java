package Warmup1;

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        if(!talking){
            return false;
        }
        if(hour > 7 && hour <20){
            return false;
        }

        return true;
    }

}
