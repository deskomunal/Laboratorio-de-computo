import javax.swing.JFrame;
import javax.swing.JTabbedPane;


public class Principal extends JFrame{
	JTabbedPane tabs = new JTabbedPane();
	public Principal() {
		super("Laborator - Control");
		setBounds(50 ,50 , 800, 550);
		setResizable(false);
		setLocationRelativeTo(null);
		tabs.addTab("mantenimiento",new FormularioMantenimiento());
		add(tabs);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Principal();
	}
}
