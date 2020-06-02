package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Resultado4;
import ar.edu.unju.fi.repository.IResultado4;

@Repository
public class ResultadoServiceImp4 implements IResultadoService4{

	@Autowired
	private IResultado4 iresultado;
	
	
	@Override
	public void guardar() {
		
	iresultado.guardar();
	
	}

	@Override
	public Resultado4 mostrar() {
	
     Resultado4 resultado=iresultado.mostar();
	 return resultado;	
	 
	}

	@Override
	public void eliminar() {
		
	iresultado.eliminar();	
		
	}

	@Override
	public Resultado4 modificar() {
		
	Resultado4 resultado=iresultado.modificar();
	return resultado;	
	
	}
	
}
