package datos;

import java.util.Set;

public class Administrador extends Usuario {
	private String legajo;
	private Set<Turno> turnos;

	public Administrador() {}
	
	public Administrador(String nombre, String apellido, String legajo) {
		super(nombre, apellido);
		this.legajo = legajo;
	}
	
	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public Set<Turno> getTurnos() {
		return turnos;
	}

	public void setTurnos(Set<Turno> turnos) {
		this.turnos = turnos;
	}

}
