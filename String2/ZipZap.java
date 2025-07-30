package String2;

public class ZipZap {
    public String zipZap(String str) {
        if(str.length()<=2) return str;
        StringBuilder res = new StringBuilder();
         for(int i=0; i<str.length();i++){
             if(i+2 >str.length()) {
                 res.append(str.charAt(i));
                continue;
             }
             if(str.charAt(i) == 'z' && str.charAt(i+2)=='p'){
                 res.append('z').append('p');
                 i+=2;
             }else {
                 res.append(str.charAt(i));
             }

         }

         return res.toString();
    }
}
