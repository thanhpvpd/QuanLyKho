package ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class ThuocJDialog extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ThuocJDialog dialog = new ThuocJDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private JTextField txtMa;
	private JTextField txtTen;
	private JTextField txtHSD;
	private Component txtNSX;
	private Component txtMaNV;
	private JTextField txtTG;
	private JTextField txtTim;
	private JTable tblDanhSach;

	/**
	 * Create the dialog.
	 */
	public ThuocJDialog() {
		setBounds(100, 100, 728, 604);
		getContentPane().setLayout(null);
		
		JLabel lblQunLThc = new JLabel("Quản lý thuốc");
		lblQunLThc.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblQunLThc.setBounds(10, 10, 210, 29);
		getContentPane().add(lblQunLThc);
		JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP);
		tabs.setBounds(10, 49, 696, 508);
		getContentPane().add(tabs);

		JPanel panel = new JPanel();
		tabs.addTab("Cập nhật", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Mã thuốc:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(28, 10, 111, 21);
		panel.add(lblNewLabel_2);
		
		txtMa = new JTextField();
		txtMa.setColumns(10);
		txtMa.setBounds(28, 41, 303, 19);
		panel.add(txtMa);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tên thuốc:");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(28, 165, 111, 21);
		panel.add(lblNewLabel_2_1);
		
		txtTen = new JTextField();
		txtTen.setColumns(10);
		txtTen.setBounds(28, 196, 303, 19);
		panel.add(txtTen);
		
		JLabel lblNewLabel_2_2 = new JLabel("Vật nuôi:");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_2.setBounds(28, 87, 111, 21);
		panel.add(lblNewLabel_2_2);
		
		JComboBox cboVN = new JComboBox();
		cboVN.setModel(new DefaultComboBoxModel(new String[] {"gà", "bò", "lợn"}));
		cboVN.setBounds(28, 118, 303, 21);
		panel.add(cboVN);
		
		JLabel lblNewLabel_2_3 = new JLabel("NSX:");
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_3.setBounds(373, 10, 67, 21);
		panel.add(lblNewLabel_2_3);
		
		txtHSD = new JTextField();
		txtHSD.setColumns(10);
		txtHSD.setBounds(373, 120, 303, 19);
		panel.add(txtHSD);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("HSD");
		lblNewLabel_2_3_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_3_1.setBounds(373, 87, 67, 21);
		panel.add(lblNewLabel_2_3_1);
		
		txtNSX = new JTextField();
		txtNSX.setBounds(373, 41, 303, 19);
		panel.add(txtNSX);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Mã nhân viên thêm:");
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_1_1.setBounds(28, 242, 172, 21);
		panel.add(lblNewLabel_2_1_1);
		
		txtMaNV = new JTextField();
		txtMaNV.setEnabled(false);
		txtMaNV.setBounds(28, 273, 303, 19);
		panel.add(txtMaNV);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Thời gian thêm:");
		lblNewLabel_2_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_1_1_1.setBounds(373, 248, 172, 21);
		panel.add(lblNewLabel_2_1_1_1);
		
		txtTG = new JTextField();
		txtTG.setEnabled(false);
		txtTG.setColumns(10);
		txtTG.setBounds(373, 273, 303, 19);
		panel.add(txtTG);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Mô tả:");
		lblNewLabel_2_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_1_1_2.setBounds(28, 311, 111, 21);
		panel.add(lblNewLabel_2_1_1_2);
		
		JTextArea txtMoTa = new JTextArea();
		txtMoTa.setBounds(28, 342, 648, 77);
		panel.add(txtMoTa);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.setBounds(28, 429, 85, 34);
		panel.add(btnThem);
		
		JButton btnSua = new JButton("Sửa");
		btnSua.setBounds(123, 429, 85, 34);
		panel.add(btnSua);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.setBounds(218, 429, 85, 34);
		panel.add(btnXoa);
		
		JButton btnMoi = new JButton("Mới");
		btnMoi.setBounds(313, 429, 85, 34);
		panel.add(btnMoi);
		
		JButton btnXuat = new JButton("Xuất");
		btnXuat.setBounds(591, 429, 85, 34);
		panel.add(btnXuat);
		
		JButton btnNhap = new JButton("Nhập");
		btnNhap.setBounds(496, 429, 85, 34);
		panel.add(btnNhap);
		
		JPanel panel_1 = new JPanel();
		tabs.addTab("Danh sách", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "T\u00ECm ki\u1EBFm", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 10, 671, 52);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		txtTim = new JTextField();
		txtTim.setBounds(30, 23, 525, 19);
		panel_2.add(txtTim);
		txtTim.setColumns(10);
		
		JButton btnTim = new JButton("Tìm");
		btnTim.setBounds(576, 22, 69, 21);
		panel_2.add(btnTim);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 72, 671, 399);
		panel_1.add(scrollPane);
		
		tblDanhSach = new JTable();
		tblDanhSach.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 TA", "T\u00EAn th\u1EE9c \u0103n", "M\u00E3 v\u1EADt nu\u00F4i", "NSX", "HSD", "S\u1ED1 l\u01B0\u1EE3ng", "M\u00F4 t\u1EA3", "Ng\u01B0\u1EDDi th\u00EAm", "Ng\u00E0y th\u00EAm"
			}
		));
		tblDanhSach.getColumnModel().getColumn(0).setPreferredWidth(51);
		tblDanhSach.getColumnModel().getColumn(2).setPreferredWidth(71);
		tblDanhSach.getColumnModel().getColumn(5).setPreferredWidth(54);
		tblDanhSach.getColumnModel().getColumn(6).setPreferredWidth(89);
		scrollPane.setViewportView(tblDanhSach);
		
		
	}

}
