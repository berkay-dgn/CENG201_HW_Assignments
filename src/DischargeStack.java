import java.text.SimpleDateFormat;
import java.util.Date;
public class DischargeStack {
    private class Node{
        DischargeRecord data;
        Node link;
    }
    Node top;
    DischargeStack(){this.top=null;}
    public void push(DischargeRecord record){
        Node temp=new Node();
        temp.data=record;
        temp.link=top;
        top=temp;
        // ı add new node in head because it is more fruitful way  for big o
    }
    public DischargeRecord peek(){
        Node temp=top;
        return temp.data;
    }
    public DischargeRecord pop(){
     if(top==null){
         System.out.println("this stack is empty");
         return null;
     }
     DischargeRecord x=top.data;
     top=top.link;
     return x;
    }
    public void Printstack(){
        Node temp=top;
        if(top==null){
            System.out.println("this stack is empty ");
        }
        while(temp!=null){
            int id = temp.data.getPatientId();
            String time = temp.data.getFormattedTime();
            System.out.println("Patient ID: " + id + " | Discharge Time: " + time);
            temp=temp.link;

        }
    }
}
