package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import javax.swing.border.BevelBorder;

public class ThongKeJDialog extends JDialog {
	private JTextField txtTenHang;
	private JTable tblPhieuXuat;
	private JTable tblPhieuNhap;
	private JTextField txtMaxHHX;
	private JTextField txtMinHHX;
	private JTextField txtMaxHHN;
	private JTextField txtMinHHN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ThongKeJDialog dialog = new ThongKeJDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ThongKeJDialog() {
		setBounds(100, 100, 1214, 657);
		getContentPane().setLayout(null);

		JLabel lblBoCoThng = new JLabel("Báo cáo thống kê");
		lblBoCoThng.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblBoCoThng.setBounds(476, 10, 191, 29);
		getContentPane().add(lblBoCoThng);
		
		JPanel pnlBoLoc = new JPanel();
		pnlBoLoc.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "B\u1ED9 l\u1ECDc", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlBoLoc.setBounds(10, 49, 249, 561);
		getContentPane().add(pnlBoLoc);
		pnlBoLoc.setLayout(null);
		
		JLabel lblNam = new JLabel("Năm:");
		lblNam.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNam.setBounds(10, 25, 55, 21);
		pnlBoLoc.add(lblNam);
		
		JComboBox cboNam = new JComboBox();
		cboNam.setBounds(10, 56, 229, 21);
		pnlBoLoc.add(cboNam);
		
		JLabel lblThang = new JLabel("Tháng:");
		lblThang.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblThang.setBounds(10, 87, 88, 21);
		pnlBoLoc.add(lblThang);
		
		JComboBox cboThang = new JComboBox();
		cboThang.setBounds(10, 118, 229, 21);
		pnlBoLoc.add(cboThang);
		
		JLabel lblQuy = new JLabel("Quý:");
		lblQuy.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblQuy.setBounds(10, 149, 75, 21);
		pnlBoLoc.add(lblQuy);
		
		JComboBox cboQuy = new JComboBox();
		cboQuy.setBounds(10, 180, 229, 21);
		pnlBoLoc.add(cboQuy);
		
		JLabel lblNgayBD = new JLabel("Ngày bắt đầu:");
		lblNgayBD.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNgayBD.setBounds(10, 211, 138, 21);
		pnlBoLoc.add(lblNgayBD);
		
		JDateChooser jdcNgayBD = new JDateChooser();
		jdcNgayBD.setBounds(10, 242, 229, 19);
		pnlBoLoc.add(jdcNgayBD);
		
		JLabel lblNgayKT = new JLabel("Ngày kết thúc:");
		lblNgayKT.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNgayKT.setBounds(10, 271, 123, 21);
		pnlBoLoc.add(lblNgayKT);
		
		JDateChooser jdcNgayKT = new JDateChooser();
		jdcNgayKT.setBounds(10, 302, 229, 19);
		pnlBoLoc.add(jdcNgayKT);
		
		JLabel lblLoaiVT = new JLabel("Loại vật tư:");
		lblLoaiVT.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblLoaiVT.setBounds(10, 331, 114, 21);
		pnlBoLoc.add(lblLoaiVT);
		
		JComboBox cboLVT = new JComboBox();
		cboLVT.setBounds(10, 362, 229, 21);
		pnlBoLoc.add(cboLVT);
		
		JLabel lblTenHang = new JLabel("Tên hàng hóa:");
		lblTenHang.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblTenHang.setBounds(10, 393, 138, 21);
		pnlBoLoc.add(lblTenHang);
		
		txtTenHang = new JTextField();
		txtTenHang.setBounds(10, 424, 229, 19);
		pnlBoLoc.add(txtTenHang);
		txtTenHang.setColumns(10);
		
		JButton btnXacNhan = new JButton("Xác nhận");
		btnXacNhan.setBounds(10, 479, 229, 34);
		pnlBoLoc.add(btnXacNhan);
		
		JButton btnInBC = new JButton("In báo cáo");
		btnInBC.setBounds(10, 517, 229, 34);
		pnlBoLoc.add(btnInBC);
		
		JPanel pnlBaoCao = new JPanel();
		pnlBaoCao.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Danh S\u00E1ch", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlBaoCao.setBounds(269, 49, 571, 561);
		getContentPane().add(pnlBaoCao);
		pnlBaoCao.setLayout(null);
		
		JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP);
		tabs.setBounds(10, 23, 551, 528);
		pnlBaoCao.add(tabs);
		
		JPanel pnlPX = new JPanel();
		tabs.addTab("Phiếu xuất", null, pnlPX, null);
		pnlPX.setLayout(null);
		
		JScrollPane scpPX = new JScrollPane();
		scpPX.setBounds(10, 10, 526, 365);
		pnlPX.add(scpPX);
		
		tblPhieuXuat = new JTable();
		tblPhieuXuat.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 phi\u1EBFu xu\u1EA5t", "T\u00EAn h\u00E0ng h\u00F3a", "S\u1ED1 l\u01B0\u1EE3ng", "M\u1EE5c \u0111\u00EDnh", "Ng\u01B0\u1EDDi th\u1EF1c hi\u1EC7n", "Ng\u00E0y th\u1EF1c hi\u1EC7n"
			}
		));
		scpPX.setViewportView(tblPhieuXuat);
		
		JPanel pnlHangHoaX = new JPanel();
		pnlHangHoaX.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlHangHoaX.setBounds(10, 385, 526, 106);
		pnlPX.add(pnlHangHoaX);
		pnlHangHoaX.setLayout(null);
		
		JLabel lblHangHoa = new JLabel("Hàng hóa");
		lblHangHoa.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblHangHoa.setBounds(230, 10, 83, 21);
		pnlHangHoaX.add(lblHangHoa);
		
		JLabel lblMaxHHX = new JLabel("Xuất nhiều nhất:");
		lblMaxHHX.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblMaxHHX.setBounds(64, 40, 141, 21);
		pnlHangHoaX.add(lblMaxHHX);
		
		JLabel lblMinHHX = new JLabel("Xuất ít nhất:");
		lblMinHHX.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblMinHHX.setBounds(64, 71, 141, 21);
		pnlHangHoaX.add(lblMinHHX);
		
		txtMaxHHX = new JTextField();
		txtMaxHHX.setEditable(false);
		txtMaxHHX.setBounds(253, 43, 189, 19);
		pnlHangHoaX.add(txtMaxHHX);
		txtMaxHHX.setColumns(10);
		
		txtMinHHX = new JTextField();
		txtMinHHX.setEditable(false);
		txtMinHHX.setColumns(10);
		txtMinHHX.setBounds(253, 74, 189, 19);
		pnlHangHoaX.add(txtMinHHX);
		
		JPanel pnlPN = new JPanel();
		tabs.addTab("Phiếu nhập", null, pnlPN, null);
		pnlPN.setLayout(null);
		
		JScrollPane scpPN = new JScrollPane();
		scpPN.setBounds(10, 10, 526, 365);
		pnlPN.add(scpPN);
		
		tblPhieuNhap = new JTable();
		tblPhieuNhap.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 phi\u1EBFu nh\u1EADp", "T\u00EAn h\u00E0ng h\u00F3a", "S\u1ED1 l\u01B0\u1EE3ng", "M\u1EE5c \u0111\u00EDch", "Ng\u01B0\u1EDDi th\u1EF1c hi\u1EC7n", "Ng\u00E0y th\u1EF1c hi\u1EC7n"
			}
		));
		scpPN.setViewportView(tblPhieuNhap);
		
		JPanel pnlHangHoaX_1 = new JPanel();
		pnlHangHoaX_1.setLayout(null);
		pnlHangHoaX_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlHangHoaX_1.setBounds(10, 385, 526, 106);
		pnlPN.add(pnlHangHoaX_1);
		
		JLabel lblHangHoaN = new JLabel("Hàng hóa");
		lblHangHoaN.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblHangHoaN.setBounds(230, 10, 83, 21);
		pnlHangHoaX_1.add(lblHangHoaN);
		
		JLabel lblMaxHHN = new JLabel("Nhập nhiều nhất:");
		lblMaxHHN.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblMaxHHN.setBounds(64, 40, 141, 21);
		pnlHangHoaX_1.add(lblMaxHHN);
		
		JLabel lblMinHHN = new JLabel("Nhập ít nhất");
		lblMinHHN.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblMinHHN.setBounds(64, 71, 141, 21);
		pnlHangHoaX_1.add(lblMinHHN);
		
		txtMaxHHN = new JTextField();
		txtMaxHHN.setEditable(false);
		txtMaxHHN.setColumns(10);
		txtMaxHHN.setBounds(253, 43, 189, 19);
		pnlHangHoaX_1.add(txtMaxHHN);
		
		txtMinHHN = new JTextField();
		txtMinHHN.setEditable(false);
		txtMinHHN.setColumns(10);
		txtMinHHN.setBounds(253, 74, 189, 19);
		pnlHangHoaX_1.add(txtMinHHN);
		
		JPanel pnlBieuDo = new JPanel();
		pnlBieuDo.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Bi\u1EC3u \u0111\u1ED3", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlBieuDo.setBounds(850, 49, 340, 561);
		getContentPane().add(pnlBieuDo);
		pnlBieuDo.setLayout(null);
		
		JPanel pnlBDX = new JPanel();
		pnlBDX.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlBDX.setBounds(10, 28, 320, 251);
		pnlBieuDo.add(pnlBDX);
		pnlBDX.setLayout(null);
		
		JLabel lblBDX = new JLabel("Biểu đồ xuất");
		lblBDX.setBounds(130, 10, 82, 13);
		pnlBDX.add(lblBDX);
		
		JPanel pnlBDN = new JPanel();
		pnlBDN.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlBDN.setBounds(10, 289, 320, 262);
		pnlBieuDo.add(pnlBDN);
		pnlBDN.setLayout(null);
		
		JLabel lblBDN = new JLabel("Biểu đồ nhập");
		lblBDN.setBounds(130, 10, 93, 13);
		pnlBDN.add(lblBDN);

	}
}
