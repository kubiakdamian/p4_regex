package pl.qbsapps;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern p = Pattern.compile("-?\\d\\d*[*/+-^]\\d\\d*([*/+-^]\\d\\d*)*;(-?\\d\\d*[*/+-^]\\d\\d*([*/+-^]\\d\\d*)*)*;");

        while (true) {
            String word = scanner.nextLine();
            word = word.trim();
            word = word.replaceAll("\\s+","");

            Matcher m = p.matcher(word);


            if (m.matches()) {
                System.out.println("POPRAWNY");
            } else {
                System.out.println("NIEPOPRAWNY");
            }
        }
    }
}
