package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * Representa el estadio donde se juega un partido de fútbol de La Liga de
 * Fútbol
 * 
 * @author Natalia
 */

@Component
public class Estadio2 {

	/*
	 * --ATRIBUTOS---
	 */

	/**
	 * Represnta el Nombre del Estadio donde juegan los partidos la Liga de Fútbol
	 */
	private String nombre;

	/**
	 * Representa la Fecha de Fundación del estadio del equipo de fútbol
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
	 * Representa la Dirección donde esta ubicado el estadio
	 */
	private String dirección;

	/*
	 * ---CONSTRUCTORES---
	 */
	/**
	 * Constructor parametrizado que recibe el nombre ,fecha de fundación la
	 * ciudad,capacidad y dirección del estadio
	 * 
	 * @param String    nombre
	 * @param LocalDate fechaFundacion
	 * @param String    ciudad
	 * @param int       capacidad
	 * @param String    dirección
	 */
	public Estadio2(String nombre,LocalDate fechaFundacion,String ciudad,int capacidad,String dirección) {
	
		this.nombre= nombre;
		this.fechaFundacion=fechaFundacion;
		this.ciudad=ciudad;
		this.capacidad=capacidad;
		this.dirección=dirección;
		
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
	 * Devuelve la fecha de fundación
	 * 
	 * @return this fechaFundacion la fecha de fundacion del estadio
	 */
	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}

	/**
	 * Asigna a fechaFundacion un valor de fecha de fundación del estadio
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
	 * @return this dirección
	 */
	public String getDirección() {
		return dirección;
	}

	/**
	 * Asigna a direccion el valor de direccion del estadio
	 * 
	 * @param dirección la dirección
	 */
	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	@Override
	public String toString() {
		return "Estadio2 [nombre=" + nombre + ", ciudad=" + ciudad + ", capacidad=" + capacidad + ", dirección="
				+ dirección + ", getNombre()=" + getNombre() + ", getCiudad()=" + getCiudad() + ", getCapacidad()="
				+ getCapacidad() + ", getDirección()=" + getDirección() + "]";
	}

}
