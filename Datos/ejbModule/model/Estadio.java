package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the estadio database table.
 * 
 */
@Entity
@Table(name="estadio")
@NamedQuery(name="Estadio.findAll", query="SELECT e FROM Estadio e")
public class Estadio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idEstadio;

	private int capacidad;

	private String ciudad;

	private String direccion;

	private String nombre;

	//bi-directional many-to-one association to Localidad
	@OneToMany(mappedBy="estadio")
	private List<Localidad> localidads;

	//bi-directional many-to-one association to Partido
	@OneToMany(mappedBy="estadio")
	private List<Partido> partidos;

	public Estadio() {
	}

	public int getIdEstadio() {
		return this.idEstadio;
	}

	public void setIdEstadio(int idEstadio) {
		this.idEstadio = idEstadio;
	}

	public int getCapacidad() {
		return this.capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Localidad> getLocalidads() {
		return this.localidads;
	}

	public void setLocalidads(List<Localidad> localidads) {
		this.localidads = localidads;
	}

	public Localidad addLocalidad(Localidad localidad) {
		getLocalidads().add(localidad);
		localidad.setEstadio(this);

		return localidad;
	}

	public Localidad removeLocalidad(Localidad localidad) {
		getLocalidads().remove(localidad);
		localidad.setEstadio(null);

		return localidad;
	}

	public List<Partido> getPartidos() {
		return this.partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}

	public Partido addPartido(Partido partido) {
		getPartidos().add(partido);
		partido.setEstadio(this);

		return partido;
	}

	public Partido removePartido(Partido partido) {
		getPartidos().remove(partido);
		partido.setEstadio(null);

		return partido;
	}

}