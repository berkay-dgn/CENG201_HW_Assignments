public class Patient {
        private int id;
        private String patientName;
        private int severityLevel;
        private int patientAge;
        public Patient(int id,String patientName,int severityLevel,int patientAge){
            this.id=id;
            this.patientName=patientName;
            this.severityLevel=severityLevel;
            this.patientAge=patientAge;
        }
        public int getId() {return id;}
        public int getPatientAge(){return patientAge;}
        public String getPatientName(){return patientName;}
        public int getSeverityLevel(){return severityLevel;}
        public String toString(){
            return patientName+" "+id+" "+patientAge+" "+severityLevel;
        }

}
