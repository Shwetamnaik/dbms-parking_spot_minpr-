
package dbmsproject1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JTable;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
public class Queries extends javax.swing.JFrame {
    public Queries() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setText("Number of Cars Parked");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Amount for Cars Parked");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Number of Cars and Amount");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Parking Lot");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Profits");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Daily TurnOver");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Purchase Amount");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton8.setText("BACK");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Query 1................................................................................
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       Connection con = null;
        Statement DataReq;
        ResultSet Res;
        
        try {
            con=DriverManager.getConnection(URL, USER,PASSWD);
            
            if(con!=null)
                System.out.println("Connected");
           
            String query = "SELECT COUNT(*) CountCars FROM Payment WHERE Date LIKE '2016%'";
            DataReq = con.createStatement();
            Res = DataReq.executeQuery(query);
            
            boolean rec = Res.next();
            
            String t ;
                                 
                      t=Res.getString("CountCars");
                
                    String Columns[] = {"CountCars"};
               
                    Object data[][]= {{t}};
                    
                                    
                   JTable jtab = new JTable(data,Columns);
                   JFrame jfrm = new JFrame("Cars information");
                   
                   jfrm.add(jtab);
                    JScrollPane jsp=new JScrollPane(jtab);
        jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jfrm.add(jsp); 
                  jfrm.setVisible(true);
                   jfrm.setSize(400,400);
                  
                   DataReq.close();
            }
           
         catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try{
            if(con!=null)
                    con.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }         
        
    }//GEN-LAST:event_jButton1ActionPerformed
//Query2...........................................................................
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Connection con = null;
        Statement DataReq;
        ResultSet Res;
        
        try {
            con=DriverManager.getConnection(URL, USER,PASSWD);
            
            if(con!=null)
                System.out.println("Connected");
           
            String query = "SELECT SUM(Amount)  Total_Amount  FROM Payment  WHERE Date LIKE '2013-01-%'";
            DataReq = con.createStatement();
            Res = DataReq.executeQuery(query);
            
            boolean rec = Res.next();
            
            String t ;
          
            int i=0;
               
                       t=Res.getString("Total_Amount");
                                   
                    String Columns[] = {"Total_Amount"};
               
                    Object data[][] = {{t}};
                                                        
                   JTable jtab = new JTable(data,Columns);
                   JFrame jfrm = new JFrame("Amount Jan-2013");
                 
                                   
                   jfrm.add(jtab);
                    JScrollPane jsp=new JScrollPane(jtab);
        jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jfrm.add(jsp); 
                  jfrm.setVisible(true);
                   jfrm.setSize(400,400);
                 
                  DataReq.close();
            }
           
         catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try{
            if(con!=null)
                    con.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed
//Query 3.....................................................................................
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Connection con = null;
        Statement DataReq;
        ResultSet Res;
        
        try {
            con=DriverManager.getConnection(URL, USER,PASSWD);
            
            if(con!=null)
                System.out.println("Connected");
           
            String query = "SELECT COUNT(*)  No_of_Cars, SUM(Amount)  Amount FROM Vehicle v,Payment p, Owner o  WHERE v.Vehicle_No ='KA25G1234' AND p.Date> '2013-11-10' AND o.Owner_Id=p.Owner_Id AND o.Owner_Id = v.Owner_Id";
            DataReq = con.createStatement();
            Res = DataReq.executeQuery(query);
            
            boolean rec = Res.next();
            
            String[] t =new String[10];
            String[] a =new String [10];
            
            int i=0;
            if(rec)
            {
                do{
                             
                       t[i]=Res.getString("No_of_Cars");
                       a[i] = Res.getString("Amount"); 
                       i++;
                   }while(Res.next());
            }
                      
                    String Columns[] = {"No_Of_Cars","Amount"};
               
                    Object data[][] = {{t[0],a[0]}};
                    
                                    
                   JTable jtab = new JTable(data,Columns);
                   JFrame jfrm = new JFrame("Car-Amount Info");
                   
                   jfrm.add(jtab);
                   JScrollPane jsp=new JScrollPane(jtab);
        jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jfrm.add(jsp); 
                  jfrm.setVisible(true);
                   jfrm.setSize(400,400);
                  
                  DataReq.close();
            }
           
         catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try{
            if(con!=null)
                    con.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed
//Query 4.......................................................................................
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Connection con = null;
        Statement DataReq;
        ResultSet Res;
        
        try {
            con=DriverManager.getConnection(URL, USER,PASSWD);
            
            if(con!=null)
                System.out.println("Connected");
           
            String query = "SELECT COUNT(Spot_Id) No_of_ParkingLot FROM Parking_spot  WHERE Vehicle__No = 'KA25G1234' AND Vehicle__No !='KA24H5678'";
            DataReq = con.createStatement();
            Res = DataReq.executeQuery(query);
            
            boolean rec = Res.next();
            
            String t;
             t=Res.getString("No_of_ParkingLot");
                                   
                    String Columns[] = {"No_Of_ParkingLot"};
               
                    Object data[][] = {{t}};
                                                        
                   JTable jtab = new JTable(data,Columns);
                   JFrame jfrm = new JFrame("Parking Lot");
                   
                   jfrm.add(jtab);
                    JScrollPane jsp=new JScrollPane(jtab);
        jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jfrm.add(jsp);
                  jfrm.setVisible(true);
                   jfrm.setSize(400,400);
                  
                  DataReq.close();
            }
           
         catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try{
            if(con!=null)
                    con.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed
//Query 5............................................................................................
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         Connection con = null;
        Statement DataReq;
        ResultSet Res;
        
        try {
            con=DriverManager.getConnection(URL, USER,PASSWD);
            
            if(con!=null)
                System.out.println("Connected");
           
            String query = "SELECT SUM(p.Amount-20) PROFIT FROM Payment p  WHERE Date LIKE '2012%'";
            DataReq = con.createStatement();
            Res = DataReq.executeQuery(query);
            
            boolean rec = Res.next();
            
            String t =Res.getString("PROFIT");
                                  
                    String Columns[] = {"PROFIT"};
               
                    Object data[][] = {{t}};
                    
                                    
                   JTable jtab = new JTable(data,Columns);
                   JFrame jfrm = new JFrame("PROFIT");
                
                   jfrm.add(jtab);
                   JScrollPane jsp=new JScrollPane(jtab);
        jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jfrm.add(jsp); 
                  jfrm.setVisible(true);
                   jfrm.setSize(400,400);
                
                   DataReq.close();
            }
           
         catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try{
            if(con!=null)
                    con.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed
//Query 6.....................................................................................
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Connection con = null;
        Statement DataReq;
        ResultSet Res;
        
        try {
            con=DriverManager.getConnection(URL, USER,PASSWD);
            
            if(con!=null)
                System.out.println("Connected");
           
            String query = "SELECT v.Vehicle_No Vehicle,p.Amount-20 Turn_Over,p.Date FROM Vehicle v,Payment p,Owner o  WHERE v.Owner_id=p.Owner_Id GROUP BY p.Date,v.Vehicle_No,p.Amount";
            DataReq = con.createStatement();
            Res = DataReq.executeQuery(query);
            
            boolean rec = Res.next();
            
            String[] t =new String[10];
            String[] b = new String[10];
            String[] c = new String[10];
            int i=0;
            if(rec)
            {
                do{
                             
                       t[i]=Res.getString("Turn_Over");
                       b[i]=Res.getString("Vehicle");
                       c[i]=Res.getDate("Date").toString();
                        i++;
                   }while(Res.next());
            }
                      
                    String Columns[] = {"Vehicle","Turn_Over","Date"};
               
                    Object data[][] = {
                         {b[0],t[0],c[0]},
                       {b[1],t[1],c[1]},
                       {b[2],t[2],c[2]},
                       {b[3],t[3],c[3]},
                       {b[4],t[4],c[4]},
                       {b[5],t[5],c[5]},
                       {b[6],t[6],c[6]},
                       {b[7],t[7],c[7]},
                       {b[8],t[8],c[8]}
                                        
                    };
                    
                                    
                   JTable jtab = new JTable(data,Columns);
                   JFrame jfrm = new JFrame("Turn Over");
                
                   jfrm.add(jtab);
                    JScrollPane jsp=new JScrollPane(jtab);
        jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jfrm.add(jsp);
                  jfrm.setVisible(true);
                   jfrm.setSize(400,400);
                  
                   DataReq.close();
            }
           
         catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try{
            if(con!=null)
                    con.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed
//Query 7.............................................................................
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         Connection con = null;
        Statement DataReq;
        ResultSet Res;
        
        try {
            con=DriverManager.getConnection(URL, USER,PASSWD);
            
            if(con!=null)
                System.out.println("Connected");
           
            String query = "SELECT Amount PURCHASE_AMOUNT  FROM Payment  WHERE Date BETWEEN '2019-10-12' AND '2019-12-12'  ";
            DataReq = con.createStatement();
            Res = DataReq.executeQuery(query);
            
            boolean rec = Res.next();
            
            String t = Res.getString("PURCHASE_AMOUNT");
             
                    String Columns[] = {"PURCHASE_AMOUNT"};
               
                    Object data[][] = {{t}};
                    
                   JTable jtab = new JTable(data,Columns);
                   JFrame jfrm = new JFrame("PURCHASE AMOUNT");
            
                   jfrm.add(jtab);
                  JScrollPane jsp=new JScrollPane(jtab);
        jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jfrm.add(jsp);  
                  jfrm.setVisible(true);
                   jfrm.setSize(400,400);
              
                   DataReq.close();
            }
           
         catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try{
            if(con!=null)
                    con.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        First f=new First();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    static private String USER = "root";
    static private String PASSWD = "";
    static private String URL = "jdbc:mysql://localhost/Parking";
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
            java.util.logging.Logger.getLogger(Queries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Queries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Queries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Queries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Queries().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
