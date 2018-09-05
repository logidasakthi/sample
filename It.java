package gpack1;
import java.util.*;
import gpack3.*;
public class It{
	Scanner s=new Scanner(System.in);
	static int G1,G2;
	static String g;
	public double sem1(){
	System.out.println("mathematics");
	g=s.next();
	G1=Grad.grade(g);
	System.out.println("DPSD");
	g=s.next();
	G2=Grad.grade(g);
	double gpa=((G1*4)+(G2*3))/2;
	return gpa;
	}
	public double sem2(){
	System.out.println("mathematics");
	g=s.next();
	G1=Grad.grade(g);
	System.out.println("DPSD");
	g=s.next();
	G2=Grad.grade(g);
	double gpa=((G1*3)+(G2*4))/2;
	return gpa;
	}
}

	
	