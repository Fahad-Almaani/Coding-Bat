package String2;

public class CatDog {
    public boolean catDog(String str) {
        int c1 = 0;
        int l1 = 0;
        while ((l1 = str.indexOf("cat",l1))!=-1){
            c1++;
            l1 +=3;
        }
        int c2 = 0;
        l1 =0;
        while ((l1 = str.indexOf("dog",l1))!=-1){
            c2++;
            l1 +=3;
        }
        return (c1 == c2);

    }
}
