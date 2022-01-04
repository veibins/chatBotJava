package com.kvstarter;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanInput = new Scanner(System.in);

        System.out.println("Sveiks! Tu šobrīd atrodies \"SuperDuper\" programmēšanas skolas mājaslapā!");
        System.out.print("Lai turpinātu, lūdzu ievadi savu vārdu un spied Enter: ");

        String name = scanInput.nextLine();

        String choiceOne = "Java";
        String choiceTwo = "C++";
        String choiceThree = "WEB/JS/HTML";

        System.out.println("Laipni lūgts/a \"SuperDuper\" skolā, " + name + "!");
        System.out.println("Lūdzu ieraksti, kādu programmēšanas valodu vēlies apgūt un spied Enter: (raksti \"1\", ja vēlies apgūt " + choiceOne +
                " \"2\", ja vēlies apgūt " + choiceTwo + " \"3\", ja vēlies apgūt " + choiceThree + ")");

        int choiceCodeLang = scanInput.nextInt();

        if (choiceCodeLang == 1) {
            System.out.println("Paldies! Tu izvēlējies macīties " + choiceOne + ".");
        }
        if (choiceCodeLang == 2) {
            System.out.println("Paldies! Tu izvēlējies macīties " + choiceTwo + ".");
        }
        if (choiceCodeLang == 3){
            System.out.println("Paldies! Tu izvēlējies macīties " + choiceThree + ".");
        }

        System.out.println("Tiekamies mācībās! ;)");

        scanInput.close();








    }
}
