package presentacion.vista;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import entidad.Persona;

@SuppressWarnings("serial")
public class PanelEditarPersona extends JPanel {

	private JTextField txtDNI;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JButton btnEditar;
	private JList<Persona> lista;
	private DefaultListModel<Persona> modelPersonas;

	/**
	 * Create the panel.
	 */
	public PanelEditarPersona() {
		setLayout(null);
		
		JLabel lblEditarPersona = new JLabel("Editar Persona");
		lblEditarPersona.setBounds(227, 11, 94, 14);
		add(lblEditarPersona);
		
		modelPersonas = new DefaultListModel<Persona>();
		lista = new JList<Persona>();
		lista.setBounds(62, 44, 429, 224);
		add(lista);
		lista.setModel(modelPersonas);
		
		txtDNI = new JTextField();
		txtDNI.setEditable(false);
		txtDNI.setBounds(62, 279, 105, 20);
		add(txtDNI);
		txtDNI.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(177, 279, 105, 20);
		add(txtNombre);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(292, 279, 105, 20);
		add(txtApellido);
		
		btnEditar = new JButton("Modificar");
		btnEditar.setBounds(407, 278, 89, 23);
		add(btnEditar);

	}

	public JButton getBtnEditar() {
		return btnEditar;
	}

	public void setBtnEditar(JButton btnEditar) {
		this.btnEditar = btnEditar;
	}
	
	public void cargarLista(ArrayList<Persona> arr) {
		modelPersonas.clear();
		 for(Persona val : arr)
			 modelPersonas.addElement(val);
	}
	
	public JTextField getTxtDNI() {
		return txtDNI;
	}

	public void setTxtDNI(JTextField txtDNI) {
		this.txtDNI = txtDNI;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtApellido() {
		return txtApellido;
	}

	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
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

	public void show()
	{
		this.setVisible(true);
	}
	
	public void mostrarMensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
