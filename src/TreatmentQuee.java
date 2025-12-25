public class TreatmentQuee {
    public class Node{
        protected  Treatmentrequest data;
        protected Node next;
        public Node(Treatmentrequest data){
            this.data=data;
            this.next=null;
        }
    }
    Node front;
    Node rear;
    int size=0;
    TreatmentQuee() {
        Node front=null;
        Node rear=null;
        int size;
    }
    public void enquee(Treatmentrequest data){
        Node node=new Node(data);
        if(rear ==null){
            // if quee is empty the new node will be rear and front
            rear=node;
            front=node;
            size++;
        }
        rear.next=node;
        rear=node;
        size++;
    }
    public boolean isEmpty(){
        if(rear==null&&front==null){
            return true;
        }else{
            return false;
        }
    }

    public Treatmentrequest dequee(){
        if(isEmpty()){
            System.out.println("this quee is empty ");

        }
        Treatmentrequest removed=front.data;
        front=front.next;
        size--;
        return removed;
    }
    public int showSize(){
        return size;
    }
    public void printQuee(){
        if(isEmpty()){
            System.out.println("this quee is empty ");
        }
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
            if(temp!=null){
                System.out.print("-->");
            }
        }


    }




}
