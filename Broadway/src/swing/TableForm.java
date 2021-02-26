package swing;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class TableForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField nameTxt;
	private JLabel lblNewLabel_1;
	private JTextField addressTxt;
	private JLabel lblNewLabel_2;
	private JComboBox collegeCmb;
	private JLabel lblNewLabel_3;
	private JRadioButton maleRbtn;
	private JRadioButton femaleRbtn;
	private JCheckBox agreeCb;
	private JButton addBtn;
	private JSeparator separator;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					TableForm frame = new TableForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TableForm() {
		setTitle("Table Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getNameTxt());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getAddressTxt());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getCollegeCmb());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getMaleRbtn());
		contentPane.add(getFemaleRbtn());
		contentPane.add(getAgreeCb());
		contentPane.add(getAddBtn());
		contentPane.add(getSeparator());
		contentPane.add(getScrollPane());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Name");
			lblNewLabel.setBounds(28, 27, 46, 14);
		}
		return lblNewLabel;
	}

	private JTextField getNameTxt() {
		if (nameTxt == null) {
			nameTxt = new JTextField();
			nameTxt.setBounds(88, 24, 86, 20);
			nameTxt.setColumns(10);
		}
		return nameTxt;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Address");
			lblNewLabel_1.setBounds(214, 27, 58, 14);
		}
		return lblNewLabel_1;
	}

	private JTextField getAddressTxt() {
		if (addressTxt == null) {
			addressTxt = new JTextField();
			addressTxt.setBounds(282, 24, 86, 20);
			addressTxt.setColumns(10);
		}
		return addressTxt;
	}

	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("College");
			lblNewLabel_2.setBounds(411, 27, 46, 14);
		}
		return lblNewLabel_2;
	}

	private JComboBox getCollegeCmb() {
		if (collegeCmb == null) {
			collegeCmb = new JComboBox();
			collegeCmb.setModel(
					new DefaultComboBoxModel(new String[] { "- select -", "NCC", "KEC", "NCIT", "ISMT", "ABC" }));
			collegeCmb.setBounds(458, 23, 89, 22);
		}
		return collegeCmb;
	}

	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Gender");
			lblNewLabel_3.setBounds(28, 71, 46, 14);
		}
		return lblNewLabel_3;
	}

	private JRadioButton getMaleRbtn() {
		if (maleRbtn == null) {
			maleRbtn = new JRadioButton("Male");
			buttonGroup.add(maleRbtn);
			maleRbtn.setBounds(87, 67, 95, 23);
		}
		return maleRbtn;
	}

	private JRadioButton getFemaleRbtn() {
		if (femaleRbtn == null) {
			femaleRbtn = new JRadioButton("Female");
			buttonGroup.add(femaleRbtn);
			femaleRbtn.setBounds(198, 67, 109, 23);
		}
		return femaleRbtn;
	}

	private JCheckBox getAgreeCb() {
		if (agreeCb == null) {
			agreeCb = new JCheckBox("Agree");
			agreeCb.setBounds(375, 67, 62, 23);
		}
		return agreeCb;
	}

	private JButton getAddBtn() {
		if (addBtn == null) {
			addBtn = new JButton("Add");
			addBtn.setBounds(458, 67, 89, 23);
			addBtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String n = nameTxt.getText();
					String adr = addressTxt.getText();
					String col = collegeCmb.getSelectedItem().toString();

					String gender = "";
					if (maleRbtn.isSelected()) {
						gender = "male";
					} else if (femaleRbtn.isSelected()) {
						gender = "female";
					}

					String agree;
					if (agreeCb.isSelected()) {
						agree = "YES";
					} else {
						agree = "NO";
					}

					if (n.isEmpty() || adr.isEmpty() || col.isEmpty() || (gender.isEmpty())
							|| (collegeCmb.getSelectedIndex() == 0) || (agree.isEmpty() || agree.equals("NO"))) {
						JOptionPane.showMessageDialog(null, "Fields may be empty, All fields are required ", "Error",
								JOptionPane.ERROR_MESSAGE);
					} else {
						// display data on jtable
						DefaultTableModel model = (DefaultTableModel) table.getModel();
						model.addRow(new Object[] { n, adr, col, gender, agree });

						// clear input data
						nameTxt.setText("");
						addressTxt.setText("");
						collegeCmb.setSelectedIndex(0);
						maleRbtn.setSelected(false);
						femaleRbtn.setSelected(false);
						agreeCb.setSelected(false);
					}

				}
			});
		}
		return addBtn;
	}

	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(27, 99, 520, 2);
		}
		return separator;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(28, 112, 520, 190);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}

	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(new Object[][] {},
					new String[] { "Name", "Address", "College", "Gender", "Agree" }));
		}
		return table;
	}
}
