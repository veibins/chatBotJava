package com.kvstarter;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        String choiceOne = "Java";
        String choiceTwo = "C++";
        String choiceThree = "WEB/JS/HTML";
        String statementOne = ("Tiekamies mācībās! ;)");
        int choiceCodeLang = 0;

        /*defining variables*/

        Scanner scanInput = new Scanner(System.in);

        System.out.println("Sveiks! Tu šobrīd atrodies \"SuperDuper\" programmēšanas skolas mājaslapā!");
        System.out.print("Lai turpinātu, lūdzu ievadi savu vārdu un spied Enter: ");

        String input = scanInput.nextLine();

        System.out.println("Laipni lūgts/a \"SuperDuper\" skolā, " + input + "!");
        System.out.println("Lūdzu ieraksti, kādu programmēšanas valodu vēlies apgūt un spied Enter: (raksti \"1\", ja vēlies apgūt " + choiceOne +
                " \"2\", ja vēlies apgūt " + choiceTwo + " \"3\", ja vēlies apgūt " + choiceThree + ")");

        /*while loop to enter a valid integer for code to continue executing further*/

        while (choiceCodeLang > 3 || choiceCodeLang < 1) {
            if (scanInput.hasNextInt()) {
                choiceCodeLang = scanInput.nextInt();
            } else {
                scanInput.next();
            }
            if (choiceCodeLang > 3 || choiceCodeLang < 1) {
                System.out.println("Atvaino, bet šāda apmācību programma šobrīd vēl neeksistē.");
                System.out.println("Lūdzu ieraksti, kādu programmēšanas valodu vēlies apgūt un spied Enter: (raksti \"1\", ja vēlies apgūt " + choiceOne +
                        " \"2\", ja vēlies apgūt " + choiceTwo + " \"3\", ja vēlies apgūt " + choiceThree + ")");
            } else {
                if (choiceCodeLang == 1) {
                    System.out.println("Paldies! Tu izvēlējies macīties " + choiceOne + ". " + statementOne);
                }
                if (choiceCodeLang == 2) {
                    System.out.println("Paldies! Tu izvēlējies macīties " + choiceTwo + ". " + statementOne);
                }
                if (choiceCodeLang == 3) {
                    System.out.println("Paldies! Tu izvēlējies macīties " + choiceThree + ". " + statementOne);
                }
            }
        }
        scanInput.close();
    }
}
