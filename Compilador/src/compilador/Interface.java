package compilador;

public class Interface extends javax.swing.JFrame {

    public Interface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBotoes = new javax.swing.JPanel();
        jToggleButtonNovo = new javax.swing.JToggleButton();
        jToggleButtonAbrir = new javax.swing.JToggleButton();
        jToggleButtonSalvar = new javax.swing.JToggleButton();
        jToggleButtonCopiar = new javax.swing.JToggleButton();
        jToggleButtonColar = new javax.swing.JToggleButton();
        jToggleButtonRecortar = new javax.swing.JToggleButton();
        jToggleButtonCompilar = new javax.swing.JToggleButton();
        jToggleButtonGerarCodigo = new javax.swing.JToggleButton();
        jToggleButtonEquipe = new javax.swing.JToggleButton();
        jPanelEntrada = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaEntrada = new javax.swing.JTextArea();
        jPanelSaida = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaSaida = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBotoes.setLayout(new java.awt.GridLayout());

        jToggleButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/File-add-icon.png"))); // NOI18N
        jToggleButtonNovo.setText("novo [ctrl+n]");
        jToggleButtonNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonNovo.setMinimumSize(new java.awt.Dimension(0, 0));
        jToggleButtonNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanelBotoes.add(jToggleButtonNovo);

        jToggleButtonAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Folder-icon.png"))); // NOI18N
        jToggleButtonAbrir.setText("abrir [ctrl+a]");
        jToggleButtonAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonAbrir.setMinimumSize(new java.awt.Dimension(0, 0));
        jToggleButtonAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanelBotoes.add(jToggleButtonAbrir);

        jToggleButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Save-icon.png"))); // NOI18N
        jToggleButtonSalvar.setText("salvar [ctrl+s]");
        jToggleButtonSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonSalvar.setMinimumSize(new java.awt.Dimension(0, 0));
        jToggleButtonSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanelBotoes.add(jToggleButtonSalvar);

        jToggleButtonCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Copy-icon.png"))); // NOI18N
        jToggleButtonCopiar.setText("copiar [ctrl+c]");
        jToggleButtonCopiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonCopiar.setMinimumSize(new java.awt.Dimension(0, 0));
        jToggleButtonCopiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanelBotoes.add(jToggleButtonCopiar);

        jToggleButtonColar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Paste-icon.png"))); // NOI18N
        jToggleButtonColar.setText("colar [ctrl+v]");
        jToggleButtonColar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonColar.setMinimumSize(new java.awt.Dimension(0, 0));
        jToggleButtonColar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanelBotoes.add(jToggleButtonColar);

        jToggleButtonRecortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cut-icon.png"))); // NOI18N
        jToggleButtonRecortar.setText("recortar [ctrl+x]");
        jToggleButtonRecortar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonRecortar.setMinimumSize(new java.awt.Dimension(0, 0));
        jToggleButtonRecortar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanelBotoes.add(jToggleButtonRecortar);

        jToggleButtonCompilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Actions-arrow-right-double-icon.png"))); // NOI18N
        jToggleButtonCompilar.setText("compilar [F8]");
        jToggleButtonCompilar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonCompilar.setMinimumSize(new java.awt.Dimension(0, 0));
        jToggleButtonCompilar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanelBotoes.add(jToggleButtonCompilar);

        jToggleButtonGerarCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Wheels-icon.png"))); // NOI18N
        jToggleButtonGerarCodigo.setText("gerar código [F9]");
        jToggleButtonGerarCodigo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonGerarCodigo.setMinimumSize(new java.awt.Dimension(0, 0));
        jToggleButtonGerarCodigo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanelBotoes.add(jToggleButtonGerarCodigo);

        jToggleButtonEquipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Users-icon.png"))); // NOI18N
        jToggleButtonEquipe.setText("equipe [F1]");
        jToggleButtonEquipe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonEquipe.setMinimumSize(new java.awt.Dimension(0, 0));
        jToggleButtonEquipe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanelBotoes.add(jToggleButtonEquipe);

        jPanelEntrada.setLayout(new java.awt.GridLayout());

        jTextAreaEntrada.setColumns(20);
        jTextAreaEntrada.setRows(5);
        jTextAreaEntrada.setText("Soh tem q trocar esse cara por um componente com linhas\nacho q a Joice vai passar isso\n");
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
    private javax.swing.JToggleButton jToggleButtonAbrir;
    private javax.swing.JToggleButton jToggleButtonColar;
    private javax.swing.JToggleButton jToggleButtonCompilar;
    private javax.swing.JToggleButton jToggleButtonCopiar;
    private javax.swing.JToggleButton jToggleButtonEquipe;
    private javax.swing.JToggleButton jToggleButtonGerarCodigo;
    private javax.swing.JToggleButton jToggleButtonNovo;
    private javax.swing.JToggleButton jToggleButtonRecortar;
    private javax.swing.JToggleButton jToggleButtonSalvar;
    // End of variables declaration//GEN-END:variables
}
