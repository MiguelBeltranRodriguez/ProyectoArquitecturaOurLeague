package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the localidad database table.
 * 
 */
@Embeddable
public class LocalidadPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idLocalidad;

	@Column(name="Estadio_idEstadio", insertable=false, updatable=false)
	private int estadio_idEstadio;

	public LocalidadPK() {
	}
	public int getIdLocalidad() {
		return this.idLocalidad;
	}
	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}
	public int getEstadio_idEstadio() {
		return this.estadio_idEstadio;
	}
	public void setEstadio_idEstadio(int estadio_idEstadio) {
		this.estadio_idEstadio = estadio_idEstadio;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof LocalidadPK)) {
			return false;
		}
		LocalidadPK castOther = (LocalidadPK)other;
		return 
			(this.idLocalidad == castOther.idLocalidad)
			&& (this.estadio_idEstadio == castOther.estadio_idEstadio);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idLocalidad;
		hash = hash * prime + this.estadio_idEstadio;
		
		return hash;
	}
}