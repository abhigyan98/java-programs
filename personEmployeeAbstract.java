package assignment3;
import java.util.*;
interface Examination{
	boolean pass(int marks);
}
interface Classify{
	String division(int avg);
}
public class Result implements Examination,Classify{
   public boolean pass(int marks){
	   if(marks>=50)
		   return true;
    	return false;
    }
   public String division(int avg){
	   if(avg>=60)
		   return "First";
	   else if(avg>=50&&avg<60)
		   return "Second";
	   else
		   return "No Division";
   }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Examination examination = new Result();
		Classify classify = new Result();
		System.out.println("Enter marks : ");
		int marks = sc.nextInt();
		System.out.println("Enter average : ");
		int avg = sc.nextInt();
		System.out.println(examination.pass(marks)?"Pass":"Fail");
		System.out.println("Division : "+classify.division(avg));
	}

}
