package Logic1;

public class SquirrelPlay {
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if(temp < 60){
            return false;
        }
        if(isSummer){
            return  temp<=100;
        }
        return temp<=90;
    }

}
