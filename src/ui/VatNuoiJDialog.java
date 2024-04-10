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
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VatNuoiJDialog extends JDialog {
	private JTextField txtTenVN;
	private JTextField txtTG;
	private JTextField txtNgayThem;
	private JTable tblDanhSach;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VatNuoiJDialog dialog = new VatNuoiJDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VatNuoiJDialog() {
		setBounds(100, 100, 608, 376);
		getContentPane().setLayout(null);

		JLabel lblQunLVt = new JLabel("Quản lý Vật nuôi");
		lblQunLVt.setBounds(10, 10, 191, 29);
		lblQunLVt.setFont(new Font("Times New Roman", Font.BOLD, 24));
		getContentPane().add(lblQunLVt);

		JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP);
		tabs.setBounds(10, 49, 584, 294);
		getContentPane().add(tabs);

		JPanel panel = new JPanel();
		tabs.addTab("Cập nhật", null, panel, null);
		panel.setLayout(null);

		JLabel lblHinhAnh = new JLabel("");
		lblHinhAnh.setIcon(new ImageIcon("D:\\download\\QuanLyKhoVTCN\\src\\main\\java\\icon\\anhga.png"));
		lblHinhAnh.setBounds(10, 10, 182, 247);
		panel.add(lblHinhAnh);

		JLabel lblNewLabel_2 = new JLabel("Tên vật nuôi:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(202, 10, 143, 21);
		panel.add(lblNewLabel_2);

		txtTenVN = new JTextField();
		txtTenVN.setBounds(202, 41, 370, 19);
		panel.add(txtTenVN);
		txtTenVN.setColumns(10);

		JLabel lblNewLabel_2_1 = new JLabel("Thời gian sinh trưởng (tháng)");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(202, 70, 250, 21);
		panel.add(lblNewLabel_2_1);

		txtTG = new JTextField();
		txtTG.setBounds(202, 101, 370, 19);
		panel.add(txtTG);
		txtTG.setColumns(10);

		JLabel lblNewLabel_2_1_1 = new JLabel("Ngày thêm");
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_1_1.setBounds(202, 130, 151, 21);
		panel.add(lblNewLabel_2_1_1);

		txtNgayThem = new JTextField();
		txtNgayThem.setBounds(202, 166, 370, 19);
		panel.add(txtNgayThem);
		txtNgayThem.setColumns(10);

		JButton btnThem = new JButton("Thêm");
		btnThem.setBounds(202, 223, 85, 34);
		panel.add(btnThem);

		JButton btnSua = new JButton("Sửa");
		btnSua.setBounds(297, 223, 85, 34);
		panel.add(btnSua);

		JButton btnXoa = new JButton("Xóa");
		btnXoa.setBounds(392, 223, 85, 34);
		panel.add(btnXoa);

		JButton btnMoi = new JButton("Mới");
		btnMoi.setBounds(487, 223, 85, 34);
		panel.add(btnMoi);

		JPanel panel_1 = new JPanel();
		tabs.addTab("Danh sách", null, panel_1, null);
		panel_1.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 559, 247);
		panel_1.add(scrollPane);

		tblDanhSach = new JTable();
		tblDanhSach.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null }, { null, null, null, null, null },
						{ null, null, null, null, null }, { null, null, null, null, null }, },
				new String[] { "M\u00E3 v\u1EADt nu\u00F4i", "T\u00EAn v\u1EADt nu\u00F4i", "TG sinh tr\u01B0\u1EDFng",
						"H\u00ECnh \u1EA3nh", "Ng\u00E0y th\u00EAm" }));
		tblDanhSach.getColumnModel().getColumn(0).setPreferredWidth(70);
		tblDanhSach.getColumnModel().getColumn(2).setPreferredWidth(85);
		scrollPane.setViewportView(tblDanhSach);
	}

}
