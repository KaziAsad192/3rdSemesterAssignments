package NsuGradeing;

import java.util.Scanner;

public class gradetoScholarship {
	

	    public static void main(String[] args){
	        System.out.print("Please Enter Your Number (in-between 0 to 100) (to check CGPA): ");
	        Scanner scanner = new Scanner(System.in);
	        float number = scanner.nextFloat() ;
	        String Grade ;
	        float cgpa ;
	        String Question = "Yes";

	        String firstQuestion = " " ;

	        if (number>=93 && number<=100){
	            Grade = "A";
	            cgpa = 4.00f;
	        }
	        else if (number>=90 && number<=92){
	            Grade ="A-";
	            cgpa = 3.70f;
	        }
	        else if (number>=87 && number<=89){
	            Grade = "B+";
	            cgpa = 3.30f;
	        }
	        else if (number>=83 && number<=86){
	            Grade = "B";
	            cgpa = 3.00f;
	        }
	        else if (number>=80 && number<=82){
	            Grade = "B-";
	            cgpa = 2.70f;
	        }
	        else if (number>=77 && number<=79){
	            Grade = "C+";
	            cgpa = 2.3f;
	        }
	        else if (number>=73 && number<=76){
	            Grade = "C";
	            cgpa = 2.00f;
	        }
	        else if (number>=70 && number <=72){
	            Grade = "C-";
	            cgpa = 1.70f;
	        }
	        else if (number>=67 && number<=69){
	            Grade = "D+";
	            cgpa =1.30f;
	        }
	        else if (number>=60 && number<=66){
	            Grade ="D";
	            cgpa = 1.00f;
	        }

	        else{
	            Grade = "F";
	            cgpa=0.00f;
	        }

	        System.out.println("Your CGPA = "+ cgpa + "\nYour Grade =" + Grade);

	        if (cgpa>=3.00 && cgpa<=4.00) {
	            System.out.println("D: Congratulation You are Eligible to Apply for Your ScholarShip :) ");
	            System.out.println("\nD: Do you want to Apply for the Post graduate program? (Yes or No):) :");

	            Scanner input = new Scanner(System.in);
	            String Answer1= input.nextLine();

	            if (Answer1.compareToIgnoreCase(Question) == 0){
	                System.out.println("D: Please Go to the desk number 7 fo further Information.. :) ");
	                //Ask Question to the person on the Desk(Task)
	                String Answer2= input.nextLine();
	                if (Answer2.compareTo(firstQuestion)>0){
	                    System.out.println("S: Excuse me ! I need to know something..");

	                    String Answer3 = input.nextLine();
	                    if (Answer3.compareToIgnoreCase(firstQuestion) >= 0){
	                        System.out.println("S:Does Your University offer the course I'm Interested in ? :| ");

	                        String Answer4= input.nextLine();
	                        if (Answer4.compareToIgnoreCase(firstQuestion)>=0){
	                            System.out.println("S: What should I submit with my scholarship application ? ");

	                            String Answer5 = input.nextLine();
	                            if (Answer5.compareToIgnoreCase(firstQuestion)>=0){
	                                System.out.println("S: What are the university facilities like? Is the library open 24 hours a day?");

	                                String Answer6 = input.nextLine();
	                                if (Answer6.compareToIgnoreCase(firstQuestion)>=0){
	                                    System.out.println("S: Do you want to add anything what should I know before become a student of this University... :) ");

	                                    String Answer7= input.nextLine();
	                                    if (Answer7.compareToIgnoreCase(firstQuestion)>=0){
	                                        System.out.println("S: Okay!!!! Thank you for your kind information...");
	                                    }
	                                }

	                            }
	                        }
	                    }
	                }
	            }
	            else
	                System.out.println("Thank you for communicate....");
	        }
	        else
	            System.out.println("You are not allowed to Apply for Scholarship :( ");
	    }


}
