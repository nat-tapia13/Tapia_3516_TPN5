package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Tapia3516Tpn5Application;
import ar.edu.unju.fi.model.Estadio2;

@Repository("estadioImp")
public class EstadioImp2 implements IEstadio2 {

	@Autowired
	private Estadio2 estadio;

	public static Logger LOG = LoggerFactory.getLogger(Tapia3516Tpn5Application.class);

	@Override
	public void guardar() {
		// accion ejecutada para guardar un objeto equipo en la BD
		LOG.info("El nombre del estadio fue guardado" + estadio.getNombre() + "," + estadio.getFechaFundacion() + ","
				+ estadio.getCiudad() + "," + estadio.getCapacidad() + "," + estadio.getDirección());
	}

	@Override
	public Estadio2 mostar() {
		// se recuperan todos los datos del equipo
		LOG.info("Mostar datos del estadio");
		return estadio;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto equipo de la BD
		LOG.info("Se elimino los datos de estadio");

	}

	@Override
	public Estadio2 modificar() {
		// se modifica el objeto estadio de la BD
		LOG.info("Se modifico datos de estadio");
		return estadio;
	}

}
