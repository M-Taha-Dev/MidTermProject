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
    }

    public static Manager getInstance() {
        if (instance == null) {
            instance = new Manager();
        }
        return instance;
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
            return false;
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

    public boolean editConsumableAccessories(ConsumableAccessories obj, int index) {
        if (obj != null && index != -1) {
            cList.set(index, obj);
            return true;
        } else {
            return false;
        }
    }

    public boolean editNonConsumableAccessories(NonConsumableAccessories obj, int index) {
        if (obj != null && index != -1) {
            nList.set(index, obj);
            return true;
        } else {
            return false;
        }
    }
    public boolean deleteNonConsumableAccessories(int index)
    {
        if(index != -1)
        {
            nList.remove(index);
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean deleteConsumableAccessories(int index)
    {
        if(index!= -1)
        {
            cList.remove(index);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public List<Receipt> getEmployeeReceipt(String email)
    {
        List<Receipt>strList = new ArrayList<>();
        for (int i=0;i<recList.size();i++)
        {
            if(recList.get(i).email.equals(email))
            {
                strList.add(recList.get(i));
            }
        }
        return strList;
    }
    List <Request>viewAllRequest()
    {
        List<Request>strList = new ArrayList<>();
        strList = reqList;
        return strList;
    }
    public void acceptAllRequest()
    {
        for(int i=0;i<reqList.size();i++)
        {
            reqList.get(i).setStatus("Accepted");
        }
    }
    public void rejectAllRequest()
    {
        for(int i=0;i<reqList.size();i++)
        {
            reqList.get(i).setStatus("Rejected");
        }
        
    }
   /* public List<NonConsumableAccessories> alertNonConsumable()
    {
        
    }
    public List<ConsumableAccessories> alertConsumable()
    {
        
    }*/
}
