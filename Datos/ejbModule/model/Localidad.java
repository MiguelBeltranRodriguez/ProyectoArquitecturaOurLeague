package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the localidad database table.
 * 
 */
@Entity
@Table(name="localidad")
@NamedQuery(name="Localidad.findAll", query="SELECT l FROM Localidad l")
public class Localidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LocalidadPK id;

	private String capacidad;

	@Lob
	private String costoSilla;

	private String nombre;

	//bi-directional many-to-one association to Estadio
	@ManyToOne
	@JoinColumn(name="Estadio_idEstadio")
	private Estadio estadio;

	//bi-directional many-to-one association to Silla
	@OneToMany(mappedBy="localidad")
	private List<Silla> sillas;

	public Localidad() {
	}

	public LocalidadPK getId() {
		return this.id;
	}

	public void setId(LocalidadPK id) {
		this.id = id;
	}

	public String getCapacidad() {
		return this.capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	public String getCostoSilla() {
		return this.costoSilla;
	}

	public void setCostoSilla(String costoSilla) {
		this.costoSilla = costoSilla;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estadio getEstadio() {
		return this.estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	public List<Silla> getSillas() {
		return this.sillas;
	}

	public void setSillas(List<Silla> sillas) {
		this.sillas = sillas;
	}

	public Silla addSilla(Silla silla) {
		getSillas().add(silla);
		silla.setLocalidad(this);

		return silla;
	}

	public Silla removeSilla(Silla silla) {
		getSillas().remove(silla);
		silla.setLocalidad(null);

		return silla;
	}

}