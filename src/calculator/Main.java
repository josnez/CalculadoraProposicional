package calculator;
import java.util.Scanner;
import pila.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hallarExpresion());
		
	}
	
	public static String hallarExpresion() {
		String exp="";
		Scanner lector = new Scanner(System.in);
		Pila pilita = new PilaArray();
		
		String expresion = lector.next();
		char c;
		int p=0,r=0,s=0,q=0, numVar;
		
		for(int i=0; i<expresion.length(); i++) {
			c = expresion.charAt(i);
			switch (c) {
			case '(': break;
			case 'y': pilita.push(c);break;
			case 'o': pilita.push(c);break;
			case 'p':exp=exp+c;p=1;break;
			case 'q':exp=exp+c;q=1;break;
			case 'r':exp=exp+c;r=1;break;
			case 's':exp=exp+c;s=1;break;
			case ' ':System.out.print(" ");break;
			case ')':exp=exp+pilita.pop();break;
			default: System.out.print("Expresion no valida");
			}
		}
		numVar=p+q+r+s;
		
		System.out.println();
		return exp;
	}

}
