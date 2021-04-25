package testpack;
import java.util.*;
import java.io.*;

class Main {

    public static boolean QuestionsMarks(String str) {
        StringBuilder builder = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(Character.isAlphabetic(ch))
                builder.append(ch);
        }
        String s = builder.toString();
        String k = builder.reverse().toString();
        if(s.equals(k))
            return true;
        else
            return false;
}

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(QuestionsMarks("Noel - sees Leon"));
    }

}