package views;

import javax.swing.JFrame;


public class MenuPrincipal extends JFrame {

  /** Creates new form MenuPrincipal */
  public MenuPrincipal() {
    initComponents();
    setExtendedState(JFrame.MAXIMIZED_BOTH);
  }


  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel2 = new javax.swing.JPanel();
    jMenuBar1 = new javax.swing.JMenuBar();
    menuLancar = new javax.swing.JMenu();
    menuItemLancarEntrada = new javax.swing.JMenuItem();
    menuItemLancarSaida = new javax.swing.JMenuItem();
    menuListar = new javax.swing.JMenu();
    menuItemListarEntrada = new javax.swing.JMenuItem();
    menuItemListarSaida = new javax.swing.JMenuItem();
    menuItemListarRelatorio = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Gestão Financeira");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 1071, Short.MAX_VALUE)
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 682, Short.MAX_VALUE)
    );

    menuLancar.setText("Lançar");

    menuItemLancarEntrada.setText("Entrada");
    menuItemLancarEntrada.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuItemLancarEntradaActionPerformed(evt);
      }
    });
    menuLancar.add(menuItemLancarEntrada);

    menuItemLancarSaida.setText("Saida");
    menuItemLancarSaida.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuItemLancarSaidaActionPerformed(evt);
      }
    });
    menuLancar.add(menuItemLancarSaida);

    jMenuBar1.add(menuLancar);

    menuListar.setText("Listar");

    menuItemListarEntrada.setText("Entradas");
    menuItemListarEntrada.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuItemListarEntradaActionPerformed(evt);
      }
    });
    menuListar.add(menuItemListarEntrada);

    menuItemListarSaida.setText("Saídas");
    menuListar.add(menuItemListarSaida);

    menuItemListarRelatorio.setText("Relatório");
    menuListar.add(menuItemListarRelatorio);

    jMenuBar1.add(menuListar);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void menuItemLancarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLancarEntradaActionPerformed
    BasicLancamentoEditor lancarEntrada = new BasicLancamentoEditor(this, true, 'E');
    lancarEntrada.setVisible(true);
  }//GEN-LAST:event_menuItemLancarEntradaActionPerformed

  private void menuItemLancarSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLancarSaidaActionPerformed
    BasicLancamentoEditor lancarSaida = new BasicLancamentoEditor(this, true, 'S');
    lancarSaida.setVisible(true);
  }//GEN-LAST:event_menuItemLancarSaidaActionPerformed

  private void menuItemListarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarEntradaActionPerformed
    LancamentosPanel lancamentosPanel = new LancamentosPanel(this, true);
    lancamentosPanel.setVisible(true);
  }//GEN-LAST:event_menuItemListarEntradaActionPerformed

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
    }
    catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {

      public void run() {
        new MenuPrincipal().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  protected javax.swing.JMenuBar jMenuBar1;
  protected javax.swing.JPanel jPanel2;
  protected javax.swing.JMenuItem menuItemLancarEntrada;
  protected javax.swing.JMenuItem menuItemLancarSaida;
  protected javax.swing.JMenuItem menuItemListarEntrada;
  protected javax.swing.JMenuItem menuItemListarRelatorio;
  protected javax.swing.JMenuItem menuItemListarSaida;
  protected javax.swing.JMenu menuLancar;
  protected javax.swing.JMenu menuListar;
  // End of variables declaration//GEN-END:variables
}