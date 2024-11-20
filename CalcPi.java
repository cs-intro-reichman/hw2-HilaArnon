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
        //Importent in the while loop to know
        boolean timesIsEven;
        if (times % 2 == 0){
            timesIsEven = true;
        } else {
            timesIsEven = false;
        }

        double denominator = 3.0;
        double countPI = 1.0;      //The answer
        while (times > 1){
            if ((times % 2 == 0 && timesIsEven) || (times % 2 != 0 && !timesIsEven)){
                countPI -= 1.0 / denominator;
            } else {
                countPI += 1.0 / denominator;
            }
            denominator += 2.0;
            times --;
        }
        System.out.println("pi according to Java: 3.141592653589793");
        System.out.print("pi, approximated:     " + (countPI * 4.0));
    }
}




