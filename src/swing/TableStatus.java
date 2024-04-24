
package swing;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import model.StatusType;

public class TableStatus extends JLabel {
    
    public TableStatus(){
        setForeground(Color.WHITE);
    }
    
    private StatusType type;

    public StatusType getType() {
        return type;
    }
    
    public void setType(StatusType type) {
        this.type = type;
        setText(type.toString());
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        if (type != null) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            GradientPaint g;
            if (type == StatusType.PENDING) {
                g = new GradientPaint(0, 0, new Color(212, 235, 255), 0, getHeight(), new Color(242, 255, 3));
            } else if (type == StatusType.APPROVED) {
                g = new GradientPaint(0, 0, new Color(212, 235, 255), 0, getHeight(), new Color(7, 250, 32));
            } else {
                g = new GradientPaint(0, 0, new Color(212, 235, 255), 0, getHeight(), new Color(240, 12, 16));
            }
            g2.setPaint(g);
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 1, 1);
        }
        super.paintComponent(grphcs);
    }
    
}
