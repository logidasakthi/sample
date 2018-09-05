package pack;
import gpack1.*;
import gpack3.*;
import java.util.*;
public class Gpa{
	public static void main(String args[]){
	It t=new It();
	double gpa;
	Scanner s=new Scanner(System.in);
	System.out.println("1.IT/n2.CSE/n");
	int ch=s.nextInt();
	switch(ch){
	case 1:
	System.out.println("IT DEPT");
	System.out.println("enter the sem");
	int n=s.nextInt();
	switch(n){
		case 1:
		System.out.println("1st sem");
		gpa=t.sem1();
		System.out.println(gpa);
		break;
		case 2:
		System.out.println("2nd sem");
		gpa=t.sem2();
		System.out.println(gpa);
		break;
		default:
		System.out.println("enter the correct option");
		}
	}
}
}
	
