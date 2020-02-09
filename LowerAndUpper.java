import java.util.Scanner;

public class LowerAndUpper {
	public static void main(String[] args) {
		System.out.println("please Enter the Lower Bound:");
        Scanner scanner = new Scanner(System.in);
        int lowerBound = scanner.nextInt();
        System.out.println("Please enter the upper bound:");
        int upperBound=scanner.nextInt();

        System.out.println("Numbers divisible by 5 0r 8: ");
        while (upperBound>=lowerBound){
           if (upperBound%5==0 && upperBound%8==0) {
               System.out.print(upperBound + ", ");
           }
               upperBound-- ;
       }
	}

}
