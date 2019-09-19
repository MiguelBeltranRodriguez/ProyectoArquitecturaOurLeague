package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the partido database table.
 * 
 */
@Entity
@Table(name="partido")
@NamedQuery(name="Partido.findAll", query="SELECT p FROM Partido p")
public class Partido implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PartidoPK id;

	private String descripcion;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	//bi-directional many-to-one association to Estadio
	@ManyToOne
	@JoinColumn(name="Estadio_idEstadio")
	private Estadio estadio;

	//bi-directional many-to-one association to Equipo
	@ManyToOne
	@JoinColumn(name="Equipo_idEquipo")
	private Equipo equipo1;

	//bi-directional many-to-one association to Equipo
	@ManyToOne
	@JoinColumn(name="Equipo_idEquipo1")
	private Equipo equipo2;

	public Partido() {
	}

	public PartidoPK getId() {
		return this.id;
	}

	public void setId(PartidoPK id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Estadio getEstadio() {
		return this.estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	public Equipo getEquipo1() {
		return this.equipo1;
	}

	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	public Equipo getEquipo2() {
		return this.equipo2;
	}

	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

}