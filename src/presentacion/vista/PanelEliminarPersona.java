package presentacion.vista;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import entidad.Persona;

@SuppressWarnings("serial")
public class PanelEliminarPersona extends JPanel {

	private JButton btnEliminar;
	private JList<Persona> lista;
	private DefaultListModel<Persona> modelPersonas;
	
	/**
	 * Create the panel.
	 */
	public PanelEliminarPersona() {
		setLayout(null);
		
		JLabel lblEliminarPersona = new JLabel("Eliminar Persona");
		lblEliminarPersona.setBounds(223, 11, 110, 14);
		add(lblEliminarPersona);
		
		modelPersonas = new DefaultListModel<Persona>();
		lista = new JList<Persona>();
		lista.setBounds(58, 36, 390, 220);
		add(lista);
		lista.setModel(modelPersonas);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(223, 267, 89, 23);
		add(btnEliminar);

	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public JList<Persona> getLista() {
		return lista;
	}

	public void setLista(JList<Persona> lista) {
		this.lista = lista;
	}

	public DefaultListModel<Persona> getModelPersonas() {
		return modelPersonas;
	}

	public void setModelPersonas(DefaultListModel<Persona> modelPersonas) {
		this.modelPersonas = modelPersonas;
	}
	
	public void cargarLista(ArrayList<Persona> arr) {
		modelPersonas.clear();
		 for(Persona val : arr)
			 modelPersonas.addElement(val);
	}
	
	public void show()
	{
		this.setVisible(true);
	}
	
	public void mostrarMensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
