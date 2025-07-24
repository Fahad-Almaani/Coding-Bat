package String1;

public class MakeOutWord {
    public String makeOutWord(String out, String word) {
        String open = out.substring(0,2);
        String clos = out.substring(2);
        return open+word+clos;

    }

}
