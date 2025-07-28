package Logic1;

public class InOrderEqual {
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if(c>=b && b>=a && equalOk) return true;
        return (c>b && b>a) ;
    }

}
