/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.pkg51.core;

import area.pkg51.UI.mainMenu;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.transform.Result;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author SilverPanda
 */
public class Wifi {
    private String SSID;
    private byte[] password;
    private String comment;
    private String hash;
    private final String tableName = "wifitable";
    private final String primarykey = "SSID";
    
    
    Wifi()
    {     
      /* This constructor will be called then user wants to decrypt their password
         getDataFromDataBase() will be called and load the data members with this
         Then call decryptPass() member method                 
      */    
      
      /*
        After IMPLEMENTING call getDataFromDataBase() function here.
        */
      
         
       
       
    }
  
    public Wifi(String wifiName, String pass,String comment) throws Exception
    {
        this.SSID  = wifiName;
        this.comment = comment; 
        /* 
            When user clicks on Update Button a function called 
                getDatafromDataBase() which is implemented in another class is 
                called which fills the text fields of the dialog box with data 
                recieved.
            Then this constructor will be called
                Which then calls addMember function
                which loads the values from the text fields to the instance variables
            Delete the previous entry
            addDataToDataBase() function is called which loads the data from the
                instance variables to the Data Base.       
        
        */
        
        /* When user clicks on Add button, A dialog box appears
        and user fills that information, 
        when he clicks ok -
            Constructor is called
                Which then calls addMember function
                which loads the values from the text fields to the instance variables
            addDataToDataBase() function is called which loads the data from the
                instance variables to the Data Base.
                
         
      */
      addMember(SSID, comment, pass);
      
      /*
         AFTER IMPLEMENTING addDataToDataBase(), call this function below this.
      */
      addDataToDataBase();
     // Wifi.addDataToTable();  
    }
    
    public void addMember(String wifiName, String comment, String pass) throws Exception
    {
           
        this.hash = hashing.createHashOfTwoString(this.SSID,"QALK@#BH)(ZGUWTR%^*MN<NBVY");
        
        /* Remove "String hashMaster" after implemnting class which has functions
           to extract hash of Master from DataBase        
        */
        
        String hashMaster = "$2a$10$OXwR/Bu0DESq184nvwkwXuP4zfcofhEJFwY3aCHcto0ptn7gFeU2i";
        
        
        byte[] key = new byte[32];
        key =  Encryption.generateKey(hashMaster, this.hash);
                
        this.password = Encryption.encryptIt(key, pass);
        
    }
     
    
    public static String decryptPass(byte[] pass,String hash) throws Exception
    {
        
        
        /* Remove "String hashMaster" after implemnting class which has functions
           to extract hash of Master from DataBase        
        */
        
        String hashMaster = "$2a$10$OXwR/Bu0DESq184nvwkwXuP4zfcofhEJFwY3aCHcto0ptn7gFeU2i";
        
        
        byte[] key = new byte[32];
        key =  Encryption.generateKey(hashMaster, hash);
        
        String passWord = Encryption.decryptIt(key, pass);
        return passWord;
       
    }
    
    public void addDataToDataBase()throws Exception
    {
         
        
        Connection conn=null;
        Class.forName("com.mysql.jdbc.Driver");
        conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/area51","root","root");
           
        Result rs;
        PreparedStatement pst;
        String sql;
    
        
        sql=" insert into "+this.tableName+" ( SSID,Password,Hash, Comment)" + " values (?,?,?,?)";
        pst=conn.prepareStatement(sql);
        pst.setString(1,this.SSID);
        pst.setBytes(2, this.password);
        pst.setString(3,this.hash);
        pst.setString(4,this.comment);
        
        
        pst.execute();
      
         pst.close();

    } 
  
    
    
}
         

