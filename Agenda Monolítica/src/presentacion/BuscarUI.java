package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.text.ParseException;

import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import dominio.Contacto;
import dominio.Gestor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BuscarUI {

	private JFrame frmAgendaMonoltica;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblStatus;
	private JButton btnBuscar;
	private JButton btnLimpiar;
	private JPanel panel_2;
	private JLabel lblTelfono;
	private JLabel lblNombre;
	private JLabel lblApellido1;
	private JLabel lblApellido2;
	private JFormattedTextField ftxtTelefono;
	private JLabel lblNombreSel;
	private JLabel lblApellido1Sel;
	private JLabel lblApellido2Sel;
	private JButton btnVolver;
	private Gestor gestor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscarUI window = new BuscarUI();
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
	public BuscarUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		gestor = new Gestor();
		frmAgendaMonoltica = new JFrame();
		frmAgendaMonoltica.setTitle("Agenda Monolítica - Eliminar Contacto");
		frmAgendaMonoltica.setBounds(100, 100, 480, 316);
		frmAgendaMonoltica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			panel = new JPanel();
			frmAgendaMonoltica.getContentPane().add(panel, BorderLayout.CENTER);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 239, 0, 88, 0, 0};
			gbl_panel.rowHeights = new int[]{45, 55, 55, 55, 53, 0, 0};
			gbl_panel.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				panel_1 = new JPanel();
				panel_1.setBorder(new TitledBorder(null, "Eliminar Contacto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				GridBagConstraints gbc_panel_1 = new GridBagConstraints();
				gbc_panel_1.gridheight = 3;
				gbc_panel_1.insets = new Insets(0, 0, 5, 5);
				gbc_panel_1.fill = GridBagConstraints.BOTH;
				gbc_panel_1.gridx = 1;
				gbc_panel_1.gridy = 1;
				panel.add(panel_1, gbc_panel_1);
				panel_1.setLayout(new BorderLayout(0, 0));
				{
					panel_2 = new JPanel();
					panel_1.add(panel_2, BorderLayout.CENTER);
					GridBagLayout gbl_panel_2 = new GridBagLayout();
					gbl_panel_2.columnWidths = new int[]{14, 0, 0, 0, 0, 0};
					gbl_panel_2.rowHeights = new int[]{40, 36, 37, 26, 0};
					gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
					gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
					panel_2.setLayout(gbl_panel_2);
					{
						lblTelfono = new JLabel("Teléfono:");
						GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
						gbc_lblTelfono.anchor = GridBagConstraints.WEST;
						gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
						gbc_lblTelfono.gridx = 1;
						gbc_lblTelfono.gridy = 0;
						panel_2.add(lblTelfono, gbc_lblTelfono);
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
						GridBagConstraints gbc_ftxtTelefono = new GridBagConstraints();
						gbc_ftxtTelefono.fill = GridBagConstraints.HORIZONTAL;
						gbc_ftxtTelefono.gridwidth = 3;
						gbc_ftxtTelefono.insets = new Insets(0, 0, 5, 0);
						gbc_ftxtTelefono.gridx = 2;
						gbc_ftxtTelefono.gridy = 0;
						panel_2.add(ftxtTelefono, gbc_ftxtTelefono);
					}
					{
						lblNombre = new JLabel("Nombre:");
						GridBagConstraints gbc_lblNombre = new GridBagConstraints();
						gbc_lblNombre.anchor = GridBagConstraints.WEST;
						gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
						gbc_lblNombre.gridx = 1;
						gbc_lblNombre.gridy = 1;
						panel_2.add(lblNombre, gbc_lblNombre);
					}
					{
						lblNombreSel = new JLabel("");
						GridBagConstraints gbc_lblNombreSel = new GridBagConstraints();
						gbc_lblNombreSel.fill = GridBagConstraints.HORIZONTAL;
						gbc_lblNombreSel.gridwidth = 3;
						gbc_lblNombreSel.insets = new Insets(0, 0, 5, 0);
						gbc_lblNombreSel.gridx = 2;
						gbc_lblNombreSel.gridy = 1;
						panel_2.add(lblNombreSel, gbc_lblNombreSel);
					}
					{
						lblApellido1 = new JLabel("Apellido1:");
						GridBagConstraints gbc_lblApellido1 = new GridBagConstraints();
						gbc_lblApellido1.anchor = GridBagConstraints.WEST;
						gbc_lblApellido1.insets = new Insets(0, 0, 5, 5);
						gbc_lblApellido1.gridx = 1;
						gbc_lblApellido1.gridy = 2;
						panel_2.add(lblApellido1, gbc_lblApellido1);
					}
					{
						lblApellido1Sel = new JLabel("");
						GridBagConstraints gbc_lblApellido1Sel = new GridBagConstraints();
						gbc_lblApellido1Sel.fill = GridBagConstraints.HORIZONTAL;
						gbc_lblApellido1Sel.gridwidth = 3;
						gbc_lblApellido1Sel.insets = new Insets(0, 0, 5, 0);
						gbc_lblApellido1Sel.gridx = 2;
						gbc_lblApellido1Sel.gridy = 2;
						panel_2.add(lblApellido1Sel, gbc_lblApellido1Sel);
					}
					{
						lblApellido2 = new JLabel("Apellido2:");
						GridBagConstraints gbc_lblApellido2 = new GridBagConstraints();
						gbc_lblApellido2.anchor = GridBagConstraints.WEST;
						gbc_lblApellido2.insets = new Insets(0, 0, 0, 5);
						gbc_lblApellido2.gridx = 1;
						gbc_lblApellido2.gridy = 3;
						panel_2.add(lblApellido2, gbc_lblApellido2);
					}
					{
						lblApellido2Sel = new JLabel("");
						GridBagConstraints gbc_lblApellido2Sel = new GridBagConstraints();
						gbc_lblApellido2Sel.fill = GridBagConstraints.HORIZONTAL;
						gbc_lblApellido2Sel.gridwidth = 3;
						gbc_lblApellido2Sel.insets = new Insets(0, 0, 0, 5);
						gbc_lblApellido2Sel.gridx = 2;
						gbc_lblApellido2Sel.gridy = 3;
						panel_2.add(lblApellido2Sel, gbc_lblApellido2Sel);
					}
				}
			}
			{
				{
					btnBuscar = new JButton("Buscar");
					btnBuscar.addActionListener(new BtnEliminarActionListener());
					GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
					gbc_btnBuscar.fill = GridBagConstraints.VERTICAL;
					gbc_btnBuscar.insets = new Insets(0, 0, 5, 5);
					gbc_btnBuscar.gridx = 3;
					gbc_btnBuscar.gridy = 1;
					panel.add(btnBuscar, gbc_btnBuscar);
				}
			}
			btnLimpiar = new JButton("Limpiar");
			btnLimpiar.addActionListener(new BtnLimpiarCamposActionListener());
			GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
			gbc_btnLimpiar.insets = new Insets(0, 0, 5, 5);
			gbc_btnLimpiar.gridx = 3;
			gbc_btnLimpiar.gridy = 2;
			panel.add(btnLimpiar, gbc_btnLimpiar);
			{
				lblStatus = new JLabel("");
				GridBagConstraints gbc_lblStatus = new GridBagConstraints();
				gbc_lblStatus.anchor = GridBagConstraints.WEST;
				gbc_lblStatus.insets = new Insets(0, 0, 5, 5);
				gbc_lblStatus.gridx = 1;
				gbc_lblStatus.gridy = 4;
				panel.add(lblStatus, gbc_lblStatus);
			}
			{
				btnVolver = new JButton("Volver");
				btnVolver.addActionListener(new BtnVolverActionListener());
				GridBagConstraints gbc_btnVolver = new GridBagConstraints();
				gbc_btnVolver.anchor = GridBagConstraints.SOUTH;
				gbc_btnVolver.insets = new Insets(0, 0, 5, 5);
				gbc_btnVolver.gridx = 3;
				gbc_btnVolver.gridy = 4;
				panel.add(btnVolver, gbc_btnVolver);
			}
		}
	}
	private void limpiar(){
		ftxtTelefono.setText("");
		lblNombreSel.setText("");
		lblApellido1Sel.setText("");
		lblApellido2Sel.setText("");
	}

	private class BtnLimpiarCamposActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			limpiar();
		}
	}
	private class BtnVolverActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class BtnEliminarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try{
				//Recogida de datos
				String telefono_str = ftxtTelefono.getText();
				telefono_str = telefono_str.replaceAll("\\s+","");
				long telefono = Long.parseLong(telefono_str);
				Contacto contacto = gestor.leer(telefono);
				String nombre = contacto.getNombre();
				String apellido1 = contacto.getApellido1();
				String apellido2 = contacto.getApellido2();
				lblNombreSel.setText(nombre);
				lblApellido1Sel.setText(apellido1);
				lblApellido2Sel.setText(apellido2);
				
			} catch (Exception ex){
				JOptionPane.showMessageDialog(frmAgendaMonoltica, "Ha habido un error al modificar el contacto.", 
						"Error",JOptionPane.PLAIN_MESSAGE);
				lblStatus.setForeground(Color.RED);
				lblStatus.setText("El contacto no existe.");
				limpiar();
				ex.printStackTrace();
				
			}
		}
	}
}
