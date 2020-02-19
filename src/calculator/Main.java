package calculator;
import java.util.Scanner;
import pila.*;

public class Main {

	private static int numVar=0, numOpe;
	private static char[] ordPro = {'.','.','.','.','.','.','.','.','.','.','.','.'}, auxOrdPro = {'.','.','.','.','1','2','3','4'};
	private static Operaciones op;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		op = new Operaciones(numVar, numOpe);
		String exp = hallarExpresion();
		System.out.println(exp);
		hallarSolucion(exp);
		
	}
	
	public static String hallarExpresion() {
		String exp="";
		@SuppressWarnings("resource")
		Scanner lector = new Scanner(System.in);
		Pila pilita = new PilaArray();
		
		String expresion = lector.next();
		char c;
		int y=0,o=0;
		
		for(int i=0; i<expresion.length(); i++) {
			c = expresion.charAt(i);
			switch (c) {
			case '(': break;
			case 'y': pilita.push(c);y+=1;break;
			case 'o': pilita.push(c);o+=1;break;
			case 'p':exp=exp+c;ordPro[i]='p';numVar++;break;
			case 'q':exp=exp+c;ordPro[i]='q';numVar++;break;
			case 'r':exp=exp+c;ordPro[i]='r';numVar++;break;
			case 's':exp=exp+c;ordPro[i]='s';numVar++;break;
			case ' ':System.out.print(" ");break;
			case ')':exp=exp+pilita.pop();break;
			default: System.out.print("Expresion no valida");
			}
		}
		
		ordPro(expresion);
		
		
		numOpe=y+o; 
		System.out.println();
		return exp;
	}

	public static void hallarSolucion(String exp) {
		Pila pilita = new PilaArray();
		int numOp=0;
		int x[] = new int[(int)Math.pow(2, numVar)];
		char c;
		for(int i=0; i<exp.length();i++) {
			c = exp.charAt(i);
			switch (c) {
			case 'y': 
				x = op.conjuncion(obtPro(pilita.pop()), obtPro(pilita.pop()));
				numOp++;
				if(numOp==1) {
					op.setOp1(x);
					pilita.push('1');
				}else if(numOp==2) {
					op.setOp2(x);
					pilita.push('2');
				}else if(numOp==3) {
					op.setOp3(x);
					pilita.push('3');
				}else {
					op.setOp4(x);
					pilita.push('4');
				}
				break;
			case 'o': 
				x = op.disyuncion(obtPro(pilita.pop()), obtPro(pilita.pop()));
				numOp++;
				if(numOp==1) {
					op.setOp1(x);
					pilita.push('1');
				}else if(numOp==2) {
					op.setOp2(x);
					pilita.push('2');
				}else if(numOp==3) {
					op.setOp3(x);
					pilita.push('3');
				}else {
					op.setOp4(x);
					pilita.push('4');
				}
				break;
			case 'p':pilita.push(c);break;
			case 'q':pilita.push(c);break;
			case 'r':pilita.push(c);break;
			case 's':pilita.push(c);break;
			}
		}
	}
	
	public static void ordPro(String expresion) {
		int aux=0;
		
		for(int i=0; i<expresion.length(); i++) {
			if(numVar==2 && ordPro[i]!='.') {
				aux++;
				if(aux==1) {
					auxOrdPro[0]=ordPro[i];
				}else {
					auxOrdPro[1]=ordPro[i];
				}
			}else if(numVar==3 && ordPro[i]!='.'){
				aux++;
				if(aux==1) {
					auxOrdPro[0]=ordPro[i];
				}else if(aux==2){
					auxOrdPro[1]=ordPro[i];
				}else if(aux==3){
					auxOrdPro[2]=ordPro[i];
				}
				
			}else if(numVar==4 && ordPro[i]!='.'){
				aux++;
				if(aux==1) 
					auxOrdPro[0]=ordPro[i];
				else if(aux==2)
					auxOrdPro[1]=ordPro[i];
				else if(aux==3)
					auxOrdPro[2]=ordPro[i];
				else if(aux==4)
					auxOrdPro[3]=ordPro[i];
			}
		}
	}
	
	public static int[] obtPro(Object object) {
		int aux=-1;
	
		for(int i=0; i<8; i++) {
			if(auxOrdPro[i]==(char)object)aux=i;
		}
		if(aux==0)return op.getP();
		else if(aux==1)return op.getQ();
		else if(aux==2)return op.getR();
		else if(aux==3)return op.getS();
		else if(aux==4)return op.getOp1();
		else if(aux==5)return op.getOp2();
		else if(aux==6)return op.getOp3();
		else return op.getOp4();
	}
	
}
