public class TimeCalc {
    /*
     * The TimeCalc program gets a time input which is given using the 24-hour hh:mm format, and a
     * number of minutesToAdd input. The program computes time + minutesToAdd, and prints the
     * resulting time using the 24-hour hh:mm format. For example, the time 10:30 + 4055 minutes
     * happens to be 06:05. Here is one way to calculate this new time value:
     * Total minutes = (10 hours * 60 minutes) + 30 minutes + 4055 minutes = 4685 minutes;
     * Total hours = 4685 / 60 = 78;
     * New hours = 78 % 24 = 6; // The remainder operator % is also known as modulo
     * New minutes = 4685 – (78 * 60) = 5;
     * Therefore the answer is 06:05.

    */
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));   //from HW1
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4)); //from HW1
        
    }
}
