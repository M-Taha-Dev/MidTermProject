/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermproject;

import java.security.Timestamp;

/**
 *
 * @author DELL
 */
public class NonConsumableAccessories {
    private String companyName;
    private String model;
    private String type;
    private String yearOfManufacture;
    private String status;
    private Timestamp Time;

    public String getCompanyName() {
        return companyName;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getStatus() {
        return status;
    }

    public Timestamp getTime() {
        return Time;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTime(Timestamp Time) {
        this.Time = Time;
    }
    
}
