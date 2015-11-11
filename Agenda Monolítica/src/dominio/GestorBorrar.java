package dominio;

import persistencia.ContactoDAO;

public class GestorBorrar {
	public static void borrar(long telefono) throws Exception{
		ContactoDAO dao = ContactoDAO.getContactoDAO();
		dao.readContacto(telefono);
		dao.deleteContacto(telefono);
		
	}
}
