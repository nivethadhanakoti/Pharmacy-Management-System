/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacymanagementsystem;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;
import java.util.Calendar;
import java.awt.*;

/**
 *
 * @author prathi
 */
public class PlaceOrder extends javax.swing.JFrame {
    Connection con;
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    /**
     * Creates new form PlaceOrder
     */
    public PlaceOrder() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(204,204,255));
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            //JOptionPane.showMessageDialog(this,"Driver Loaded!");
            try {
                con = DriverManager.getConnection("jdbc:oracle:thin:@NivethaKoti:1521:orcl","scott","tiger");
                //JOptionPane.showMessageDialog(this,"Connected to Oracle database!");
            }
            catch (SQLException ex) {
                Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE,null, ex);
            JOptionPane.showMessageDialog(this,ex.getMessage());
            }
        }
        catch(ClassNotFoundException ex){
            Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE,null, ex);
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
        setLocationToMiddleLeft();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        presctiption_id = new javax.swing.JLabel();
        order_date = new javax.swing.JLabel();
        transaction_id = new javax.swing.JLabel();
        total_cost = new javax.swing.JLabel();
        delivery_date = new javax.swing.JLabel();
        place_order_button = new javax.swing.JButton();
        prescription_id_val = new javax.swing.JTextField();
        order_date_val = new javax.swing.JTextField();
        transaction_id_val = new javax.swing.JTextField();
        delivery_date_val = new javax.swing.JTextField();
        total_cost_val = new javax.swing.JTextField();
        back_button = new javax.swing.JButton();
        medicine_id = new javax.swing.JLabel();
        delivery_agent_id = new javax.swing.JLabel();
        delivery_Agent_id = new javax.swing.JTextField();
        medicine_id_val = new javax.swing.JTextField();
        customer_id = new javax.swing.JLabel();
        customer_id_val = new javax.swing.JTextField();
        refresh = new javax.swing.JButton();
        title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        presctiption_id.setText("PRESCIPTION_ID");

        order_date.setText("ORDER_DATE");

        transaction_id.setText("TRANSACTION_ID");

        total_cost.setText("TOTAL COST");

        delivery_date.setText("DELIVERY DATE");

        place_order_button.setText("PLACE ORDER");
        place_order_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                place_order_buttonActionPerformed(evt);
            }
        });

        prescription_id_val.setText(" ");

        order_date_val.setText(" ");

        transaction_id_val.setText(" ");

        delivery_date_val.setText(" ");
        delivery_date_val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delivery_date_valActionPerformed(evt);
            }
        });

        total_cost_val.setText(" ");

        back_button.setText("BACK");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        medicine_id.setText("MEDICINE ID");

        delivery_agent_id.setText("DELIVERY AGENT ID");

        delivery_Agent_id.setText(" ");

        medicine_id_val.setText(" ");

        customer_id.setText("CUSTOMER ID");

        customer_id_val.setText(" ");

        refresh.setText("REFRESH");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        title.setText("PLACE ORDER PAGE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(place_order_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                .addComponent(back_button)
                .addGap(119, 119, 119))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(medicine_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(presctiption_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(order_date, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(customer_id))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(order_date_val, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(medicine_id_val, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prescription_id_val, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customer_id_val, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delivery_date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(transaction_id, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(total_cost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(delivery_agent_id)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transaction_id_val)
                    .addComponent(delivery_date_val)
                    .addComponent(total_cost_val)
                    .addComponent(delivery_Agent_id, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(refresh))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(title)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(transaction_id)
                            .addComponent(transaction_id_val, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delivery_date)
                            .addComponent(delivery_date_val, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(total_cost)
                            .addComponent(total_cost_val, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(presctiption_id)
                            .addComponent(prescription_id_val, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(medicine_id)
                            .addComponent(medicine_id_val, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(order_date)
                            .addComponent(order_date_val, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delivery_Agent_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(customer_id)
                        .addComponent(customer_id_val, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(delivery_agent_id)))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(place_order_button)
                    .addComponent(back_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refresh)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void place_order_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_place_order_buttonActionPerformed
                                                   
    try {
        // Generate a new transaction ID
        String tid = generateTransactionID();

        // Prepare the SQL statement to insert the transaction
        String sql = "INSERT INTO TRANSACTIONS1 VALUES (?, ?, ?, ?, ?,null,null)";
        ps = con.prepareStatement(sql);
        ps.setString(1, tid);
        ps.setString(2, prescription_id_val.getText());
        ps.setString(3, medicine_id_val.getText());
        ps.setString(4, customer_id_val.getText());
        ps.setString(5, order_date_val.getText());

        // Execute the SQL statement
        int rowsInserted = ps.executeUpdate();

        // Check if the insertion was successful
        if (rowsInserted > 0) {
            // Call the procedure to calculate total cost and assign a delivery agent
            CallableStatement cs = con.prepareCall("{call CALCULATE_TOTAL_COST(?)}");
            cs.setString(1, tid);
            cs.execute();

            // Check if a delivery agent was assigned
            String deliveryAgentId = getAssignedDeliveryAgent(tid);
            if (deliveryAgentId != null) {
                String deliveryDate = getDeliveryDate(tid); // Get the delivery date value
                String message = "<html>Order placed successfully!<br>Delivery agent assigned: " + deliveryAgentId + "<br>Delivery date: " + deliveryDate + "</html>";
JOptionPane.showMessageDialog(this, message);
            } else {
                 String deliveryDate = getDeliveryDate(tid); // Get the delivery date value
                 String message = "<html>Order placed successfully!<br> Currently no delivery agents available, but you will be assigned one later.<br> Delivery date: " + deliveryDate + "</html>";
                 JOptionPane.showMessageDialog(this, message);
            }
            displayTransactionDetails(tid);
        } else {
            JOptionPane.showMessageDialog(this, "Failed to place order.");
        }
    } catch (SQLException ex) {
        Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, ex.getMessage());
    }

    }//GEN-LAST:event_place_order_buttonActionPerformed

    private String getAssignedDeliveryAgent(String transactionId) {
    try {
        String sql = "SELECT DELIVERYAGENTID FROM TRANSACTIONS1 WHERE TransactionID = ?";
        ps = con.prepareStatement(sql);
        ps.setString(1, transactionId);
        rs = ps.executeQuery();

        if (rs.next()) {
            return rs.getString("DELIVERYAGENTID");
        } else {
            return null; // No delivery agent assigned
        }
    } catch (SQLException ex) {
        Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, ex.getMessage());
        return null;
    }
}
    private String getDeliveryDate(String transactionId) {
    try {
        String sql = "SELECT DeliveryDate FROM TRANSACTIONS1 WHERE TransactionID = ?";
        ps = con.prepareStatement(sql);
        ps.setString(1, transactionId);
        rs = ps.executeQuery();

        if (rs.next()) {
            String deliveryDate = rs.getString("DeliveryDate");
            return deliveryDate != null ? deliveryDate : "Not assigned";
        } else {
            return "Not assigned"; // No delivery date found
        }
    } catch (SQLException ex) {
        Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, ex.getMessage());
        return "Not assigned";
    }
}

    private void displayTransactionDetails(String transactionId) {
    try {
        // Fetch details from TRANSACTIONS1
        String sql1 = "SELECT * FROM TRANSACTIONS1 WHERE TRANSACTIONID = ?";
        ps = con.prepareStatement(sql1);
        ps.setString(1, transactionId);
        rs = ps.executeQuery();
        if (rs.next()) {
            transaction_id_val.setText(rs.getString("TRANSACTIONID"));
            prescription_id_val.setText(rs.getString("PRESCRIPTIONID"));
            medicine_id_val.setText(rs.getString("MEDICINEID"));
            customer_id_val.setText(rs.getString("CUSTOMERID"));
            order_date_val.setText(rs.getString("ORDERDATE"));
            delivery_Agent_id.setText(rs.getString("DELIVERYAGENTID"));
            delivery_date_val.setText(rs.getString("DELIVERYDATE"));
        }

        // Fetch details from TRANSACTIONS2
        String sql2 = "SELECT * FROM TRANSACTIONS2 WHERE TRANSACTIONID = ?";
        ps = con.prepareStatement(sql2);
        ps.setString(1, transactionId);
        rs = ps.executeQuery();
        if (rs.next()) {
            total_cost_val.setText(rs.getString("TOTALPRICE"));
        }
    } catch (SQLException ex) {
        Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, ex.getMessage());
    }
}
    private String generateTransactionID() {
    try {
        // Query the database for the current number of transactions
        String countQuery = "SELECT COUNT(*) FROM TRANSACTIONS1";
        Statement countStatement = con.createStatement();
        ResultSet countResult = countStatement.executeQuery(countQuery);
        countResult.next();
        int count = countResult.getInt(1);

        // Generate a new transaction ID
        return "T" + (count + 1);
    } catch (SQLException ex) {
        Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, ex.getMessage());
        return null;
    }
}
    private void delivery_date_valActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delivery_date_valActionPerformed
        String orderDateStr = order_date_val.getText();
    
    // Parse the order date into a java.sql.Date object
        java.sql.Date orderDate = java.sql.Date.valueOf(orderDateStr);
    
    // Generate a random number between 2 to 7 (inclusive) for the delivery days
        int deliveryDays = new Random().nextInt(6) + 2;
    
    // Calculate the delivery date
        Calendar cal = Calendar.getInstance();
        cal.setTime(orderDate);
        cal.add(Calendar.DAY_OF_MONTH, deliveryDays);
        java.sql.Date deliveryDate = new java.sql.Date(cal.getTimeInMillis());
    
    // Set the calculated delivery date in the delivery date text field
        delivery_date_val.setText(deliveryDate.toString());// TODO add your handling code here:
    }//GEN-LAST:event_delivery_date_valActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed

        new Option().setVisible(true);
        this.setVisible(false);       // TODO add your handling code here:
    }//GEN-LAST:event_back_buttonActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        // Create a new instance of the current frame
        PlaceOrder newFrame = new PlaceOrder();
        newFrame.setVisible(true);
    // Hide or dispose the current frame
        this.dispose();
    }//GEN-LAST:event_refreshActionPerformed

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
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaceOrder().setVisible(true);
            }
        });
    }
    private void setLocationToMiddleLeft() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = this.getSize();
        
        // Calculate the new location
        int x = screenSize.width / 3 - frameSize.width / 2; // Middle left quarter
        int y = screenSize.height / 2 - frameSize.height / 2; // Center vertically

        this.setLocation(x, y);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JLabel customer_id;
    private javax.swing.JTextField customer_id_val;
    private javax.swing.JTextField delivery_Agent_id;
    private javax.swing.JLabel delivery_agent_id;
    private javax.swing.JLabel delivery_date;
    private javax.swing.JTextField delivery_date_val;
    private javax.swing.JLabel medicine_id;
    private javax.swing.JTextField medicine_id_val;
    private javax.swing.JLabel order_date;
    private javax.swing.JTextField order_date_val;
    private javax.swing.JButton place_order_button;
    private javax.swing.JTextField prescription_id_val;
    private javax.swing.JLabel presctiption_id;
    private javax.swing.JButton refresh;
    private javax.swing.JLabel title;
    private javax.swing.JLabel total_cost;
    private javax.swing.JTextField total_cost_val;
    private javax.swing.JLabel transaction_id;
    private javax.swing.JTextField transaction_id_val;
    // End of variables declaration//GEN-END:variables
}
