package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JPasswordField;

public class DangNhapJDialog extends JDialog {
	private JTextField txtMaND;
	private JPasswordField txtPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DangNhapJDialog dialog = new DangNhapJDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DangNhapJDialog() {
		setBounds(100, 100, 537, 326);
		getContentPane().setLayout(null);
		Border border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Dự án 1\\image\\Ảnh chụp màn hình 2023-06-29 143511.png"));
		lblNewLabel.setBounds(10, 20, 203, 254);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Đăng nhập");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_1.setBounds(223, 20, 116, 29);
		getContentPane().add(lblNewLabel_1);
		
		txtMaND = new JTextField();
		txtMaND.setForeground(SystemColor.desktop);
		txtMaND.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtMaND.setBounds(223, 91, 270, 39);
		txtMaND.setBorder(border);
		getContentPane().add(txtMaND);
		txtMaND.setColumns(10);
		
		JButton btnDangNhap = new JButton("Đăng nhập");
		btnDangNhap.setBackground(new Color(0, 0, 0));
		btnDangNhap.setBounds(223, 235, 104, 39);
		getContentPane().add(btnDangNhap);
		
		JButton btnKetThuc = new JButton("Kết thúc");
		btnKetThuc.setBounds(389, 235, 104, 39);
		getContentPane().add(btnKetThuc);
		
		txtPass = new JPasswordField();
		txtPass.setBounds(223, 172, 270, 39);
		txtPass.setBorder(border);
		getContentPane().add(txtPass);
		
		JLabel lblNewLabel_2 = new JLabel("Mật khẩu");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(233, 140, 66, 22);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Mã nhân viên");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(223, 59, 91, 22);
		getContentPane().add(lblNewLabel_2_1);
		
	}
}
