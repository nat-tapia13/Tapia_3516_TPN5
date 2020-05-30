package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Estadio2;
import ar.edu.unju.fi.repository.IEstadio2;

@Repository
public class EstadioServiceImp2 implements IEstadioService2{

	@Autowired
	private IEstadio2 iestadio;
	/*
	 * --METODOS---
	 */
	@Override
	public void guardar() {
		// 
		iestadio.guardar();
	}

	@Override
	public Estadio2 mostrar() {
		Estadio2 estadio= iestadio.mostar();
		return estadio;
		
	}

	@Override
	public void eliminar() {
		iestadio.eliminar();
		
	}

	@Override
	public Estadio2 modificar() {
		Estadio2 estadio= iestadio.modificar();
		return estadio;
	}

}
