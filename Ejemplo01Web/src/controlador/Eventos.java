package controlador;

import java.util.Date;

public class Eventos {

	private int id;
	private String nombre1;
	private String nombre2;
	private String estadio;
	private Date fecha;

	public Eventos(int id, String nombre1, String nombre2, String estadio, Date fecha) {
		super();
		this.id = id;
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.estadio = estadio;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

}
