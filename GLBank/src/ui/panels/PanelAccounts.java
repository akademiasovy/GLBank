/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.panels;

import glbank.Account;
import glbank.database.ConnectionProvider;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author client
 */
public class PanelAccounts extends javax.swing.JPanel {
    private int idc;
    private int idemp;
    
    private List<Account> list;
    /**
     * Creates new form PanelAccounts
     */
    public PanelAccounts(int idc, int idemp) {
        initComponents();
        this.idc=idc;
        this.idemp=idemp;
        initAccountList();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jAccountList = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        jtxtAddValue = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jtxtSubValue = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnNewAccount = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Account id:");

        jAccountList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jAccountList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAccountListActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Balance:");

        lblBalance.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBalance.setText("1234.56");

        jtxtAddValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtAddValue.setText("0");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("add +");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtxtSubValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtSubValue.setText("0");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("sub -");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Cash transaction:");

        btnNewAccount.setText("Add new account");
        btnNewAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNewAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBalance)
                                .addGap(120, 120, 120)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                            .addComponent(jtxtAddValue))
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtxtSubValue, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 141, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jAccountList, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jAccountList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblBalance)
                    .addComponent(jtxtAddValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtSubValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNewAccount)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jAccountListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAccountListActionPerformed
        // TODO add your handling code here:
        if(!list.isEmpty()){
            int index=jAccountList.getSelectedIndex();
            lblBalance.setText(""+list.get(index).getBalance());
        }
    }//GEN-LAST:event_jAccountListActionPerformed

    private void btnNewAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAccountActionPerformed
        // TODO add your handling code here:
        ConnectionProvider conn=new ConnectionProvider();
        long proposalAccount;
        do{
                 proposalAccount=Math.abs(new Random().nextLong()%900000000)*11;
        }while(conn.existsAccount(proposalAccount));
           System.out.println("New account id: "+proposalAccount);
           conn.insertNewAccount(idc,proposalAccount);
    }//GEN-LAST:event_btnNewAccountActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String text = jtxtAddValue.getText();
        float value= parseStringToFloat(text);
        value = (float) Math.round(value * 100) / 100;
        System.out.println("value: "+value);
        if(value>=0.1){
            JOptionPane.showMessageDialog(this, "Payment ok.");
            int index=jAccountList.getSelectedIndex();
            long idacc=list.get(index).getIdacc();
            new ConnectionProvider().insertCash(idacc,value,idemp); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private float parseStringToFloat(String text){
        if(text.length()>0){
            try {
                float value=Float.parseFloat(text);
                return value;
            }catch(NumberFormatException ex){
                
            }
        }
        return 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewAccount;
    private javax.swing.JComboBox<String> jAccountList;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jtxtAddValue;
    private javax.swing.JTextField jtxtSubValue;
    private javax.swing.JLabel lblBalance;
    // End of variables declaration//GEN-END:variables

    private void initAccountList() {
        ConnectionProvider conn = new ConnectionProvider();
        list=conn.getAccounts(idc);
        lblBalance.setText("");
        if(list.isEmpty())
            return;
        
        list.stream().forEach((account) -> {
            jAccountList.addItem(""+account.getIdacc()+" / 2701");
        });
        int index=jAccountList.getSelectedIndex();
        lblBalance.setText(""+list.get(index).getBalance());
    }
}
