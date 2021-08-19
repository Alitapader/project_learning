
public class MyAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Task 1: reverse a String
		System.out.println("reverse a String");

		
		String rEverse = "My name is Ali";
		
		System.out.println(rEverse);
		
		for(int i = rEverse.length()-1; i>= 0; i--) {
			System.out.println(rEverse.charAt(i));
		}
		
		
		System.out.println();
		//Task 2: concatenate multiple String
		System.out.println("Task 2: concatenate multiple String");

		
		String fName = "Ali";
		String mName = "Hussain";
		String lName = "Tapader";
	
		
		System.out.println(fName + mName + lName);
		
		System.out.println();
		
		//Task 3: count of a character 
		System.out.println("Task 3: count of a character");
		
		int fRequency = 0;
		String sentence = "everything is messy everytime everywhere";
		
		for(int i = 0; i<sentence.length(); i++) {
			if(sentence.charAt(i)== 'e') {
				
				fRequency = fRequency + 1;
				
			}	
		}
		System.out.println(fRequency);

	}

}
