package JavaOOP.Haidar.PraktikumPemro.Modul6;

import javax.swing.*;
import java.awt.*;

public class Praktikum6 extends JFrame {
    public Praktikum6() {
        setTitle("NIM Table");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Membuat tabel
        Object[][] data = {
            {"123", "John", " "},
            {"123", "Jane", " "},
            {"124123", "Jono", " "},
            {"1241234", "Agus", " "}
        };
        String[] columns = {"NIM", "Nama", " "};
        JTable table = new JTable(data, columns);

        // Menambahkan tabel ke panel
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(table), BorderLayout.CENTER);

        // Menambahkan panel ke jendela
        setContentPane(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Praktikum6().setVisible(true);
            }
        });
    }
}