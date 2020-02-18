package pila;

public interface Pila {
	
	public int longitud();
	public boolean estaVacia();
	public void push(Object o);
	public Object pop();
	public Object primero();
}
