package com.nttdata.nttdatacenters_spring_t2_OEDL.Modelo;

import java.util.List;

public class Producto {
	private String id;
    private String nombre;
    private double precioSinImpuestos;
    private double precioPVP;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecioSinImpuestos() {
		return precioSinImpuestos;
	}
	public void setPrecioSinImpuestos(double precioSinImpuestos) {
		this.precioSinImpuestos = precioSinImpuestos;
	}
	public double getPrecioPVP() {
		return precioPVP;
	}
	public void setPrecioPVP(double precioPVP) {
		this.precioPVP = precioPVP;
	}
}
