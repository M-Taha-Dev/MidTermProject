/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Timestamp;
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
        //nList.add(obj);
        ConsumableAccessories obj1 = new ConsumableAccessories();
        obj1.setCompanyName("Dollar");
        obj1.setType("Pencil");
        obj1.setTag("ABC-123");
       // cList.add(obj1);
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

    /*Receipt createReceipt(String ID) {
        Receipt obj1 = (Receipt) new Request();

        for (int i = 0; i < reqList.size(); i++) {
            if (reqList.get(i).getReqID().equals(ID)) {
                obj1 = (Receipt) reqList.get(i);
            }
        }
        return obj1;
    }*/
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

    public Receipt createEmployeeReceipt(String ID) {

        Request obj =  new Request();
        for (int i = 0; i < reqList.size(); i++) {
            if (reqList.get(i).getReqID().equals(ID)) {
                obj = reqList.get(i);
            }
        }
        
        Receipt rec = new Receipt();
        rec.setEmail(obj.getEmail());
        rec.setReqID(obj.getReqID());
        rec.setTimeq();
        rec.setcList(obj.cList);
        rec.setnList(obj.nList);
        return rec;
    }
       Receipt searchRecID(String ID) {
        Receipt obj = new Receipt();
        for (int i = 0; i < recList.size(); i++) {
            if (recList.get(i).getReqID().equals(ID)) {
                obj = recList.get(i);
            }
        }
        return obj;
    }
       String returnEmail(String id)
       {
           String email = "";
           for(int i=0;i<recList.size();i++)
           {
               if(recList.get(i).getReqID().equals(id))
               {
                   email = recList.get(i).getEmail();
               }
           }
           return email;
       }
    void saveAccessories()
    {
        try 
        {
        FileWriter fw = new FileWriter("AccessoryRecord.txt");
        String out = "";
        for(int i=0;i<nList.size();i++)
        {
            out = out + "Non Consumable" + ",";
            out = out + nList.get(i).getType() + ",";
            out = out + nList.get(i).getCompanyName() + ",";
            out = out + nList.get(i).getModel() + ",";
            out = out + nList.get(i).getYearOfManufacture() + "\n";
        }
        for(int i=0;i<cList.size();i++)
        {
            out = out + "Consumable" + ",";
            out = out + cList.get(i).getType() + ",";
            out = out + cList.get(i).getCompanyName() + ",";
            out = out + cList.get(i).getTag() + ",";
            out = out + cList.get(i).getTime() + "\n";
        }
        fw.write(out);
        fw.flush();
        fw.close();
        }
        catch (Exception ex)
        {
            
        }
    }
    void readAccessories()
    {
        try
        {
        FileReader fr = new FileReader ("AccessoryRecord.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line != null)
        {
            String arr[] = line.split(",");
            if(arr[0].equals("Non Consumable"))
            {
                NonConsumableAccessories obj = new NonConsumableAccessories();
                obj.setType(arr[1]);
                obj.setCompanyName(arr[2]);
                obj.setModel(arr[3]);
                obj.setYearOfManufacture(arr[4]);
                nList.add(obj);
            }
            else if(arr[0].equals("Consumable"))
            {
                ConsumableAccessories obj = new ConsumableAccessories();
                obj.setType(arr[1]);
                obj.setCompanyName(arr[2]);
                obj.setTag(arr[3]);
                cList.add(obj);
                //obj.setTime(Timestamp.valueOf(arr[4]));
            }
            line = br.readLine();
        }
        br.close();
        fr.close();
        }
        catch(Exception ex)
        {
            
        }
        
    }
    
    
    
    boolean checkTag(String tag)
    {
        boolean check = true;
        for(int i=0;i<cList.size();i++)
        {
            if(cList.get(i).getTag().equals(tag))
            {
                check = false;
                break;
            }
        }
        return check;
    }
    
    
    
    
    
     public String generateTag() {
        char arr[] = new char[8];
        boolean flag = false;
        String var = "";
        while(flag == false)
        {
        arr[0] = (char) (new Random().nextInt(90 - 65 + 1) + 65);
        arr[1] = (char) (new Random().nextInt(90 - 65 + 1) + 65);
        arr[2] = (char) (new Random().nextInt(90 - 65 + 1) + 65);
        arr[3] = '-';
        arr[4] = (char) (new Random().nextInt(57 - 48 + 1) + 48);
        arr[5] = (char) (new Random().nextInt(57 - 48 + 1) + 48);
        arr[6] = (char) (new Random().nextInt(57 - 48 + 1) + 48);
        arr[7] = (char) (new Random().nextInt(57 - 48 + 1) + 48);
        var = String.valueOf(arr);
        flag = Manager.getInstance().checkID(var);
        }
        return var;
    }
    
}
