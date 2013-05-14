package es.iessaladillo.juegos.saladillo.controller;


/** 
 * Interfaz común para interfaz y modelo que describe un elemento que se puede dibujar en un mapa de un juego de bloques
 * 
 * 
 * @author Javier Graña
 * @version 1.0
 */



public interface Dibujable extends Cloneable{
	
	/** Devuelve el nombre de la imagen asociada a un elemento del mapa.
	 * 
	 * @return Nombre de la imagen
	 */
	
	public String getNombreImagen();
	
	/** Devuelve si el elemento contiene otro elemento de fondo.
	 * 
	 * @return Nombre de la imagen
	 */
	public boolean contieneFondo();
	
	/** Devuelve el elemento de fondo o null si no lo hubiese.
	 * 
	 * @return Nombre de la imagen
	 */
	public Dibujable getFondo();
	
	public void setFondo(Dibujable dibujable);
	
	public String getNombreClase();
	
	public Object clone();
	

	
}
