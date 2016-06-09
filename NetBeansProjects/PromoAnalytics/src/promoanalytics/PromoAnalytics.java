/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promoanalytics;

import Promo.Promotion;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;



/**
 *
 * @author adamstokes
 */
public class PromoAnalytics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
       Promotion Promo = new Promotion();
       int[] itemArray = {1234,34,10};
      
       Promo.setItemKey(itemArray);
       Promo.setStartDate("03/14/2016");
       Promo.setEndDate("04/12/2016");
       
 

       
       // OUTPUT for Testing Class Methods
       System.out.println("The Items are: NEEDS TO BE FIXED");
       
       System.out.println("Start Date:" + Promo.StartDate());
       System.out.println("End Date:" + Promo.EndDate());

    }
    
}
