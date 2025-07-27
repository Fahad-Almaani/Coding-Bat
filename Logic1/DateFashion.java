package Logic1;

public class DateFashion {
    public int dateFashion(int you, int date) {
        if(Math.min(you,date)<=2) return 0;
        if(Math.max(you,date)>=8) return 2;
        return 1;
    }

}
