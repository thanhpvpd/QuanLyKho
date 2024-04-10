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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class ThemHangJDialog extends JDialog {
	private JTextField txtMa;
	private JTextField txtTen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ThemHangJDialog dialog = new ThemHangJDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ThemHangJDialog() {
		setBounds(100, 100, 574, 475);
		getContentPane().setLayout(null);
		
			JLabel lblThmHngMi = new JLabel("Thêm hàng mới");
			lblThmHngMi.setFont(new Font("Times New Roman", Font.BOLD, 24));
			lblThmHngMi.setBounds(10, 10, 174, 29);
			getContentPane().add(lblThmHngMi);
		
		
			JLabel lblNewLabel = new JLabel("Mã hàng hóa:");
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
			lblNewLabel.setBounds(10, 66, 122, 21);
			getContentPane().add(lblNewLabel);
		
		
			txtMa = new JTextField();
			txtMa.setBounds(10, 110, 252, 19);
			getContentPane().add(txtMa);
			txtMa.setColumns(10);
		
		
			JLabel lblTnHngHa = new JLabel("Tên hàng hóa:");
			lblTnHngHa.setFont(new Font("Times New Roman", Font.BOLD, 18));
			lblTnHngHa.setBounds(295, 66, 122, 21);
			getContentPane().add(lblTnHngHa);
		
		
			txtTen = new JTextField();
			txtTen.setColumns(10);
			txtTen.setBounds(295, 110, 252, 19);
			getContentPane().add(txtTen);
		
		
			JLabel lblVtNui = new JLabel("Vật nuôi:");
			lblVtNui.setFont(new Font("Times New Roman", Font.BOLD, 18));
			lblVtNui.setBounds(10, 154, 122, 21);
			getContentPane().add(lblVtNui);
		
		
			JLabel lblLoiVtT = new JLabel("Loại vật tư:");
			lblLoiVtT.setFont(new Font("Times New Roman", Font.BOLD, 18));
			lblLoiVtT.setBounds(295, 160, 122, 21);
			getContentPane().add(lblLoiVtT);
		
		
			JComboBox cboVN = new JComboBox();
			cboVN.setModel(new DefaultComboBoxModel(new String[] {"Gà", "Bò", "Lợn"}));
			cboVN.setBounds(10, 197, 252, 21);
			getContentPane().add(cboVN);
		
		
			JComboBox cboLVT = new JComboBox();
			cboLVT.setModel(new DefaultComboBoxModel(new String[] {"Thức ăn", "Thuốc", "Máy móc", "Vật tư khác"}));
			cboLVT.setBounds(295, 197, 252, 21);
			getContentPane().add(cboLVT);
		
		
			JLabel lblMT = new JLabel("Mô tả:");
			lblMT.setFont(new Font("Times New Roman", Font.BOLD, 18));
			lblMT.setBounds(10, 242, 122, 21);
			getContentPane().add(lblMT);
		
		
		JTextArea txtMoTa = new JTextArea();
		txtMoTa.setBounds(10, 285, 540, 96);
		getContentPane().add(txtMoTa);
		
		JButton btnHuy = new JButton("Hủy");
		btnHuy.setBounds(462, 391, 85, 34);
		getContentPane().add(btnHuy);
		
		JButton btnCapNhat = new JButton("Cập nhật");
		btnCapNhat.setBounds(367, 391, 85, 34);
		getContentPane().add(btnCapNhat);
		
		JButton btnThem = new JButton("Thêm mới");
		btnThem.setBounds(267, 391, 85, 34);
		getContentPane().add(btnThem);
	}
}
