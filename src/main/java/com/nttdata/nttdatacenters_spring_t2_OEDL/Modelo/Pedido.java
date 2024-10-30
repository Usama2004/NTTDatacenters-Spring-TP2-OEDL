package com.nttdata.nttdatacenters_spring_t2_OEDL.Modelo;

import java.util.List;

public class Pedido {
	private String id;
    private String destinatario;
    private String direccionEntrega;
    private boolean esIslas;
    private List<Producto> productos;
    
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public String getDireccionEntrega() {
		return direccionEntrega;
	}
	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
	}
	public boolean isEsIslas() {
		return esIslas;
	}
	public void setEsIslas(boolean esIslas) {
		this.esIslas = esIslas;
	}
}
