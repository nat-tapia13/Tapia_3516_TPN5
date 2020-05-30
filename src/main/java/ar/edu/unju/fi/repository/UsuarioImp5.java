package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Tapia3516Tpn5Application;
import ar.edu.unju.fi.model.Usuario5;


@Repository("usuarioImp")
public class UsuarioImp5 implements IUsuario5 {

	@Autowired
	private Usuario5 usuario;
	
	public static Logger LOG=LoggerFactory.getLogger(Tapia3516Tpn5Application.class);
	
	@Override
	public void guardar() {
		
		// accion ejecutada para guardar un objeto usuario en la BD
		LOG.info("El usuario fue guardado"+usuario.getNombre()+","+usuario.getApellido()
					+","+usuario.getFechaNacimiento()+","+usuario.getDireccion()+","
					+usuario.getDni()+","+usuario.getFechaAlta()+","+usuario.getTipo());
	}

	@Override
	public Usuario5 mostar() {
	
		// se recuperan todos los datos  del usuario
		LOG.info("Mostar informacion del usuario");
        return usuario;	
		
	}

	@Override
	public void eliminar() {
		
		// se elimina el objeto usuario de la BD
		LOG.info("Se elimino usuario de la BD");
	
	}

	@Override
	public Usuario5 modificar() {
		// se modifica un nuevo objeto usuario de la BD
		 LOG.info("Se modifico informacion de resultado");
			return usuario;
	}

}
