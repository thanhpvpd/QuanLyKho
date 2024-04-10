package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class NhanVienJDialog extends JDialog {
	private JTextField txtMa;
	private JTextField txtHoTen;
	private JPasswordField txtPass;
	private JTextField txtSDT;
	private JTable tblDanhSach;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NhanVienJDialog dialog = new NhanVienJDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NhanVienJDialog() {
		setBounds(100, 100, 675, 415);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quản lý nhân viên");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(10, 10, 210, 29);
		getContentPane().add(lblNewLabel);
		
		JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP);
		tabs.setBounds(10, 49, 650, 327);
		getContentPane().add(tabs);
		
		ButtonGroup BG = new ButtonGroup();
		
		JPanel panel = new JPanel();
		tabs.addTab("Cập nhật", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblHinhAnh = new JLabel("");
		lblHinhAnh.setIcon(new ImageIcon("D:\\download\\QuanLyKhoVTCN\\src\\main\\java\\icon\\anh1.png"));
		lblHinhAnh.setBounds(22, 10, 173, 277);
		panel.add(lblHinhAnh);
		
		JLabel lblNewLabel_2 = new JLabel("Mã nhân viên:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(214, 24, 143, 21);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Họ và tên:");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(214, 71, 126, 21);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Mật khẩu:");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_2.setBounds(214, 114, 143, 21);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("SĐT:");
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_3.setBounds(214, 158, 143, 21);
		panel.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Vai trò:");
		lblNewLabel_2_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_4.setBounds(214, 205, 143, 21);
		panel.add(lblNewLabel_2_4);
		
		txtMa = new JTextField();
		txtMa.setBounds(367, 24, 230, 19);
		panel.add(txtMa);
		txtMa.setColumns(10);
		
		txtHoTen = new JTextField();
		txtHoTen.setBounds(367, 74, 230, 19);
		panel.add(txtHoTen);
		txtHoTen.setColumns(10);
		
		txtPass = new JPasswordField();
		txtPass.setBounds(367, 117, 230, 19);
		panel.add(txtPass);
		
		txtSDT = new JTextField();
		txtSDT.setBounds(367, 161, 230, 19);
		panel.add(txtSDT);
		txtSDT.setColumns(10);
		
		JRadioButton rdoNV = new JRadioButton("Nhân viên");
		rdoNV.setSelected(true);
		rdoNV.setBounds(363, 207, 103, 21);
		panel.add(rdoNV);
		
		JRadioButton rdoChu = new JRadioButton("Chủ kho");
		rdoChu.setBounds(468, 207, 97, 21);
		panel.add(rdoChu);
		BG.add(rdoNV);
		BG.add(rdoChu);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.setBounds(224, 253, 85, 34);
		panel.add(btnThem);
		
		JButton btnSua = new JButton("Sửa");
		btnSua.setBounds(319, 253, 85, 34);
		panel.add(btnSua);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.setBounds(417, 253, 85, 34);
		panel.add(btnXoa);
		
		JButton btnMoi = new JButton("Mới");
		btnMoi.setBounds(512, 253, 85, 34);
		panel.add(btnMoi);
		
		
		
		
		JPanel panel_1 = new JPanel();
		tabs.addTab("Danh sách", null, panel_1, null);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 5, 625, 285);
		panel_1.add(scrollPane);
		
		tblDanhSach = new JTable();
		tblDanhSach.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 NV", "M\u1EADt kh\u1EA9u", "H\u1ECD t\u00EAn", "S\u0110T", "H\u00ECnh \u1EA3nh", "Vai tr\u00F2"
			}
		));
		scrollPane.setViewportView(tblDanhSach);
	}
}
