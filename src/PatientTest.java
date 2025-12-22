public class PatientTest {
    public static void main() {
        PatientList list=new PatientList();
        Patient p1=new Patient(10,"serdar",2,40);
        Patient p2=new Patient(20,"berkay",6,22);
        Patient p3=new Patient(30,"serhat",3,33);
        Patient p4=new Patient(40,"mehmet",5,44);
        Patient p5=new Patient(50,"ahmet",9,55);
        System.out.println(list.isEmpty());// list boş olup olmadığını kontrol etmek için kullandım
        list.addPatient(p1);
        list.addPatient(p2);
        list.addPatient(p3);
        list.addPatient(p4);
        list.addPatient(p5);
        System.out.println(list.isEmpty());
        list.printList(); // burda println kullanmamın nedeni kodun doğru şekilde add yapıp yapmadığını kontrol etmek
        list.removePatient(10);
       // list.removePatient(50); bunu kullandım çünkü remove fonk taili silip silmediğini göremek istedim
        System.out.println( );
        list.printList();
    }
}
