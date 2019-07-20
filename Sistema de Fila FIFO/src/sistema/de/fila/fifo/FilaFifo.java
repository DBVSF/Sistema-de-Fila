
package sistema.de.fila.fifo;

import java.util.LinkedList;
import java.util.List;


public class FilaFifo extends javax.swing.JFrame {

    
    private List<String> fila;
    int contador = 0;
    
    public FilaFifo() {
        initComponents();
        
        this.fila = new LinkedList();
        
        labelUltimo.setText("");
        labelUltimo1.setText("");  
        labelUltimo2.setText("");  
        
        
        
        
        
        
    }

    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelProximo = new javax.swing.JLabel();
        labelChamada = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelUltimo = new javax.swing.JLabel();
        labelUltimo1 = new javax.swing.JLabel();
        labelUltimo2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cpNome = new javax.swing.JTextField();
        btnIncluirCliente = new javax.swing.JButton();
        btnChamarCliente = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        list1 = new java.awt.List();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelProximo.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        labelProximo.setText("Próximo:");

        labelChamada.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        labelChamada.setText("      (CHAMADA)");
        labelChamada.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setText("Últimas chamadas:");

        labelUltimo.setText("(ultimos chamados)");

        labelUltimo1.setText("(ultimos chamados)");

        labelUltimo2.setText("(ultimos chamados)");

        cpNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpNomeActionPerformed(evt);
            }
        });

        btnIncluirCliente.setText("Incluir Cliente");
        btnIncluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirClienteActionPerformed(evt);
            }
        });

        btnChamarCliente.setText("Chamar Cliente");
        btnChamarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChamarClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Lista de clientes na fila:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelProximo))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(labelUltimo)
                                .addGap(18, 18, 18)
                                .addComponent(labelUltimo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelUltimo2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelChamada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                            .addComponent(btnChamarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cpNome)
                                .addGap(18, 18, 18)
                                .addComponent(btnIncluirCliente)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(list1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelProximo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelChamada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUltimo)
                    .addComponent(labelUltimo1)
                    .addComponent(labelUltimo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIncluirCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnChamarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirClienteActionPerformed
        
        
        //capta o nome digitado no campo de texto 
        String nome = cpNome.getText().trim();
        
        //joga os clientes incluidos na lista
        list1.add(nome);
        
        //após incluir o nome, zera o campo 
        cpNome.setText("");
        
        //inclui o nome na lista
        this.fila.add(nome);
        
      
        
        
        
    }//GEN-LAST:event_btnIncluirClienteActionPerformed

    private void cpNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpNomeActionPerformed

    private void btnChamarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChamarClienteActionPerformed
       
       
        //remove o cliente da lista conforme é chamado
        list1.removeAll();
        
        for (int i = 0; i < this.fila.size(); i++) {
             list1.add(this.fila.get(i));
            
        }
                
                
        
        
        
        
        if (fila.size()!=0) {
            
            
            //captura o cliente da fila
            String nome = this.fila.get(0); 
          
           contador ++;
           
           //remove o nome da fila
           this.fila.remove(0);
           
           //seta a variavel label com o nome do cliente 
            labelChamada.setText(nome);
            java.awt.Toolkit.getDefaultToolkit().beep();
            
          if (contador == 1) {
            
            labelUltimo.setText(nome);
            
        } if (contador == 2 ) {
            labelUltimo1.setText(nome);
        } if (contador == 3 ) {
            labelUltimo2.setText(nome);
            contador = 0;
        } else {
            java.awt.Toolkit.getDefaultToolkit().beep();
        }
        
        } 
        
    }//GEN-LAST:event_btnChamarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(FilaFifo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilaFifo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilaFifo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilaFifo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FilaFifo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChamarCliente;
    private javax.swing.JButton btnIncluirCliente;
    private javax.swing.JTextField cpNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelChamada;
    private javax.swing.JLabel labelProximo;
    private javax.swing.JLabel labelUltimo;
    private javax.swing.JLabel labelUltimo1;
    private javax.swing.JLabel labelUltimo2;
    private java.awt.List list1;
    // End of variables declaration//GEN-END:variables
}
