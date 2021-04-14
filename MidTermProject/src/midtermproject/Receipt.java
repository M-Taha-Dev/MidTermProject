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
    private Timestamp dateTime;
    private String receiptID;
    private String status;

    public Timestamp getDateTime() {
        return dateTime;
    }

    public String getReceiptID() {
        return receiptID;
    }

    @Override
    public String getStatus() {
        return status;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public void setReceiptID(String receiptID) {
        this.receiptID = receiptID;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }
    public void generateReceiptID()
    {
        
    }
    
}
