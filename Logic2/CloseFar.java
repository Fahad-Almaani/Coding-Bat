package Logic2;

public class CloseFar {
    public boolean closeFar(int a, int b, int c) {

        if(Math.abs(a-b) <= 1){
            if(Math.abs(b-c) >=2 && Math.abs(a-c) >=2) return true;
        }
        if(Math.abs(a-c) <= 1) {
            if(Math.abs(c-b)>=2 && Math.abs(b-a) >=2) return true;
        }
        return false;


    }

}
