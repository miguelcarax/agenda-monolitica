package persistencia;

import dominio.Contacto;
import java.sql.*;

public class ContactoDAO {
	private static ContactoDAO contactDAO;
	private static Agente agenteBD;
	
	private ContactoDAO()throws Exception{
		agenteBD= Agente.getAgente();
	}
	
	public static ContactoDAO getContactoDAO() throws Exception{
		if(contactDAO==null)
			contactDAO = new ContactoDAO();
		return contactDAO;
	}
	public void deleteContacto(long telefono) throws Exception{
		agenteBD.delete("DELETE FROM Contactos WHERE telefono='"+telefono+"';");
	}
	
	public void updateContacto(Contacto contacto) throws Exception{
		agenteBD.update("UPDATE contactos SET nombre='"+contacto.getNombre()+"', apellido1='"
				+contacto.getApellido1()+"', apellido2='"+contacto.getApellido2()+"'"
				+" WHERE telefono='"+contacto.getTelefono()+"';");
	}
	
	public Contacto readContacto(long telefono) throws Exception{
		ResultSet resultado = agenteBD.read("SELECT * FROM contactos WHERE telefono='"
				+telefono+"';");
		resultado.next();
		Contacto resulContacto = new Contacto(resultado.getLong(1), resultado.getString(2), resultado.getString(3), resultado.getString(4));
		return resulContacto;
	}
	
	public void createContacto(Contacto contacto)throws Exception{
		agenteBD.create("INSERT INTO contactos VALUES('"+contacto.getTelefono()+"','"+contacto.getNombre()+"','"+contacto.getApellido1()+"','"
				+contacto.getApellido2()+"');");
	}
}
