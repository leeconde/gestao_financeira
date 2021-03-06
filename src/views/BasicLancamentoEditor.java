package views;

import dao.LancamentoDao;
import entities.Lancamento;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BasicLancamentoEditor extends JDialog {

  private char tipo;

  /** Creates new form BasicLancar */
  public BasicLancamentoEditor(java.awt.Frame parent, boolean modal, char tipo) {
    super(parent, modal);
    initComponents();
    setLocationRelativeTo(null);
    setResizable(false);
    tipoOperacao(tipo);
    desabilitaCamposParcela();
  }

  private BasicLancamentoEditor(JFrame jFrame, boolean b) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  private void tipoOperacao(char tipo) {
    if (tipo == 'E') {
      this.tipo = 'E';
      setTitle("Lançar Entrada");
      panelParcelas.setVisible(false);
    }
    else if (tipo == 'S') {
      this.tipo = 'S';
      setTitle("Lançar Saída");
    }
    else {
      System.out.println("Erro");
    }
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    panelGeral = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    txtDescricao = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    dataChooserData = new com.toedter.calendar.JDateChooser();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    txtValorTotal = new javax.swing.JTextField();
    jScrollPane1 = new javax.swing.JScrollPane();
    editorPanelObservacao = new javax.swing.JEditorPane();
    panelButtons = new javax.swing.JPanel();
    buttonSalvar = new javax.swing.JButton();
    buttonCancel = new javax.swing.JButton();
    panelParcelas = new javax.swing.JPanel();
    checkBoxParcelado = new javax.swing.JCheckBox();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    txtValorParcela = new javax.swing.JTextField();
    txtQuantidade = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jLabel1.setText("Descrição");

    jLabel2.setText("Data");

    jLabel3.setText("Observação");

    jLabel4.setText("Valor");

    jScrollPane1.setViewportView(editorPanelObservacao);

    javax.swing.GroupLayout panelGeralLayout = new javax.swing.GroupLayout(panelGeral);
    panelGeral.setLayout(panelGeralLayout);
    panelGeralLayout.setHorizontalGroup(
      panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelGeralLayout.createSequentialGroup()
        .addGap(38, 38, 38)
        .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabel3)
          .addComponent(jLabel1)
          .addComponent(jLabel4))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addGroup(panelGeralLayout.createSequentialGroup()
            .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(dataChooserData, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(txtDescricao, javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1))
        .addContainerGap(73, Short.MAX_VALUE))
    );
    panelGeralLayout.setVerticalGroup(
      panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGeralLayout.createSequentialGroup()
        .addGap(33, 33, 33)
        .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(28, 28, 28)
        .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelGeralLayout.createSequentialGroup()
            .addComponent(jLabel3)
            .addGap(0, 0, Short.MAX_VALUE))
          .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(dataChooserData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel4)
            .addComponent(jLabel2)
            .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(11, 11, 11))
    );

    buttonSalvar.setText("Salvar");
    buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonSalvarActionPerformed(evt);
      }
    });

    buttonCancel.setText("Cancelar");
    buttonCancel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonCancelActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout panelButtonsLayout = new javax.swing.GroupLayout(panelButtons);
    panelButtons.setLayout(panelButtonsLayout);
    panelButtonsLayout.setHorizontalGroup(
      panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelButtonsLayout.createSequentialGroup()
        .addGap(169, 169, 169)
        .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(37, 37, 37)
        .addComponent(buttonCancel)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    panelButtonsLayout.setVerticalGroup(
      panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelButtonsLayout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addGroup(panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(buttonSalvar)
          .addComponent(buttonCancel))
        .addContainerGap(18, Short.MAX_VALUE))
    );

    checkBoxParcelado.setText("Parcelado?");
    checkBoxParcelado.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        checkBoxParceladoActionPerformed(evt);
      }
    });

    jLabel5.setText("Valor Parcela");

    jLabel6.setText("Quantidade");

    javax.swing.GroupLayout panelParcelasLayout = new javax.swing.GroupLayout(panelParcelas);
    panelParcelas.setLayout(panelParcelasLayout);
    panelParcelasLayout.setHorizontalGroup(
      panelParcelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelParcelasLayout.createSequentialGroup()
        .addGap(35, 35, 35)
        .addGroup(panelParcelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelParcelasLayout.createSequentialGroup()
            .addComponent(checkBoxParcelado)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(panelParcelasLayout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addComponent(jLabel6)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtQuantidade)
            .addGap(18, 18, 18)
            .addComponent(jLabel5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtValorParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(89, 89, 89))))
    );
    panelParcelasLayout.setVerticalGroup(
      panelParcelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelParcelasLayout.createSequentialGroup()
        .addComponent(checkBoxParcelado)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(panelParcelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(jLabel6)
          .addComponent(txtValorParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(8, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(panelParcelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(panelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(panelGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(panelGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(panelParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
        .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
    dispose();
  }//GEN-LAST:event_buttonCancelActionPerformed

  private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
    if (tipo == 'E' && validarCampos()) {
      String descricao = txtDescricao.getText();
      String observacao = editorPanelObservacao.getText();
      String valorTotalString = txtValorTotal.getText();
      double valotTotal = Double.parseDouble(valorTotalString);
      Date dataEntrada = dataChooserData.getDate();

      Lancamento lancarOperacaoEntrada = new Lancamento(descricao, observacao, valotTotal,
          dataEntrada, 'E');

      LancamentoDao.getInstance().createLancamento(lancarOperacaoEntrada);
      this.dispose();
    }
    else if (tipo == 'S' && validarCampos()) {
      String descricao = txtDescricao.getText();
      String observacao = editorPanelObservacao.getText();
      String valorTotalString = txtValorTotal.getText();
      double valotTotal = Double.parseDouble(valorTotalString);
      Date dataEntrada = dataChooserData.getDate();
      if (verificaParcelado()) {
        int quantidade = Integer.parseInt(txtQuantidade.getText());
        double valorParcela = Double.parseDouble(txtValorParcela.getText());
        Lancamento lancarOperacaoSaida = new Lancamento(descricao, observacao, valotTotal,
            dataEntrada, true, quantidade, valorParcela, 'S');
        LancamentoDao.getInstance().createLancamento(lancarOperacaoSaida);
      }
      else {
        Lancamento lancarOperacaoSaida = new Lancamento(descricao, observacao, valotTotal,
            dataEntrada, 'S');
        LancamentoDao.getInstance().createLancamento(lancarOperacaoSaida);
      }
      this.dispose();
    }
  }//GEN-LAST:event_buttonSalvarActionPerformed

  private void checkBoxParceladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxParceladoActionPerformed
    verificaParcelado();
  }//GEN-LAST:event_checkBoxParceladoActionPerformed

  private boolean verificaParcelado() {
    if (checkBoxParcelado.isSelected()) {
      habilitaCamposParcela();
      return true;
    }
    else {
      desabilitaCamposParcela();
      return false;
    }
  }

  private void desabilitaCamposParcela() {
    txtQuantidade.setEnabled(false);
    txtValorParcela.setEnabled(false);
  }

  private void habilitaCamposParcela() {
    txtQuantidade.setEnabled(true);
    txtValorParcela.setEnabled(true);
  }

  private boolean validarCampos() {
    if (txtDescricao.getText().trim().isEmpty()) {
      JOptionPane.showMessageDialog(null, "Descrição não pode ser vazia!");
      return false;
    }
    else if (editorPanelObservacao.getText().trim().isEmpty()) {
      JOptionPane.showMessageDialog(null, "Observação não pode ser vazia!");
      return false;
    }
    else if (txtValorTotal.getText().trim().isEmpty()) {
      JOptionPane.showMessageDialog(null, "Valor Total não pode ser vazio!");
      return false;
    }
    if (checkBoxParcelado.isSelected()) {
      if (txtQuantidade.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Quantidade de parcelas não pode ser vazio!");
        return false;
      }
      else if (txtValorParcela.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Valor da Parcela não pode ser vazio!");
        return false;
      }
    }
    return true;
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
    }
    catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(BasicLancamentoEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(BasicLancamentoEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(BasicLancamentoEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(BasicLancamentoEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {

      public void run() {
        BasicLancamentoEditor dialog = new BasicLancamentoEditor(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {

          @Override
          public void windowClosing(java.awt.event.WindowEvent e) {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  protected javax.swing.JButton buttonCancel;
  protected javax.swing.JButton buttonSalvar;
  protected javax.swing.JCheckBox checkBoxParcelado;
  protected com.toedter.calendar.JDateChooser dataChooserData;
  protected javax.swing.JEditorPane editorPanelObservacao;
  protected javax.swing.JLabel jLabel1;
  protected javax.swing.JLabel jLabel2;
  protected javax.swing.JLabel jLabel3;
  protected javax.swing.JLabel jLabel4;
  protected javax.swing.JLabel jLabel5;
  protected javax.swing.JLabel jLabel6;
  protected javax.swing.JScrollPane jScrollPane1;
  protected javax.swing.JPanel panelButtons;
  protected javax.swing.JPanel panelGeral;
  protected javax.swing.JPanel panelParcelas;
  protected javax.swing.JTextField txtDescricao;
  protected javax.swing.JTextField txtQuantidade;
  protected javax.swing.JTextField txtValorParcela;
  protected javax.swing.JTextField txtValorTotal;
  // End of variables declaration//GEN-END:variables
}