package pl.pk.letter;

import java.text.Collator;
import java.util.*;

public class Application1 {

    public static void main(String[] args) {
        String text =
                "Młodości! ty nad poziomy\n" +
                "Wylatuj, a okiem słońca\n" +
                "Ludzkości całe ogromy\n" +
                "Przeniknij z końca do końca!";
        //Set<String> letters = new HashSet<>();
        Set<String> letters = new TreeSet<>(Collator.getInstance());

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (! Character.isLetter(ch)) {
                continue;
            }
            String l = String.valueOf(ch);
            letters.add(l);
        }

        System.out.println(letters);
    }

}
