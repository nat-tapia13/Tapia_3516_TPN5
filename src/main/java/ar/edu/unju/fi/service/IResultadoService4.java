package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Resultado4;
/**
 * Implementamos las interfaces  para conectarse con los
 * datos almacenados en el repositorio de datos
 * @author Natalia
 *
 */
   public interface IResultadoService4 {

	/*
	 * ---METODOS---
	 */
	
    public void guardar();
	
	public Resultado4 mostrar();

	public void eliminar();
	
	public Resultado4 modificar();

}
