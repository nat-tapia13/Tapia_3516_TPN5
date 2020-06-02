package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unju.fi.model.Noticia3;
import ar.edu.unju.fi.repository.INoticia3;

public class NoticiaServiceImp3 implements INoticiaService3 {
	
	@Autowired
	private INoticia3 inoticia;
	
	
	@Override
	public void guardar() {
		
	inoticia.guardar();	
		
	}

	@Override
	public Noticia3 mostrar() {
	
	Noticia3 noticia= inoticia.mostar();
	return noticia;
	
	}

	@Override
	public void eliminar() {
	
	inoticia.eliminar();
		
	}

	@Override
	public Noticia3 modificar() {
		
	Noticia3 noticia=inoticia.modificar();
	return noticia;
	
	}

}
