package at.fhj.msd;

public class CountVowls {

    public static int findVowls(String s){
        int count =0;

        if (s==null||s.isEmpty())
            return 0;

        s = s.toLowerCase();

        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                count++;
        }
        return count;
    }
}