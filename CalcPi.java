// Computes an approximation of PI.
public class CalcPi {
    /* Fourth question (20 points)
     * % java CalcPi 10
     * pi according to Java: 3.141592653589793
     * pi, approximated: 3.0418396189294032
     * % java CalcPi 1000
     * pi according to Java: 3.141592653589793
     * pi, approximated: 3.140592653839794
     */
    public static void main(String [] args) { 
        int times = Integer.parseInt(args[0]);
        int denominator = 3;
        double countPI = 1.0;
        while (times >= 0){
            if (times % 2 == 0){
                countPI -= 1.0 / denominator;
                System.out.println("- 1/" + denominator);
            } else {
                countPI += 1.0 / denominator;
                System.out.println("+ 1/" + denominator);
            }
            denominator += 2;
            times --;
        }
        System.out.println("pi according to Java: 3.141592653589793");
        System.out.println("pi, approximated: " + (countPI *4));
    }
}


