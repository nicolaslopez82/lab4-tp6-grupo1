package presentacion.vista;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import entidad.Persona;

@SuppressWarnings("serial")
public class PanelListarPersonas extends JPanel {

	private JTable tablaPersonas;
	private DefaultTableModel modelPersonas;
	private String[] nombreColumnas = {"DNI","Nombre", "Apellido"};

	/**
	 * Create the panel.
	 */
	public PanelListarPersonas() {
		setLayout(null);
		
		JScrollPane spPersonas = new JScrollPane();
		spPersonas.setBounds(15, 30, 510, 274);
		add(spPersonas);
		
		modelPersonas = new DefaultTableModel(null,nombreColumnas);
		tablaPersonas = new JTable(modelPersonas);
		tablaPersonas.setBounds(57, 36, 432, 239);
		
		
		tablaPersonas.getColumnModel().getColumn(0).setPreferredWidth(70);
		tablaPersonas.getColumnModel().getColumn(0).setResizable(false);
		tablaPersonas.getColumnModel().getColumn(1).setPreferredWidth(80);
		tablaPersonas.getColumnModel().getColumn(1).setResizable(false);
		tablaPersonas.getColumnModel().getColumn(1).setPreferredWidth(80);
		tablaPersonas.getColumnModel().getColumn(1).setResizable(false);
		
		spPersonas.setViewportView(tablaPersonas);
		
		JLabel lblListadoDePersonas = new JLabel("Listado de Personas");
		lblListadoDePersonas.setBounds(205, 11, 123, 14);
		add(lblListadoDePersonas);

	}
	
	public DefaultTableModel getModelPersonas() 
	{
		return modelPersonas;
	}
	
	public JTable getTablaPersonas()
	{
		return tablaPersonas;
	}

	public String[] getNombreColumnas() 
	{
		return nombreColumnas;
	}


	public void cargarTabla(ArrayList<Persona> ar) {
		this.getModelPersonas().setRowCount(0);
		this.getModelPersonas().setColumnCount(0);
		this.getModelPersonas().setColumnIdentifiers(this.getNombreColumnas());

		for (Persona p : ar)
		{
			String dni = p.getDni();
			String nombre = p.getNombre();
			String tel = p.getApellido();
			Object[] fila = {dni, nombre, tel};
			this.getModelPersonas().addRow(fila);
		}
		
	}
	
	public void mostrarMensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public void show()
	{
		this.setVisible(true);
	}
	
}
