package Employee.swing;

public class Split extends javax.swing.JPanel {

    public Split(String name) {
        initComponents();
        label.setText(name);
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelSplit1 = new Employee.swing.LabelSplit();
        label = new javax.swing.JLabel();
        labelSplit2 = new Employee.swing.LabelSplit();

        labelSplit1.setMinimumSize(new java.awt.Dimension(15, 38));

        label.setForeground(new java.awt.Color(115, 115, 115));
        label.setText("Name");

        labelSplit2.setGradient(true);
        labelSplit2.setMinimumSize(new java.awt.Dimension(15, 38));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelSplit1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSplit2, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSplit1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label)
                    .addComponent(labelSplit2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label;
    private Employee.swing.LabelSplit labelSplit1;
    private Employee.swing.LabelSplit labelSplit2;
    // End of variables declaration//GEN-END:variables
}
