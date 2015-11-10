package dominio;

public class Gestor {
	public void anadir(long telefono, String nombre, String apellido1, String apellido2) throws Exception{
		GestorAnadir.anadir(telefono, nombre, apellido1, apellido2);
	}
}
