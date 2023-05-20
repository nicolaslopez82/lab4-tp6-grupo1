package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import negocio.PersonaNegocio;
import presentacion.vista.PanelAgregarPersonas;
import presentacion.vista.VentanaPrincipal;

public class Controlador implements ActionListener {

	private VentanaPrincipal ventanaPrincipal;
	private PersonaNegocio personaNegocio;
	private PanelAgregarPersonas pnlAgregarPersona;

	public Controlador(VentanaPrincipal vista, PersonaNegocio personaNegocio) {
		// TODO Auto-generated constructor stub
		// Guardo todas las instancias que recibo en el constructor
		this.ventanaPrincipal = vista;
		this.personaNegocio = personaNegocio;
		// Instancio los paneles
		this.pnlAgregarPersona = new PanelAgregarPersonas();
		this.ventanaPrincipal.getMntmAgregar().addActionListener(a -> EventoClickMenu_AbrirPanel_AgregarPersona(a));
	}

	public void EventoClickMenu_AbrirPanel_AgregarPersona(ActionEvent a) {
		ventanaPrincipal.getContentPane().removeAll();
		ventanaPrincipal.getContentPane().add(pnlAgregarPersona);
		ventanaPrincipal.getContentPane().repaint();
		ventanaPrincipal.getContentPane().revalidate();
	}

	public void inicializar() {

		this.ventanaPrincipal.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
