// Prints a crowd cheering output.
public class Cheers {
        /*
         * Third question (15 points) 
         * The Cheers program gets two inputs: a string and a non-negative integer value, and prints a crowd
         * cheering output. Here is an example of the program’s execution:
         * {'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X'} the program prints "an", not "a"
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
            String special = "AEFHILMNORSX";
            
            int placeOfChar = 0;
            while (placeOfChar <= word.length()){
                char correntLetter = word.charAt(placeOfChar);
                System.out.print("Give me ");                  
                if (special.indexOf(correntLetter) >= 0){
                        System.out.print("an ");
                } else {
                        System.out.print("a ");
                }
                System.out.println(correntLetter + ": " + correntLetter + "!");
            }

            System.out.println("What does that spell?");
            int counter = 0;
            while (counter < times){
                System.out.println(word + "!!!");
            }
        }
}
