package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the cupondescuento database table.
 * 
 */
@Embeddable
public class CupondescuentoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idPromocion;

	@Column(name="Cliente_idCliente", insertable=false, updatable=false)
	private int cliente_idCliente;

	@Column(name="Cliente_Equipo_idEquipo", insertable=false, updatable=false)
	private int cliente_Equipo_idEquipo;

	public CupondescuentoPK() {
	}
	public int getIdPromocion() {
		return this.idPromocion;
	}
	public void setIdPromocion(int idPromocion) {
		this.idPromocion = idPromocion;
	}
	public int getCliente_idCliente() {
		return this.cliente_idCliente;
	}
	public void setCliente_idCliente(int cliente_idCliente) {
		this.cliente_idCliente = cliente_idCliente;
	}
	public int getCliente_Equipo_idEquipo() {
		return this.cliente_Equipo_idEquipo;
	}
	public void setCliente_Equipo_idEquipo(int cliente_Equipo_idEquipo) {
		this.cliente_Equipo_idEquipo = cliente_Equipo_idEquipo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CupondescuentoPK)) {
			return false;
		}
		CupondescuentoPK castOther = (CupondescuentoPK)other;
		return 
			(this.idPromocion == castOther.idPromocion)
			&& (this.cliente_idCliente == castOther.cliente_idCliente)
			&& (this.cliente_Equipo_idEquipo == castOther.cliente_Equipo_idEquipo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idPromocion;
		hash = hash * prime + this.cliente_idCliente;
		hash = hash * prime + this.cliente_Equipo_idEquipo;
		
		return hash;
	}
}