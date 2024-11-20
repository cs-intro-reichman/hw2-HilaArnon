// Prints a crowd cheering output.
public class Cheers {
        /*
         * Third question (15 points) 
         * The Cheers program gets two inputs: a string and a non-negative integer value, and prints a crowd
         * cheering output. Here is an example of the program’s execution:
         * {'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X'} the program prints "an", not "a"
         * The inputted letters can be lowercase\ uppercase. The outputted letters must be uppercase.
         * % java Cheers RUNI 5
         * Give me an R: R!
         * Give me a U: U!
         * Give me an N: N!
         * Give me an I: I!
         * What does that spell?
         * RUNI!!!
         * RUNI!!!
         * RUNI!!!
         * RUNI!!!
         * RUNI!!!
         */
        public static void main(String[] args) {
            String word = args[0];
            int times = Integer.parseInt(args[1]);

            //Convert lowercase letters to uppercase letters
            String upperCaseWord = "";
            String upperLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            int i = 0; 
            while(i < word.length()){
                char ch = word.charAt(i);
                int upperIndex = upperLetters.indexOf(ch);
                if (upperIndex == -1){      //small letter   
                        ch -= 32;           //ASCII
                }
                upperCaseWord += ch;
                i ++;
            }

            //First part of the question
            String special = "AEFHILMNORSX";
            int placeOfChar = 0;
            while (placeOfChar < upperCaseWord.length()){
                char correntLetter = upperCaseWord.charAt(placeOfChar);
                System.out.print("Give me ");                  
                if (special.indexOf(correntLetter) >= 0){   //Uniq letter
                        System.out.print("an ");
                } else {
                        System.out.print("a  ");
                }
                System.out.println(correntLetter + ": " + correntLetter + "!");
                placeOfChar++;
            }

            //Second part of the question
            System.out.println("What does that spell?");
            int counter = 0;
            while (counter < times){
                System.out.println(upperCaseWord + "!!!");
                counter ++;
            }
        }
}
