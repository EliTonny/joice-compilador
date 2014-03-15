package compilador;

public class Interface extends javax.swing.JFrame {

    public Interface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBotoes = new javax.swing.JPanel();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jPanelEntrada = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaEntrada = new javax.swing.JTextArea();
        jPanelSaida = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaSaida = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBotoes.setLayout(new java.awt.GridLayout());

        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/File-add-icon.png"))); // NOI18N
        jToggleButton4.setText("novo [ctrl+n]");
        jToggleButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton4.setMinimumSize(new java.awt.Dimension(0, 0));
        jToggleButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanelBotoes.add(jToggleButton4);

        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Folder-icon.png"))); // NOI18N
        jToggleButton5.setText("abrir [ctrl+a]");
        jToggleButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton5.setMinimumSize(new java.awt.Dimension(0, 0));
        jToggleButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanelBotoes.add(jToggleButton5);

        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Save-icon.png"))); // NOI18N
        jToggleButton6.setText("salvar [ctrl+s]");
        jToggleButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton6.setMinimumSize(new java.awt.Dimension(0, 0));
        jToggleButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanelBotoes.add(jToggleButton6);

        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Copy-icon.png"))); // NOI18N
        jToggleButton7.setText("copiar [ctrl+c]");
        jToggleButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton7.setMinimumSize(new java.awt.Dimension(0, 0));
        jToggleButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanelBotoes.add(jToggleButton7);

        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Paste-icon.png"))); // NOI18N
        jToggleButton8.setText("colar [ctrl+v]");
        jToggleButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton8.setMinimumSize(new java.awt.Dimension(0, 0));
        jToggleButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanelBotoes.add(jToggleButton8);

        jToggleButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cut-icon.png"))); // NOI18N
        jToggleButton9.setText("recortar [ctrl+x]");
        jToggleButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton9.setMinimumSize(new java.awt.Dimension(0, 0));
        jToggleButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanelBotoes.add(jToggleButton9);

        jToggleButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Actions-arrow-right-double-icon.png"))); // NOI18N
        jToggleButton10.setText("compilar [F8]");
        jToggleButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton10.setMinimumSize(new java.awt.Dimension(0, 0));
        jToggleButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanelBotoes.add(jToggleButton10);

        jToggleButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Wheels-icon.png"))); // NOI18N
        jToggleButton11.setText("gerar código [F9]");
        jToggleButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton11.setMinimumSize(new java.awt.Dimension(0, 0));
        jToggleButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanelBotoes.add(jToggleButton11);

        jToggleButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Users-icon.png"))); // NOI18N
        jToggleButton12.setText("equipe [F1]");
        jToggleButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton12.setMinimumSize(new java.awt.Dimension(0, 0));
        jToggleButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanelBotoes.add(jToggleButton12);

        jPanelEntrada.setLayout(new java.awt.GridLayout());

        jTextAreaEntrada.setColumns(20);
        jTextAreaEntrada.setRows(5);
        jScrollPane1.setViewportView(jTextAreaEntrada);

        jPanelEntrada.add(jScrollPane1);

        jPanelSaida.setLayout(new java.awt.GridLayout());

        jTextAreaSaida.setColumns(20);
        jTextAreaSaida.setRows(5);
        jScrollPane2.setViewportView(jTextAreaSaida);

        jPanelSaida.add(jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 1037, Short.MAX_VALUE)
            .addComponent(jPanelEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanelSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelEntrada;
    private javax.swing.JPanel jPanelSaida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaEntrada;
    private javax.swing.JTextArea jTextAreaSaida;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables
}
