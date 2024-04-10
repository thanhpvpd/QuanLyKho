package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class ThucAnJDialog extends JDialog {
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ThucAnJDialog dialog = new ThucAnJDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ThucAnJDialog() {
		setBounds(100, 100, 728, 581);
		getContentPane().setLayout(null);

		JLabel lblQunLThc = new JLabel("Quản lý Thức ăn");
		lblQunLThc.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblQunLThc.setBounds(10, 10, 210, 29);
		getContentPane().add(lblQunLThc);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "T\u00ECm ki\u1EBFm", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 49, 694, 64);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(41, 24, 471, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Tìm");
		btnNewButton.setBounds(557, 23, 85, 21);
		panel.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 123, 694, 367);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 VT kh\u00E1c", "T\u00EAn v\u1EADt t\u01B0", "V\u1EADt nu\u00F4i s\u1EED d\u1EE5ng", "HSD", "S\u1ED1 l\u01B0\u1EE3ng", "M\u00F4 t\u1EA3", "M\u00E3 phi\u1EBFu nh\u1EADp"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(67);
		table.getColumnModel().getColumn(1).setPreferredWidth(93);
		table.getColumnModel().getColumn(2).setPreferredWidth(91);
		table.getColumnModel().getColumn(3).setPreferredWidth(95);
		table.getColumnModel().getColumn(4).setPreferredWidth(59);
		table.getColumnModel().getColumn(5).setPreferredWidth(143);
		scrollPane.setViewportView(table);
		
		JButton btnNhap = new JButton("Nhập");
		btnNhap.setBounds(619, 500, 85, 34);
		getContentPane().add(btnNhap);
		
		JButton btnXuat = new JButton("Xuất");
		btnXuat.setBounds(524, 500, 85, 34);
		getContentPane().add(btnXuat);
		
		JButton btnSua = new JButton("Sửa");
		btnSua.setBounds(10, 500, 85, 34);
		getContentPane().add(btnSua);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.setBounds(105, 500, 85, 34);
		getContentPane().add(btnXoa);

	}
}
