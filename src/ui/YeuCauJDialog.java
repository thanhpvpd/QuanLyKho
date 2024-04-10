package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;

public class YeuCauJDialog extends JDialog {
	private JTable tblXuat;
	private JTable tblNhap;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			YeuCauJDialog dialog = new YeuCauJDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public YeuCauJDialog() {
		setBounds(100, 100, 615, 416);
		getContentPane().setLayout(null);
		{
			JLabel lblQunLYu = new JLabel("Quản lý yêu cầu");
			lblQunLYu.setFont(new Font("Times New Roman", Font.BOLD, 24));
			lblQunLYu.setBounds(10, 10, 191, 29);
			getContentPane().add(lblQunLYu);
		}
		
			JButton btnHy = new JButton("Hủy");
			btnHy.setBounds(506, 339, 85, 34);
			getContentPane().add(btnHy);
		
		
			JButton btnTChi = new JButton("Từ chối");
			btnTChi.setBounds(411, 339, 85, 34);
			getContentPane().add(btnTChi);
		
		
			JButton btnng = new JButton("Đồng ý");
			btnng.setBounds(316, 339, 85, 34);
			getContentPane().add(btnng);
		
		
			JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP);
			tabs.setBounds(10, 42, 581, 287);
			getContentPane().add(tabs);
			
				JPanel pnlXuat = new JPanel();
				tabs.addTab("Xuất", null, pnlXuat, null);
				pnlXuat.setLayout(null);
				{
					JScrollPane scrollPane = new JScrollPane();
					scrollPane.setBounds(10, 10, 556, 240);
					pnlXuat.add(scrollPane);
					{
						tblXuat = new JTable();
						tblXuat.setModel(new DefaultTableModel(
							new Object[][] {
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
							},
							new String[] {
								"M\u00E3 xu\u1EA5t", "M\u00E3 h\u00E0ng", "S\u1ED1 l\u01B0\u1EE3ng", "L\u00FD do", "Ng\u01B0\u1EDDi nh\u1EADp", "Ng\u00E0y Nh\u1EADp", "Tr\u1EA1ng th\u00E1i"
							}
						));
						tblXuat.getColumnModel().getColumn(0).setPreferredWidth(82);
						tblXuat.getColumnModel().getColumn(2).setPreferredWidth(62);
						tblXuat.getColumnModel().getColumn(3).setPreferredWidth(137);
						tblXuat.getColumnModel().getColumn(5).setPreferredWidth(93);
						tblXuat.getColumnModel().getColumn(6).setPreferredWidth(91);
						scrollPane.setViewportView(tblXuat);
					}
				}
			
			
				JPanel pnlNhap = new JPanel();
				tabs.addTab("Nhập", null, pnlNhap, null);
				pnlNhap.setLayout(null);
				{
					JScrollPane scrollPane1 = new JScrollPane();
					scrollPane1.setBounds(10, 10, 556, 240);
					pnlNhap.add(scrollPane1);
					{
						tblNhap = new JTable();
						tblNhap.setModel(new DefaultTableModel(
							new Object[][] {
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null},
							},
							new String[] {
								"M\u00E3 nh\u1EADp", "M\u00E3 h\u00E0ng", "S\u1ED1 l\u01B0\u1EE3ng", "L\u00FD do", "Ng\u01B0\u1EDDi nh\u1EADp", "Ng\u00E0y nh\u1EADp", "tr\u1EA1ng th\u00E1i"
							}
						));
						tblNhap.getColumnModel().getColumn(0).setPreferredWidth(82);
						tblNhap.getColumnModel().getColumn(2).setPreferredWidth(62);
						tblNhap.getColumnModel().getColumn(3).setPreferredWidth(137);
						tblNhap.getColumnModel().getColumn(5).setPreferredWidth(93);
						tblNhap.getColumnModel().getColumn(6).setPreferredWidth(91);
						scrollPane1.setViewportView(tblNhap);
					}
				}
			
		
	}

}
