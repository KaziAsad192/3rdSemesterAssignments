import java.text.DecimalFormat;
import java.util.Scanner;

public class classtask1 {
	static double countCg(String grade,double credit)
	{
		if(grade.matches("A"))
		{
			double x =4*credit;
			return x;
		}
		if(grade.matches("A-"))
		{
			double y =3.7*credit;
			return y;
		}
		return 1;
	}
	
	public static void main(String[] args){
		System.out.println("Enter the semester name:");
		Scanner scanner = new Scanner(System.in);
		String Semester=scanner.nextLine();
		
		
		System.out.println("Enter the first course code :");
		String code = scanner.nextLine();
		System.out.println("Enter the grade:");
		String grade = scanner.nextLine();
		System.out.println("Enter the number of credits:");
		double credit1 = scanner.nextDouble();
		double grade_point_1=countCg(grade,credit1);
		
		System.out.println("Enter the second course code:");
		scanner.nextLine();
		String code2 = scanner.nextLine();
		System.out.println("Enter the grade:");
		String grade2 = scanner.nextLine();
		System.out.println("Enter the number of credits:");
		double credit2 = scanner.nextDouble();
		double grade_point_2=countCg(grade2,credit2);
		
		System.out.println("Enter the third Course code:");
		scanner.nextLine();
		String code3 = scanner.nextLine();
		System.out.println("Enter the grade:");
		String grade3 = scanner.nextLine();
		System.out.println("Enter number of credits:");
		double credit3 = scanner.nextDouble();
		double grade_point_3=countCg(grade3,credit3);
		DecimalFormat gpa = new DecimalFormat(".00");
		
		double cg=(grade_point_1+grade_point_2+grade_point_3)/(credit1+credit2+credit3);
		System.out.println("        "+"  course    "+" credit    "+"   Grade   "+"credit*grade"+ "     cgpa    ");
		System.out.println();
		System.out.print(Semester+"  ");
		System.out.println(code+"       "+credit1+"         "+grade+"        "+gpa.format(grade_point_1));
		System.out.println("          "+code2+"      "+credit2+"         "+grade2+"       "+gpa.format(grade_point_2)+"           "+gpa.format(cg));
		System.out.println("          "+code3+"       "+credit3+"         "+grade3+"       "+gpa.format(grade_point_3));
	}
	
	

}
