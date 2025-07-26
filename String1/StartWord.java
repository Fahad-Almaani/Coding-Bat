package String1;

public class StartWord {
    public static String startWord(String str,String word){
        if(str.isEmpty() || word.isEmpty()) return "";
        if(str.length()<word.length()) return "";
        String a = str.substring(1,word.length());
        String b = word.substring(1);
        if(a.equals(b)){
           return str.charAt(0)+word.substring(1);
        }
        return "";
    }

    public static void main(String[] args){
        System.out.println(startWord("hippo","ix"));
    }
}
