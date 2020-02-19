package calculator;

public class Operaciones {
	
	private int p[];
	private int q[];
	private int r[];
	private int s[];
	private int numVar;
	
	public Operaciones(int numVar) {
		this.numVar=numVar;
		if(numVar==2) {
			p = new int[(int) Math.pow(2,2)];
			q = new int[(int) Math.pow(2,2)];
		}else if(numVar==3) {
			p = new int[(int) Math.pow(2,3)];
			q = new int[(int) Math.pow(2,3)];
			r = new int[(int) Math.pow(2,3)];
		}else if(numVar==4) {
			p = new int[(int) Math.pow(2,4)];
			q = new int[(int) Math.pow(2,4)];
			r = new int[(int) Math.pow(2,4)];
			s = new int[(int) Math.pow(2,4)];
		}
	}
	
	public void inicializar() {
		int i,j;
		if(numVar==2) {
			for(i=0; i<2; i++) {
				p[i]=1;
				for(j=0; j<1; j++) {
					q[j]=1;
				}
			}
			for(i=i; i<2; i++) {
				p[i]=1;
				for(j=0; j<1; j++) {
					q[i]=1;
				}
			}
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
