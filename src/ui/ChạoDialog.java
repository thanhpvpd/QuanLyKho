package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;

public class ChạoDialog extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ChạoDialog dialog = new ChạoDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ChạoDialog() {
		setBounds(100, 100, 593, 360);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(
				new ImageIcon("D:\\download\\QuanLyKhoVTCN\\src\\main\\java\\icon\\hinh-anh-chao-mung-840x524.jpg"));
		lblNewLabel.setBounds(0, 0, 580, 288);
		getContentPane().add(lblNewLabel);

		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(0, 292, 580, 31);
		getContentPane().add(progressBar);
		
		JLabel lblNewLabel_1 = new JLabel("vui lòng chờ");
		lblNewLabel_1.setBounds(149, 292, 229, 31);
		getContentPane().add(lblNewLabel_1);
	}
}
