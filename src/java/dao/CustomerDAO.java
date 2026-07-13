package dao;

import database.DBConnection;
import model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerDAO 
{
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public boolean registerCustomer(Customer customer) 
    {
        boolean status = false;
        try 
        {
            con = DBConnection.getConnection();
            String sql = "INSERT INTO customers(account_no,name,email,phone,address,password,account_type,balance) VALUES(?,?,?,?,?,?,?,?)";

            ps = con.prepareStatement(sql);

            ps.setString(1, customer.getAccountNo());
            ps.setString(2, customer.getName());
            ps.setString(3, customer.getEmail());
            ps.setString(4, customer.getPhone());
            ps.setString(5, customer.getAddress());
            ps.setString(6, customer.getPassword());
            ps.setString(7, customer.getAccountType());
            ps.setDouble(8, customer.getBalance());

            int i = ps.executeUpdate();

            if(i>0)
                status=true;
        } 
        catch(Exception e)
        {
           System.out.println(e);
        }
        return status;
    }

    public Customer login(String email,String password)
    {
        Customer customer=null;
        try
        {
           con=DBConnection.getConnection();

            String sql="SELECT * FROM customers WHERE email=? AND password=?";
            ps=con.prepareStatement(sql);
            ps.setString(1,email);
            ps.setString(2,password);
            rs=ps.executeQuery();
            if(rs.next())
            {
                customer=new Customer();

                customer.setId(rs.getInt("id"));
                customer.setAccountNo(rs.getString("account_no"));
                customer.setName(rs.getString("name"));
                customer.setEmail(rs.getString("email"));
                customer.setPhone(rs.getString("phone"));
                customer.setAddress(rs.getString("address"));
                customer.setPassword(rs.getString("password"));
                customer.setAccountType(rs.getString("account_type"));
                customer.setBalance(rs.getDouble("balance"));

            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return customer;
    }
}