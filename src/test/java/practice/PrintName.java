
package practice;

public class PrintName {
	public static void main(String[] args) {
		
		printMyName(5);
	}
	
	
	public static void printMyName(int count) {
		System.out.println("Hareesha D P");
		
		if (count == 1) {
			return;
		}
		printMyName(count-1);
	}

}
