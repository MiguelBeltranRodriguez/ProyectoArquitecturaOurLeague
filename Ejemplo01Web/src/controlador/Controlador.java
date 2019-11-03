package controlador;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import dataModel.Usuario;
import logica.FachadaLogicaBeanRemote;

@ManagedBean(eager = true)
@RequestScoped
public class Controlador {
	@ManagedProperty(value = "#{loginUsuariosBean}")
	public LoginUsuariosBean loginUsuario;
	
	@EJB
	public Usuario usuario;

	@EJB
	public Usuario nuevoUsuario;
	
	public List<Usuario> listaUsuarios;
	
 	public int idPartido;
	//public Equipo local;
	//public Equipo visitante;

	public String x = "https://www.stickpng.com/assets/images/584a9b3bb080d7616d298777.png";
	public String y = "https://i.pinimg.com/originals/14/83/68/1483685fe60a018dbd6372815363538c.png";

	
	public int tribuna;
	public int sur;
	public int norte;
	public int oriental;
	public int occidental;
	public int total;
	
	public Controlador() {
		// TODO Auto-generated constructor stub
		this.nuevoUsuario = new Usuario();
		this.listaUsuarios = new ArrayList<Usuario>();
	}
	
	public void seleccion(int x) {
		
	}

	public String validarUsuario() {
		String userName = loginUsuario.getUserName();
		String password = loginUsuario.getPassword();

		System.out.println("Solicitud recibida: " + userName + " " + password);

		// Invoca el localizador de servicios para obtener la fachada remota
		LocalizadorServicios localizadorServicios = new LocalizadorServicios();
		FachadaLogicaBeanRemote fachadaLogica = localizadorServicios.getServicio1();

		// Invoca el servicio remoto
		usuario = fachadaLogica.findUsuario(userName, password);

		if (usuario == null)
			return "fracaso";

		System.out.println("Usuario: " + usuario.getNombres() + ", " + usuario.getApellidos());

		return "exito";

	}
	
	public String loginError() {
		return "reintentar";
	}
	
	public String loginExito() {
		return "aceptar";
	}
	
	
	/*
	public List<Eventos> listaPartidos ()
	{
		List<Eventos> partidos= new ArrayList<Eventos>();
		LocalizadorServicios localizadorServicios = new LocalizadorServicios();
		FachadaLogicaBeanRemote fachadaLogica = localizadorServicios.getServicio1();
		
		// Invoca el servicio remoto
		listaPartidos = fachadaLogica.getPartidosPaginados(1, 10);
		
		for(Usuario partido : listaUsuarios) {
			//Estadio estadio = partido.getEstadio();
			//String nombre = estadio.getNombre();
			//Date fecha = partido.getFecha();
			// local = partido.getEquipo1();
			//visitante = partido.getEquipo2();
			Evento e = new Evento (partido.getIdPartido(),local.getNombre(),visitante.getNombre(),estadio.getNombre(),partido.getFecha();
			
			partidos.add(e);
			
		}
		
		return partidos;
	}
	
	
	public String compraPartido(Evento e){
		this.idPartido = e.getId();
		return "valido";
	
	}
	*/

	
	public String insertarUsuario() {
		// Invoca el localizador de servicios para obtener la fachada remota
		LocalizadorServicios localizadorServicios = new LocalizadorServicios();
		FachadaLogicaBeanRemote fachadaLogica = localizadorServicios.getServicio1();

		System.out.println("Solicitud recibida: " + nuevoUsuario.getIdusuario() + " " + nuevoUsuario.getNombres() + " "
				+ nuevoUsuario.getApellidos() + " " + nuevoUsuario.getUserName() + " " + nuevoUsuario.getPassword());

		// Invoca el servicio remoto (retorna exito o existe)
		return fachadaLogica.insertarUsuario(nuevoUsuario);

	}

	public String insertarError() {
		return "reintentar";
	}
	
	public String insertarExito() {
		return "aceptar";
	}
	
	public String listarUsuarios() {
		// Invoca el localizador de servicios para obtener la fachada remota
		LocalizadorServicios localizadorServicios = new LocalizadorServicios();
		FachadaLogicaBeanRemote fachadaLogica = localizadorServicios.getServicio1();

		// Invoca el servicio remoto (retorna exito o existe)
		listaUsuarios = fachadaLogica.findAllUsuarios();
		return "exito";
	}
	
	public String listarExito() {
		return "aceptar";
	}	
	
	public LoginUsuariosBean getLoginUsuario() {
		return loginUsuario;
	}

	public void setLoginUsuario(LoginUsuariosBean loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getNuevoUsuario() {
		return nuevoUsuario;
	}

	public void setNuevoUsuario(Usuario nuevoUsuario) {
		this.nuevoUsuario = nuevoUsuario;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}
	
	public int getTribuna() {
		return tribuna;
	}

	public void setT(int tribuna) {
		this.tribuna = tribuna;
	}

	public int getSur() {
		return sur;
	}

	public void setSur(int sur) {
		this.sur = sur;
	}

	public int getNorte() {
		return norte;
	}

	public void setNorte(int norte) {
		this.norte = norte;
	}

	public int getOriental() {
		return oriental;
	}

	public void setOriental(int oriental) {
		this.oriental = oriental;
	}

	public int getOccidental() {
		return occidental;
	}

	public void setOccidental(int occidental) {
		this.occidental = occidental;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void setTribuna(int tribuna) {
		this.tribuna = tribuna;
	}
	
	
}
