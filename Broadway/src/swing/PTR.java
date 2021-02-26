package swing;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PTR extends JFrame {

	float si, amt;

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField principle;
	private JTextField time;
	private JTextField rate;
	private JButton btnCalculate;
	private JLabel lblNewLabel_3;
	private JTextField simpleInterest;
	private JLabel lblNewLabel_4;
	private JTextField amount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					PTR frame = new PTR();
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
	public PTR() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getPrinciple());
		contentPane.add(getTime());
		contentPane.add(getRate());
		contentPane.add(getBtnCalculate());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getSimpleInterest());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getAmount());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("P");
			lblNewLabel.setBounds(38, 29, 46, 14);
		}
		return lblNewLabel;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("T");
			lblNewLabel_1.setBounds(38, 54, 46, 14);
		}
		return lblNewLabel_1;
	}

	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("R");
			lblNewLabel_2.setBounds(38, 79, 46, 14);
		}
		return lblNewLabel_2;
	}

	private JTextField getPrinciple() {
		if (principle == null) {
			principle = new JTextField();
			principle.setBounds(66, 26, 86, 20);
			principle.setColumns(10);
		}
		return principle;
	}

	private JTextField getTime() {
		if (time == null) {
			time = new JTextField();
			time.setText("");
			time.setBounds(66, 54, 86, 20);
			time.setColumns(10);
		}
		return time;
	}

	private JTextField getRate() {
		if (rate == null) {
			rate = new JTextField();
			rate.setText("");
			rate.setBounds(66, 79, 86, 20);
			rate.setColumns(10);
		}
		return rate;
	}

	private JButton getBtnCalculate() {
		if (btnCalculate == null) {
			btnCalculate = new JButton("Calculate");
			btnCalculate.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					float p = Float.parseFloat(principle.getText().toString());
					float t = Float.parseFloat(time.getText().toString());
					float r = Float.parseFloat(rate.getText().toString());

					si = (p * t * r) / 100;

					amt = p + si;

					simpleInterest.setText(String.valueOf(si));
					amount.setText(String.valueOf(amt));
				}
			});
			btnCalculate.setBounds(66, 112, 89, 23);
		}
		return btnCalculate;
	}

	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("S I");
			lblNewLabel_3.setBounds(38, 157, 46, 14);
		}
		return lblNewLabel_3;
	}

	private JTextField getSimpleInterest() {
		if (simpleInterest == null) {
			simpleInterest = new JTextField();
			simpleInterest.setBounds(66, 154, 86, 20);
			simpleInterest.setColumns(10);
			simpleInterest.setEditable(false);
		}
		return simpleInterest;
	}

	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Amount");
			lblNewLabel_4.setBounds(186, 157, 46, 14);
		}
		return lblNewLabel_4;
	}

	private JTextField getAmount() {
		if (amount == null) {
			amount = new JTextField();
			amount.setBounds(253, 154, 86, 20);
			amount.setColumns(10);
			amount.setEditable(false);
		}
		return amount;
	}
}
