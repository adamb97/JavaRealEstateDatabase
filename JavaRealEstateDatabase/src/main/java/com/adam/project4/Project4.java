
package com.adam.project4;

import java.util.TreeMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Adam Benalayat
 * Class: CMIS 242
 * Date: 8/11
 * This program manages a real estate database using enumerated types and the TreeMap data structure.
 * The user can enter Information about their real estate transaction, and then retrieve or deleted the inserted information
 */
public class Project4 extends javax.swing.JFrame {

    
    public Project4() {
        initComponents();
        //creating the TreeMap Databse
        
        propertyDB = new TreeMap<Integer, Property>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Real Estate Database");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Transaction No: ");

        jLabel2.setText("Address: ");

        jLabel3.setText("Bedrooms: ");

        jLabel4.setText("Square Footage: ");

        jLabel5.setText("Price: ");

        jButton1.setText("Process");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Change Status");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Insert", "Delete", "Find" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FOR_SALE", "UNDER_CONTRACT", "SOLD" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(jTextField4)
                    .addComponent(jTextField3)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, 161, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
      
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Data Validation
        int transaction;
        int bedrooms;
        int footage;
        int price;
        try {
             transaction = Integer.parseInt(jTextField1.getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Transaction Number is not an integer", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
             bedrooms = Integer.parseInt(jTextField3.getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Bedroom Number is not an integer", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
             footage = Integer.parseInt(jTextField4.getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Footage is not an integer", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
             price = Integer.parseInt(jTextField5.getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Price is not an integer", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
       String address = jTextField2.getText();
       
       //Performing Event
       
       String selectedActionCase = jComboBox1.getSelectedItem().toString();
       switch(selectedActionCase){
           case "Insert":{
               //Validate that key doesn't already exist
               if(propertyDB.containsKey(transaction)){
                   
                   JOptionPane.showMessageDialog(null, "Transaction Number already exists in the Database");
               } else {
                   //Create Property Object
                   Property element = new Property (address, bedrooms, footage, price);
                   propertyDB.put(transaction, element);
                   JOptionPane.showMessageDialog(null, "Insert was successful.", "information", JOptionPane.INFORMATION_MESSAGE);
               }
               break;
           }
           
           case "Delete": {
               //Validate that key already exists
               if(!propertyDB.containsKey(transaction)){
                 JOptionPane.showMessageDialog(null, "Transaction Number not found in the database.", "Error", JOptionPane.ERROR_MESSAGE);  
               } else {
                   //Remove object
                   propertyDB.remove(transaction);
                   JOptionPane.showMessageDialog(null, "Delete was successful.", "information", JOptionPane.INFORMATION_MESSAGE);
                   
               }
               break;
           }
           
           case "Find": {
               //validate that key exists
               
               if(!propertyDB.containsKey(transaction)){
                    JOptionPane.showMessageDialog(null, "Transaction Number not found in the database.", "Error", JOptionPane.ERROR_MESSAGE);
               } else {
                   //Show property Object
                   Property element = propertyDB.get(transaction);
                   JOptionPane.showMessageDialog(null, element.toString(), "information", JOptionPane.INFORMATION_MESSAGE);
                   
               }
               break;
               
           }
           default:
               break;
           
           
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Perform the Selected Action
        String selectedAction = jComboBox2.getSelectedItem().toString();
        int transaction;
        try {
            transaction = Integer.parseInt(jTextField1.getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Transaction number is not an integer", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Status selectedStatus;
        switch(selectedAction){
            case "FOR_SALE":{
                selectedStatus = Status.FOR_SALE;
                break;
            }
            case "UNDER_CONTRACT":{
                selectedStatus = Status.UNDER_CONTRACT;
                break;
                        
            }
            default:
                selectedStatus = Status.SOLD;
                break;
       
        }
        
        //Ensure key exists
        if(!propertyDB.containsKey(transaction)){
            JOptionPane.showMessageDialog(null, "Transaction Number not found in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
             propertyDB.get(transaction).changeState(selectedStatus);
            JOptionPane.showMessageDialog(null, "Status changed successfully.", "information", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
    
    }//GEN-LAST:event_jComboBox2ActionPerformed

    
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Project4().setVisible(true);
            }
        });
    }
    
    TreeMap<Integer, Property> propertyDB;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
