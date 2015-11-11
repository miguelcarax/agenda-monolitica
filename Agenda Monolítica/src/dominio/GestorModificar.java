package dominio;

import persistencia.ContactoDAO;

public class GestorModificar {
	public static void modificar(long telefono, String nombre, String apellido1, String apellido2) throws Exception{
		Contacto contacto = new Contacto(telefono, nombre, apellido1, apellido2);
		ContactoDAO dao = ContactoDAO.getContactoDAO();
		dao.readContacto(telefono);
		dao.updateContacto(contacto);
	}

}
