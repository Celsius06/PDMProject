package Employee.swing;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

public class LabelSplit extends JLabel {

    private boolean gradient;

    public boolean isGradient() {
        return gradient;
    }

    public void setGradient(boolean gradient) {
        this.gradient = gradient;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.3f));
        if (gradient) {
            g2.setPaint(new GradientPaint(0, 0, new Color(115, 115, 115), getWidth(), 0, new Color(115, 115, 115, 0)));
        } else {
            g2.setColor(new Color(115, 115, 115));
        }
        g2.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
        g2.dispose();
        super.paint(g);
    }
}
