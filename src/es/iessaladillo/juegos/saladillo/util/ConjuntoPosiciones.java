package es.iessaladillo.juegos.saladillo.util;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;




public class ConjuntoPosiciones {
	
	private ArrayList <Posicion> posiciones;

	public ConjuntoPosiciones() {

	}

	public	void anhadirPosicion(Posicion posicion){
		posiciones.add(posicion);
	}

	public Iterator <Posicion> obtenerPosiciones(){
		return posiciones.iterator();
	}

    public boolean estaVacio(){
    	return posiciones.isEmpty();
    	
    }

}
