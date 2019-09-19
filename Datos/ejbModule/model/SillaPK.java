package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the silla database table.
 * 
 */
@Embeddable
public class SillaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idSilla;

	@Column(name="Localidad_idLocalidad", insertable=false, updatable=false)
	private int localidad_idLocalidad;

	@Column(name="Localidad_Estadio_idEstadio", insertable=false, updatable=false)
	private int localidad_Estadio_idEstadio;

	public SillaPK() {
	}
	public int getIdSilla() {
		return this.idSilla;
	}
	public void setIdSilla(int idSilla) {
		this.idSilla = idSilla;
	}
	public int getLocalidad_idLocalidad() {
		return this.localidad_idLocalidad;
	}
	public void setLocalidad_idLocalidad(int localidad_idLocalidad) {
		this.localidad_idLocalidad = localidad_idLocalidad;
	}
	public int getLocalidad_Estadio_idEstadio() {
		return this.localidad_Estadio_idEstadio;
	}
	public void setLocalidad_Estadio_idEstadio(int localidad_Estadio_idEstadio) {
		this.localidad_Estadio_idEstadio = localidad_Estadio_idEstadio;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SillaPK)) {
			return false;
		}
		SillaPK castOther = (SillaPK)other;
		return 
			(this.idSilla == castOther.idSilla)
			&& (this.localidad_idLocalidad == castOther.localidad_idLocalidad)
			&& (this.localidad_Estadio_idEstadio == castOther.localidad_Estadio_idEstadio);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idSilla;
		hash = hash * prime + this.localidad_idLocalidad;
		hash = hash * prime + this.localidad_Estadio_idEstadio;
		
		return hash;
	}
}