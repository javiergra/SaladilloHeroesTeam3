package es.iessaladillo.juegos.saladillo.util;

/** Describe la posición en un mapa bidimensional
 * 
 * 
 * @author Javier Graña
 * @version 1.0
 */

public class Posicion {
	

	private int x;
	private int y;
	
	/** Constructor
	 * 
	 * @param x Coordenada x del mapa
	 * @param y Coordenada y del mapa
	 */
	
	public Posicion(int x, int y){
		this.x=x;
		this.y=y;
		
		
	}
	
	

	
	/**
	 * @return Coordenada x del mapa
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x Coordenada x del mapa
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return Coordenada y del mapa  
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param Coordenada y del mapa
	 */
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Posicion [x=" + x + ", y=" + y + "]";
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

}
