/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermproject;

/**
 *
 * @author DELL
 */
public class Employee {
   private String name;
   private String email;
   private String cellNumber;
   private Request req;
   private Receipt rec;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public void setReq(Request req) {
        this.req = req;
    }

    public void setRec(Receipt rec) {
        this.rec = rec;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public Request getReq() {
        return req;
    }

    public Receipt getRec() {
        return rec;
    }
    
}
