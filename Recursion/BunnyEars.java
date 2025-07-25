package Recursion;

public class BunnyEars {
    public int bunnyEars(int bunnies) {
        if(bunnies == 1) return 2;

        return 2 + bunnyEars(bunnies-1);
    }

}
