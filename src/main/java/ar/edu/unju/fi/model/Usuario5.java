package ar.edu.unju.fi.model;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Representa a los datos de un Usuario
 * 
 * @author Natalia
 */
@Component
public class Usuario5 {

	/*
	 * --ATRIBUTOS---
	 */
	/**
	 * Representa el codigo id del usuario
	 */
	@Autowired
	private int Id;
	/**
	 * Representa el nombre del usuario
	 */
	private String nombre;

	/**
	 * Representa el apellido del usuario
	 */
	private String apellido;
	/**
	 * Representa la fecha de nacimiento del usuario
	 */
	private LocalDate fechaNacimiento;

	/**
	 * Representa la direccion de donde vive el usuario
	 */
	private String direccion;
	/**
	 * Representa el documento de identidad del usuario
	 */
	private long dni;
	/**
	 * Representa la fecha de Alta del usuario
	 */
	private LocalDate fechaAlta;
	/**
	 * Representa el tipo de usuario 
	 */
	@Autowired
	private String Tipo="SOCIO,ADMIN,CONSULTOR";
	
	@Autowired
	private String password;
   
	  /*
      * ---CONSTRUCTORES---
      */
	
	/**
	 * Constructor parametrizado 
	 * 
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param fechaNacimiento
	 * @param direccion
	 * @param dni
	 * @param fechaAlta
	 * @param tipo
	 * @param password
	 */
	
	public Usuario5(int id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, long dni,
			LocalDate fechaAlta, String tipo, String password) {
		
		this.Id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.dni = dni;
		this.fechaAlta = fechaAlta;
		this.Tipo = tipo;
		this.password = password;
	}

	/*
	 * ---METODOS ACCESORES---
	 */
	/**
	 * Devulve el valor de id del usuario
	 * 
	 * @return this Id
	 */
	public int getId() {
		return Id;
	}

	/**
	 * Asigna a Id el valor de Id
	 * 
	 * @param Id
	 */
	public void setPrivateid(int Id) {
		this.Id = Id;
	}

	/**
	 * Devuelve el valor del nombre del usuario
	 * 
	 * @return this nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna el nombre a nombre del usuario
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve apellido el valor del apellido del usuario
	 * 
	 * @return this apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Asigna a apellido el valor de appellido del usuario
	 * 
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Devuelve la fechaNacimiento del usuario
	 * 
	 * @return this fechaNacimiento del usuario
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Asigna a fechaNacimiento a el valor de fechaNacimiento
	 * 
	 * @param fechaNacimiento
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Devulve la direccion del usuario
	 * 
	 * @return this direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Asigna a direccion el valor de direccion del usuario
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Devulve el dni del usuario
	 * 
	 * @return this dni
	 */
	public long getDni() {
		return dni;
	}

	/**
	 * Asigna a dni el numero de dni del usuario
	 * 
	 * @param dni
	 */
	public void setDni(long dni) {
		this.dni = dni;
	}

	/**
	 * Devuelve la fechaAlta del usuaurio
	 * 
	 * @return this fechaAlta
	 */
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * Asigna a fechaAlta el valor de fechaAlta del usuario
	 * 
	 * @param fechaAlta
	 */
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	/**
	 * Devuelve el valor de la contraseña del usuario
	 * 
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Asigna a password el valor de passsword
	 * 
	 * @param passwor valor de password del usuaurio
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * Devuelve el Tipo de usuario
	 * 
	 * @return this Tipo
	 */
	public String getTipo() {
		return Tipo;
	}
	/**
	 * Asigna a Tipo un valor 
	 * @param tipo valor de tipo del usuaurio
	 */
	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	@Override
	public String toString() {
		return "Usuario5 [Id=" + Id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", direccion=" + direccion + ", dni=" + dni + ", fechaAlta=" + fechaAlta + ", Tipo="
				+ Tipo + ", password=" + password + ", getId()=" + getId() + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getFechaNacimiento()=" + getFechaNacimiento()
				+ ", getDireccion()=" + getDireccion() + ", getDni()=" + getDni() + ", getFechaAlta()=" + getFechaAlta()
				+ ", getPassword()=" + getPassword() + ", getTipo()=" + getTipo() + "]";
	}

		
	}
