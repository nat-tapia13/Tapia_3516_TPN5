package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Cuota6;
import ar.edu.unju.fi.repository.ICuota6;

@Repository
public class CuotaServiceImp6 implements ICuotaService6{

	@Autowired
	private ICuota6 icuota;
	
	@Override
	public void guardar() {
		
	icuota.guardar();	
		
	}

	@Override
	public Cuota6 mostrar() {
	
	Cuota6 cuota=icuota.mostar();
	return cuota;
	
	}

	@Override
	public void eliminar() {
		
	icuota.eliminar();	
		
	}

	@Override
	public Cuota6 modificar() {
	
	Cuota6 cuota=icuota.modificar();
	return cuota;	
	
	}

}
