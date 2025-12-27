void main () {
    HospitalSystem hospital=new HospitalSystem();
    Patient p1=new Patient(10,"a",2,40);
    Patient p2=new Patient(20,"b",6,22);
    Patient p3=new Patient(30,"c",3,33);
    Patient p4=new Patient(40,"d",5,44);
    Patient p5=new Patient(50,"e",9,55);
    Patient p6=new Patient(60,"f",10,60);
    Patient p7=new Patient(70,"g",8,65);
    Patient p8=new Patient(80,"j",9,75);
    Patient p9=new Patient(90,"k",9,85);
    Patient p10=new Patient(100,"h",9,90);
    // ı fristly create patirnt becasue my add patience methods parameters is patient p
    hospital.addPatient(p1);
    hospital.addPatient(p2);
    hospital.addPatient(p3);
    hospital.addPatient(p4);
    hospital.addPatient(p5);
    hospital.addPatient(p6);
    hospital.addPatient(p7);
    hospital.addPatient(p8);
    hospital.addPatient(p9);
    hospital.addPatient(p10);

    hospital.treatmentRequest(p1,true);
    hospital.treatmentRequest(p2,true);
    hospital.treatmentRequest(p3,true);
    hospital.treatmentRequest(p4,false);
    hospital.treatmentRequest(p5,false);
    hospital.treatmentRequest(p6,false);
    hospital.treatmentRequest(p7,false);
    hospital.treatmentRequest(p8,false);
    // ı use treatment process for priority patient
    hospital.Treatmentproces();
    hospital.Treatmentproces();
    hospital.Treatmentproces();

    hospital.discharge(p9);
    hospital.discharge(p10);

    hospital.printSystem();
}
