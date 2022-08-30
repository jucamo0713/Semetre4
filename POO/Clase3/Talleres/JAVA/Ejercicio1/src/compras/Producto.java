package compras;

public class Producto {
	private final int codigo;
	private String nombre;
	String tipo;
	static int totalProductosPedidos;
	
	public Producto(int codigo, String nombre, String tipo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	void imprimirNombre() {
		System.out.print(nombre);
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public static int getTotalProductosPedidos() {
		return totalProductosPedidos;
	}
}
