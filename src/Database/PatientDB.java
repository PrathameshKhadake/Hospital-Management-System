package Database;

import Interfaces.Patient;

import java.util.HashMap;

public class PatientDB {

    HashMap<String, Patient> PatientDetail;

    public PatientDB(){
        PatientDetail = new HashMap<>();
    }

    public int getTotalPatient(){
        return PatientDetail.size();
    }
    public Patient getPatient(String pid){
        return PatientDetail.get(pid);
    }

    public void addPatient(Patient p){
        String pid = p.patientID();
        PatientDetail.put(pid, p);
        System.out.println("New Patient is added in the Hospital..");
    }
}
