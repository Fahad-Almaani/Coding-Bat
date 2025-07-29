package Logic2;

public class MakeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        int ch = 0;
        while (big>0){
            if(ch + 5 <= goal){
                ch+=5;
            }else {
                break;
            }
            big--;
        }
        if(ch==goal) return 0;
        if(small >= goal-ch) return goal-ch;
        return -1;
    }


}
