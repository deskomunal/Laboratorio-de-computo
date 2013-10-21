import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;


class FormularioMantenimiento extends JPanel implements ActionListener{
	/* ETIQUETAS:
	 * 
	 * lIdMaq = id maquina, 
	 * lTipMan = tipo de mantenimientos
	 * lDesMan = descripcion del mantenimiento
	 * lPerMan = Personal de Mantenimiento
	 * lFecMan = fecha del mantenimiento
	 */
	private int idMaq;
	
	private String perMan, tipMan, desMan;
	
	private JLabel lIdMaq, lTipMan, lDesMan, lPerMan, lFecMan;
	//comboBox id maquina, personal de mantenimiento
	private JComboBox<String> cIdMaq, cPerMan;
	// radioButton tipo de mantenimiento
	private JRadioButton rTipo1, rTipo2;
	// area de texto para la descripcion del mantenimieto
	private JTextArea tDesMan;
	private JButton bAceptar, bCancelar, bLimpiar;
	public FormularioMantenimiento() {
		
		lIdMaq = new JLabel("ID Maquina:");
		lTipMan = new JLabel("Tipo de Mantenimiento:");
		lDesMan = new JLabel("Descripcion Mantenimiento:");
		lPerMan = new JLabel("Personal de Mantenimiento:");
		lFecMan = new JLabel("Fecha:");
		cIdMaq = new JComboBox<String>();
		cPerMan = new JComboBox<String>();
		rTipo1 = new JRadioButton("Reparacion");
		rTipo2 = new JRadioButton("Cambio de accesorio");
		JPanel radioB = new JPanel();
		radioB.setLayout(new GridLayout(5,2));
		radioB.add(rTipo1);
		radioB.add(rTipo2);
		tDesMan = new JTextArea();
		bAceptar = new JButton("Aceptar");
		bAceptar.addActionListener(this);
		bCancelar = new JButton("Cancerlar");
		bLimpiar = new JButton("Limpiar");
		
		setLayout(new GridLayout(6,2));
		setBounds(0, 0, 400, 600);
		
		add(lIdMaq);
		add(cIdMaq);
		add(lTipMan);
		add(radioB);
		add(lDesMan);
		add(tDesMan);
		add(lPerMan);
		add(cPerMan);
		add(lFecMan);
		add(bAceptar);
		add(bCancelar);
		add(bLimpiar);
		setVisible(true);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.print("algo");
		if(){
			System.out.println("descripcion "+desMan.toString());
		}		
	}
}
