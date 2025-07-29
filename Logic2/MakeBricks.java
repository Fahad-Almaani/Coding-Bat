package Logic2;

public class MakeBricks {
    public static boolean makeBricks(int small, int big, int goal) {
        int len =0;
        while(big !=0 && len < goal){
            if(len + 5 <= goal){
                len+=5;
                big--;
            }else {
                break;
            }
        }
        if(goal != len){
            return goal - len <= small;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(makeBricks(3,1,9));
    }

}
