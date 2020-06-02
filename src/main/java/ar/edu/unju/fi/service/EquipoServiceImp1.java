package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Equipo1;
import ar.edu.unju.fi.repository.IEquipo1;

@Repository
public class EquipoServiceImp1 implements IEquipoService1{

	/*
	 * ---ATRIBUTOS--
	 */
	@Autowired
	private IEquipo1 iequipo;
	
	
	
	@Override
	public void guardar() {
		
	iequipo.guardar();		
		
	}

	@Override
	public Equipo1 mostrar() {
		
	Equipo1 equipo =iequipo.mostar();
	return equipo;
	}

	@Override
	public void eliminar() {
		
	iequipo.eliminar();
	
	}

	@Override
	public Equipo1 modificar() {
	
	Equipo1 equipo = iequipo.modificar();
	return equipo;
	}

}
