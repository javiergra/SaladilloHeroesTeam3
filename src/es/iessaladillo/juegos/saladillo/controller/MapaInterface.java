package es.iessaladillo.juegos.saladillo.controller;

import es.iessaladillo.juegos.saladillo.util.Posicion;

public interface MapaInterface {

	Dibujable obtenerPosicion(Posicion posicion);
	Posicion getPosicionHeroe();
	void ponerElemento(Posicion posicion, Dibujable dibujable);
	
}
