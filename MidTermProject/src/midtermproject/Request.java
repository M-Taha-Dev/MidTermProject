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
public class Request {
    String email;
    private List<NonConsumableAccessories> nList = new ArrayList<>();
    private List<ConsumableAccessories> cList = new ArrayList<>();
    private String rqStatus;
    
    public List<NonConsumableAccessories> getnList() {
        return nList;
    }

    public List<ConsumableAccessories> getcList() {
        return cList;
    }

    public String getStatus() {
        return rqStatus;
    }
    
    public void setnList(List<NonConsumableAccessories> nList) {
        this.nList = nList;
    }

    public void setcList(List<ConsumableAccessories> cList) {
        this.cList = cList;
    }

    public void setStatus(String status) {
        this.rqStatus = status;
    }
    boolean addItemConsumable(ConsumableAccessories obj)
    {
        boolean check = false;
        if(obj != null)
        {
            cList.add(obj);
            check = true;
        }
        return check;
    }
    boolean addItemNonConsumable(NonConsumableAccessories obj)
    {
        boolean check = false;
         if(obj != null)
        {
            nList.add(obj);
            check = true;
        }
        return check;
    }
    boolean deleteItemConsumable(ConsumableAccessories obj,String Type)
    {
        boolean check = false;
        for (int i=0;i<cList.size();i++)
        {
            if (cList.get(i).getType().equals(Type))
            {
                cList.remove(i);
                check = true;
                break;
            }
        }
        return check;
    }
    
    boolean deleteItemNonConsumable(String Model)
    {
        boolean check = false;
        for (int i=0;i<nList.size();i++)
        {
            if(nList.get(i).getModel().equals(Model))
            {
                nList.remove(i);
                check = true;
                break;
            }
        }
        return check;
    }
    
    void deleteAllItems()
    {
        nList = new ArrayList<>();
        cList = new ArrayList<>();
    }
}
