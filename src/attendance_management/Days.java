
package attendance_management;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Days {
       Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
       double pr;
    double ab;
    double tot;
    double por;
   double present(String i){
               try{
            Class.forName("com.mysql.jdbc.Driver");
           con=(Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/attendancemanagement","root","");
           String sql="select *from attendance where Roll=? ";
           pst=(PreparedStatement) con.prepareStatement(sql);
           pst.setString(1, i);
           rs=pst.executeQuery();
           
      
          
            while(rs.next())
            {
                
                pr=Integer.parseInt(rs.getString("Present"));
               
            }
            
         
        }
        catch(Exception ex)
        {
              JOptionPane.showMessageDialog(null,ex);
        }
       return pr;
   }
   
   double absent(String i){
            try{
            Class.forName("com.mysql.jdbc.Driver");
          con=(Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/attendancemanagement","root","");
           String sql="select *from attendance where Roll=? ";
           pst=(PreparedStatement) con.prepareStatement(sql);
           pst.setString(1, i);
           rs=pst.executeQuery();
           
      
          
            while(rs.next())
            {
                
                ab=Integer.parseInt(rs.getString("Absent"));
               
            }
            
         
        }
        catch(Exception ex)
        {
              JOptionPane.showMessageDialog(null,ex);
        }
            
            return ab;
   }
   
 
   
   double pora(String i){
             try{
            Class.forName("com.mysql.jdbc.Driver");
          con=(Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/attendancemanagement","root","");
           String sql="select *from attendance where Roll=? ";
           pst=(PreparedStatement) con.prepareStatement(sql);
           pst.setString(1, i);
           rs=pst.executeQuery();
           
      
          
            while(rs.next())
            {
                
                por=Integer.parseInt(rs.getString("PORA"));
               
            }
            
         
        }
        catch(Exception ex)
        {
              JOptionPane.showMessageDialog(null,ex);
        }
       
       return por;
   }

   

   
   
  /*  public static void main(String[] args) {
          Days a=new Days();
         // for(int i=1;i<10;i++){
           // System.out.print(a.pora(i)+"  ");
               //  System.out.print(a.present(i)+ " ");     
                  //  System.out.println(a.absent(i));
         // }
      
    }
  */
}
