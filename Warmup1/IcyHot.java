package Warmup1;

public class IcyHot {
    public boolean icyHot(int temp1, int temp2) {
        return (temp1 > 100 && temp2 <0) || (temp2 > 100 && temp1 < 0);
    }

}
