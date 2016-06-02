/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Promo;
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
    
    public void setStartDate(Date newValue) {
        startDate = newValue;
    }
    
    public void setEndDate(Date newValue) {
        endDate = newValue;
    }
}
