package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Representa a los equipos de Liga de futbol 
 * @author Natalia
 *
 */
@Component
public class Equipo1 {

	/*
	 * ---VARIABLES MIEMBROS---
	 */
	
	/**
	 * Representa al Nombre del Equipo
	 */
	
	private String nombre;
	
	/**
	 * Representa el Estadio donde se juegan los partidos
	 */
	private Estadio2 estadio;
	
	/*
	 *---CONSTRUCTORES---
	 */
	/**
	 * Constructor parametrizado que recibe como parametro estadio de tipo Estadio  
	 * @param estadio 
	 * @param nombre
	 */
	@Autowired
	public Equipo1(Estadio2 estadio) {
		
		this.estadio = estadio;
	}
	/**
	 * Constructor parametrizado que recibe como parametro
	 * nombre del estadio que representa el lugar donde se juegan los partidos de 
	 * la Liga de Fútbol
	 * @param nombre
	 */
	public Equipo1(String nombre ) {
	
	     this.nombre = nombre;
	}
	
	/*
	 * --METODOS ACCESORES---
	 */
	
	/**
	 * Asigna a nombre el valor del nombre
	 * @param nombre el nombre del equipo
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    /**
	 *Devuelve el nombre del equipo
	 * return this nombre
	 */
		public String getNombre() {
			return nombre;
		}
	/**
	 * Devuelve el Estadio donde se encuetra el equipo
	 * @return this estadio
	 */
	public Estadio2 getEstadio() {
		return estadio;
	}

	/**
	 * Asigna a estadio el valor de estadio
	 * @param estadio 
	 */
	public void setEstadio(Estadio2 estadio) {
		this.estadio = estadio;
	}

	@Override
	public String toString() {
		return "Equipo1 [nombre=" + nombre + ", estadio=" + estadio + ", getNombre()=" + getNombre() + ", getEstadio()="
				+ getEstadio() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


}

