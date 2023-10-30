/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

class AboutPanel
extends JPanel {
    private JTextArea textArea;
    private ImageIcon image;
    private ImageIcon background;
    private int language;

    public AboutPanel(int language) {
        this.setLayout(null);
        this.textArea = new JTextArea();
        this.textArea.setLineWrap(true);
        this.language = language;
        if (language == 0) {
            this.textArea.setText("Project of OS Class (Class ID : IT007.F25)\nCPU Scheduling Simulation Program\nImplemented by: MrNocTV and Pham  Thi Tuyet.\nWe coded this program in one week as we      wanted to be the first group to submit       project for teacher. In such a short time    like that, me and my friend tried to finish  this program with a nice interface and       without any bugs.\nBut if you encounter any errors or program   crashes when you are using, please contact uswith the contact information given in the    Contact menu. \nThe program is only for simulation purpose   and helping student in studying OS subjects (especially for studying CPU scheduling).  ");
        } else if (language == 1) {
            this.textArea.setText("\u0110\u1ed3 \u00e1n l\u1edbp h\u1ec7 \u0111i\u1ec1u h\u00e0nh (M\u00e3 l\u1edbp: IT007.F25)\nCh\u01b0\u01a1ng tr\u00ecnh m\u00f4 ph\u1ecfng l\u1eadp l\u1ecbch CPU\nHi\u1ec7n th\u1ef1c b\u1edfi: MrNocTV and Ph\u1ea1m Th\u1ecb Tuy\u1ebft.\nCh\u00fang t\u00f4i vi\u1ebft ch\u01b0\u01a1ng tr\u00ecnh n\u00e0y trong v\u00f2ng 1 tu\u1ea7n v\u00ec ch\u00fang t\u00f4i mu\u1ed1n m\u00ecnh l\u00e0 nh\u00f3m n\u1ed9p \u0111\u1ed3 \u00e1n s\u1edbm nh\u1ea5t cho gi\u1ea3ng vi\u00ean. V\u1edbi kho\u1ea3ng th\u1eddi gian ng\u1eafn nh\u01b0 v\u1eady, t\u00f4i v\u00e0 b\u1ea1n c\u1ee7a m\u00ecnh c\u1ed1 g\u1eafng ho\u00e0n th\u00e0nh ch\u01b0\u01a1ng tr\u00ecnh v\u1edbi giao di\u1ec7n \u0111\u1eb9p v\u00e0 kh\u00f4ng c\u00f3 l\u1ed7i.\nNh\u01b0ng n\u1ebfu trong qu\u00e1 tr\u00ecnh s\u1eed d\u1ee5ng, n\u1ebfu b\u1ea1n g\u1eb7p ph\u1ea3i b\u1ea5t c\u1ee9 l\u1ed7i n\u00e0o ho\u1eb7c ch\u01b0\u01a1ng tr\u00ecnh b\u1ecb treo, vui l\u00f2ng li\u00ean l\u1ea1c v\u1edbi chung t\u00f4i th\u00f4ng qua th\u00f4ng tin \u0111\u01b0\u1ee3c cung c\u1ea5p \u1edf m\u1ee5c Li\u00ean h\u1ec7. \nCh\u01b0\u01a1ng tr\u00ecnh ch\u1ec9 nh\u1eb1m m\u1ee5c \u0111\u00edch m\u00f4 ph\u1ecfng v\u00e0 gi\u00fap sinh vi\u00ean h\u1ecdc m\u00f4n h\u1ec7 \u0111i\u1ec1u h\u00e0nh(\u0111\u1eb7c bi\u1ec7t l\u00e0 ph\u1ea7n l\u1eadp l\u1ecbch CPU).");
        }
        this.textArea.setEnabled(false);
        this.textArea.setOpaque(true);
        this.textArea.setBackground(Color.BLACK);
        this.textArea.setForeground(Color.GREEN);
        JScrollPane scrollPane = new JScrollPane(this.textArea, 22, 31);
        scrollPane.setSize(385, 200);
        scrollPane.setBorder(new TitledBorder(new LineBorder(Color.GREEN)));
        scrollPane.setLocation(20, 80);
        scrollPane.setOpaque(true);
        this.add(scrollPane);
        this.setBackground(Color.BLACK);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        new ImageIcon(this.getClass().getResource("pic4_Fotor.jpg")).paintIcon(this, g, 150, 300);
        g.setFont(new Font("Sansserif", 1, 20));
        g.setColor(Color.GREEN);
        if (this.language == 0) {
            g.drawString("CPU SCHEDULING SIMULATION PROJECT", 10, 20);
            g.drawString("To teacher: Ha Le Hoai Trung", 50, 50);
        } else if (this.language == 1) {
            g.drawString("\u0110\u1ed2 \u00c1N M\u00d4 PH\u1eceNG L\u1eacP L\u1ecaCH CPU", 50, 20);
            g.drawString("Gi\u1ea3ng Vi\u00ean: H\u00e0 L\u00ea Ho\u00e0i Trung", 70, 50);
        }
    }
}
