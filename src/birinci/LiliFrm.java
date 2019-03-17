
package birinci;


public class LiliFrm extends javax.swing.JFrame
  {
    private static String txtString;
    private PencereAyarı pencereAyarı;

    public LiliFrm()
      {
        initComponents();
        txtString="";
        pencereAyarı=new PencereAyarı(this);
        jProgressBar1.setValue(5);
      }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents()
      {

        TabbedP = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        ResimCheckBox = new javax.swing.JCheckBox();
        ArsivCheckBox = new javax.swing.JCheckBox();
        SesCheckBox = new javax.swing.JCheckBox();
        DeveloperCheckBox = new javax.swing.JCheckBox();
        DocumentCheckBox = new javax.swing.JCheckBox();
        VideoCheckBox = new javax.swing.JCheckBox();
        AktarButton = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        RB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ResimCheckBox.setText("Resim");
        ResimCheckBox.addActionListener(new java.awt.event.ActionListener()
          {
            public void actionPerformed(java.awt.event.ActionEvent evt)
              {
                ResimCheckBoxActionPerformed(evt);
              }
          });

        ArsivCheckBox.setText("Arsiv");

        SesCheckBox.setText("Ses");

        DeveloperCheckBox.setText("Developer");

        DocumentCheckBox.setText("Document");

        VideoCheckBox.setText("Video");

        AktarButton.setText("Aktar");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ResimCheckBox)
                                        .addComponent(ArsivCheckBox)
                                        .addComponent(SesCheckBox)
                                        .addComponent(DeveloperCheckBox)
                                        .addComponent(DocumentCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(VideoCheckBox)
                                        .addComponent(AktarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(ResimCheckBox)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ArsivCheckBox)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(SesCheckBox)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(DeveloperCheckBox)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(DocumentCheckBox)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(VideoCheckBox)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AktarButton)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jScrollPane1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ResimCheckBox.getAccessibleContext().setAccessibleDescription("");

        TabbedP.addTab("Uygulama", jPanel1);

        RB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/EğlenceT.jpg"))); // NOI18N
        RB.setFocusPainted(false);
        RB.setFocusable(false);
        RB.setVerifyInputWhenFocusTarget(false);

        jLabel2.setText("Ahmet Batuhan Kılıç");

        jLabel3.setText("Mail: han_batur@hotmail.com");

        jLabel4.setText("Youtube: Eğlence Tutkumuz");

        jLabel5.setText("github.com/KlcAhmet");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(RB, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(590, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(12, Short.MAX_VALUE))
        );

        TabbedP.addTab("Bilgi", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(TabbedP)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TabbedP)
        );

        pack();
      }// </editor-fold>

    private void ResimCheckBoxActionPerformed(java.awt.event.ActionEvent evt)
      {
        // TODO add your handling code here:
      }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
      {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try
          {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
              {
                if ("Nimbus".equals(info.getName()))
                  {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                  }
              }
          }
        catch (ClassNotFoundException ex)
          {
            java.util.logging.Logger.getLogger(LiliFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
        catch (InstantiationException ex)
          {
            java.util.logging.Logger.getLogger(LiliFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
        catch (IllegalAccessException ex)
          {
            java.util.logging.Logger.getLogger(LiliFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
          {
            java.util.logging.Logger.getLogger(LiliFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
          {
            public void run()
              {
                new LiliFrm().setVisible(true);
              }
          });
      }


    protected void textAreaSet(String txt)  // TxtArea set metodu
    {
      try
        {
          txtString += "\n" + txt;
          jTextArea1.setText(txtString);
        }
      catch (Exception e)
        {
          e.printStackTrace();
        }
    }

    protected void setProgressbar(int i) // progresBar set metodu
    {
      jProgressBar1.setValue(i);
    }

    // Variables declaration - do not modify
    protected javax.swing.JToggleButton AktarButton;
    protected javax.swing.JCheckBox ArsivCheckBox;
    protected javax.swing.JCheckBox DeveloperCheckBox;
    protected javax.swing.JCheckBox DocumentCheckBox;
    private javax.swing.JButton RB;
    protected javax.swing.JCheckBox ResimCheckBox;
    protected javax.swing.JCheckBox SesCheckBox;
    protected javax.swing.JTabbedPane TabbedP;
    protected javax.swing.JCheckBox VideoCheckBox;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel3;
    protected javax.swing.JLabel jLabel4;
    protected javax.swing.JLabel jLabel5;
    protected javax.swing.JPanel jPanel1;
    protected javax.swing.JPanel jPanel2;
    protected javax.swing.JProgressBar jProgressBar1;
    protected javax.swing.JScrollPane jScrollPane1;
    protected static javax.swing.JTextArea jTextArea1;
    // End of variables declaration
  }
