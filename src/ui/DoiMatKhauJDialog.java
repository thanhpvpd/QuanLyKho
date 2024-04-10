package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;

public class DoiMatKhauJDialog extends JDialog {
	private JTextField txtMa;
	private JPasswordField txtMKC;
	private JPasswordField txtMKM;
	private JPasswordField txtMKM2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DoiMatKhauJDialog dialog = new DoiMatKhauJDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DoiMatKhauJDialog() {
		setBounds(100, 100, 450, 500);
		getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Đổi mật khẩu");
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
			lblNewLabel.setBounds(145, 10, 142, 38);
			getContentPane().add(lblNewLabel);
		}
		{
			txtMa = new JTextField();
			txtMa.setForeground(Color.BLACK);
			txtMa.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			txtMa.setBounds(54, 89, 333, 39);
			getContentPane().add(txtMa);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Mã nhân viên");
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
			lblNewLabel_1.setBounds(54, 58, 110, 21);
			getContentPane().add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Mật khẩu cũ");
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
			lblNewLabel_1.setBounds(54, 138, 103, 21);
			getContentPane().add(lblNewLabel_1);
		}
		{
			txtMKC = new JPasswordField();
			txtMKC.setBounds(54, 169, 333, 39);
			getContentPane().add(txtMKC);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Mật khẩu mới");
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
			lblNewLabel_1.setBounds(54, 218, 114, 21);
			getContentPane().add(lblNewLabel_1);
		}
		{
			txtMKM = new JPasswordField();
			txtMKM.setBounds(54, 249, 333, 39);
			getContentPane().add(txtMKM);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Nhập lại mật khẩu");
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
			lblNewLabel_1.setBounds(54, 298, 156, 21);
			getContentPane().add(lblNewLabel_1);
		}
		{
			txtMKM2 = new JPasswordField();
			txtMKM2.setBounds(54, 329, 333, 39);
			getContentPane().add(txtMKM2);
		}
		{
			JButton btnDMK = new JButton("Đổi mật khẩu");
			btnDMK.setBounds(54, 392, 124, 50);
			getContentPane().add(btnDMK);
		}
		{
			JButton BtnHuy = new JButton("Hủy");
			BtnHuy.setBounds(263, 392, 124, 50);
			getContentPane().add(BtnHuy);
		}
	}

}
