package Logic1;

public class WithoutDoubles {
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if(noDoubles){
            if(die1 == die2){
            if(die1==6) return 1 + die2;
            return die1+1+die2;
            }
        }
        return die1+die2;
    }

}
