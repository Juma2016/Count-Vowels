package at.fhj.msd;

public class CountVowls {

    public static int findVowls(String s){
        int count =0;

        if (s==null||s.isEmpty())
            return 0;
        for (int i=0;i<s.length();i++){
            if (s.contains("a")||s.contains("e")||s.contains("i")||s.contains("o")||s.contains("u"))
                count++;
        }
        return count;
    }
}