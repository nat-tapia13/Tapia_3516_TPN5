package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unju.Tapia3516Tp5Application;
import ar.edu.unju.fi.model.Resultado4;

public class ResultadoImp4 implements IResultado4 {

	@Autowired
	private Resultado4 resultado;
	
	public static Logger LOG=LoggerFactory.getLogger(Tapia3516Tp5Application.class);

	@Override
	public void guardar() {
		
	// accion ejecutada para guardar un objeto resultado en la BD
	LOG.info("La noticia fue guardada"+resultado.getFecha()+","+resultado.getEquipo1()
					+","+resultado. getEquipo2()+","+resultado.getGolesEquipo1()+","
					+resultado.getGolesEquipo2());	
		
	}

	@Override
	public Resultado4 mostar() {
		
    // se recuperan toda la informacion resultado
	LOG.info("Mostar informacion de resultado");
    return resultado;	
		
	}

	@Override
	public void eliminar() {
		
	// se elimina el objeto resultado de la BD
	LOG.info("Se elimino la informacion de resultado");	
		
	}

	@Override
	public Resultado4 modificar() {
		
	 // se modifica el objeto resultado de la BD
	LOG.info("Se modifico informacion de resultado");
	return resultado;	
		
	}

}
