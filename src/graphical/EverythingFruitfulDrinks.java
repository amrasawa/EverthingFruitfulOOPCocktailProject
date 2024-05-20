/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package graphical;

import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class EverythingFruitfulDrinks extends javax.swing.JFrame {

    private boolean cupSelected = false, drinkSelected = false;

    /**
     * Creates new form EverythingFruitfulDrinks
     */
    public EverythingFruitfulDrinks() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        FruitfullButton = new javax.swing.JToggleButton();
        StrawberryButton = new javax.swing.JToggleButton();
        MangoButton = new javax.swing.JToggleButton();
        ChocoButton = new javax.swing.JToggleButton();
        WizardButton = new javax.swing.JToggleButton();
        GalaticButton = new javax.swing.JToggleButton();
        VanillaButton = new javax.swing.JToggleButton();
        SmallButton = new javax.swing.JToggleButton();
        MediumButton = new javax.swing.JToggleButton();
        LargeButton = new javax.swing.JToggleButton();
        SubmitButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(218, 192, 203));

        jPanel2.setBackground(new java.awt.Color(218, 192, 203));

        jLabel2.setFont(new java.awt.Font("Script MT Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 80, 148));
        jLabel2.setText("Everything Fruitful Cocktails Menu");

        jLabel7.setFont(new java.awt.Font("Script MT Bold", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(236, 80, 148));
        jLabel7.setText("Cup Size:");

        FruitfullButton.setBackground(new java.awt.Color(218, 192, 203));
        buttonGroup1.add(FruitfullButton);
        FruitfullButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        FruitfullButton.setForeground(new java.awt.Color(69, 66, 66));
        FruitfullButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphical/icons/fruitful_resized_resized.png"))); // NOI18N
        FruitfullButton.setText("• Fruitful Drink (Our Special)");
        FruitfullButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FruitfullButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FruitfullButtonActionPerformed(evt);
            }
        });

        StrawberryButton.setBackground(new java.awt.Color(218, 192, 203));
        buttonGroup1.add(StrawberryButton);
        StrawberryButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        StrawberryButton.setForeground(new java.awt.Color(69, 66, 66));
        StrawberryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphical/icons/strawberry_resized.png"))); // NOI18N
        StrawberryButton.setText("• Strawberry Milkshake");
        StrawberryButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        StrawberryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StrawberryButtonActionPerformed(evt);
            }
        });

        MangoButton.setBackground(new java.awt.Color(218, 192, 203));
        buttonGroup1.add(MangoButton);
        MangoButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        MangoButton.setForeground(new java.awt.Color(69, 66, 66));
        MangoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphical/icons/mango_resized.png"))); // NOI18N
        MangoButton.setText("• Mango Smoothie");
        MangoButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MangoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MangoButtonActionPerformed(evt);
            }
        });

        ChocoButton.setBackground(new java.awt.Color(218, 192, 203));
        buttonGroup1.add(ChocoButton);
        ChocoButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        ChocoButton.setForeground(new java.awt.Color(69, 66, 66));
        ChocoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphical/icons/chocolate_resized.png"))); // NOI18N
        ChocoButton.setText("• Chocolate Milkshake");
        ChocoButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ChocoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChocoButtonActionPerformed(evt);
            }
        });

        WizardButton.setBackground(new java.awt.Color(218, 192, 203));
        buttonGroup1.add(WizardButton);
        WizardButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        WizardButton.setForeground(new java.awt.Color(69, 66, 66));
        WizardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphical/icons/wizard_resized.png"))); // NOI18N
        WizardButton.setText("• Wizard Brew");
        WizardButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        WizardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WizardButtonActionPerformed(evt);
            }
        });

        GalaticButton.setBackground(new java.awt.Color(218, 192, 203));
        buttonGroup1.add(GalaticButton);
        GalaticButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        GalaticButton.setForeground(new java.awt.Color(69, 66, 66));
        GalaticButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphical/icons/galaxy_resized.png"))); // NOI18N
        GalaticButton.setText("• Galatic Mix");
        GalaticButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GalaticButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        GalaticButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GalaticButtonActionPerformed(evt);
            }
        });

        VanillaButton.setBackground(new java.awt.Color(218, 192, 203));
        buttonGroup1.add(VanillaButton);
        VanillaButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        VanillaButton.setForeground(new java.awt.Color(69, 66, 66));
        VanillaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphical/icons/vanilla_resized.png"))); // NOI18N
        VanillaButton.setText("• Vanilla Shake");
        VanillaButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VanillaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VanillaButtonActionPerformed(evt);
            }
        });

        SmallButton.setBackground(new java.awt.Color(218, 192, 203));
        buttonGroup2.add(SmallButton);
        SmallButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        SmallButton.setForeground(new java.awt.Color(69, 66, 66));
        SmallButton.setText("• Small Cup");
        SmallButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        MediumButton.setBackground(new java.awt.Color(218, 192, 203));
        buttonGroup2.add(MediumButton);
        MediumButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        MediumButton.setForeground(new java.awt.Color(69, 66, 66));
        MediumButton.setText("• Medium Cup");
        MediumButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LargeButton.setBackground(new java.awt.Color(218, 192, 203));
        buttonGroup2.add(LargeButton);
        LargeButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        LargeButton.setForeground(new java.awt.Color(69, 66, 66));
        LargeButton.setText("• Large Cup");
        LargeButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SubmitButton.setBackground(new java.awt.Color(218, 192, 203));
        SubmitButton.setFont(new java.awt.Font("Script MT Bold", 0, 30)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(236, 80, 148));
        SubmitButton.setText("Submit Order");
        SubmitButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(VanillaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(221, 221, 221))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MangoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FruitfullButton, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(WizardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChocoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StrawberryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GalaticButton, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(SmallButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MediumButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LargeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FruitfullButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StrawberryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MangoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChocoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GalaticButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WizardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(VanillaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SmallButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MediumButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LargeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(956, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FruitfullButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FruitfullButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FruitfullButtonActionPerformed

    private void StrawberryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StrawberryButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StrawberryButtonActionPerformed

    private void MangoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MangoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MangoButtonActionPerformed

    private void ChocoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChocoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChocoButtonActionPerformed

    private void WizardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WizardButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WizardButtonActionPerformed

    private void GalaticButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GalaticButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GalaticButtonActionPerformed

    private void VanillaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VanillaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VanillaButtonActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        Result r = null;
        if (SmallButton.isSelected()) {
            cupSelected = true;
            if (FruitfullButton.isSelected()) {
                drinkSelected = true;
                r = new Result("FruitFul Drink", 1, 5, 320, 255, 105, 180);

            } else if (StrawberryButton.isSelected()) {
                drinkSelected = true;
                r = new Result("Strawberry shake", 1, 5, 200, 255, 182, 193);

            } else if (MangoButton.isSelected()) {
                drinkSelected = true;
                r = new Result("Mango smoothie", 1, 5, 250, 255, 215, 0);

            } else if (ChocoButton.isSelected()) {
                drinkSelected = true;
                r = new Result("Chocolate Milkshake", 1, 5, 300, 210, 105, 30);

            } else if (VanillaButton.isSelected()) {
                drinkSelected = true;
                r = new Result("Vanilla Milkshake", 1, 5, 180, 255, 253, 208);

            } else if (WizardButton.isSelected()) {
                drinkSelected = true;
                r = new Result("Wizard Brew", 1, 5, 260, 138, 43, 226);

            } else if (GalaticButton.isSelected()) {
                drinkSelected = true;
                r = new Result("Galatic Mix", 1, 5, 290, 44, 58, 71);

            } else {

                JOptionPane.showMessageDialog(this, "You must select a drink ", "Warning", JOptionPane.ERROR_MESSAGE);

            }

        } else if (MediumButton.isSelected()) {
            cupSelected = true;

            if (FruitfullButton.isSelected()) {
                drinkSelected = true;
                r = new Result("FruitFul Drink", 2, 5, 320, 255, 105, 180);

            } else if (StrawberryButton.isSelected()) {
                drinkSelected = true;
                r = new Result("Strawberry shake", 2, 5, 200, 255, 182, 193);

            } else if (MangoButton.isSelected()) {
                drinkSelected = true;
                r = new Result("Mango smoothie", 2, 5, 250, 255, 215, 0);

            } else if (ChocoButton.isSelected()) {
                drinkSelected = true;
                r = new Result("Chocolate Milkshake", 2, 5, 300, 210, 105, 30);

            } else if (VanillaButton.isSelected()) {
                drinkSelected = true;
                r = new Result("Vanilla Milkshake", 2, 5, 180, 255, 253, 208);

            } else if (WizardButton.isSelected()) {
                drinkSelected = true;
                r = new Result("Wizard Brew", 2, 5, 260, 138, 43, 226);

            } else if (GalaticButton.isSelected()) {
                drinkSelected = true;
                r = new Result("Galatic Mix", 2, 5, 290, 44, 58, 71);

            } else {

                JOptionPane.showMessageDialog(this, "You must select a drink ", "Warning", JOptionPane.ERROR_MESSAGE);

            }
        } else if (LargeButton.isSelected()) {
            cupSelected = true;
            if (FruitfullButton.isSelected()) {
                drinkSelected = true;
                r = new Result("FruitFul Drink", 3, 5, 320, 255, 105, 180);

            } else if (StrawberryButton.isSelected()) {
                drinkSelected = true;
                r = new Result("Strawberry shake", 3, 5, 200, 255, 182, 193);

            } else if (MangoButton.isSelected()) {
                drinkSelected = true;
                r = new Result("Mango smoothie", 3, 5, 250, 255, 215, 0);

            } else if (ChocoButton.isSelected()) {
                drinkSelected = true;
                r = new Result("Chocolate Milkshake", 3, 5, 300, 210, 105, 30);

            } else if (VanillaButton.isSelected()) {
                drinkSelected = true;
                r = new Result("Vanilla Milkshake", 3, 5, 180, 255, 253, 208);

            } else if (WizardButton.isSelected()) {
                drinkSelected = true;
                r = new Result("Wizard Brew", 3, 5, 260, 138, 43, 226);

            } else if (GalaticButton.isSelected()) {
                drinkSelected = true;
                r = new Result("Galatic Mix", 3, 5, 290, 44, 58, 71);

            } else {

                JOptionPane.showMessageDialog(this, "You must select a drink ", "Warning", JOptionPane.ERROR_MESSAGE);

            }

        } else {

            JOptionPane.showMessageDialog(this, "You must select a cup size  ", "Warning", JOptionPane.ERROR_MESSAGE);

        }
        if (r != null) {
            r.show();
            dispose();
        }


    }//GEN-LAST:event_SubmitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EverythingFruitfulDrinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EverythingFruitfulDrinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EverythingFruitfulDrinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EverythingFruitfulDrinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EverythingFruitfulDrinks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ChocoButton;
    private javax.swing.JToggleButton FruitfullButton;
    private javax.swing.JToggleButton GalaticButton;
    private javax.swing.JToggleButton LargeButton;
    private javax.swing.JToggleButton MangoButton;
    private javax.swing.JToggleButton MediumButton;
    private javax.swing.JToggleButton SmallButton;
    private javax.swing.JToggleButton StrawberryButton;
    private javax.swing.JToggleButton SubmitButton;
    private javax.swing.JToggleButton VanillaButton;
    private javax.swing.JToggleButton WizardButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
