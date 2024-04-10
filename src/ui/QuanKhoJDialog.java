package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuanKhoJDialog extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			QuanKhoJDialog dialog = new QuanKhoJDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public QuanKhoJDialog() {
		setBounds(100, 100, 525, 336);
		getContentPane().setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel.setBounds(10, 10, 491, 233);
			getContentPane().add(panel);
			panel.setLayout(null);
			
			JLabel lblNewLabel_2 = new JLabel("Quản lý nhân viên");
			lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
			lblNewLabel_2.setBounds(34, 16, 163, 21);
			panel.add(lblNewLabel_2);
			
			JLabel lblNewLabel_2_1 = new JLabel("Quản lý vật nuôi");
			lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
			lblNewLabel_2_1.setBounds(318, 16, 163, 21);
			panel.add(lblNewLabel_2_1);
			
			JLabel lblNewLabel_2_1_1 = new JLabel("báo cáo thống kê");
			lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
			lblNewLabel_2_1_1.setBounds(34, 125, 139, 21);
			panel.add(lblNewLabel_2_1_1);
			
			JLabel lblNewLabel_2_1_1_1 = new JLabel("Danh sách yêu cầu");
			lblNewLabel_2_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
			lblNewLabel_2_1_1_1.setBounds(318, 125, 163, 21);
			panel.add(lblNewLabel_2_1_1_1);
			
			JButton btnNV = new JButton("Vào");
			btnNV.setBounds(61, 51, 85, 34);
			panel.add(btnNV);
			
			JButton btnThongKe = new JButton("Vào");
			btnThongKe.setBounds(61, 170, 85, 34);
			panel.add(btnThongKe);
			
			JButton btnVN = new JButton("Vào");
			btnVN.setBounds(353, 47, 85, 34);
			panel.add(btnVN);
			
			JButton btnDanhSach = new JButton("Vào");
			btnDanhSach.setBounds(353, 170, 85, 34);
			panel.add(btnDanhSach);
		}
		
		JButton btnHuy = new JButton("Hủy bỏ");
		
		btnHuy.setBounds(416, 253, 85, 34);
		getContentPane().add(btnHuy);
	}
}
