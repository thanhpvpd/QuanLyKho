package ui;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;

public class VD extends JFrame {
    public VD(String title) {
        super(title);

        // Tạo dữ liệu cho biểu đồ
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(50, "Category 1", "Label 1");
        dataset.setValue(70, "Category 2", "Label 2");
        dataset.setValue(90, "Category 3", "Label 3");

        // Tạo biểu đồ hình cột dọc
        JFreeChart chart = ChartFactory.createBarChart(
                "Biểu đồ hình cột dọc", // Tiêu đề biểu đồ
                "Nhãn", // Nhãn trục x
                "Giá trị", // Nhãn trục y
                dataset // Dữ liệu biểu đồ
        );

        // Thay đổi màu nền của biểu đồ (tùy chọn)
        chart.setBackgroundPaint(Color.white);

        // Tạo một Panel chứa biểu đồ và hiển thị trong giao diện
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(400, 300));

        // Thêm Panel vào giao diện
        setContentPane(chartPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VD example = new VD("Biểu đồ hình cột dọc");
            example.pack();
            example.setLocationRelativeTo(null);
            example.setVisible(true);
        });
    }
}
