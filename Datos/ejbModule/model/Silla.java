package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the silla database table.
 * 
 */
@Entity
@Table(name="silla")
@NamedQuery(name="Silla.findAll", query="SELECT s FROM Silla s")
public class Silla implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SillaPK id;

	private String identificador;

	//bi-directional many-to-one association to Localidad
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="Localidad_Estadio_idEstadio", referencedColumnName="Estadio_idEstadio"),
		@JoinColumn(name="Localidad_idLocalidad", referencedColumnName="idLocalidad")
		})
	private Localidad localidad;

	public Silla() {
	}

	public SillaPK getId() {
		return this.id;
	}

	public void setId(SillaPK id) {
		this.id = id;
	}

	public String getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public Localidad getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

}