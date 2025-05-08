package datos;

public abstract class Usuario {
	private long idUsuario;
	private String nombre;
	private String apellido;
	
	public Usuario() {}

	public Usuario(String apellido, String nombre) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
	}
	
	public long getIdUsuario() {
		return idUsuario;
	}
	protected void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
