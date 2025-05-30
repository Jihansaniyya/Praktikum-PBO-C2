/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Proyek4;
import javax.swing.DefaultListModel;
import java.util.List;
import java.util.ArrayList;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author Jihan Saniyya
 */
public class GUIListSetMap extends javax.swing.JFrame {
    
    DefaultListModel<String> dlm;
    List<String> items = new ArrayList<>();
    Set<String>itemSet = new HashSet<>();
    Map<String, String> itemMap = new HashMap<>();
    
    String[] datas = {"buku", "meja", "kursi", "tas", "pintu jati"};

    /**
     * Creates new form GUIListSetMap
     */
    public GUIListSetMap() {
        initComponents();
        dlm = new DefaultListModel<>();
        jListItem.setModel(dlm);
        
        for (String data : datas){
            dlm.addElement(data);
        }
        updateJumDataTersimpan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListItem = new javax.swing.JList<>();
        jButtonSavetoList = new javax.swing.JButton();
        jButtonInsertDataList = new javax.swing.JButton();
        jButtonSavetoSet = new javax.swing.JButton();
        jButtonInsertDataSet = new javax.swing.JButton();
        jButtonSavetoMap = new javax.swing.JButton();
        jButtonInsertDataMap = new javax.swing.JButton();
        jTextFieldNamaItem = new javax.swing.JTextField();
        jLabelNamaItem = new javax.swing.JLabel();
        jButtonClearAll = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jLabelJumlahDataList = new javax.swing.JLabel();
        jLabelJumlahDataSet = new javax.swing.JLabel();
        jLabelJumlahDataMap = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jListItem);

        jButtonSavetoList.setText("Save to List ->");
        jButtonSavetoList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSavetoListActionPerformed(evt);
            }
        });

        jButtonInsertDataList.setText("<- Insert data List");
        jButtonInsertDataList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertDataListActionPerformed(evt);
            }
        });

        jButtonSavetoSet.setText("Save to Set ->");
        jButtonSavetoSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSavetoSetActionPerformed(evt);
            }
        });

        jButtonInsertDataSet.setText("<- Insert data Set");
        jButtonInsertDataSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertDataSetActionPerformed(evt);
            }
        });

        jButtonSavetoMap.setText("save to Map ->");
        jButtonSavetoMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSavetoMapActionPerformed(evt);
            }
        });

        jButtonInsertDataMap.setText("<- insert data Map");
        jButtonInsertDataMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertDataMapActionPerformed(evt);
            }
        });

        jTextFieldNamaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNamaItemActionPerformed(evt);
            }
        });

        jLabelNamaItem.setText("Item name: ");

        jButtonClearAll.setText("clear all");
        jButtonClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearAllActionPerformed(evt);
            }
        });

        jButtonAdd.setText("add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setText("delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jLabelJumlahDataList.setText("Data tersimpan =");

        jLabelJumlahDataSet.setText("Data tersimpan =");

        jLabelJumlahDataMap.setText("Data tersimpan =");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonClearAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSavetoList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSavetoSet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonInsertDataSet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSavetoMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonInsertDataMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldNamaItem)
                            .addComponent(jLabelNamaItem, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonInsertDataList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelJumlahDataList, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(jLabelJumlahDataSet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelJumlahDataMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDelete)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSavetoList)
                            .addComponent(jLabelJumlahDataList))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsertDataList)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSavetoSet)
                            .addComponent(jLabelJumlahDataSet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsertDataSet)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSavetoMap)
                            .addComponent(jLabelJumlahDataMap))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsertDataMap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNamaItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNamaItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClearAll)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void addItem(String namaItem){
        if(!namaItem.isEmpty()){
            dlm.addElement(namaItem);
            items.add(namaItem);
            updateJumDataTersimpan();
        }
    }
    
    public void updateJumDataTersimpan(){
        jLabelJumlahDataList.setText("Data tersimpan = " + items.size());
        jLabelJumlahDataSet.setText("Data tersimpan = " + itemSet.size());
        jLabelJumlahDataMap.setText("Data tersimpan = " + itemMap.size());
    }
    
    public void saveToList(){
        items.clear();
        for(int i = 0; i < dlm.getSize(); i++){
            items.add(dlm.getElementAt(i));
        }
        updateJumDataTersimpan();
    }
    
    public void insertDataList(){
        dlm.clear();
        for (String item : items){
            dlm.addElement(item);
        }
    }
    
    public void saveToSet(){
        itemSet.clear();
        for(int i = 0; i < dlm.getSize(); i++){
            itemSet.add(dlm.getElementAt(i));
        }
        updateJumDataTersimpan();
    }
    
    public void insertDataSet(){
        dlm.clear();
        for (Map.Entry<String, String> entry : itemMap.entrySet()){
            dlm.addElement(entry.getKey() + ":" + entry.getValue());
        }
    }
    
    public void saveToMap(){
        itemMap.clear();
        for(int i = 0; i < dlm.getSize(); i++){
            itemMap.put("Key" + i, dlm.getElementAt(i));
        }
        updateJumDataTersimpan();
    }
    
    public void insertDataMap(){
        dlm.clear();
        for(Map.Entry<String, String> entry : itemMap.entrySet()){
            dlm.addElement(entry.getKey() + ":" + entry.getValue());
        }
    }
    
    private void jTextFieldNamaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNamaItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNamaItemActionPerformed

    private void jButtonClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearAllActionPerformed
        // TODO add your handling code here:
        dlm.clear();
        items.clear();
        updateJumDataTersimpan();
    }//GEN-LAST:event_jButtonClearAllActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        int index = jListItem.getSelectedIndex();
        String selected = jTextFieldNamaItem.getText();
        dlm.setElementAt(selected, index);
        
        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        addItem(jTextFieldNamaItem.getText());
        
        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        int index = jListItem.getSelectedIndex();
        if (index != -1){
            String removedItem = dlm.getElementAt(index);
            dlm.removeElementAt(index);
            updateJumDataTersimpan();
            jTextFieldNamaItem.setText("");
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonInsertDataMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertDataMapActionPerformed
        // TODO add your handling code here:
        insertDataMap();
    }//GEN-LAST:event_jButtonInsertDataMapActionPerformed

    private void jButtonSavetoMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSavetoMapActionPerformed
        // TODO add your handling code here:
        saveToMap();
    }//GEN-LAST:event_jButtonSavetoMapActionPerformed

    private void jButtonInsertDataSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertDataSetActionPerformed
        // TODO add your handling code here:
        insertDataSet();
    }//GEN-LAST:event_jButtonInsertDataSetActionPerformed

    private void jButtonSavetoSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSavetoSetActionPerformed
        // TODO add your handling code here:
        saveToSet();
    }//GEN-LAST:event_jButtonSavetoSetActionPerformed

    private void jButtonInsertDataListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertDataListActionPerformed
        // TODO add your handling code here:
        insertDataList();
    }//GEN-LAST:event_jButtonInsertDataListActionPerformed

    private void jButtonSavetoListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSavetoListActionPerformed
        // TODO add your handling code here:
        saveToList();
    }//GEN-LAST:event_jButtonSavetoListActionPerformed

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
            java.util.logging.Logger.getLogger(GUIListSetMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIListSetMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIListSetMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIListSetMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(guiListSetMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiListSetMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiListSetMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiListSetMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIListSetMap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClearAll;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsertDataList;
    private javax.swing.JButton jButtonInsertDataMap;
    private javax.swing.JButton jButtonInsertDataSet;
    private javax.swing.JButton jButtonSavetoList;
    private javax.swing.JButton jButtonSavetoMap;
    private javax.swing.JButton jButtonSavetoSet;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelJumlahDataList;
    private javax.swing.JLabel jLabelJumlahDataMap;
    private javax.swing.JLabel jLabelJumlahDataSet;
    private javax.swing.JLabel jLabelNamaItem;
    private javax.swing.JList<String> jListItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNamaItem;
    // End of variables declaration//GEN-END:variables
}
