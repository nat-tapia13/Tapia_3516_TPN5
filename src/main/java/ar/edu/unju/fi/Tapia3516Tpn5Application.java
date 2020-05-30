package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ar.edu.unju.fi.model.Usuario5;
import ar.edu.unju.fi.service.IUsuarioService5;


@SpringBootApplication
public class Tapia3516Tpn5Application implements CommandLineRunner{

	@Autowired
	IUsuarioService5 usuarioService;
	
	@Autowired
	Usuario5 usuario;
	
	public static void main(String[] args) {
		SpringApplication.run(Tapia3516Tpn5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//inicializo las variables de mi objeto usuario
		usuario.setNombre("Monica");
		usuario.setApellido("Tapia");
		usuario.setDireccion("Av Mitre 256");
		usuario.setFechaNacimiento(LocalDate.of(1997,06,13));
		usuario.setFechaAlta(LocalDate.now());
		usuario.setDni(40176809);
		usuario.setPassword("1234");
		usuario.setTipo("SOCIO");
	
		usuarioService.guardar();
	
	}

}
