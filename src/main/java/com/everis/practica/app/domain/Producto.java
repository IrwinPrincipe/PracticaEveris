package com.everis.practica.app.domain;

import javax.persistence.Entity;
import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity //sirve para dar una entidad para crear la bds
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tbl_alumno")

public class Producto{

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY) //generar id autoincrementable
 @Column(name="idAlumno",length=5)
 private Long idProducto;
 
 
 @Column(name="nombreAlumno",length=20,nullable = false)
 @NotBlank
 private String nombre;

@NotBlank
@Column(name="cantidad",length = 20)
 private Integer cantidad;
@Column(name="categoria",length = 20,unique=true)
@NotEmpty
@Size(max=20)
 private String categoria;
 
}
