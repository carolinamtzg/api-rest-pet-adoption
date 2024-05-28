package com.carolina.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="mascota")
public class Mascota {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	 @Column(name = "fecha_nac")
	private Date fechaNac;
	private String raza;
	private Double peso;
	private Boolean tiene_chip;
	private String url_foto;
	
	
	public Mascota() {
	}

	public Mascota(Long id, String nombre, Date fechaNac, String raza, Double peso, Boolean tiene_chip, String url_foto) {
		this.id = id;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.raza = raza;
		this.peso = peso;
		this.tiene_chip = tiene_chip;
		this.url_foto = url_foto;
	}
	
	
}
