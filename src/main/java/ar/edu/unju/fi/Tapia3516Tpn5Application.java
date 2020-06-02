package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Cuota6;
import ar.edu.unju.fi.model.Equipo1;
import ar.edu.unju.fi.model.Estadio2;
import ar.edu.unju.fi.model.Noticia3;
import ar.edu.unju.fi.model.Resultado4;
import ar.edu.unju.fi.model.Usuario5;
import ar.edu.unju.fi.repository.ICuota6;
import ar.edu.unju.fi.repository.IEquipo1;
import ar.edu.unju.fi.repository.IEstadio2;
import ar.edu.unju.fi.repository.INoticia3;
import ar.edu.unju.fi.repository.IResultado4;
import ar.edu.unju.fi.service.IUsuarioService5;


@SpringBootApplication
public class Tapia3516Tpn5Application implements CommandLineRunner{

	@Autowired
	IUsuarioService5 usuarioService;
	
	@Autowired
	Usuario5 usuario;
	
	public static void main(String[]args) {
	
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
	
	@Autowired
	IEquipo1 equipoService;
	
	@Autowired
	Estadio2 estadio;
	
	@Autowired
	Equipo1 equipo;
 	
	public void run1(String... args) throws Exception {
		//inicializo las variables de mi objeto equipo
		equipo.setEstadio(estadio);
		equipo.setNombre("River.P");
		
		equipoService.guardar();
	
	}		
	
	@Autowired
	IEstadio2 estadioService;
	
	@Autowired
	Estadio2 estadio1;
	
	public void run2(String... args) throws Exception {
		//inicializo las variables de mi objeto estadio
     estadio1.setNombre("Boca.J");
	 estadio1.setFechaFundacion(LocalDate.of(1920,03,15));
	 estadio1.setCiudad("San Salvador de Jujuy");
	 estadio1.setCapacidad(70);
	 estadio1.setDirección("Avda Mitre 345");
	 
	 estadioService.guardar();
	 
	}
		
   @Autowired
   INoticia3 noticiaService;
   
   @Autowired
   Noticia3 noticia;
   
   public void run3(String... args) throws Exception {
		//inicializo las variables de mi objeto noticia
	   
   noticia.setFecha(LocalDate.of(2020,04,12));
   noticia.setResumen("River Plate le gana a Boca.J con tres goles ");
   noticia.setTitulo("Resultados");
   
   noticiaService.guardar();
   }
   
   @Autowired
   IResultado4 resultadoService;
   
   @Autowired
   Resultado4 resultado;
   
   @Autowired
   IEquipo1 equipo2;
      
   public void run4(String... args) throws Exception {
		//inicializo las variables de mi objeto resultado   
   resultado.setFecha(LocalDate.of(2020,04,13));
   resultado.setEquipo1(equipo);
   resultado.setEquipo2(equipo);
   resultado.setGolesEquipo1(1);
   resultado.setGolesEquipo2(3);
   
   resultadoService.guardar();
   }
   
   @Autowired
   ICuota6 cuotaService;
   
   @Autowired
   Cuota6 cuota;
   
   public void run5(String... args) throws Exception {
	
	//inicializo las variables de mi objeto cuota
	cuota.setId(3516);
	cuota.setFechaPago(LocalDate.of(2021,04,21));
	cuota.setPeriodo("12 meses");
	cuota.setMonto(2.500);
	cuota.setEstado("PAGADO");
    cuota.setUsuario(usuario);
    
    cuotaService.guardar();
   }
   
}
