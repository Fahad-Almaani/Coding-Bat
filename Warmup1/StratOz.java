package Warmup1;

public class StratOz {
    public String startOz(String str ){
        String result = "";
        if(str.startsWith("o")) result+="o";
        if(str.startsWith("z",1)) result+="z";
        return result;
    }
}
