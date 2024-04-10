package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		Border border1 = BorderFactory.createMatteBorder(0, 0, 0, 1, Color.BLACK);
		Border border2 = BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK);
		Border border3 = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 158, 453);
		panel.setBorder(border1);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.setBounds(0, 421, 155, 32);
		panel.add(btnThoat);
		
		JButton btnDKM = new JButton("Đổi mật khẩu");
		btnDKM.setBounds(0, 391, 155, 32);
		panel.add(btnDKM);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 155, 101);
		panel_1.setBorder(border3);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblHinhAnh = new JLabel("");
		lblHinhAnh.setIcon(new ImageIcon("C:\\Users\\thanh\\Downloads\\profile.png"));
		lblHinhAnh.setBounds(40, 10, 62, 62);
		panel_1.add(lblHinhAnh);
		
		JLabel lblMa = new JLabel("Xin chào bạn tamnt");
		lblMa.setBounds(23, 82, 119, 13);
		panel_1.add(lblMa);
		
		JButton btnThucAn = new JButton("Thúc ăn");
		btnThucAn.setBounds(0, 111, 155, 40);
		panel.add(btnThucAn);
		
		JButton btnThuoc = new JButton("Thuốc");
		btnThuoc.setBounds(0, 149, 155, 40);
		panel.add(btnThuoc);
		
		JButton btnMay = new JButton("Máy móc");
		btnMay.setBounds(0, 187, 155, 40);
		panel.add(btnMay);
		
		JButton btnVTK = new JButton("Vật tư khác");
		btnVTK.setBounds(0, 225, 155, 40);
		panel.add(btnVTK);
		
		JButton btnVatNuoi = new JButton("Vật nuôi");
		btnVatNuoi.setBounds(0, 263, 155, 40);
		panel.add(btnVatNuoi);
		
		JButton btnNV = new JButton("Nhân viên");
		btnNV.setBounds(0, 301, 155, 40);
		panel.add(btnNV);
		
		JButton btnThongKe = new JButton("Thống kê");
		btnThongKe.setBounds(0, 338, 155, 40);
		panel.add(btnThongKe);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(156, 424, 641, 29);
		panel_2.setBorder(border2);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblGT2 = new JLabel("");
		lblGT2.setIcon(new ImageIcon("D:\\download\\QuanLyKhoVTCN\\src\\main\\java\\icon\\icons8-info-24.png"));
		lblGT2.setBounds(0, 0, 24, 29);
		panel_2.add(lblGT2);
		
		JLabel lblGT = new JLabel("Giới thiệu sản phẩm");
		lblGT.setBounds(27, 0, 115, 29);
		panel_2.add(lblGT);
		
		JLabel lblDongHo = new JLabel("00:00:00 AM");
		lblDongHo.setBounds(568, 0, 74, 29);
		panel_2.add(lblDongHo);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("D:\\Du An mau\\SOF2041_Assignment\\polypro\\icon\\Alarm.png"));
		lblNewLabel_1_1.setBounds(534, 0, 24, 29);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblHuongDan = new JLabel("");
		lblHuongDan.setIcon(new ImageIcon("C:\\Users\\thanh\\Downloads\\help-desk.png"));
		lblHuongDan.setBounds(755, 10, 32, 32);
		contentPane.add(lblHuongDan);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\download\\QuanLyKhoVTCN\\src\\main\\java\\icon\\nongdan.png"));
		lblNewLabel.setBounds(226, 60, 228, 338);
		contentPane.add(lblNewLabel);
		
		JLabel lbl23 = new JLabel("Thức ăn sắp hết hạn");
		lbl23.setBounds(475, 130, 121, 13);
		contentPane.add(lbl23);
		
		JButton btnTAHN = new JButton("0");
		btnTAHN.setForeground(new Color(255, 0, 0));
		btnTAHN.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnTAHN.setBounds(485, 153, 85, 45);
		contentPane.add(btnTAHN);
		
		JLabel lblNewLabel_1_2 = new JLabel("Thuốc sắp hết hạn");
		lblNewLabel_1_2.setBounds(659, 130, 121, 13);
		contentPane.add(lblNewLabel_1_2);
		
		JButton btnTSHN = new JButton("0");
		
		
		btnTSHN.setForeground(new Color(255, 0, 0));
		btnTSHN.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnTSHN.setBounds(669, 153, 85, 45);
		contentPane.add(btnTSHN);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Máy sắp đến hạn bảo hành");
		lblNewLabel_1_2_1.setBounds(475, 267, 158, 13);
		contentPane.add(lblNewLabel_1_2_1);
		
		JButton btnMBH = new JButton("0");
		btnMBH.setForeground(Color.RED);
		btnMBH.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnMBH.setBounds(485, 290, 85, 45);
		contentPane.add(btnMBH);
		
		JLabel lbl23_1 = new JLabel("Thức ăn sắp hết hạn");
		lbl23_1.setBounds(659, 267, 121, 13);
		contentPane.add(lbl23_1);
		
		JButton btnMBH_1 = new JButton("0");
		btnMBH_1.setForeground(Color.RED);
		btnMBH_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnMBH_1.setBounds(659, 290, 85, 45);
		contentPane.add(btnMBH_1);
	}
	
	
}
