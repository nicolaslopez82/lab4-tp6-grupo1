/**
 * 
 */
package dao;

import java.util.List;

import entidad.Persona;

/**
 * @author nicolaslopez
 *
 */
public interface PersonaDao {
	
	public boolean insert(Persona persona);
	public boolean delete(Persona persona_a_eliminar);
	public boolean findPersonaByDNI(String dni);
	public boolean update(Persona persona);
	public List<Persona> readAll();

}
