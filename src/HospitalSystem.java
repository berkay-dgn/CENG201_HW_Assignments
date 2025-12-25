import java.util.HashMap;

public class HospitalSystem {
    private PatientList patientList;
    private TreatmentQuee Priorityquee;
    private TreatmentQuee Normalquee;
    private DischargeStack stack;
    public HashMap<Integer,Patient>map;
    public HospitalSystem(){
        patientList=new PatientList();
        Priorityquee=new TreatmentQuee();
        Normalquee=new TreatmentQuee();
        stack=new DischargeStack();
        map=new HashMap<>();

    }
    public void addPatient(Patient patient){
        patientList.addPatient(patient);
        map.put(patient.getId(), patient);
        // ı use map fıction for quick patient checking
    }
    public void treatmentRequest(Treatmentrequest r){
        if(r.isPriority()){
            Priorityquee.enquee(r);
            // in this part my code checking is patient have any priority if patient has any priority
            // ı use enquee method in priotiy quee for that reason ı couldnt break fıfo
        }else{
            Normalquee.enquee(r);
        }
    }
    public void Treatmentproces(){
        Treatmentrequest request;
        if(!Priorityquee.isEmpty()){
            request=Priorityquee.dequee();
        }else if(!Normalquee.isEmpty()){
            request=Normalquee.dequee();
        }

    }
    public void printSystem(){
        System.out.println("patient list: ");
        patientList.printList();
        System.out.println();
        System.out.println("ouee: ");
        Priorityquee.printQuee();
        Normalquee.printQuee();
        System.out.println();
        System.out.println("discharge stack: ");
        stack.Printstack();
    }

}
