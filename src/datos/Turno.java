package datos;

import java.time.LocalDate;
import java.util.Set;

public class Turno {
	private long idTurno;
	private LocalDate fecha;
	private String estado;
	private Cliente cliente;
    private Administrador administrador;
    private Set<Servicio> servicios;
	
	public Turno() {}
	
	public Turno(LocalDate fecha, String estado, Cliente cliente, Administrador administrador, Set<Servicio> servicios) {
		this.fecha = fecha;
		this.estado = estado;
		this.cliente = cliente;
		this.administrador = administrador;
		this.servicios = servicios;
	}

	protected long getIdTurno() {
		return idTurno;
	}
	public void setIdTurno(long idTurno) {
		this.idTurno = idTurno;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

	public Set<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(Set<Servicio> servicios) {
		this.servicios = servicios;
	}
}
