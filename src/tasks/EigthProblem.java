package tasks;

import java.util.Scanner;

public class EigthProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        boolean ch = check(n, 0);
        if (ch)
            System.out.println("Yes");
        else
            System.out.println("NO");
    }
    public static Boolean check(String n, int index){
        if (index == n.length())
            return true;
        if (Character.isDigit(n.charAt(index)))
            return check(n, index + 1);
        return false;
    }
}
