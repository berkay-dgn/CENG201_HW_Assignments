import java.text.SimpleDateFormat;
import java.util.Date;
public class Treatmentrequest {
    private int patientId;
    private long Arrivaltime;
    private boolean isPriority;// ı add this attributes for hospital system
    Treatmentrequest(int patientId, long Arrivaltime){
        this.patientId=patientId;
        this.Arrivaltime=Arrivaltime;
    }
    Treatmentrequest(int patientId, long Arrivaltime,boolean isPriority){
        this.patientId=patientId;
        this.Arrivaltime=Arrivaltime;
        this.isPriority=isPriority;
    }

    public int getPatientId(){return this.patientId;}
    // arrival time will show  like hh: mm
    public String getFormattedArrivalTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return sdf.format(new Date(Arrivaltime));
    }
    public String toString(){
        return this.patientId+"  come in this time  "+" " +this.getFormattedArrivalTime()+" "+this.isPriority;
        // ı override toString because it show patient ıd and his arrival timme
    }

    public boolean isPriority() {
        return isPriority;
    }
}
