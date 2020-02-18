package main;
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
		
		for(int i=0; i<expresion.length(); i++) {
			c = expresion.charAt(i);
			switch (c) {
			case '(': break;
			case 'y': pilita.push(c);break;
			case 'o': pilita.push(c);break;
			case 'p':exp=exp+c;break;
			case 'q':exp=exp+c;break;
			case 'r':exp=exp+c;break;
			case ' ':System.out.print(" ");break;
			case ')':exp=exp+pilita.pop();break;
			default: System.out.print("Expresion no valida");
			}
			
		}
		
		System.out.println();
		return exp;
	}

}
