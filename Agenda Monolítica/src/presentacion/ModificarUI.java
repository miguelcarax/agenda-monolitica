package presentacion;

import dominio.Gestor;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.text.ParseException;

import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModificarUI {

	private JFrame frmAgendaMonoltica;
	private JPanel panel;
	private JButton btnModificar;
	private JLabel lblNumero;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblApellido_1;
	private JTextField txtNombre;
	private JTextField txtApellido1;
	private JTextField txtApellido2;
	private JFormattedTextField ftxtTelefono;
	private Gestor gestor;
	private final JButton btnLimpiar = new JButton("Limpiar");
	private final JLabel lblStatus = new JLabel("");
	private JButton btnVolver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarUI window = new ModificarUI();
					window.frmAgendaMonoltica.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ModificarUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		gestor = new Gestor();
		frmAgendaMonoltica = new JFrame();
		frmAgendaMonoltica.setResizable(false);
		frmAgendaMonoltica.setTitle("Agenda Monolítica");
		frmAgendaMonoltica.setBounds(100, 100, 450, 300);
		frmAgendaMonoltica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{22, 68, 52, 44, 50, 51, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{15, 47, 0, 54, 44, 40, 43, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frmAgendaMonoltica.getContentPane().setLayout(gridBagLayout);
		{
			panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Contacto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setLayout(null);
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.gridwidth = 5;
			gbc_panel.gridheight = 5;
			gbc_panel.insets = new Insets(0, 0, 5, 5);
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 1;
			gbc_panel.gridy = 1;
			frmAgendaMonoltica.getContentPane().add(panel, gbc_panel);
			{
				lblNumero = new JLabel("Numero:");
				lblNumero.setHorizontalAlignment(SwingConstants.RIGHT);
				lblNumero.setBounds(26, 41, 61, 16);
				panel.add(lblNumero);
			}
			{
				lblNombre = new JLabel("Nombre:");
				lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
				lblNombre.setBounds(26, 78, 61, 16);
				panel.add(lblNombre);
			}
			{
				lblApellido = new JLabel("Apellido 1:");
				lblApellido.setHorizontalAlignment(SwingConstants.RIGHT);
				lblApellido.setBounds(19, 115, 68, 16);
				panel.add(lblApellido);
			}
			{
				lblApellido_1 = new JLabel("Apellido 2:");
				lblApellido_1.setHorizontalAlignment(SwingConstants.RIGHT);
				lblApellido_1.setBounds(19, 150, 68, 16);
				panel.add(lblApellido_1);
			}
			{
				txtNombre = new JTextField();
				txtNombre.setColumns(10);
				txtNombre.setBounds(92, 73, 148, 26);
				panel.add(txtNombre);
			}
			{
				txtApellido1 = new JTextField();
				txtApellido1.setColumns(10);
				txtApellido1.setBounds(92, 110, 148, 26);
				panel.add(txtApellido1);
			}
			{
				txtApellido2 = new JTextField();
				txtApellido2.setColumns(10);
				txtApellido2.setBounds(92, 145, 148, 26);
				panel.add(txtApellido2);
			}
			{
				MaskFormatter formatoTlfno;
				try {
				    formatoTlfno = new MaskFormatter("###' ###' ###");
				    formatoTlfno.setPlaceholderCharacter('*');
				    ftxtTelefono = new JFormattedTextField(formatoTlfno);
				} catch (ParseException e) {
				    // TODO Auto-generated catch block
				    e.printStackTrace();
				}
				ftxtTelefono.setBounds(92, 36, 148, 26);
				panel.add(ftxtTelefono);
			}
		}
		{
			btnModificar = new JButton("Modificar Contacto");
			btnModificar.addActionListener(new BtnModificarActionListener());
			GridBagConstraints gbc_btnModificar = new GridBagConstraints();
			gbc_btnModificar.fill = GridBagConstraints.VERTICAL;
			gbc_btnModificar.gridwidth = 4;
			gbc_btnModificar.insets = new Insets(0, 0, 5, 0);
			gbc_btnModificar.gridx = 6;
			gbc_btnModificar.gridy = 3;
			frmAgendaMonoltica.getContentPane().add(btnModificar, gbc_btnModificar);
		}
		{
			GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
			gbc_btnLimpiar.gridwidth = 4;
			gbc_btnLimpiar.insets = new Insets(0, 0, 5, 0);
			gbc_btnLimpiar.gridx = 6;
			gbc_btnLimpiar.gridy = 4;
			btnLimpiar.addActionListener(new BtnLimpiarActionListener());
			frmAgendaMonoltica.getContentPane().add(btnLimpiar, gbc_btnLimpiar);
		}
		{
			GridBagConstraints gbc_lblStatus = new GridBagConstraints();
			gbc_lblStatus.gridwidth = 2;
			gbc_lblStatus.insets = new Insets(0, 0, 5, 5);
			gbc_lblStatus.gridx = 7;
			gbc_lblStatus.gridy = 5;
			frmAgendaMonoltica.getContentPane().add(lblStatus, gbc_lblStatus);
		}
		{
			btnVolver = new JButton("Volver");
			btnVolver.addActionListener(new BtnVolverActionListener());
			GridBagConstraints gbc_btnVolver = new GridBagConstraints();
			gbc_btnVolver.insets = new Insets(0, 0, 5, 5);
			gbc_btnVolver.gridx = 1;
			gbc_btnVolver.gridy = 6;
			frmAgendaMonoltica.getContentPane().add(btnVolver, gbc_btnVolver);
		}
	}
	
	private void limpiar(){
		txtNombre.setText("");
		ftxtTelefono.setText("");
		txtApellido1.setText("");
		txtApellido2.setText("");
	}
	
	private class BtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			limpiar();
		}
	}
	private class BtnModificarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try{
				//Recogida de datos
				String telefono_str = ftxtTelefono.getText();
				telefono_str = telefono_str.replaceAll("\\s+","");
				long telefono = Long.parseLong(telefono_str);
				String nombre = txtNombre.getText();
				String apellido1 = txtApellido1.getText();
				String apellido2 = txtApellido2.getText();
				gestor.modificar(telefono, nombre, apellido1, apellido2);
				lblStatus.setForeground(Color.GREEN);
				lblStatus.setText("Modificado correctamente");
			} catch (Exception ex){
				JOptionPane.showMessageDialog(frmAgendaMonoltica, "Ha habido un error al modificar el contacto.", 
						"Error",JOptionPane.PLAIN_MESSAGE);
				lblStatus.setForeground(Color.RED);
				lblStatus.setText("ERROR");
				limpiar();
				ex.printStackTrace();
				
			}
		}	
	}
	private class BtnVolverActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
	}
}
