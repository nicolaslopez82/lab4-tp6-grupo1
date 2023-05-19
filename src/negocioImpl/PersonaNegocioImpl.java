package negocioImpl;

import java.util.List;

import dao.PersonaDao;
import daoImpl.PersonaDaoImpl;
import entidad.Persona;
import negocio.PersonaNegocio;

public class PersonaNegocioImpl implements PersonaNegocio {
	PersonaDao pdao = new PersonaDaoImpl();
	@Override
	public boolean insert(Persona persona) {
		// TODO Auto-generated method stub
		boolean estado = false;
		if (persona.getNombre().trim().length() < 0 && persona.getApellido().trim().length() < 0
				&& persona.getDni().trim().length() < 0) {
			estado = pdao.insert(persona);
		}

		return estado;
	}

	@Override
	public boolean delete(Persona persona_a_eliminar) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Persona> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
