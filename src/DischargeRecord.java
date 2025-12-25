import java.text.SimpleDateFormat;
import java.util.Date;

public class DischargeRecord {
    private int PatientId;
    private long dischargeTıme;
    public DischargeRecord(int PatientId,long dischargeTıme){
        this.PatientId=PatientId;
        this.dischargeTıme=dischargeTıme;
    }

    public int getPatientId(){
        return PatientId;
    }

    public String getFormattedTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return sdf.format(new Date(dischargeTıme));
    }

    public String toString(){
        return this.getPatientId()+" "+this.getFormattedTime();
        //ı use this method becasue this method shows patients ıd and his discharge time
    }
}
