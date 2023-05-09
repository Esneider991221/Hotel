package com.example.demo.entidades;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "habitaciones")
public class Habitacion  implements Serializable{
	
	  private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    @Column(name = "numero_habitacion")
    private Integer numeroHabitacion;
 
    @Column(name = "tipo_habitacion")
    private String tipoHabitacion;
 
    @Column(name = "tarifa_noche")
    private Double tarifaNoche;
 
    @Column(name = "comodidades")
    private String comodidades;
public Habitacion() {
	// TODO Auto-generated constructor stub
}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumeroHabitacion() {
		return numeroHabitacion;
	}

	public void setNumeroHabitacion(Integer numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public Double getTarifaNoche() {
		return tarifaNoche;
	}

	public void setTarifaNoche(Double tarifaNoche) {
		this.tarifaNoche = tarifaNoche;
	}

	public String getComodidades() {
		return comodidades;
	}

	public void setComodidades(String comodidades) {
		this.comodidades = comodidades;
	}
 
  
    
}
