package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Tapia3516Tpn5Application;
import ar.edu.unju.fi.model.Equipo1;


@Repository("equipoImp")
public class EquipoImp1 implements IEquipo1 {

	@Autowired
	private Equipo1 equipo;
	
	public static Logger LOG = LoggerFactory.getLogger(Tapia3516Tpn5Application.class);
	
	@Override
	public void guardar() {
		//accion ejecutada para guardar un objeto equipo en la BD
	  LOG.info("El nombre del equipo fue guardado"+equipo.getNombre()+","+equipo.getEstadio());
	}

	@Override
	public Equipo1 mostar() {
		//se recuperan todos los datos del equipo 
		LOG.info("Mostar datos del equipo");
		return equipo;
	}

	@Override
	public void eliminar() {
		//se elimina el objeto equipo de la BD
		LOG.info("Se elimino los datos de equipo");
		
	}

	@Override
	public Equipo1 modificar() {
		// se modifica el objeto equipo de la BD
		return equipo;
	}

}
