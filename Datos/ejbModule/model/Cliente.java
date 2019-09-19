package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@Table(name="cliente")
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ClientePK id;

	private String apellidos;

	private String cedula;

	private String celular;

	private String ciudad;

	private String contrasena;

	private String email;

	private String nombre;

	private String telefono;

	//bi-directional many-to-one association to Equipo
	@ManyToOne
	@JoinColumn(name="Equipo_idEquipo")
	private Equipo equipo;

	//bi-directional many-to-one association to Cupondescuento
	@OneToMany(mappedBy="cliente")
	private List<Cupondescuento> cupondescuentos;

	public Cliente() {
	}

	public ClientePK getId() {
		return this.id;
	}

	public void setId(ClientePK id) {
		this.id = id;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCedula() {
		return this.cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public List<Cupondescuento> getCupondescuentos() {
		return this.cupondescuentos;
	}

	public void setCupondescuentos(List<Cupondescuento> cupondescuentos) {
		this.cupondescuentos = cupondescuentos;
	}

	public Cupondescuento addCupondescuento(Cupondescuento cupondescuento) {
		getCupondescuentos().add(cupondescuento);
		cupondescuento.setCliente(this);

		return cupondescuento;
	}

	public Cupondescuento removeCupondescuento(Cupondescuento cupondescuento) {
		getCupondescuentos().remove(cupondescuento);
		cupondescuento.setCliente(null);

		return cupondescuento;
	}

}