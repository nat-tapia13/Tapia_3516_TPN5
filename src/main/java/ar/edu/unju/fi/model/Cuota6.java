package ar.edu.unju.fi.model;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Representa a el valor de tipo de cuota
 * 
 * @author Natalia Tapia
 */
@Component
public class Cuota6 {

	/*
	 * ---ATRIBUTOS---
	 */
	/**
	 * Representa el id de la cuota del usuario
	 */
	@Autowired
	private long Id;
	/**
	 * Representa la fecha de pago de la cuota del usuaurio
	 */
	@Autowired
	private LocalDate fechaPago;
	/**
	 * Representa el periodo que de la cuota a pagar del usuario
	 */
	private String periodo;
	/**
	 * Representa el moto a pagar en cuota del usuario
	 */
	private double monto;
	/**
	 * Representa el esatdo de la cuota del usuario
	 */
	private String estado;
	
	@Autowired
	private Usuario5 usuario;
	/*
	 * ---CONSTRUCTORES---
	 */

	/**
	 * Constructor parametrizado que recibe como parametros id de tipo
	 * long,fechaPago de tipo LocalDate,periodo de tipo String monto de tipo
	 * double,estado de tipo
	 * 
	 * @param id
	 * @param fechaPago
	 * @param monto
	 * @param estado
	 */
	public Cuota6(long id, LocalDate fechaPago, String periodo, double monto, String estado) {

		Id = id;
		this.fechaPago = fechaPago;
		this.periodo = periodo;
		this.monto = monto;
		this.estado = estado;
	}

	/*
	 * ---METODOS ACCESORES---
	 */

	/**
	 * Devulve el valor del Id
	 * 
	 * @return this Id
	 */
	public long getId() {
		return Id;
	}

	/**
	 * Asigna a Id el valor de Id
	 * 
	 * @param Id
	 */
	public void setId(long Id) {
		this.Id = Id;
	}

	/**
	 * Devulve el valor de periodo
	 * 
	 * @return this fechaPago
	 */
	public LocalDate getFechaPago() {
		return fechaPago;
	}

	/**
	 * Asigna fechaPago el valor de fechaPago del usuaurio
	 * 
	 * @param fechaPago la fechaPago del usuario
	 */
	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}

	/**
	 * Devulve el valor de periodo
	 * 
	 * @return this periodo
	 */
	public String getPeriodo() {
		return periodo;
	}

	/**
	 * Asigna a periodo el valor de periodo
	 * 
	 * @param periodo el periodo de la cuota
	 */
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	/**
	 * Devuelve el valor del monto
	 * 
	 * @return this monto de la cuota
	 */
	public double getMonto() {
		return monto;
	}

	/**
	 * Asigna el monto valor de monto
	 * 
	 * @param monto
	 */
	public void setMonto(double monto) {
		this.monto = monto;
	}

	/**
	 * Devulve el valor del estado de la cuota
	 * 
	 * @return this estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Asigna a estado el valor de estado
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * Devulve el valor de usuaurio
	 * 
	 * @return this usuario
	 */
	public Usuario5 getUsuario() {
		return usuario;
	}

	/**
	 * Asigna a usuario el nombre del usuario
	 * 
	 * @param usuario
	 */
	public void setUsuario(Usuario5 usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Cuota6 [Id=" + Id + ", fechaPago=" + fechaPago + ", periodo=" + periodo + ", monto=" + monto
				+ ", estado=" + estado + ", usuario=" + usuario + ", getId()=" + getId() + ", getFechaPago()="
				+ getFechaPago() + ", getPeriodo()=" + getPeriodo() + ", getMonto()=" + getMonto() + ", getEstado()="
				+ getEstado() + ", getUsuario()=" + getUsuario() + "]";
	}	
}
