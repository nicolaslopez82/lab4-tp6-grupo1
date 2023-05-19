package presentacion.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PanelAgregarPersonas extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldDni;

	/**
	 * Create the panel.
	 */
	public PanelAgregarPersonas() {
		super();
		System.out.println("PANEL");
		initialize();
	}

	public void initialize() {
		setBounds(100, 100, 514, 455);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 504, 445);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		System.out.println("INITIALIZE");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre.setBounds(105, 103, 45, 13);
		panel.add(lblNombre);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldNombre.setBounds(247, 101, 96, 19);
		panel.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(105, 180, 45, 13);
		panel.add(lblApellido);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldApellido.setBounds(247, 177, 96, 19);
		panel.add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDni.setBounds(105, 251, 45, 13);
		panel.add(lblDni);
		
		textFieldDni = new JTextField();
		textFieldDni.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldDni.setBounds(247, 249, 96, 19);
		panel.add(textFieldDni);
		textFieldDni.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAceptar.setBounds(105, 336, 85, 21);
		panel.add(btnAceptar);

	}
}
