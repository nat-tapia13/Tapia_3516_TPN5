package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unju.Tapia3516Tp5Application;
import ar.edu.unju.fi.model.Noticia3;

public class NoticiaImp3 implements INoticia3 {

	@Autowired
	private Noticia3 noticia;
	
	public static Logger LOG=LoggerFactory.getLogger(Tapia3516Tp5Application.class);
	
	@Override
	public void guardar() {
		
	// accion ejecutada para guardar un objeto noticia en la BD
	LOG.info("La noticia fue guardada"+noticia.getTitulo()+","+noticia.getFecha()
			+","+noticia.getResumen());
	
	}
	
	@Override
	public Noticia3 mostar() {
		
	// se recuperan toda la informacion de noticia
	LOG.info("Mostar informacion de noticia");
	return noticia;	
	
	}

	@Override
	public void eliminar() {
		
	// se elimina el objeto equipo de la BD
	LOG.info("Se elimino la informacion de noticia");	
		
	}

	@Override
	public Noticia3 modificar() {
		
	// se modifica el objeto estadio de la BD
	LOG.info("Se modifico informacion de noticia");
	return noticia;	
		
	}

}
