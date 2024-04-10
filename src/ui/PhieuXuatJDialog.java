package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PhieuXuatJDialog extends JDialog {
	private JTextField txtMa;
	private JTextField txtSoLuong;
	private JTextField txtMaHang;
	private JTextField txtNgay;
	private JTable tblDS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			PhieuXuatJDialog dialog = new PhieuXuatJDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public PhieuXuatJDialog() {
		setBounds(100, 100, 642, 452);
		getContentPane().setLayout(null);
		{
			JLabel lblPhiuXut = new JLabel("Phiếu xuất");
			lblPhiuXut.setFont(new Font("Times New Roman", Font.BOLD, 24));
			lblPhiuXut.setBounds(10, 10, 153, 29);
			getContentPane().add(lblPhiuXut);
		}
		{
			JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP);
			tabs.setBounds(10, 49, 608, 364);
			getContentPane().add(tabs);
			{
				JPanel pnlCN = new JPanel();
				tabs.addTab("Tạo phiếu", null, pnlCN, null);
				pnlCN.setLayout(null);
				
					JLabel lblNewLabel_2 = new JLabel("Mã phiếu :");
					lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
					lblNewLabel_2.setBounds(10, 10, 95, 21);
					pnlCN.add(lblNewLabel_2);
				
				
					txtMa = new JTextField();
					txtMa.setBounds(10, 51, 272, 19);
					pnlCN.add(txtMa);
					txtMa.setColumns(10);
				
				
					JLabel lblNewLabel_6 = new JLabel("Mã hàng hóa :");
					lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 18));
					lblNewLabel_6.setBounds(321, 10, 131, 21);
					pnlCN.add(lblNewLabel_6);
				
				
					txtSoLuong = new JTextField();
					txtSoLuong.setBounds(10, 140, 272, 19);
					pnlCN.add(txtSoLuong);
					txtSoLuong.setColumns(10);
				
				
					JLabel lblNewLabel_3 = new JLabel("Số lượng:");
					lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
					lblNewLabel_3.setBounds(10, 94, 95, 21);
					pnlCN.add(lblNewLabel_3);
				
				
					txtMaHang = new JTextField();
					txtMaHang.setColumns(10);
					txtMaHang.setBounds(321, 51, 272, 19);
					pnlCN.add(txtMaHang);
				
				
					JLabel lblNewLabel_4 = new JLabel("Ngày Xuất:");
					lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
					lblNewLabel_4.setBounds(321, 94, 95, 21);
					pnlCN.add(lblNewLabel_4);
				
				
					txtNgay = new JTextField();
					txtNgay.setColumns(10);
					txtNgay.setBounds(321, 140, 272, 19);
					pnlCN.add(txtNgay);
				
				
					JLabel lblNewLabel_5 = new JLabel("Lý do:");
					lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
					lblNewLabel_5.setBounds(10, 179, 95, 21);
					pnlCN.add(lblNewLabel_5);
				
				
					JTextArea txtLD = new JTextArea();
					txtLD.setBounds(10, 210, 583, 77);
					pnlCN.add(txtLD);
				
				
					JButton btnXoa = new JButton("Xóa");
					btnXoa.setBounds(508, 294, 85, 34);
					pnlCN.add(btnXoa);
				
				
					JButton btnSua = new JButton("Sửa");
					btnSua.setBounds(413, 294, 85, 34);
					pnlCN.add(btnSua);
				
				
					JButton btnThem = new JButton("Thêm");
					btnThem.setBounds(318, 294, 85, 34);
					pnlCN.add(btnThem);
				
				
					JButton btnMoi = new JButton("Mới");
					btnMoi.setBounds(223, 294, 85, 34);
					pnlCN.add(btnMoi);
				
			}
			{
				JPanel pnlDS = new JPanel();
				tabs.addTab("Danh sách phiếu", null, pnlDS, null);
				pnlDS.setLayout(null);
				{
					JScrollPane scrollPane = new JScrollPane();
					scrollPane.setBounds(10, 10, 583, 317);
					pnlDS.add(scrollPane);
					{
						tblDS = new JTable();
						tblDS.setModel(new DefaultTableModel(
							new Object[][] {
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
							},
							new String[] {
								"M\u00E3 phi\u1EBFu", "M\u00E3 h\u00E0ng", "S\u1ED1 l\u01B0\u1EE3ng", "L\u00FD do", "Ng\u01B0\u1EDDi xu\u1EA5t", "Ng\u00E0y xu\u1EA5t", "tr\u1EA1ng th\u00E1i"
							}
						));
						tblDS.getColumnModel().getColumn(0).setPreferredWidth(82);
						tblDS.getColumnModel().getColumn(2).setPreferredWidth(62);
						tblDS.getColumnModel().getColumn(3).setPreferredWidth(137);
						tblDS.getColumnModel().getColumn(5).setPreferredWidth(93);
						tblDS.getColumnModel().getColumn(6).setPreferredWidth(91);
						scrollPane.setViewportView(tblDS);
					}
				}
			}
		}
	}

}
