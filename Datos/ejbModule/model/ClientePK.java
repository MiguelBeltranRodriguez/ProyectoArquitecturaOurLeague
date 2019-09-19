package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the cliente database table.
 * 
 */
@Embeddable
public class ClientePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idCliente;

	@Column(name="Equipo_idEquipo", insertable=false, updatable=false)
	private int equipo_idEquipo;

	public ClientePK() {
	}
	public int getIdCliente() {
		return this.idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getEquipo_idEquipo() {
		return this.equipo_idEquipo;
	}
	public void setEquipo_idEquipo(int equipo_idEquipo) {
		this.equipo_idEquipo = equipo_idEquipo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ClientePK)) {
			return false;
		}
		ClientePK castOther = (ClientePK)other;
		return 
			(this.idCliente == castOther.idCliente)
			&& (this.equipo_idEquipo == castOther.equipo_idEquipo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idCliente;
		hash = hash * prime + this.equipo_idEquipo;
		
		return hash;
	}
}