// Demonstrates the Collatz conjecture.
public class Collatz {
	/*
	 * Fifth question (30 points)
	 */
	public static void main(String args[]) {
        int N = Integer.parseInt(args[0]);    //Highest seed
		String mode = args[1];
		int counterN = 1;
		boolean first1 = false;     //when counterN == 1 and didnt get inside the second while loop
		if (mode.equals("v")){
			while(counterN <= N){
				int correntN = counterN;
				int timesTo1 = 0;
				while(correntN != 1 || !first1){
					first1 = true;
					timesTo1 ++;
					System.out.print(correntN + " ");	
					if (correntN % 2 == 0){				//Even
						correntN /= 2;
					} else {							//Odd
						correntN = (correntN * 3) + 1;
					}
				}
				System.out.println(1 + " (" + (timesTo1 + 1) + ")");
				counterN ++;
			}
		} 
		System.out.print("Every one of the first " + N + " hailstone sequences reached 1.");	    
	}
}
