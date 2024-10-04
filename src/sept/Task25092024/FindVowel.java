package sept.Task25092024;

import java.util.Scanner;

public class FindVowel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String string = scanner.nextLine();


        char[] ch = string.toCharArray();

        int vowelCount =0;

        int consonantsCount=0;

        for(int i =0;i< ch.length;i++){



            if (ch[i] == 'A' || ch[i]  == 'E' || ch[i]  == 'I'|| ch[i]  == 'O'|| ch[i]  == 'U'||
                ch[i] == 'a' || ch[i]  == 'e' || ch[i]  == 'i'|| ch[i]  == 'o'|| ch[i]  == 'u'){

               vowelCount++;

            }

            else{

                consonantsCount++;
            }



        }
 System.out.println("Vowels in String: "+vowelCount);
        System.out.println("consonants in the String: "+consonantsCount);


    }
}
