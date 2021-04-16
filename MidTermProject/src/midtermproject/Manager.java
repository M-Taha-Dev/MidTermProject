/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermproject;

import java.util.*;

/**
 *
 * @author DELL
 */
public class Manager extends Accessories {

    List<Receipt> recList = new ArrayList<>();
    List<Request> reqList = new ArrayList<>();
    private static Manager instance;

    private Manager() {
        recList = new ArrayList<>();
        reqList = new ArrayList<>();
        nList = new ArrayList<>();
        cList = new ArrayList<>();
        NonConsumableAccessories obj = new NonConsumableAccessories();
        obj.setCompanyName("HP");
        obj.setModel("Spectre");
        obj.setType("Laptop");
        obj.setYearOfManufacture("2020");
        nList.add(obj);
        ConsumableAccessories obj1 = new ConsumableAccessories();
        obj1.setCompanyName("Dollar");
        obj1.setType("Pencil");
        obj1.setTag("ABC-123");
        cList.add(obj1);
    }

    public static Manager getInstance() {
        if (instance == null) {
            instance = new Manager();
        }
        return instance;
    }

    public boolean fetchRequests(Request obj) {
        boolean check = false;

        reqList.add(obj);
        check = true;

        return check;
    }

    public boolean acceptRequest(Request obj) {

        if (obj != null) {
            obj.setStatus("Accepted");
            return true;
        } else {
            return false;
        }
    }

    public boolean rejectRequest(Request obj) {
        if (obj != null) {
            obj.setStatus("Rejected");
            return true;
        } else {
            return false;
        }
    }

    public boolean addNonConsumableAccessories(NonConsumableAccessories obj) {
        if (obj != null) {
            nList.add(obj);
            return true;
        } else {
            return false;
        }
    }

    public boolean addConsumableAccessories(ConsumableAccessories obj) {
        if (obj != null) {
            cList.add(obj);
            return true;
        } else {
            return false;
        }
    }

    /* public boolean editConsumableAccessories(ConsumableAccessories obj) {
        boolean check = false;
        for(int i=0;i<nList.size();i++)
        {
            if(nList.get(i).getModel().equals(obj.get))
        }
    }*/
    public boolean editNonConsumableAccessories(NonConsumableAccessories obj, String model) {
        boolean check = false;
        for (int i = 0; i < nList.size(); i++) {
            if (nList.get(i).getModel().equals(model)) {
                nList.set(i, obj);
                check = true;
                break;
            }
        }
        return check;
    }

    public boolean editConsumableAccessories(ConsumableAccessories obj, String tag) {
        boolean check = false;
        for (int i = 0; i < cList.size(); i++) {
            if (cList.get(i).getTag().equals(tag)) {
                cList.set(i, obj);
                check = true;
                break;
            }
        }
        return check;
    }

    public boolean deleteNonConsumableAccessories(String model) {
        boolean check = false;
        for (int i = 0; i < nList.size(); i++) {
            if (nList.get(i).getModel().equals(model)) {
                nList.remove(i);
                check = true;
                break;
            }
        }
        return check;
    }

    public boolean deleteConsumableAccessories(String model) {
        boolean check = false;
        for (int i = 0; i < cList.size(); i++) {
            if (cList.get(i).getTag().equals(model)) {
                cList.remove(i);
                check = true;
                break;
            }
        }
        return check;
    }

    public List<Receipt> getEmployeeReceipt(String email) {
        List<Receipt> strList = new ArrayList<>();
        for (int i = 0; i < recList.size(); i++) {
            if (recList.get(i).email.equals(email)) {
                strList.add(recList.get(i));
            }
        }
        return strList;
    }

    List<Request> viewAllRequest() {
        List<Request> strList = new ArrayList<>();
        strList = reqList;
        return strList;
    }

    public void acceptAllRequest() {
        for (int i = 0; i < reqList.size(); i++) {
            reqList.get(i).setStatus("Accepted");
        }
    }

    public void rejectAllRequest() {
        for (int i = 0; i < reqList.size(); i++) {
            reqList.get(i).setStatus("Rejected");
        }

    }

    /* public List<NonConsumableAccessories> alertNonConsumable()
    {
        
    }
    public List<ConsumableAccessories> alertConsumable()
    {
        
    }*/
    List<NonConsumableAccessories> viewByCategoryN(String type) {
        List<NonConsumableAccessories> strList = new ArrayList<>();
        for (int i = 0; i < nList.size(); i++) {
            if (nList.get(i).getType().equals(type)) {
                strList.add(nList.get(i));
            }
        }
        return strList;

    }

    List<NonConsumableAccessories> searchItemsModelN(String model) {
        List<NonConsumableAccessories> strList = new ArrayList<>();
        for (int i = 0; i < nList.size(); i++) {
            if (nList.get(i).getModel().equals(model)) {
                strList.add(nList.get(i));
            }
        }
        return strList;
    }

    List<ConsumableAccessories> viewByCategoryC(String type) {
        List<ConsumableAccessories> strList = new ArrayList<>();
        for (int i = 0; i < cList.size(); i++) {
            if (cList.get(i).getType().equals(type)) {
                strList.add(cList.get(i));
            }
        }
        return strList;
    }

    List<ConsumableAccessories> searchItemsModelC(String name) {
        List<ConsumableAccessories> strList = new ArrayList<>();
        for (int i = 0; i < cList.size(); i++) {
            if (cList.get(i).getCompanyName().equals(name)) {
                strList.add(cList.get(i));
            }
        }
        return strList;
    }

    NonConsumableAccessories getDataN(String model) {
        NonConsumableAccessories obj = new NonConsumableAccessories();
        for (int i = 0; i < nList.size(); i++) {
            if (nList.get(i).getModel().equals(model)) {
                obj = nList.get(i);
            }
        }
        return obj;
    }

    ConsumableAccessories getDataC(String tag) {
        ConsumableAccessories obj = new ConsumableAccessories();
        for (int i = 0; i < cList.size(); i++) {
            if (cList.get(i).getTag().equals(tag)) {
                obj = cList.get(i);
            }
        }
        return obj;
    }

    boolean checkID(String ID) {
        boolean check = true;
        for (int i = 0; i < reqList.size(); i++) {
            if (reqList.get(i).getReqID().equals(ID)) {
                check = false;
                break;
            }
        }
        return check;
    }

    Request searchReqID(String ID) {
        Request obj = new Request();

        for (int i = 0; i < reqList.size(); i++) {
            if (reqList.get(i).getReqID().equals(ID)) {
                obj = reqList.get(i);
            }
        }
        return obj;
    }

    Receipt createReceipt(String ID) {
        Receipt obj = (Receipt) new Request();

        for (int i = 0; i < reqList.size(); i++) {
            if (reqList.get(i).getReqID().equals(ID)) {
                obj = (Receipt) reqList.get(i);
            }
        }
        return obj;
    }

    boolean addReceipt(Receipt obj) {
        if (obj != null) {
            recList.add(obj);
            return true;
        }
        return false;
    }

    List<Receipt> getEmployeeReceiptShow(String email) {
        List<Receipt> strList = new ArrayList<>();
        for (int i = 0; i < recList.size(); i++) {
            if (recList.get(i).getEmail().equals(email)) {
                strList.add(recList.get(i));
            }
        }
        return strList;
    }
}
