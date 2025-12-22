public class StackTest {
    static void main() {
        DischargeRecord r1=new DischargeRecord(1,System.currentTimeMillis());
        // hastanın tam kaçta taburcu olduğunu göstermek için System.currentTimeMillis() kullandım
        DischargeRecord r2=new DischargeRecord(2,System.currentTimeMillis());
        DischargeRecord r3=new DischargeRecord(3,System.currentTimeMillis());
        DischargeRecord r4=new DischargeRecord(4,System.currentTimeMillis());
        DischargeRecord r5=new DischargeRecord(5,System.currentTimeMillis());
        //System.out.println(r1.toString()); test etmek içim bu methodu kullandım
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
