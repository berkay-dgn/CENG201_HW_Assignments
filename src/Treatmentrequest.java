import java.text.SimpleDateFormat;
import java.util.Date;
public class Treatmentrequest {
    private int patientId;
    private long Arrivaltime;
    private boolean isPriority;// ı add this attributes for hospital system
    Treatmentrequest(int patientId, long Arrivaltime,boolean isPriority){
        this.patientId=patientId;
        this.Arrivaltime=Arrivaltime;
        this.isPriority=isPriority;
    }

    public int getPatientId(){return this.patientId;}
    // arrival time will show  like dd: hh: mm
    public String getFormattedArrivalTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        return sdf.format(new Date(Arrivaltime));
    }
    public String toString(){
        return " patient ıd is : "+patientId+" ,"+" patient's discharge time :"+getFormattedArrivalTime()+
                " ,"+" is patient has priority: "+isPriority;
        // ı override toString because it show patient ıd and his arrival timme
    }

    public boolean isPriority() {
        return isPriority;
    }
}
