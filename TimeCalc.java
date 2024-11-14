public class TimeCalc {
    /*
     * First question (20 points)
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
        int inputHours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));   //from HW1
		int inputMinutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4)); //from HW1
        int minutesToAdd = Integer.parseInt(args[1]);
        
        int totalMinutes = (inputHours * 60) + inputMinutes + minutesToAdd;
        int totalHours = totalMinutes / 60;
        int hours = totalHours % 24;
        int minutes = totalMinutes - (totalHours * 60);
        /*int hours = inputHours + (minutesToAdd / 24);
        System.out.println("hours " + hours);
        System.out.println("minutesToAdd % 24" + minutesToAdd / 24);
        int minutes = inputMinutes + (minutesToAdd - (hours * 60));
        System.out.println("minutesToAdd - (hours * 60) " + (minutesToAdd - (hours * 60)));*/
        if (minutes >= 60){
            hours ++;
            minutes -= 60;
        }

        // Checking 00:00
        boolean check0 = false;		
        if (hours == 0 && minutes == 0) { // 0:00
			check0 = true;
		}

		// Checking the minutes
		String newMinutes;
		if (minutes < 10) {
			newMinutes = "0" + String.valueOf(minutes);
		} else {
			newMinutes = String.valueOf(minutes);
		}

        // Checking the hours
        String newhours;
        if (hours < 10) {
			newhours = "0" + String.valueOf(hours);
		} else {
			newhours = String.valueOf(hours);
		}

		// output
		if (!check0) {
			System.out.print(newhours + ":" + newMinutes);
		} else { // 00:00
			System.out.print("00:00");
		}
    }
}
