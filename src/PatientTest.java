public class PatientTest {
        public static void main() {
            PatientList list=new PatientList();
            Patient p1=new Patient(10,"a",2,40);
            Patient p2=new Patient(20,"b",6,22);
            Patient p3=new Patient(30,"c",3,33);
            Patient p4=new Patient(40,"d",5,44);
            Patient p5=new Patient(50,"e",9,55);
            list.addPatient(p1);
            list.addPatient(p2);
            list.addPatient(p3);
            list.addPatient(p4);
            list.addPatient(p5);
            System.out.println(list.isEmpty());
            list.printList();
            // ı use this method becasue ı checked my Patient list class work correct or not
            list.removePatient(10);
            //list.removePatient(50);
            // ı deleted 10 and 50 becasue ı chechked my remove method can delete tail and head correctly
            System.out.println( );
            list.printList();
        }
}
