package es.iessaladillo.juegos.saladillo.model.delegate;

import es.iessaladillo.juegos.saladillo.controller.MapaInterface;
import es.iessaladillo.juegos.saladillo.util.ConjuntoPosiciones;
import es.iessaladillo.juegos.saladillo.util.Direccion;
import es.iessaladillo.juegos.saladillo.util.Entidad;
import es.iessaladillo.juegos.saladillo.util.Posicion;


/** Heroes del Saladillo. Interfaz de la fachada del modelo
 * 
 * @author Javier Graña
 *
 */

public interface SaladilloFacadeDelegate {
/** Crea un mapa a partir de un conjunto de entidades */
 public MapaInterface mapaFromEntidades(Entidad[] entidades);
 /** Carga un mapa a partir de un conjunto de entidades */
 public void cargarMapa(Entidad[]entidades);
 /** Carga un mapa */
 public void cargarMapa(MapaInterface mapa);
 /** Mueve al heroe en la dirección indicada */
 public MapaInterface mover(Direccion direccion);
 /** Reinicia el nivel */
 public MapaInterface	 reiniciarNivel();
 /** Indica la posición actual del heroe */
 public Posicion getPosicionHeroe();
 /** Indica el número de diamantes pendientes por recoger en el mapa */
 public int diamantesEnMapa();
 /** Devuelve las posiciones que han cambiado tras el último movimiento */
 public ConjuntoPosiciones posicionesAActualizar();
 
 
}
