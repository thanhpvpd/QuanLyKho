package ui;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    private JDesktopPane desktopPane;

    public App() {
        setTitle("Ứng dụng Desktop");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        desktopPane = new JDesktopPane();
        add(desktopPane);

        createInternalFrame("Cửa sổ nội bộ 1", 50, 50, 200, 150);
        createInternalFrame("Cửa sổ nội bộ 2", 250, 100, 300, 200);

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    private void createInternalFrame(String title, int x, int y, int width, int height) {
        JInternalFrame internalFrame = new JInternalFrame(title, true, true, true, true);
        internalFrame.setBounds(x, y, width, height);

        JLabel label = new JLabel("Đây là " + title);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        internalFrame.add(label, BorderLayout.CENTER);

        internalFrame.setVisible(true);
        desktopPane.add(internalFrame);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App());
    }
}
