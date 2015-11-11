package dominio;

public class Gestor {
	public void anadir(long telefono, String nombre, String apellido1, String apellido2) throws Exception{
		GestorAnadir.anadir(telefono, nombre, apellido1, apellido2);
	}
	
	public void modificar(long telefono, String nombre, String apellido1, String apellido2) throws Exception{
		GestorModificar.modificar(telefono, nombre, apellido1, apellido2);
	}
	
	public Contacto leer(long telefono) throws Exception{
		return GestorLeer.leer(telefono);
	}
}
