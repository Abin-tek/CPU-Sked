/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

class BackgroundAutoGenerateInputPanel
extends JPanel {
    private ImageIcon backgroundImage;

    public BackgroundAutoGenerateInputPanel(int language) {
        if (language == 0) {
            this.backgroundImage = new ImageIcon(this.getClass().getResource("inputGenerator_Fotor.jpg"));
        } else if (language == 1) {
            this.backgroundImage = new ImageIcon(this.getClass().getResource("AutoInputViet_Fotor.jpg"));
        }
        System.out.println(language);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.backgroundImage.paintIcon(this, g, 0, 0);
    }
}
