package calculator;

public class Operaciones {
	
	private int p[];
	private int q[];
	private int r[];
	private int s[];
	private int op1[];
	private int op2[];
	private int op3[];
	private int op4[];
	private int numVar=0;
	
	public Operaciones(int numVar, int numOp) {
		this.numVar=numVar;
		if(numVar==2) {
			p = new int[(int) Math.pow(2,2)];
			q = new int[(int) Math.pow(2,2)];
			inicializar();
		}else if(numVar==3) {
			p = new int[(int) Math.pow(2,3)];
			q = new int[(int) Math.pow(2,3)];
			r = new int[(int) Math.pow(2,3)];
			inicializar();
		}else if(numVar==4) {
			p = new int[(int) Math.pow(2,4)];
			q = new int[(int) Math.pow(2,4)];
			r = new int[(int) Math.pow(2,4)];
			s = new int[(int) Math.pow(2,4)];
			inicializar();
		}
	}
	
	public void inicializar() {
		switch (numVar) {
		case 2:
			p[0]=1;p[1]=1;p[2]=0;p[3]=0;
			q[0]=1;q[1]=0;q[2]=1;q[3]=0;
			break;
		case 3:
			p[0]=1;p[1]=1;p[2]=1;p[3]=1;p[4]=0;p[5]=0;p[6]=0;p[7]=0;
			q[0]=1;q[1]=1;q[2]=0;q[3]=0;q[4]=1;q[5]=1;q[6]=0;q[7]=0;
			r[0]=1;r[1]=0;r[2]=1;r[3]=0;r[4]=1;r[5]=0;r[6]=1;r[7]=0;
			break;
		case 4:
			p[0]=1;p[1]=1;p[2]=1;p[3]=1;p[4]=1;p[5]=1;p[6]=1;p[7]=1;p[8]=0;p[9]=0;p[10]=0;p[11]=0;p[12]=0;p[13]=0;p[14]=0;p[15]=0;
			q[0]=1;q[1]=1;q[2]=1;q[3]=1;q[4]=0;q[5]=0;q[6]=0;q[7]=0;q[8]=1;q[9]=1;q[10]=1;q[11]=1;q[12]=0;q[13]=0;q[14]=0;q[15]=0;
			r[0]=1;r[1]=1;r[2]=0;r[3]=0;r[4]=1;r[5]=1;r[6]=0;r[7]=0;r[8]=1;r[9]=1;r[10]=0;r[11]=0;r[12]=1;r[13]=1;r[14]=0;r[15]=0;
			s[0]=1;s[1]=0;s[2]=1;s[3]=0;s[4]=1;s[5]=0;s[6]=1;s[7]=0;s[8]=1;s[9]=0;s[10]=1;s[11]=0;s[12]=1;s[13]=0;s[14]=1;s[15]=0;
			break;
		}
	}
	
	public int[] conjuncion(int x[],int y[]) {
		int l[] = new int[(int)Math.pow(2, numVar)];
		for(int i=0; i<l.length; i++) {
			if((x[i]==1) && (y[i]==1))
				l[i]=1;
			else 
				l[i]=0;
		}
		imprimir(x, y, l, "Conjuncion");
		return l;
	}
	
	public int[] disyuncion(int x[],int y[]) {
		int l[] = new int[(int)Math.pow(2, numVar)];
		for(int i=0; i<l.length; i++) {
			if(x[i]==0 && y[i]==0)l[i]=0;
			else l[i]=1;
		}
		imprimir(x, y, l, "Disyuncion");
		return l;
	}

	public int[] implicacion(int x[],int y[]) {
		int l[] = new int[(int)Math.pow(2, numVar)];
		for(int i=0; i<l.length; i++) {
			if(x[i]==1 && y[i]==0)l[i]=0;
			else l[i]=1;
		}
		imprimir(x, y, l, "Implicacion");
		return l;
	}
	
	public int[] dobleImplicacion(int x[],int y[]) {
		int l[] = new int[(int)Math.pow(2, numVar)];
		for(int i=0; i<l.length; i++) {
			if(x[i]==1 && y[i]==1)l[i]=1;
			else if (x[i]==0 && y[i]==0)l[i]=1;
			else l[i]=0;
		}
		imprimir(x, y, l, "Doble Implicacion");
		return l;
	}
	
	public int[] negacion(int x[]) {
		int l[] = new int[(int)Math.pow(2, numVar)];
		for(int i=0; i<l.length; i++) {
			if(x[i]==1)l[i]=0;
			else l[i]=1;
		}
		imprimirNeg(x, l, " Negacion");
		return l;
	}
	
	private void imprimirNeg(int[] x, int[] l, String c) {
		System.out.println(" "+c);
		for(int i=0; i<x.length; i++) {
			System.out.println("| "+x[i]+" | "+l[i]+" |");
		}
		System.out.println();
	}

	public void imprimir(int x[],int y[],int l[], String c) {
		System.out.println(" "+c);
		for(int i=0; i<x.length; i++) {
			System.out.println("| "+x[i]+" "+y[i]+" | "+l[i]+" |");
		}
		System.out.println();
	}
	
	public int[] getP() {
		return p;
	}
	public int[] getQ() {
		return q;
	}
	public int[] getR() {
		return r;
	}
	public int[] getS() {
		return s;
	}

	public int[] getOp1() {
		return op1;
	}

	public void setOp1(int[] op1) {
		this.op1 = op1;
	}

	public int[] getOp2() {
		return op2;
	}

	public void setOp2(int[] op2) {
		this.op2 = op2;
	}

	public int[] getOp3() {
		return op3;
	}

	public void setOp3(int[] op3) {
		this.op3 = op3;
	}

	public int[] getOp4() {
		return op4;
	}

	public void setOp4(int[] op4) {
		this.op4 = op4;
	}
	
	
}
