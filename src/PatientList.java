import java.util.HashMap;

public class PatientList {
    private class Node{
        private Patient data;
        private Node next;
        public Node(Patient data){
            this.data=data;
        }
        public Node(Patient data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    private Node head;
    private Node tail;
    public PatientList(){
        head =null;
        tail=null;
    }
    public boolean isEmpty(){
        // ı use this method for checking this list empty
        if(head==tail){
            return true;
        }else{
            return false;
        }

    }
    public void addPatient(Patient p){
        Node node=new Node(p);
        node.next=head;
        head=node;
    }
    public void printList(){
        Node temp=head;
        while(temp!=null){
            IO.println("Patient ID: "+temp.data.getId()+" Name: "+temp.data.getPatientName()+ " Patient Age: "+temp.data.getPatientAge()+" Severity level:" +temp.data.getSeverityLevel());
            temp=temp.next;
        }
    }
    public Patient findPatient(int id){
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            if(temp.data.getId()==id){
                return temp.data;
            }
        }
        return null;
    }
    public void removePatient(int id){
        Node temp=head;
        Node prev=null;
        if(isEmpty()){
            System.out.println("these list is empty ");
            return;
        }
        while(temp!=null){
            if(temp.data.getId()==id){
                if(prev==null) {//eğer id head ise
                    head = head.next;
                } else{
                    prev.next=temp.next;
                }
            }
            prev=temp;
            temp=temp.next;
        }
    }
    // ı end buble sort patient list class because this class has patient's informations
    public void buble(){
        if(head==null){
            System.out.println(" this list is empty");
        }
        boolean swapped;
        do{
            swapped=false;
            PatientList.Node temp=head;
            while(temp.next!=null){
                Patient p=temp.data;
                Patient p2=temp.next.data;
                if(p.getSeverityLevel()< p2.getSeverityLevel()){
                    // this if conditon give priority whose severity level is higher .
                    temp.data=p2;
                    temp.next.data=p;
                    swapped=true;
                } else if (p.getSeverityLevel() == p.getSeverityLevel()
                        && p.getPatientAge() < p2.getPatientAge()) {
                    // this else if conditon whoever is older they give priority to them.
                    temp.data=p2;
                    temp.next.data=p;
                    swapped=true;
                }
                temp=temp.next;
            }
        }while(swapped);
    }
}
