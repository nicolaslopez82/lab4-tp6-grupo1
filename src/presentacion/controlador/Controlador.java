package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import negocio.PersonaNegocio;
import presentacion.vista.PanelAgregarPersonas;
import presentacion.vista.PanelEditarPersona;
import presentacion.vista.PanelEliminarPersona;
import presentacion.vista.PanelListarPersonas;
import presentacion.vista.VentanaPrincipal;

public class Controlador implements ActionListener {

	private VentanaPrincipal ventanaPrincipal;
	private PersonaNegocio personaNegocio;
	private PanelAgregarPersonas pnlAgregarPersona;
	private PanelEditarPersona pnlEditarPersona;
	private PanelEliminarPersona pnlEliminarPersona;
	private PanelListarPersonas pnlListarPersona;
	

	public Controlador(VentanaPrincipal vista, PersonaNegocio personaNegocio) {
		// TODO Auto-generated constructor stub
		// Guardo todas las instancias que recibo en el constructor
		this.ventanaPrincipal = vista;
		this.personaNegocio = personaNegocio;
		// Instancio los paneles
		this.pnlAgregarPersona = new PanelAgregarPersonas();
		this.pnlEditarPersona = new PanelEditarPersona();
		this.pnlEliminarPersona = new PanelEliminarPersona();
		this.pnlListarPersona = new PanelListarPersonas();
		this.ventanaPrincipal.getMntmAgregar().addActionListener(a -> EventoClickMenu_AbrirPanel_AgregarPersona(a));
		this.ventanaPrincipal.getMntmEliminar().addActionListener(a -> EventoClickMenu_AbrirPanel_EliminarPersona(a));
		this.ventanaPrincipal.getMntmListar().addActionListener(a -> EventoClickMenu_AbrirPanel_ListarPersona(a));
		this.ventanaPrincipal.getMntmModificar().addActionListener(a -> EventoClickMenu_AbrirPanel_EditarPersona(a));
	}

	public void EventoClickMenu_AbrirPanel_AgregarPersona(ActionEvent a) {
		ventanaPrincipal.getContentPane().removeAll();
		ventanaPrincipal.getContentPane().add(pnlAgregarPersona);
		ventanaPrincipal.getContentPane().repaint();
		ventanaPrincipal.getContentPane().revalidate();
	}
	public void EventoClickMenu_AbrirPanel_EliminarPersona(ActionEvent a) {
		ventanaPrincipal.getContentPane().removeAll();
		ventanaPrincipal.getContentPane().add(pnlEliminarPersona);
		ventanaPrincipal.getContentPane().repaint();
		ventanaPrincipal.getContentPane().revalidate();
	}
	public void EventoClickMenu_AbrirPanel_ListarPersona(ActionEvent a) {
		ventanaPrincipal.getContentPane().removeAll();
		ventanaPrincipal.getContentPane().add(pnlListarPersona);
		ventanaPrincipal.getContentPane().repaint();
		ventanaPrincipal.getContentPane().revalidate();
	}
	public void EventoClickMenu_AbrirPanel_EditarPersona(ActionEvent a) {
		ventanaPrincipal.getContentPane().removeAll();
		ventanaPrincipal.getContentPane().add(pnlEditarPersona);
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
