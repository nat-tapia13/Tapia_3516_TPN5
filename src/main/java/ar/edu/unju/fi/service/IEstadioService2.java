package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Estadio2;

/**
 * Implementamos las interfaces  para conectarse con los
 * datos almacenados en el repositorio de datos
 * @author Natalia
 *
 */
public interface IEstadioService2 {


	/*
	 * ---METODOS---
	 */
	
	public void guardar();
	
	public Estadio2 mostrar();

	public void eliminar();
	
	public Estadio2 modificar();
}
