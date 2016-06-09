/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Promo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author adamstokes
 */
public class Promotion {
    public int itemKey;
    Date startDate = new Date( );
    Date endDate = new Date( );
    public String PromoTitle;
    
    
    
    public void setItemKey(int newValue) {
        itemKey = newValue;
    }
    
    public void setStartDate(String newValue) {
        String expectedPattern = "MM/dd/yyyy";
        SimpleDateFormat formatter = new SimpleDateFormat(expectedPattern); 
        
        try
        {
          Date newDate=formatter.parse(newValue);
          startDate = newDate;  
        }
        catch (ParseException e)
        {
         // execution will come here if the String that is given
         // does not match the expected format.
         e.printStackTrace();
        }
        
    }
    
    public void setEndDate(String newValue) {
        
        String expectedPattern = "MM/dd/yyyy";
        SimpleDateFormat formatter = new SimpleDateFormat(expectedPattern); 
        
        try
        {
          Date newDate=formatter.parse(newValue);
          endDate = newDate;  
        }
        catch (ParseException e)
        {
         // execution will come here if the String that is given
         // does not match the expected format.
         e.printStackTrace();
        }
    }
    public Date StartDate(){
        return startDate;
    }
    
    public Date EndDate(){
        return endDate;
    }
    
    public int itemKey(){
        return itemKey;
    }

    public void setEndDate(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
