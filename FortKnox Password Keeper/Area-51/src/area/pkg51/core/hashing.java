/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.pkg51.core;

/**
 *
 * @author SilverPanda
 */
public class hashing 
{
    /**
     * This function creates hash from two strings.
     * @param first  first string
     * @param second second string
     * @return 
     */
    public static String createHashOfTwoString(String first, String second)
    {   
        
        String hash1 = hashing.hashIt(first);
        String hash2 = hashing.hashIt(second);
        
        String combHash = "";
         for(int i = 0; i< hash1.length() ;i++)
          {
              if( i %2 == 0)
              {
              combHash  += hash1.charAt(i);
               }
              else
              {
              combHash  += hash2.charAt(i);
              }
          }
         
        String hash = hashing.hashIt(combHash);
        
        return hash; 
    }
    
    
    
    /**
     * This function generates a hash for the input inputString
     * and return it.
     * 
     * @param inputString
     * @return String
     */
    public static String hashIt(String inputString)
    {
        return BCrypt.hashpw(inputString, BCrypt.gensalt());        
    }
    
    /**
     * This function compares the hash of the inputString with the hash
     * and return true or false value depending whether they are equal or not.
     * 
     * @param inputString
     * @param hash
     * @return boolean
     */
    
    public static boolean checkHash (String inputString, String hash)
    {
        return BCrypt.checkpw(inputString, hash);
    } 
    
    
       
    
    
}
