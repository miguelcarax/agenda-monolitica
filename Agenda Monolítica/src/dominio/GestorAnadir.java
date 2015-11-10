package dominio;

import persistencia.ContactoDAO;

public class GestorAnadir{
	public static void anadir(long telefono, String nombre, String apellido1, String apellido2) throws Exception{
		Contacto contacto = new Contacto(telefono, nombre, apellido1, apellido2);
		ContactoDAO dao = ContactoDAO.getContactoDAO();
		dao.createContacto(contacto);
	}

}
