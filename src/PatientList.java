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
            System.out.println(temp.data);
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
}
