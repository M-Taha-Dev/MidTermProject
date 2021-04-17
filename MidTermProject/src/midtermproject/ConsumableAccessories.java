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
public class ConsumableAccessories {
    private String Type;
    private String status;
    private Timestamp Time;
    private String companyName;
    private String tag;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public ConsumableAccessories()
    {
        this.status = "Unoccupied";
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public String getType() {
        return Type;
    }

    public String getStatus() {
        return status;
    }

    public Timestamp getTime() {
        return Time;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTime(Timestamp Time) {
        this.Time = Time;
    }
    
}
