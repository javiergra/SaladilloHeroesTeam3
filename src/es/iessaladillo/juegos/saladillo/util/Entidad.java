package es.iessaladillo.juegos.saladillo.util;

/**
 * @author Javier Graña
 * Entidades definidas por un tipo y por dos posiciones sobre un mapa bidimensional
 */
public class Entidad {


	String tipo;
	int x;
	int y;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}


	@Override
	public String toString() {
		return "Entidad [tipo=" + tipo + ", x=" + x + ", y=" + y + "]";
	}
	
}
