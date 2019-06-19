/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.panel;

import javax.swing.JOptionPane;
import src.crepemaker.CrepeCaseTrabalhado;
import src.crepemaker.CrepeMaker;

/**
 *
 * @author arthur
 */
public class CrepeScreen extends javax.swing.JFrame {
private CrepeMaker crepeMaker;
    private final CrepeCaseTrabalhado crepeCase;
    private MainScreen mainScreen;
    /**
     * Creates new form CrepeScreen
     * @param crepeMaker
     * @param crepeCase
     */
    public CrepeScreen(CrepeMaker crepeMaker, CrepeCaseTrabalhado crepeCase) {
        this.crepeMaker = crepeMaker;
        this.crepeCase = crepeCase;
        initComponents();
        this.atualizaDados();
    }
    
    public void setMainScreen(MainScreen mainScreen){
        this.mainScreen = mainScreen;
    }

    private void atualizaDados(){
        this.textCrepesProduzidos.setText(this.crepeMaker.getContadorDeCrepes(this.crepeCase) + "");
        this.textSaborDoCrepe.setText(this.crepeMaker.getRecheio(this.crepeCase));
        this.textRecheioUtilizado.setText(this.crepeMaker.getRecheioUtilizado(this.crepeCase) + "");
        this.textMassaUtilizada.setText(this.crepeMaker.getMassaUtilizada(this.crepeCase) + "");
        this.textMassaDisponivel.setText(this.crepeMaker.getMassaDisponivel() + "");
        this.textRecheioDisponivel.setText(this.crepeMaker.getRecheioDisponivel(this.crepeCase) + "");
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelSaborDoCrepe = new javax.swing.JLabel();
        textSaborDoCrepe = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textMassaUtilizada = new javax.swing.JTextField();
        textRecheioUtilizado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textMassaDisponivel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textRecheioDisponivel = new javax.swing.JTextField();
        buttonRecarregaMassa = new javax.swing.JButton();
        buttonRecarregaRecheio = new javax.swing.JButton();
        buttonProduzCrepe = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        textCrepesProduzidos = new javax.swing.JTextField();
        buttonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setToolTipText("");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setOpaque(false);

        labelSaborDoCrepe.setText("Sabor");

        textSaborDoCrepe.setEditable(false);
        textSaborDoCrepe.setAutoscrolls(false);

        jLabel1.setText("Massa utilizada");

        jLabel2.setText("Recheio utilizado");

        textMassaUtilizada.setEditable(false);
        textMassaUtilizada.setAutoscrolls(false);

        textRecheioUtilizado.setEditable(false);
        textRecheioUtilizado.setAutoscrolls(false);
        textRecheioUtilizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRecheioUtilizadoActionPerformed(evt);
            }
        });

        jLabel3.setText("Massa disponivel");

        textMassaDisponivel.setEditable(false);
        textMassaDisponivel.setAutoscrolls(false);

        jLabel4.setText("Recheio disponivel");

        textRecheioDisponivel.setEditable(false);
        textRecheioDisponivel.setAutoscrolls(false);

        buttonRecarregaMassa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/recarregar.png"))); // NOI18N
        buttonRecarregaMassa.setText("recarregar tanque");
        buttonRecarregaMassa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRecarregaMassaActionPerformed(evt);
            }
        });

        buttonRecarregaRecheio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/recarregar.png"))); // NOI18N
        buttonRecarregaRecheio.setText("recarregar tanque");
        buttonRecarregaRecheio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRecarregaRecheioActionPerformed(evt);
            }
        });

        buttonProduzCrepe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/produzir.png"))); // NOI18N
        buttonProduzCrepe.setText("produzir crepe");
        buttonProduzCrepe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProduzCrepeActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/dado.png"))); // NOI18N
        jLabel5.setText("Crepes produzidos");

        textCrepesProduzidos.setEditable(false);
        textCrepesProduzidos.setAutoscrolls(false);
        textCrepesProduzidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCrepesProduzidosActionPerformed(evt);
            }
        });

        buttonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/retornar.png"))); // NOI18N
        buttonVoltar.setText("voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonProduzCrepe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(24, 24, 24)
                                .addComponent(textMassaUtilizada, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(23, 23, 23)
                                .addComponent(textRecheioUtilizado))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textMassaDisponivel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textRecheioDisponivel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonRecarregaMassa, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonRecarregaRecheio, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(labelSaborDoCrepe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textSaborDoCrepe))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCrepesProduzidos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSaborDoCrepe)
                    .addComponent(textSaborDoCrepe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textCrepesProduzidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(textMassaUtilizada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textRecheioUtilizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonProduzCrepe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textMassaDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(textRecheioDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRecarregaMassa)
                    .addComponent(buttonRecarregaRecheio))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textRecheioUtilizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRecheioUtilizadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRecheioUtilizadoActionPerformed

    private void buttonProduzCrepeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProduzCrepeActionPerformed
        this.atualizaDados();
        try {
            this.crepeMaker.makeCrepe(this.crepeCase);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e, e.getMessage(), WIDTH);
        }
    }//GEN-LAST:event_buttonProduzCrepeActionPerformed

    private void textCrepesProduzidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCrepesProduzidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCrepesProduzidosActionPerformed

    private void buttonRecarregaMassaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRecarregaMassaActionPerformed
        this.crepeMaker.abastecer();
        this.atualizaDados();
    }//GEN-LAST:event_buttonRecarregaMassaActionPerformed

    private void buttonRecarregaRecheioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRecarregaRecheioActionPerformed
        this.crepeMaker.abasteceReservatorioRecheio(this.crepeCase);
        this.atualizaDados();
    }//GEN-LAST:event_buttonRecarregaRecheioActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        this.mainScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(CrepeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrepeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrepeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrepeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrepeScreen(new CrepeMaker(), CrepeCaseTrabalhado.CREPEIRAUM).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonProduzCrepe;
    private javax.swing.JButton buttonRecarregaMassa;
    private javax.swing.JButton buttonRecarregaRecheio;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelSaborDoCrepe;
    private javax.swing.JTextField textCrepesProduzidos;
    private javax.swing.JTextField textMassaDisponivel;
    private javax.swing.JTextField textMassaUtilizada;
    private javax.swing.JTextField textRecheioDisponivel;
    private javax.swing.JTextField textRecheioUtilizado;
    private javax.swing.JTextField textSaborDoCrepe;
    // End of variables declaration//GEN-END:variables
}
