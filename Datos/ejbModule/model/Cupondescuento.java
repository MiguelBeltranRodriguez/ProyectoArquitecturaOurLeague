package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cupondescuento database table.
 * 
 */
@Entity
@Table(name="cupondescuento")
@NamedQuery(name="Cupondescuento.findAll", query="SELECT c FROM Cupondescuento c")
public class Cupondescuento implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CupondescuentoPK id;

	private String codigo;

	private String descripcion;

	private String nombre;

	private int porcentaje;

	private byte utilizado;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="Cliente_Equipo_idEquipo", referencedColumnName="Equipo_idEquipo"),
		@JoinColumn(name="Cliente_idCliente", referencedColumnName="idCliente")
		})
	private Cliente cliente;

	public Cupondescuento() {
	}

	public CupondescuentoPK getId() {
		return this.id;
	}

	public void setId(CupondescuentoPK id) {
		this.id = id;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	public byte getUtilizado() {
		return this.utilizado;
	}

	public void setUtilizado(byte utilizado) {
		this.utilizado = utilizado;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}