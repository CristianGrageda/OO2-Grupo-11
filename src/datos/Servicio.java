package datos;

import java.util.Set;

public class Servicio {
	private long idServicio;
	private String nombre;
	private String descripcion;
	private Set<Turno> turnos;
	
	public Servicio() {}
	
	public Servicio(long idServicio, String nombre, String descripcion) {
		this.idServicio = idServicio;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public long getIdServicio() {
		return idServicio;
	}
	protected void setIdServicio(long idServicio) {
		this.idServicio = idServicio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Set<Turno> getTurnos() {
		return turnos;
	}
	public void setTurnos(Set<Turno> turnos) {
		this.turnos = turnos;
	}
}
