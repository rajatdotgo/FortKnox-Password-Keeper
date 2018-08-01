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
public class Utility 
{
    
    private final static String digits = "0123456789abcdef";
	
    /**
    * Return length many bytes of the passed in byte array as a hex string
    *
    *@param data the bytes to be converted.
    *@param length the number of bytes in the data block to be converted.
    *@return a hex representation of length bytes of data.
    */
	
    public static String toHex(byte[]data, int length)
    {
        StringBuffer buf = new StringBuffer();
        for(int i = 0; i!= length; i++)
	{
            //int a = data[i];
            //System.out.println(a);
            int v = data[i] & 0xff;
            buf.append(digits.charAt(v>>4));
            buf.append(digits.charAt(v & 0xf));
	}
		
	return buf.toString();
    }
	
    /**
    * Return the passed in byte array as a hex string
    * 
    * @param data the bytes to be converted.
    * @return a hex representation of data.
    */
    
    public static  String toHex(byte[] data) 
    {
        return toHex(data, data.length);
    }
	
    /**
     *  This function returns true if  the length of first parameter 
     * is less than or equal to second. Otherwise, false.
     * 
     * @param first
     * @param second
     * @return 
     */
    
    public static boolean minLen(String first, String second)
    {
        if(first.length() <= second.length() )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
