import java.util.Scanner;

public class cmsc401 {

	public static void main(String[] args) {
		int intArray[] = null;
		grabData(intArray);
		printData(intArray);
	}
	
	public static void grabData(int intArray[]) {
		Scanner sc = new Scanner(System.in);
		int numOfElements;
		int absoluteValue;
		numOfElements = sc.nextInt();
		absoluteValue = sc.nextInt();
		intArray = new int[numOfElements];
		for(int i = 0; i < numOfElements; i++) {
			int temp = sc.nextInt();
			if(Math.abs(temp) <= absoluteValue) {
				intArray[i] = temp;
			}
		}
	}
	
	public static void printData(int intArray[]) {
		for (int i : intArray) {
			System.out.println(i);
		}
	}

}
