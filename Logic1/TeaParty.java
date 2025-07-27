package Logic1;

public class TeaParty {
    public int teaParty(int tea, int candy) {
        if(Math.min(tea,candy) <5) return 0;
        if(candy/2 >= tea) return 2;
        if(tea/2 >= candy) return 2;
        return  1;
    }

}
