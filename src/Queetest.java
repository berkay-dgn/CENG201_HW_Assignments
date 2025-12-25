public class Queetest {
    public static void main() {
        Treatmentrequest r1=new Treatmentrequest(12,System.currentTimeMillis());
        Treatmentrequest r2=new Treatmentrequest(13,System.currentTimeMillis());
        Treatmentrequest r3=new Treatmentrequest(14,System.currentTimeMillis());
        Treatmentrequest r4=new Treatmentrequest(15,System.currentTimeMillis());
        Treatmentrequest r5=new Treatmentrequest(16,System.currentTimeMillis());
        Treatmentrequest r6=new Treatmentrequest(17,System.currentTimeMillis());
        Treatmentrequest r7=new Treatmentrequest(18,System.currentTimeMillis());
        Treatmentrequest r8=new Treatmentrequest(19,System.currentTimeMillis());
        TreatmentQuee quee =new TreatmentQuee();
        quee.enquee(r1);
        quee.enquee(r2);
        quee.enquee(r3);
        quee.enquee(r4);
        quee.enquee(r5);
        quee.enquee(r6);
        quee.enquee(r7);
        quee.enquee(r8);
        // ı add 8 people in quee
        quee.dequee();
        quee.dequee();
        quee.dequee();
        //  ı delete 3 people in quee
        quee.printQuee();
    }
}
