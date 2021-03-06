package br.com.novaroma.easycon.presentation.view.resident;

import br.com.novaroma.easycon.entities.Resident;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JDesktopPane;

public class Status extends javax.swing.JInternalFrame {

    private JDesktopPane desktop;

    public Status() {
        initComponents();
        showStatus();
        setColor();
    }

    public Status(JDesktopPane jDesktopPane1) {
        desktop = jDesktopPane1;
        initComponents();
        showStatus();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonExit = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jLabelAge = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelStatus = new javax.swing.JLabel();
        jLabelPhoneNumber = new javax.swing.JLabel();
        jLabelBlock = new javax.swing.JLabel();
        jLabelBuilding = new javax.swing.JLabel();
        jLabelNumber = new javax.swing.JLabel();

        setTitle("Status");

        jButtonExit.setText("Sair");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jButtonExit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonExitKeyPressed(evt);
            }
        });

        jButtonUpdate.setText("Alterar");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jButtonUpdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonUpdateKeyPressed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados pessoais"));

        jLabelName.setText("Nome: ");

        jLabelCpf.setText("CPF: ");

        jLabelAge.setText("Idade: ");

        jLabelPassword.setText("Senha: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelName)
                    .addComponent(jLabelCpf))
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPassword)
                    .addComponent(jLabelAge))
                .addContainerGap(517, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jLabelAge))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCpf)
                    .addComponent(jLabelPassword))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do morador"));

        jLabelStatus.setText("Status: ");

        jLabelPhoneNumber.setText("Telefone: ");

        jLabelBlock.setText("Bloco: ");

        jLabelBuilding.setText("Edificio: ");

        jLabelNumber.setText("Numero: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelStatus)
                    .addComponent(jLabelBlock))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBuilding)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelPhoneNumber)
                        .addGap(49, 49, 49)
                        .addComponent(jLabelNumber)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStatus)
                    .addComponent(jLabelPhoneNumber)
                    .addComponent(jLabelNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBlock)
                    .addComponent(jLabelBuilding))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExit)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExit)
                    .addComponent(jButtonUpdate))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonExitKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            exit();
        }
    }//GEN-LAST:event_jButtonExitKeyPressed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        exit();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonUpdateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonUpdateKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            update();
        }
    }//GEN-LAST:event_jButtonUpdateKeyPressed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        update();
    }//GEN-LAST:event_jButtonUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelBlock;
    private javax.swing.JLabel jLabelBuilding;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNumber;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPhoneNumber;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void showStatus() {
        jLabelAge.setText("Idade: " + Resident.getCurrentResident().getAge());
        jLabelCpf.setText("CPF/Login: " + Resident.getCurrentResident().getCpf());
        jLabelName.setText("Nome: " + Resident.getCurrentResident().getName() + " " + Resident.getCurrentResident().getLastName());
        jLabelStatus.setText("Status: " + Resident.getCurrentResident().getOwe());
        jLabelPhoneNumber.setText("Telefone: " + Resident.getCurrentResident().getPhoneNumber());
        jLabelPassword.setText("Senha: " + Resident.getCurrentResident().getPassword());
        jLabelBlock.setText("Bloco: " + Resident.getCurrentResident().getAdrdress().getBlock());
        jLabelBuilding.setText("Edificio: " + Resident.getCurrentResident().getAdrdress().getBuilding());
        jLabelNumber.setText("Numero: " + Resident.getCurrentResident().getAdrdress().getNumber());
    }

    private void update() {
        Update up = new Update();
        desktop.add(up);
        up.setVisible(true);
    }

    private void setColor() {
        getContentPane().setBackground(Color.white);
        jPanel1.setBackground(Color.white);
        jPanel2.setBackground(Color.white);
    }
    
    private void exit() {
        this.dispose();
    }
}
