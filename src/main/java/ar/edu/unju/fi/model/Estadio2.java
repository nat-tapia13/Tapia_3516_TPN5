package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * Representa el estadio donde se juega un partido de f�tbol de La Liga de
 * F�tbol
 * 
 * @author Natalia
 */

@Component
public class Estadio2 {

	/*
	 * --ATRIBUTOS---
	 */

	/**
	 * Represnta el Nombre del Estadio donde juegan los partidos la Liga de F�tbol
	 */
	private String nombre;

	/**
	 * Representa la Fecha de Fundaci�n del estadio del equipo de f�tbol
	 */
	private LocalDate fechaFundacion;

	/**
	 * Representa la Ciudad donde esta ubicado el estadio
	 */
	private String ciudad;

	/**
	 * Representa el valor de capacidad de personas que admite el estadio
	 */
	private int capacidad;

	/**
	 * Representa la Direcci�n donde esta ubicado el estadio
	 */
	private String direcci�n;

	/*
	 * ---CONSTRUCTORES---
	 */
	/**
	 * Constructor parametrizado que recibe el nombre ,fecha de fundaci�n la
	 * ciudad,capacidad y direcci�n del estadio
	 * 
	 * @param String    nombre
	 * @param LocalDate fechaFundacion
	 * @param String    ciudad
	 * @param int       capacidad
	 * @param String    direcci�n
	 */
	public Estadio2(String nombre,LocalDate fechaFundacion,String ciudad,int capacidad,String direcci�n) {
	
		this.nombre= nombre;
		this.fechaFundacion=fechaFundacion;
		this.ciudad=ciudad;
		this.capacidad=capacidad;
		this.direcci�n=direcci�n;
		
	}
	/*
	 * --METODOS ACCESORES---
	 */

	/**
	 * Devuelve el nombre del estadio
	 * 
	 * @return this nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna a nombre el nombre del Estadio
	 * 
	 * @param nombre valor de nombre del estadio
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve la fecha de fundaci�n
	 * 
	 * @return this fechaFundacion la fecha de fundacion del estadio
	 */
	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}

	/**
	 * Asigna a fechaFundacion un valor de fecha de fundaci�n del estadio
	 * 
	 * @param fechaFundacion dato de fechaFundacion
	 */
	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	/**
	 * Devuelve la ciudad donde se encuentra el estadio
	 * 
	 * @return this ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * Asigna a ciudad el valor de ciudad en donde esta el estadio de futbol
	 * 
	 * @param ciudad valor de la ciudad
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * Devuelve la capacidad de personas que admite dicho estadio en un partido de
	 * futbol
	 * 
	 * @return this capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * Asigna a capacidad el valor de capacidad que puede soportar el estadio
	 * 
	 * @param capacidad valor de capacidad
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * Devulve la direccion donde se ubica el estadio
	 * 
	 * @return this direcci�n
	 */
	public String getDirecci�n() {
		return direcci�n;
	}

	/**
	 * Asigna a direccion el valor de direccion del estadio
	 * 
	 * @param direcci�n la direcci�n
	 */
	public void setDirecci�n(String direcci�n) {
		this.direcci�n = direcci�n;
	}

	@Override
	public String toString() {
		return "Estadio2 [nombre=" + nombre + ", ciudad=" + ciudad + ", capacidad=" + capacidad + ", direcci�n="
				+ direcci�n + ", getNombre()=" + getNombre() + ", getCiudad()=" + getCiudad() + ", getCapacidad()="
				+ getCapacidad() + ", getDirecci�n()=" + getDirecci�n() + "]";
	}

}
