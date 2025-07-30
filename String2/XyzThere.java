package String2;

public class XyzThere {
    public boolean xyzThere(String str) {
        for(int i=0;i<str.length()-1;i++){
            if(str.startsWith("xyz",i)){
                if(i > 0){
                if(str.charAt(i-1) != '.'){
                    return true;
                }
                }else {
                    return true;
                }

            }
        }

        return false;
    }
}
