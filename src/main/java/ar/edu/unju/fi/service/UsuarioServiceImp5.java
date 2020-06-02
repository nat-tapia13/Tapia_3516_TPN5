package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Usuario5;
import ar.edu.unju.fi.repository.IUsuario5;

@Repository
public class UsuarioServiceImp5 implements IUsuarioService5 {

	@Autowired
	private IUsuario5 iusuario;
	
	@Override
	public void guardar() {
		
	 iusuario.guardar();	
		
	}

	@Override
	public Usuario5 mostrar() {
		
	Usuario5 usuario=iusuario.mostar();
	return usuario;
		
	}

	@Override
	public void eliminar() {
		
	iusuario.eliminar();	
		
	}

	@Override
	public Usuario5 modificar() {
		
	Usuario5 usuario=iusuario.modificar();
	return usuario;	
	
	}

}
