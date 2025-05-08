package datos;

import java.time.LocalDate;
import java.util.Set;

public class Cliente extends Usuario{
	private String dni;
	private LocalDate fechaNacimiento;
	private boolean baja;
	private Contacto contacto;
	private Set<Turno> turnos;
	
	public Cliente() {}

	public Cliente(String nombre, String apellido, String dni, LocalDate fechaNacimiento, Contacto contacto) {
		super(nombre, apellido);
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.baja = false;
		this.contacto = contacto;
	}
	
	public Set<Turno> getTurnos() {
		return turnos;
	}

	public void setTurnos(Set<Turno> turnos) {
		this.turnos = turnos;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public boolean isBaja() {
		return baja;
	}

	public void setBaja(boolean baja) {
		this.baja = baja;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}
}
