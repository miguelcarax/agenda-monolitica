package dominio;

import dominio.Contacto;
import persistencia.ContactoDAO;

public class GestorLeer {
	public static Contacto leer(long telefono) throws Exception{
		ContactoDAO dao = ContactoDAO.getContactoDAO();
		return dao.readContacto(telefono);
	}

}
