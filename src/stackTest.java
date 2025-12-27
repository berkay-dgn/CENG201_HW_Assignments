public class stackTest {
    static void main(String[] args) {
        DischargeRecord r1=new DischargeRecord(1,System.currentTimeMillis());
        DischargeRecord r2=new DischargeRecord(2,System.currentTimeMillis());
        DischargeRecord r3=new DischargeRecord(3,System.currentTimeMillis());
        DischargeRecord r4=new DischargeRecord(4,System.currentTimeMillis());
        DischargeRecord r5=new DischargeRecord(5,System.currentTimeMillis());
        DischargeStack stack=new DischargeStack();
        stack.push(r1);
        stack.push(r2);
        stack.push(r3);
        stack.push(r4);
        stack.push(r5);
        stack.pop();
        stack.pop();
        stack.Printstack();
    }
}
