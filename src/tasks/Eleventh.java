package tasks;

public class Eleventh {
    public static void main(String[] args){
        String s = "Level";
        if (isPalindrom(s.toLowerCase()))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    public static Boolean isPalindrom(String s){
        if (s.length() == 1)
            return true;
        if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;
        return isPalindrom(s.substring(1, s.length() - 1));
    }
}
