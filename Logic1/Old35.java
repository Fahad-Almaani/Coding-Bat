package Logic1;

public class Old35 {
    public boolean old35(int n) {
        boolean three = n%3 == 0;
        boolean five = n%5 == 0;
        return three ^ five;
    }

}
