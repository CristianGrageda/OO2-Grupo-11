package datos;

public class Contacto {
	private long idContacto;
	private String direccion;
	private String telefono;
	private Cliente cliente;
	
	public Contacto() {}
	
	public Contacto(String direccion, String telefono, Cliente cliente) {
		this.direccion = direccion;
		this.telefono = telefono;
		this.cliente = cliente;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public long getIdContacto() {
		return idContacto;
	}

	protected void setIdContacto(long idContacto) {
		this.idContacto = idContacto;
	}
	
}
