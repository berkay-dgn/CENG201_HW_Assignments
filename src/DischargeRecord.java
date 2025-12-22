public class DischargeRecord {
    private int PatientId;
    private long dischargeTıme;
    public DischargeRecord(int PatientId,long dischargeTıme){
        this.PatientId=PatientId;
        this.dischargeTıme=dischargeTıme;
    }

    public long getDischargeTıme() {
        return dischargeTıme;
    }
    public int getPatientId(){
        return PatientId;
    }
    public String toString(){
        return this.getPatientId()+" "+this.getDischargeTıme();
        // hastanın id ve taburcu saatinin görülmesi için toString methodunu kullandım
    }
}
