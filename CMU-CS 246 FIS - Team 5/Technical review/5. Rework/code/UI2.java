/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test_cal;

import javax.swing.JOptionPane;

/**
 *
 * @author NebulaF
 */
public class UI2 extends javax.swing.JFrame {

    /**
     * Creates new form UI2
     */
    public UI2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        plusBtn = new javax.swing.JButton();
        subtractBtn = new javax.swing.JButton();
        multiplicBtn = new javax.swing.JButton();
        divideBtn = new javax.swing.JButton();
        modBtn = new javax.swing.JButton();
        a_TextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        b_TextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        resultTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        plusBtn.setText("+");
        plusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusBtnActionPerformed(evt);
            }
        });

        subtractBtn.setText("-");
        subtractBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractBtnActionPerformed(evt);
            }
        });

        multiplicBtn.setText("*");
        multiplicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicBtnActionPerformed(evt);
            }
        });

        divideBtn.setText("/");
        divideBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideBtnActionPerformed(evt);
            }
        });

        modBtn.setText("%");
        modBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modBtnActionPerformed(evt);
            }
        });

        a_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_TextFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("A");

        b_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_TextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("B");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Result");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resultTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(plusBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(multiplicBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(divideBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subtractBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subtractBtn)
                            .addComponent(plusBtn))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(divideBtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(resultTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1)
                                .addComponent(modBtn))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(multiplicBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusBtnActionPerformed
        // TODO add your handling code here:
        Project_calculator p = new Project_calculator();
        if(!p.check(a_TextField.getText()) || !p.check(b_TextField.getText())){
            Exception e;
            JOptionPane.showMessageDialog(null, "Invalid number");
            onReset();
        }
        else if(a_TextField.getText().equals("") || b_TextField.getText().equals(""))
           JOptionPane.showMessageDialog(null, "Do not empty text field");
        else {
            try{
                String result = p.plus(a_TextField.getText(), b_TextField.getText());
                resultTextField.setText(result);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
                onReset();
            }
        }
    }//GEN-LAST:event_plusBtnActionPerformed

    private void modBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modBtnActionPerformed
        // TODO add your handling code here:
       Project_calculator p = new Project_calculator();
        if(!p.check(a_TextField.getText()) || !p.check(b_TextField.getText())){
            Exception e;
            JOptionPane.showMessageDialog(null, "Invalid number");
            onReset();
        }
        else if(a_TextField.getText().equals("") || b_TextField.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Do not empty text field");
        else if(b_TextField.getText().equals("0") || b_TextField.getText().equals("-0") || b_TextField.getText().equals("+0")){
            if(b_TextField.getText().equals("0"))
                JOptionPane.showMessageDialog(null, "B is not allowed to be 0");
            else if(b_TextField.getText().equals("-0"))
                JOptionPane.showMessageDialog(null, "B is not allowed to be -0");
            else if(b_TextField.getText().equals("+0"))
                JOptionPane.showMessageDialog(null, "B is not allowed to be +0");
            onReset();
        }
        else {
            try{
                String result = p.modulo(a_TextField.getText(), b_TextField.getText());
                resultTextField.setText(result);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
                onReset();
            }
        }
    }//GEN-LAST:event_modBtnActionPerformed

    private void subtractBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractBtnActionPerformed
        Project_calculator p = new Project_calculator();
        if(!p.check(a_TextField.getText()) || !p.check(b_TextField.getText())){
            Exception e;
            JOptionPane.showMessageDialog(null, "Invalid number");
            onReset();
        }
        else if(a_TextField.getText().equals("") || b_TextField.getText().equals(""))
           JOptionPane.showMessageDialog(null, "Do not empty text field");
        else {
            try{
                String result = p.subtract(a_TextField.getText(), b_TextField.getText());
                resultTextField.setText(result);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
                onReset();
            }
        }
    }//GEN-LAST:event_subtractBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        onReset();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void onReset(){
        a_TextField.setText("");
        b_TextField.setText("");
        resultTextField.setText("");
    }
    private void multiplicBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicBtnActionPerformed
        // TODO add your handling code here:
        Project_calculator p = new Project_calculator();
        if(!p.check(a_TextField.getText()) || !p.check(b_TextField.getText())){
            Exception e;
            JOptionPane.showMessageDialog(null, "Invalid number");
            onReset();
        }
        else if(a_TextField.getText().equals("") || b_TextField.getText().equals(""))
           JOptionPane.showMessageDialog(null, "Do not empty text field");
        else {
            try{
                String result = p.multifly(a_TextField.getText(), b_TextField.getText());
                resultTextField.setText(result);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
                onReset();
            }
        }
    }//GEN-LAST:event_multiplicBtnActionPerformed

    private void divideBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideBtnActionPerformed
        // TODO add your handling code here:
        Project_calculator p = new Project_calculator();
        if(!p.check(a_TextField.getText()) || !p.check(b_TextField.getText())){
            Exception e;
            JOptionPane.showMessageDialog(null, "Invalid number");
            onReset();
        }
        else if(a_TextField.getText().equals("") || b_TextField.getText().equals(""))
           JOptionPane.showMessageDialog(null, "Do not empty text field");
        else if(b_TextField.getText().equals("0") || b_TextField.getText().equals("-0") || b_TextField.getText().equals("+0")){
            if(b_TextField.getText().equals("0"))
                JOptionPane.showMessageDialog(null, "B is not allowed to be 0");
            else if(b_TextField.getText().equals("-0"))
                JOptionPane.showMessageDialog(null, "B is not allowed to be -0");
            else if(b_TextField.getText().equals("+0"))
                JOptionPane.showMessageDialog(null, "B is not allowed to be +0");
            onReset();
        }
            
        else {
            try{
                String result = p.divide(a_TextField.getText(), b_TextField.getText());
                resultTextField.setText(result);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
                onReset();
            }
        }
    }//GEN-LAST:event_divideBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void a_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_TextFieldActionPerformed

    private void b_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_TextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a_TextField;
    private javax.swing.JTextField b_TextField;
    private javax.swing.JButton divideBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton modBtn;
    private javax.swing.JButton multiplicBtn;
    private javax.swing.JButton plusBtn;
    private javax.swing.JTextField resultTextField;
    private javax.swing.JButton subtractBtn;
    // End of variables declaration//GEN-END:variables
}
