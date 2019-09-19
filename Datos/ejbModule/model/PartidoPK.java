package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the partido database table.
 * 
 */
@Embeddable
public class PartidoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int id;

	@Column(name="Estadio_idEstadio", insertable=false, updatable=false)
	private int estadio_idEstadio;

	@Column(name="Equipo_idEquipo", insertable=false, updatable=false)
	private int equipo_idEquipo;

	@Column(name="Equipo_idEquipo1", insertable=false, updatable=false)
	private int equipo_idEquipo1;

	public PartidoPK() {
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEstadio_idEstadio() {
		return this.estadio_idEstadio;
	}
	public void setEstadio_idEstadio(int estadio_idEstadio) {
		this.estadio_idEstadio = estadio_idEstadio;
	}
	public int getEquipo_idEquipo() {
		return this.equipo_idEquipo;
	}
	public void setEquipo_idEquipo(int equipo_idEquipo) {
		this.equipo_idEquipo = equipo_idEquipo;
	}
	public int getEquipo_idEquipo1() {
		return this.equipo_idEquipo1;
	}
	public void setEquipo_idEquipo1(int equipo_idEquipo1) {
		this.equipo_idEquipo1 = equipo_idEquipo1;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PartidoPK)) {
			return false;
		}
		PartidoPK castOther = (PartidoPK)other;
		return 
			(this.id == castOther.id)
			&& (this.estadio_idEstadio == castOther.estadio_idEstadio)
			&& (this.equipo_idEquipo == castOther.equipo_idEquipo)
			&& (this.equipo_idEquipo1 == castOther.equipo_idEquipo1);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id;
		hash = hash * prime + this.estadio_idEstadio;
		hash = hash * prime + this.equipo_idEquipo;
		hash = hash * prime + this.equipo_idEquipo1;
		
		return hash;
	}
}