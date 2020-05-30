package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Representa el resultado de los equipos de los jugadores de fútbol
 * 
 * @author Natalia
 */
@Component
public class Resultado4 {

	/**
	 * Representa la fecha en la que se publico los resultados de los goles de la
	 * Liga de Fútbol
	 */
	private LocalDate fecha;
	/**
	 * Representa el resultado del equipo1 en el partido de fútbol
	 */
	private Equipo1 equipo1;
	/**
	 * Representa el resultado del equipo2 en el partido de fútbol
	 */
	private Equipo1 equipo2;

	/**
	 * Representa la cantidad de goles del equipo1 en el partido de fútbol
	 */
	private int golesEquipo1;

	/**
	 * Representa la cantidad de goles del equipo2 en el partido de fútbol
	 */
	private int golesEquipo2;

	/*
	 * ---CONSTRUCTORES---
	 */

	/**
	 * Constructor parametrizado
	 * 
	 * @param fecha de tipo LocalDate
	 */
	@Autowired
	public Resultado4(LocalDate fecha) {
		this.fecha = fecha;
	}
	/*
	 * --METODOS ACCESORES---
	 */

	/**
	 * Devuelve la fecha de publicacion del resultado de la partida de fútbol
	 * 
	 * @return this fecha valor de fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * Asigna a fecha la fecha de la publicacion de los resultados
	 * 
	 * @param fecha
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * Devuelve el valor de equipo1
	 * 
	 * @return this equipo1
	 */
	public Equipo1 getEquipo1() {
		return equipo1;
	}

	/**
	 * Asigna a equipo1 el valor de equipo1
	 * 
	 * @param equipo1
	 */
	public void setEquipo1(Equipo1 equipo1) {
		this.equipo1 = equipo1;
	}

	/**
	 * Devuelve el valor de equipo2
	 * 
	 * @return this equipo2
	 */
	public Equipo1 getEquipo2() {
		return equipo2;
	}

	/**
	 * Aaigna equipo2 el valor de equipo2
	 * 
	 * @param equipo2 valor de equipo2
	 */
	public void setEquipo2(Equipo1 equipo2) {
		this.equipo2 = equipo2;
	}

	/**
	 * Devuelve la cantidadas de goles del Equipo1
	 * 
	 * @return this golesEquipo1
	 */
	public int getGolesEquipo1() {
		return golesEquipo1;
	}

	/**
	 * Asigna golesEquipo1 el valor de golesEquipo1
	 * 
	 * @param golesEquipo1
	 */
	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}

	/**
	 * /** Devuelve la cantidadas de goles del Equipo2
	 * 
	 * @return this golesEquipo2
	 */
	public int getGolesEquipo2() {
		return golesEquipo2;
	}

	/**
	 * Asigna golesEquipo2 el valor a golesEquipo2
	 * 
	 * @param golesEquipo2 de golesEquipo2
	 */
	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}

	@Override
	public String toString() {
		return "Resultado4 [fecha=" + fecha + ", equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", golesEquipo1="
				+ golesEquipo1 + ", golesEquipo2=" + golesEquipo2 + ", getFecha()=" + getFecha() + ", getEquipo1()="
				+ getEquipo1() + ", getEquipo2()=" + getEquipo2() + ", getGolesEquipo1()=" + getGolesEquipo1()
				+ ", getGolesEquipo2()=" + getGolesEquipo2() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}

