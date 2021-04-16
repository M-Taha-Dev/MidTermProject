/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermproject;

import java.sql.Timestamp;
import java.util.*;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Request {

    String email;
    protected List<NonConsumableAccessories> nList = new ArrayList<>();
    protected List<ConsumableAccessories> cList = new ArrayList<>();
    protected Timestamp timeq;
    private String rqStatus;
    private String reqID;

    public String getEmail() {
        return email;
    }

    public void setReqID(String reqID) {
        this.reqID = reqID;
    }

    public String getReqID() {
        return reqID;
    }

    public Timestamp getTimeq() {
        return timeq;
    }

    public String getRqStatus() {
        return rqStatus;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTimeq() {
        Date dt = new Date();
        this.timeq = new Timestamp(dt.getTime());
    }

    public void setRqStatus(String rqStatus) {
        this.rqStatus = rqStatus;
    }

    public Request() {
        this.rqStatus = "Sent";
    }

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

    boolean addItemConsumable(ConsumableAccessories obj) {
        boolean check = false;
        if (obj != null) {
            cList.add(obj);
            check = true;
        }
        return check;
    }

    boolean addItemNonConsumable(NonConsumableAccessories obj) {
        boolean check = false;
        if (obj != null) {
            nList.add(obj);
            check = true;
        }
        return check;
    }

    boolean deleteItemConsumable(ConsumableAccessories obj, String Type) {
        boolean check = false;
        for (int i = 0; i < cList.size(); i++) {
            if (cList.get(i).getType().equals(Type)) {
                cList.remove(i);
                check = true;
                break;
            }
        }
        return check;
    }

    boolean deleteItemNonConsumable(String Model) {
        boolean check = false;
        for (int i = 0; i < nList.size(); i++) {
            if (nList.get(i).getModel().equals(Model)) {
                nList.remove(i);
                check = true;
                break;
            }
        }
        return check;
    }

    void deleteAllItems() {
        nList = new ArrayList<>();
        cList = new ArrayList<>();
    }

    public void generateID() {
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
        this.reqID = var;
    }
}
