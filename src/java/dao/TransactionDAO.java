package dao;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TransactionDAO 
{
   Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public double getBalance(String accountNo) 
    {
        double balance = 0;
        try 
        {
            con = DBConnection.getConnection();
            String sql = "SELECT balance FROM customers WHERE account_no=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, accountNo);
            rs = ps.executeQuery();

            if (rs.next()) 
            {
                balance = rs.getDouble("balance");
            }

        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
        return balance;
    }

    public boolean deposit(String accountNo, double amount) 
    {
        boolean status = false;

        try 
        {
            double balance = getBalance(accountNo);
            balance += amount;
            con = DBConnection.getConnection();
            String sql = "UPDATE customers SET balance=? WHERE account_no=?";
            ps = con.prepareStatement(sql);
            ps.setDouble(1, balance);
            ps.setString(2, accountNo);

            int i = ps.executeUpdate();

            if (i > 0) 
            {
                String history = "INSERT INTO transactions(account_no,transaction_type,amount,balance_after) VALUES(?,?,?,?)";
                ps = con.prepareStatement(history);
                ps.setString(1, accountNo);
                ps.setString(2, "Deposit");
                ps.setDouble(3, amount);
                ps.setDouble(4, balance);

                ps.executeUpdate();

                status = true;

            }

        }
        catch (Exception e) 
        {

           System.out.println(e);

        }

        return status;

    }
    public boolean withdraw(String accountNo, double amount)
    {
       boolean status = false;
        try 
        {
            double balance = getBalance(accountNo);
            if (amount > balance)
            {
                return false;
            }

            balance -= amount;
            con = DBConnection.getConnection();
            String sql = "UPDATE customers SET balance=? WHERE account_no=?";
            ps = con.prepareStatement(sql);
            ps.setDouble(1, balance);
            ps.setString(2, accountNo);
            int i = ps.executeUpdate();

            if (i > 0)
            {
                String history = "INSERT INTO transactions(account_no,transaction_type,amount,balance_after) VALUES(?,?,?,?)";
                ps = con.prepareStatement(history);
                ps.setString(1, accountNo);
                ps.setString(2, "Withdraw");
                ps.setDouble(3, amount);
                ps.setDouble(4, balance);

                ps.executeUpdate();
                status = true;
            }
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
        return status;
    }
    
    public boolean accountExists(String accountNo)
    {

    boolean status=false;

    try{

        con=DBConnection.getConnection();

        String sql="SELECT * FROM customers WHERE account_no=?";

        ps=con.prepareStatement(sql);

        ps.setString(1,accountNo);

        rs=ps.executeQuery();

        if(rs.next()){
            status=true;
        }

    }catch(Exception e){
        e.printStackTrace();
    }

    return status;
  }
    
  public boolean transfer(String sender,String receiver,double amount)
  {

    boolean status=false;

    Connection con=null;

    try
    {

        con=DBConnection.getConnection();

        con.setAutoCommit(false);

        double senderBalance=getBalance(sender);

        if(senderBalance<amount){

            return false;

        }

        double receiverBalance=getBalance(receiver);

        senderBalance-=amount;
        receiverBalance+=amount;

        String sql1="UPDATE customers SET balance=? WHERE account_no=?";
        PreparedStatement ps1=con.prepareStatement(sql1);

        ps1.setDouble(1,senderBalance);
        ps1.setString(2,sender);

        ps1.executeUpdate();

        String sql2="UPDATE customers SET balance=? WHERE account_no=?";
        PreparedStatement ps2=con.prepareStatement(sql2);

        ps2.setDouble(1,receiverBalance);
        ps2.setString(2,receiver);

        ps2.executeUpdate();

        String history="INSERT INTO transactions(account_no,transaction_type,amount,balance_after) VALUES(?,?,?,?)";

        PreparedStatement ps3=con.prepareStatement(history);

        ps3.setString(1,sender);
        ps3.setString(2,"Transfer");
        ps3.setDouble(3,amount);
        ps3.setDouble(4,senderBalance);

        ps3.executeUpdate();

        PreparedStatement ps4=con.prepareStatement(history);

        ps4.setString(1,receiver);
        ps4.setString(2,"Received");
        ps4.setDouble(3,amount);
        ps4.setDouble(4,receiverBalance);

        ps4.executeUpdate();

        con.commit();

        status=true;

    }catch(Exception e){

        try{
            if(con!=null)
                con.rollback();
        }catch(Exception ex){}

        e.printStackTrace();

    }

    return status;

}  
    
//  public ResultSet getTransactions(String accountNo){
//
//    try{
//
//        con = DBConnection.getConnection();
//
//        String sql = "SELECT * FROM transactions WHERE account_no=? ORDER BY transaction_date DESC";
//
//        ps = con.prepareStatement(sql);
//
//        ps.setString(1, accountNo);
//
//        rs = ps.executeQuery();
//
//    }catch(Exception e){
//
//        e.printStackTrace();
//
//    }
//
//    return rs;
//
//}
  public ResultSet getTransactions(String accountNo)
  {

    try{

        con=DBConnection.getConnection();

        String sql="SELECT * FROM transactions WHERE account_no=? ORDER BY transaction_date DESC";

        ps=con.prepareStatement(sql);

        ps.setString(1,accountNo);

        rs=ps.executeQuery();

    }catch(Exception e){

        e.printStackTrace();

    }

    return rs;

}
    
    
    
    
    
    
    
    
    
    
}
