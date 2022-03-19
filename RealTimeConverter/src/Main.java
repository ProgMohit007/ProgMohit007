
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Main extends javax.swing.JFrame {

    ConversionCodes convert = new ConversionCodes();
    Validation validate = new Validation();
    String NULL = "";
    String binary, octal, decimal, hexaDecimal;

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        binaryLabel = new javax.swing.JLabel();
        octalLabel = new javax.swing.JLabel();
        decimalLabel = new javax.swing.JLabel();
        hexaLabel = new javax.swing.JLabel();
        binaryInput = new javax.swing.JTextField();
        octalInput = new javax.swing.JTextField();
        decimalInput = new javax.swing.JTextField();
        hexaInput = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Converter");
        setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        setName("Main"); // NOI18N

        nameLabel.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("CONVERTER");
        nameLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nameLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nameLabelMouseExited(evt);
            }
        });

        binaryLabel.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        binaryLabel.setText("Binary");

        octalLabel.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        octalLabel.setText("Octal");

        decimalLabel.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        decimalLabel.setText("Decimal");

        hexaLabel.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        hexaLabel.setText("Hexa Decimal");

        binaryInput.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        binaryInput.setForeground(new java.awt.Color(0, 0, 0));
        binaryInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                binaryInputFocusGained(evt);
            }
        });
        binaryInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                binaryInputKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                binaryInputKeyReleased(evt);
            }
        });

        octalInput.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        octalInput.setForeground(new java.awt.Color(0, 0, 0));
        octalInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                octalInputFocusGained(evt);
            }
        });
        octalInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                octalInputKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                octalInputKeyReleased(evt);
            }
        });

        decimalInput.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        decimalInput.setForeground(new java.awt.Color(0, 0, 0));
        decimalInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                decimalInputFocusGained(evt);
            }
        });
        decimalInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                decimalInputKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                decimalInputKeyReleased(evt);
            }
        });

        hexaInput.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        hexaInput.setForeground(new java.awt.Color(0, 0, 0));
        hexaInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                hexaInputFocusGained(evt);
            }
        });
        hexaInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                hexaInputKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hexaInputKeyReleased(evt);
            }
        });

        resetButton.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        resetButton.setForeground(new java.awt.Color(0, 0, 0));
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(octalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(78, 78, 78))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(binaryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(67, 67, 67))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(decimalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(56, 56, 56))
                            .addComponent(hexaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(244, 244, 244))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(octalInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(binaryInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(decimalInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hexaInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resetButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(binaryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(binaryInput)
                .addGap(18, 18, 18)
                .addComponent(octalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(octalInput)
                .addGap(18, 18, 18)
                .addComponent(decimalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(decimalInput)
                .addGap(18, 18, 18)
                .addComponent(hexaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hexaInput)
                .addGap(32, 32, 32)
                .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(43, 43, 43))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        binaryInput.setText("");
        decimalInput.setText("");
        octalInput.setText("");
        hexaInput.setText("");

        binaryInput.setBackground(Color.WHITE);
        octalInput.setBackground(Color.WHITE);
        decimalInput.setBackground(Color.WHITE);
        hexaInput.setBackground(Color.WHITE);
    }//GEN-LAST:event_resetButtonActionPerformed

    void eventHandle(KeyEvent evt) {
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ESCAPE:
                resetButton.doClick();
                break;
            case KeyEvent.VK_Q:
                System.exit(0);
            default:
                break;
        }
    }

    private void binaryInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_binaryInputKeyPressed
        eventHandle(evt);
    }//GEN-LAST:event_binaryInputKeyPressed

    private void octalInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_octalInputKeyPressed
        eventHandle(evt);
    }//GEN-LAST:event_octalInputKeyPressed

    private void decimalInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_decimalInputKeyPressed
        eventHandle(evt);
    }//GEN-LAST:event_decimalInputKeyPressed

    private void hexaInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hexaInputKeyPressed
        eventHandle(evt);
    }//GEN-LAST:event_hexaInputKeyPressed

    private void binaryInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_binaryInputFocusGained
        octalInput.setText("");
        decimalInput.setText("");
        hexaInput.setText("");

        octalInput.setBackground(Color.WHITE);
        decimalInput.setBackground(Color.WHITE);
        hexaInput.setBackground(Color.WHITE);
    }//GEN-LAST:event_binaryInputFocusGained

    private void octalInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_octalInputFocusGained
        binaryInput.setText("");
        decimalInput.setText("");
        hexaInput.setText("");

        binaryInput.setBackground(Color.WHITE);
        decimalInput.setBackground(Color.WHITE);
        hexaInput.setBackground(Color.WHITE);
    }//GEN-LAST:event_octalInputFocusGained

    private void decimalInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_decimalInputFocusGained
        binaryInput.setText("");
        octalInput.setText("");
        hexaInput.setText("");

        binaryInput.setBackground(Color.WHITE);
        octalInput.setBackground(Color.WHITE);
        hexaInput.setBackground(Color.WHITE);
    }//GEN-LAST:event_decimalInputFocusGained

    private void hexaInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hexaInputFocusGained
        binaryInput.setText("");
        octalInput.setText("");
        decimalInput.setText("");

        binaryInput.setBackground(Color.WHITE);
        octalInput.setBackground(Color.WHITE);
        decimalInput.setBackground(Color.WHITE);
    }//GEN-LAST:event_hexaInputFocusGained

    private void nameLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameLabelMouseEntered
        nameLabel.setText("MOHIT");
    }//GEN-LAST:event_nameLabelMouseEntered

    private void nameLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameLabelMouseExited
        nameLabel.setText("CONVERTER");
    }//GEN-LAST:event_nameLabelMouseExited

    private void binaryInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_binaryInputKeyReleased
        binary = binaryInput.getText();
        if (validate.checkBinary(binary)) {
            binaryInput.setBackground(new Color(255, 195, 77));
            decimalInput.setText(String.valueOf(convert.binaryToDecimal(Integer.parseInt(binary))));
            octalInput.setText(String.valueOf(convert.binaryToOctal(Integer.parseInt(binary))));
            hexaInput.setText(convert.binaryToHexadecimal(Integer.parseInt(binary)));
        } else {
            resetButton.doClick();
        }
    }//GEN-LAST:event_binaryInputKeyReleased

    private void octalInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_octalInputKeyReleased
        octal = octalInput.getText();
        if (validate.checkOctal(octal)) {
            octalInput.setBackground(new Color(255, 195, 77));
            binaryInput.setText(String.valueOf(convert.octalToBinary(Integer.parseInt(octal))));
            decimalInput.setText(String.valueOf(convert.octalToDecimal(Integer.parseInt(octal))));
            hexaInput.setText(convert.octalToHexadecimal(Integer.parseInt(octal)));
        } else {
            resetButton.doClick();
        }
    }//GEN-LAST:event_octalInputKeyReleased

    private void decimalInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_decimalInputKeyReleased
        decimal = decimalInput.getText();
        if (validate.checkDecimal(decimal)) {
            decimalInput.setBackground(new Color(255, 195, 77));
            binaryInput.setText(String.valueOf(convert.decimalToBinary(Integer.parseInt(decimal))));
            octalInput.setText(String.valueOf(convert.decimalToOctal(Integer.parseInt(decimal))));
            hexaInput.setText(convert.decimalToHexadecimal(Integer.parseInt(decimal)));
        } else {
            resetButton.doClick();
        }
    }//GEN-LAST:event_decimalInputKeyReleased

    private void hexaInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hexaInputKeyReleased
        hexaDecimal = hexaInput.getText();
        if (validate.checkHexadecimal(hexaDecimal)) {
            hexaInput.setBackground(new Color(255, 195, 77));
            binaryInput.setText(String.valueOf(Long.parseLong(convert.hexadecimalToBinary(hexaDecimal))));
            decimalInput.setText(String.valueOf(convert.hexadecimalToDecimal(hexaDecimal)));
            octalInput.setText(String.valueOf(convert.hexadecimalToOctal(hexaDecimal)));
        } else {
            resetButton.doClick();
        }
    }//GEN-LAST:event_hexaInputKeyReleased

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField binaryInput;
    private javax.swing.JLabel binaryLabel;
    private javax.swing.JTextField decimalInput;
    private javax.swing.JLabel decimalLabel;
    private javax.swing.JTextField hexaInput;
    private javax.swing.JLabel hexaLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField octalInput;
    private javax.swing.JLabel octalLabel;
    private javax.swing.JButton resetButton;
    // End of variables declaration//GEN-END:variables
}
