package programas;

public class Persona {

	private String nombre;
	private byte edad;
	private float esta;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public byte getEdad() {
		return edad;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	public float getEsta() {
		return esta;
	}
	public void setEsta(float esta) {
		this.esta = esta;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", esta=" + esta + "]";
	}

}
