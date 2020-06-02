package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Representa a un tipo de noticia difundida de los partidos de fútbol que se
 * han jugado
 * 
 * @author Natalia
 */
@Component
public class Noticia3 {

	/*
	 * --ATRIBUTOS--
	 */
	/**
	 * Representa la Fecha en la que se publico la noticia
	 */
	@Autowired
	private LocalDate fecha;

	/**
	 * Representa el Titulo de la noticia
	 */
	private String titulo;

	/**
	 * Representa el Resumen de la noticia
	 * de los partidos de futbol
	 */
	@Autowired
	private String resumen;

	/*
	 * ---CONSTRUCTORES---
	 */
	/**
	 * Constructor parametrizado que recibe como parametro fecha,titulo,resumen
	 * 
	 * @param LocalDate fecha
	 * @param String    titulo
	 * @param String    resumen
	 */
     public Noticia3(LocalDate fecha,String titulo,String resumen) {
    	 
       this.fecha=fecha;
       this.titulo=titulo;
       this.resumen=resumen;
    	 
	}
	/*
	 * --METODOS ACCESORES---
	 */

	/**
	 * Devuelve la fecha de la noticia
	 * 
	 * @return this fecha valor de fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * Asigna a fecha el valor de fecha de la noticia
	 * 
	 * @param fecha valor de noticia
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * Devuelve el Titulo de la noticia
	 * 
	 * @return this titulo de la noticia
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Asigna el Titulo a titulo de noticia
	 * 
	 * @param titulo el titulo de noticia
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Devuelve el Resumen de la noticia
	 * 
	 * @return this resumen
	 */
	public String getResumen() {
		return resumen;
	}

	/**
	 * Asigna resumen de la noticia a resumen
	 * 
	 * @param resumen valor del resumen
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	@Override
	public String toString() {
		return "Noticia3 [fecha=" + fecha + ", titulo=" + titulo + ", resumen=" + resumen + ", getFecha()=" + getFecha()
				+ ", getTitulo()=" + getTitulo() + ", getResumen()=" + getResumen() + "]";
	}

}
