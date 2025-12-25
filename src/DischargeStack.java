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
            System.out.print(temp.data);
            temp=temp.link;
            if(temp!=null){
                System.out.print("-->");
            }
        }
    }
}
