package pila;

public class PilaArray implements Pila {

	private int top = -1;
	private Object s[];
	private int capacidad = 0;
	
	public PilaArray() {
		this(100);
	}
	
	public PilaArray(int cap) {
		this.capacidad = cap;
		s = new Object[capacidad];
	}
	
	@Override
	public int longitud() {
		// TODO Auto-generated method stub
		return (top+1);
	}

	@Override
	public boolean estaVacia() {
		// TODO Auto-generated method stub
		return (top<0);
	}

	@Override
	public void push(Object o) {
		// TODO Auto-generated method stub
		if(longitud()<capacidad) s[++top] = o;
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		Object aux;
		if(estaVacia()) return null;
		aux = s[top];
		s[top--] = null;
		return aux;
	}

	@Override
	public Object primero() {
		// TODO Auto-generated method stub
		if(estaVacia()) return null;
		else return s[top];
	}

}
