package Logic1;

public class InOrder {
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if(bOk && c>b) return true;
        return (b>a && c>b);


    }

}
