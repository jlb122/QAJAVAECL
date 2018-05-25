package qa;

public class C_Loops {

	public static void main(String[] args) {
		// Demo 3.06 - While Loop
		int i = 0;

		while (i < 10) {
			System.out.println(i);
			i++;
		}

		// Demo 3.07 - Do While Loop
		int j = 10;

		do {
			System.out.println(j);
			j++;
		} while (j < 20);

		// Demo 3.08 - For Loop
		for(int x = 0; x < 10; x++) {
			System.out.println(x);
		}

		for(int y = 0, z = 0; y < 5 && z < 5; y++, z++){
			System.out.println("(" + y + ", " + z + ")");
		}

		// Demo 3.09 - Breaking out of loops
		int k = 0;
		while(true) {
			if (k > 10) {
				System.out.println("k is greater than 10, I'm outta here");
				break;
			}
			k++;
		}

		System.out.println("k was " + k + " when the loop exited");

		// Demo 3.10 - Nesting Statements
		int b = 0;
		int c = 0;

		while(b < 10) {
			while(c < 10) {
				System.out.println("(" + b + ", " + c + ")");
				c++;
			}
			c = 0;
			b++;
		}

		// Demo 3.11 - Looping through arrays
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		for(int a = 0; a <= arr.length -1; a++) {
			System.out.println(arr[a] + " is the current value in the array element referenced");
		}

		// Demo 3.12 - Scope
		int s = 0; 		// s is in the scope of the main method

		for(int t = 0; t < 5; t++) {
			System.out.println(t); // t is in scope of this loop only
		}

		// System.out.println(t);
	}

}
