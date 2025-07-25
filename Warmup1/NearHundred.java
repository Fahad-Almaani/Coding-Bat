package Warmup1;

public class NearHundred {
    public static boolean nearHundred(int n) {
      if(Math.abs(n-100) <=10) return true;
      return Math.abs(n-200) <= 10;

    }

    public static void main(String[] args){
        System.out.println(nearHundred(93));
        System.out.println(93%100);
    }
}
