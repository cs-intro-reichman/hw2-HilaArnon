// Demonstrates the Collatz conjecture.
public class Collatz {
	/*
	 * Fifth question (30 points)
	 */
	public static void main(String args[]) {
        int N = Integer.parseInt(args[0]);
		String mode = args[1];
		int counterN = 1;
		if (mode.equals("v")){
			while(counterN <= N){
				int correntN = counterN;
				while(correntN != 1){
					System.out.print(correntN + " ");	
					if (correntN % 2 == 0){				//Even
						correntN /= 2;
					} else {							//Odd
						correntN = (correntN * 3) + 1;
					}
				}
				System.out.println(1);
				counterN ++;
			}
		} 
		System.out.print("Every one of the first " + N + " hailstone sequences reached 1.");	    
	}
}
