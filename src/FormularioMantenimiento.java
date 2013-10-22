import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.crypto.Cipher;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
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
	private ButtonGroup tipo;
	// area de texto para la descripcion del mantenimieto
	private JTextArea tDesMan;
	private JButton bAceptar, bCancelar, bLimpiar;
	
	public FormularioMantenimiento() {
		setLayout(null);
		setBounds(50,50,750,450);
		ajustarComponente();
		agregarOyenter();
		agregarComponentes();
		setVisible(true);
	}
	
	private void ajustarComponente(){
		lIdMaq = new JLabel("ID Maquina:");
		lIdMaq.setBounds(10, 20, 200, 20);
		lTipMan = new JLabel("Tipo de Mantenimiento:");
		lTipMan.setBounds(10, 70, 200, 20);
		lDesMan = new JLabel("Descripcion Mantenimiento:");
		lDesMan.setBounds(10, 120, 200, 20);
		lPerMan = new JLabel("Personal de Mantenimiento:");
		lPerMan.setBounds(10, 270, 200, 20);
		lFecMan = new JLabel("Fecha:");
		lFecMan.setBounds(10, 320, 200, 20);
		cIdMaq = new JComboBox<String>();
		cIdMaq.setBounds(210, 20, 200, 30);
		cPerMan = new JComboBox<String>();
		cPerMan.setBounds(210, 270, 200, 30);
		rTipo1 = new JRadioButton("Reparacion",true);
		rTipo1.setBounds(210, 70, 120, 20);
		rTipo2 = new JRadioButton("Cambio de accesorio");
		rTipo2.setBounds(340, 70, 180, 20);
		tipo = new ButtonGroup();
		tipo.add(rTipo1);
		tipo.add(rTipo2);
		
		tDesMan = new JTextArea();
		tDesMan.setBounds(210, 120, 200, 150);
		bAceptar = new JButton("Aceptar");
		bAceptar.setBounds(20, 350, 150, 30);
		bCancelar = new JButton("Cancerlar");
		bCancelar.setBounds(180, 350, 150, 30);
		bLimpiar = new JButton("Limpiar");
		bLimpiar.setBounds(340, 350, 150, 30);
	}
	//metodo de agregar listener a los botones
	private void agregarOyenter(){
		bAceptar.addActionListener(this);
		bCancelar.addActionListener(this);
		bLimpiar.addActionListener(this);
	}
	//metodo para agregar componentes al jPanel
	private void agregarComponentes(){
		add(lIdMaq);
		add(cIdMaq);
		add(lTipMan);
		add(rTipo1);
		add(rTipo2);
		add(lDesMan);
		add(tDesMan);
		add(lPerMan);
		add(cPerMan);
		add(lFecMan);
		add(bAceptar);
		add(bCancelar);
		add(bLimpiar);
	}
	//acciones de los botones
	@Override
	public void actionPerformed(ActionEvent e) {
		Object objeto = e.getSource();
		if(objeto instanceof JButton){
			//evento al presionar el boton aceptar
			if(objeto == bAceptar){
				//cIdMaq.get
				desMan = tDesMan.getText();
				
			}
			//evento al presionar el boton cancela
			if(objeto == bCancelar){
				System.out.println("se cancelo");
			}

			//evento al presionar el boton limpiar
			if(objeto == bLimpiar){
				System.out.println("se limpio");
			}
		}
		
	}
}
