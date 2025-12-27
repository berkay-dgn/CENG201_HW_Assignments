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
    public void treatmentRequest(Patient p,Boolean b){
        Treatmentrequest r=new Treatmentrequest(p.getId(),System.currentTimeMillis(),b);
        if(r.isPriority()){
            Priorityquee.enquee(r);
            // in this part my code checking is patient have any priority if patient has any priority
            // ı use enquee method in priotiy quee for that reason ı couldnt break fıfo
        }else{
            Normalquee.enquee(r);
        }

    }
    public void Treatmentproces(){
        Treatmentrequest request=null;
        if(!Priorityquee.isEmpty()){
            request=Priorityquee.dequee();
        }else if(!Normalquee.isEmpty()){
            request=Normalquee.dequee();
        }
        if (request != null) {
            System.out.println("Patient " + request.getPatientId() + " processed.");
            DischargeRecord d = new DischargeRecord(request.getPatientId(), System.currentTimeMillis());

            stack.push(d);
        } else {
            System.out.println("No patients waiting in any queue.");
        }

    }
    public void discharge(Patient p){
        DischargeRecord d = new DischargeRecord(p.getId(), System.currentTimeMillis());
        stack.push(d);
    }
    public void printSystem(){
        System.out.println("patient list: ");
        patientList.printList();
        System.out.println();
        System.out.println(" priority queue: ");
        Priorityquee.printQuee();
        System.out.println("normal quee");
        Normalquee.printQuee();
        System.out.println();
        System.out.println("discharge stack: ");
        stack.Printstack();
    }
    public void sortPatient(){
        patientList.buble();
    }

}
