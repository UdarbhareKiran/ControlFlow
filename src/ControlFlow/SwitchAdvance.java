package ControlFlow;

public class SwitchAdvance {
	
	public static void main(String[] args) {
	//	case-1-final varibale aallowed
	final	int a=10,b=20;
		switch(a) {
		case a:System.out.println("Kiran");
		case b:System.out.println("Rahul");
		}
//		case-2 error-case expressions must be constant expressions
//			int c=10,d=20;
//		switch(c) {
//		case c:System.out.println("Kiran");
//		case d:System.out.println("Rahul");
	}
	{
   int a=10;
   switch(a) {
   case 10:System.out.println("Rahul");
   case 20:System.out.println("ram");
   
   }
}}