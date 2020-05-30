package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Tapia3516Tpn5Application;
import ar.edu.unju.fi.model.Cuota6;

@Repository("cuotaImp")
public class CuotaImp6 implements ICuota6 {

	@Autowired
	private Cuota6 cuota;
	public static Logger LOG = LoggerFactory.getLogger(Tapia3516Tpn5Application.class);

	@Override
	public void guardar() {

		// accion ejecutada para guardar un objeto cuota en la BD
		LOG.info("Datos de Cuota fue guardada" +cuota.getId()+ "," +cuota.getFechaPago()+","
				+cuota.getPeriodo()+ ","+cuota.getMonto()+ "," +cuota.getEstado()+","
				+cuota. getUsuario());
	}
	@Override
	public Cuota6 mostar() {

		// se recuperan toda la informacion cuota
		LOG.info("Mostar informacion de resultado");
        return cuota;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto cuota de la BD
		LOG.info("Se elimino la informacion cuota ");

	}

	@Override
	public Cuota6 modificar() {
	// se modifica un nuevo objeto cuota de la BD
		 LOG.info("Se modifico informacion de cuota");
			return cuota;
	}

}
