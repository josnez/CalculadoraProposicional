package calculator;

public class Operaciones {
	
	private int p[];
	private int q[];
	private int r[];
	private int s[];
	private int numVar=0;
	
	public Operaciones(int numVar) {
		this.numVar=numVar;
		System.out.println(this.numVar);
		if(numVar==2) {
			p = new int[(int) Math.pow(2,2)];
			q = new int[(int) Math.pow(2,2)];
			inicializar();
			imprimir();
		}else if(numVar==3) {
			p = new int[(int) Math.pow(2,3)];
			q = new int[(int) Math.pow(2,3)];
			r = new int[(int) Math.pow(2,3)];
			inicializar();
			imprimir();
		}else if(numVar==4) {
			p = new int[(int) Math.pow(2,4)];
			q = new int[(int) Math.pow(2,4)];
			r = new int[(int) Math.pow(2,4)];
			s = new int[(int) Math.pow(2,4)];
			inicializar();
			imprimir();
		}
	}
	
	public void inicializar() {
		System.out.println(numVar);
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
	
	public void imprimir() {
		switch (numVar) {
		case 2:
			for(int i=0; i<4; i++) {
				System.out.println(p[i]+" "+q[i]);
			}
			break;
		case 3:
			for(int i=0; i<8; i++) {
				System.out.println(p[i]+" "+q[i]+" "+r[i]);
			}
			break;
		case 4:
			for(int i=0; i<16; i++) {
				System.out.println(p[i]+" "+q[i]+" "+r[i]+" "+s[i]);
			}
			break;
		}
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
	
}
