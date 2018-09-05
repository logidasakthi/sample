package gpack3;
import java.util.*;
public class Grad{
	static int g1;
	public static int grade(String g){
	if(g.equals("O")){
	g1=10;
	}
	if(g.equals("A+")){
	g1=9;
	}
	if(g.equals("A")){
	g1=8;
	}
	return g1;
	}
}