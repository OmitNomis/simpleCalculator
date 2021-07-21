package Calculator;

/**
 *
 * @author OmitNomis
 */
public class Calculator extends javax.swing.JFrame {
     double number;
     String calculation;

    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(113, 5, 255));

        jLabel1.setBackground(new java.awt.Color(113, 5, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setToolTipText("");

        jButton6.setBackground(new java.awt.Color(204, 255, 204));
        jButton6.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 0, 204));
        jButton6.setText("1");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton28.setBackground(new java.awt.Color(204, 255, 204));
        jButton28.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton28.setForeground(new java.awt.Color(51, 0, 204));
        jButton28.setText("-");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(204, 255, 204));
        jButton29.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton29.setForeground(new java.awt.Color(51, 0, 204));
        jButton29.setText("6");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(204, 255, 204));
        jButton19.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton19.setForeground(new java.awt.Color(51, 0, 204));
        jButton19.setText("<-");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton30.setBackground(new java.awt.Color(204, 255, 204));
        jButton30.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton30.setForeground(new java.awt.Color(51, 0, 204));
        jButton30.setText("4");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(204, 255, 204));
        jButton20.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton20.setForeground(new java.awt.Color(51, 0, 204));
        jButton20.setText("2");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton31.setBackground(new java.awt.Color(204, 255, 204));
        jButton31.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton31.setForeground(new java.awt.Color(51, 0, 204));
        jButton31.setText("7");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(204, 255, 204));
        jButton21.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton21.setForeground(new java.awt.Color(51, 0, 204));
        jButton21.setText("5");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton32.setBackground(new java.awt.Color(204, 255, 204));
        jButton32.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jButton32.setForeground(new java.awt.Color(51, 0, 204));
        jButton32.setText("Clear");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(204, 255, 204));
        jButton22.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton22.setForeground(new java.awt.Color(51, 0, 204));
        jButton22.setText("3");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton33.setBackground(new java.awt.Color(204, 255, 204));
        jButton33.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton33.setForeground(new java.awt.Color(51, 0, 204));
        jButton33.setText(".");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(204, 255, 204));
        jButton23.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton23.setForeground(new java.awt.Color(51, 0, 204));
        jButton23.setText("*");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton34.setBackground(new java.awt.Color(204, 255, 204));
        jButton34.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton34.setForeground(new java.awt.Color(51, 0, 204));
        jButton34.setText("=");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(204, 255, 204));
        jButton24.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton24.setForeground(new java.awt.Color(51, 0, 204));
        jButton24.setText("+");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton35.setBackground(new java.awt.Color(204, 255, 204));
        jButton35.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton35.setForeground(new java.awt.Color(51, 0, 204));
        jButton35.setText("/");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(204, 255, 204));
        jButton25.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton25.setForeground(new java.awt.Color(51, 0, 204));
        jButton25.setText("9");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setBackground(new java.awt.Color(204, 255, 204));
        jButton26.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton26.setForeground(new java.awt.Color(51, 0, 204));
        jButton26.setText("8");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setBackground(new java.awt.Color(204, 255, 204));
        jButton27.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton27.setForeground(new java.awt.Color(51, 0, 204));
        jButton27.setText("0");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(113, 5, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(175, 175, 175)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"1");
    }                                        

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"2");
    }                                         

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"3");
    }                                         

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        String a = jTextField1.getText();
        
        if (a.length() >0){
            number = Double.parseDouble(a); 
            calculation = "add";
        
            jLabel1.setText(a);
            jTextField1.setText("");
        
        }
        else{
            jLabel1.setText("Invalid Input!!");
            
        }
             
        
        
    }                                         

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"4");
    }                                         

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"5");
    }                                         

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"6");
    }                                         

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + "7");
    }                                         

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"8");
    }                                         

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"9");
    }                                         

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"0");
    }                                         

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        String a = jTextField1.getText();
        
        if (a.length() >0){
            number = Double.parseDouble(a); 
            calculation = "sub";
        
            jLabel1.setText(a);
            jTextField1.setText("");
        
        }
        else{
            jLabel1.setText("Invalid Input!!");
            
        }
          
    }                                         

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        String a = jTextField1.getText();
        
        if (a.length() >0){
            number = Double.parseDouble(a); 
            calculation = "mul";
        
            jLabel1.setText(a);
            jTextField1.setText("");
        
        }
        else{
            jLabel1.setText("Invalid Input!!");
            
        }
          
    }                                         

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        String a = jTextField1.getText();
        
        if (a.length() >0){
            number = Double.parseDouble(a); 
            calculation = "div";
        
            jLabel1.setText(a);
            jTextField1.setText("");
        
        }
        else{
            jLabel1.setText("Invalid Input!!");
            
        }
          
    }                                         

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        String a = jTextField1.getText();
        double number1 = Double.parseDouble(a);
        
        if (calculation == "add"){
            String result = String.valueOf(number+number1);
            jTextField1.setText(result);
            jLabel1.setText("");
            number = 0;
                                
        
        } 
        if (calculation == "sub"){
            String result = String.valueOf(number-number1);
            jTextField1.setText(result);
            jLabel1.setText("");
            number = 0;
                                
        
        } 
         if (calculation == "mul"){
            String result = String.valueOf(number*number1);
            jTextField1.setText(result);
            jLabel1.setText("");
            number = 0;
                                
        
        } 
          if (calculation == "div"){
            String result = String.valueOf(number/number1);
            jTextField1.setText(result);
            jLabel1.setText("");
            number = 0;
                                
        
        } 
        
    }                                         

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jTextField1.setText("");
        jLabel1.setText("");
        
    }                                         

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        String a = jTextField1.getText();
        if(a.contains(".")){
            jTextField1.setText(jTextField1.getText()+"");
        }
        else{
            jTextField1.setText(jTextField1.getText()+".");
        }
        
        
    }                                         

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int length = jTextField1.getText().length();
        int del = length-1;
        if (length>0){
        
            StringBuilder lol =new StringBuilder(jTextField1.getText());
            lol.deleteCharAt(del);
            jTextField1.setText(lol.toString());
        }
        
    }                                         

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
}
