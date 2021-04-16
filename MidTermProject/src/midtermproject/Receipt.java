/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermproject;

import java.sql.Timestamp;

/**
 *
 * @author DELL
 */
public class Receipt extends Request {
    
   public void setstatus(String status)
   {
       if(status.equals("Not Returned") || status.equals("Returned"))
       this.setstatus(status);
   }
    
}
