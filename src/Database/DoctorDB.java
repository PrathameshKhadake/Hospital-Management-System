package Database;

import Interfaces.Doctor;
import Interfaces.Patient;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDB {
    HashMap<String, Doctor> docDetail;
    HashMap<String, ArrayList<Patient>> docVsPatients;

    public DoctorDB(){
        docDetail = new HashMap<>();
        docVsPatients = new HashMap<>();
    }

    public int getTotalDoctors(){
        return docDetail.size();
    }

    public ArrayList<Patient> getAssignPatients(String docID){
        return docVsPatients.get(docID);
    }

    public Doctor assignPatientToDoctor(Patient p){
        String docID = "";
        int min = Integer.MAX_VALUE;
        for(String docsID : docVsPatients.keySet()){
            if(min > docVsPatients.get(docsID).size()){
                min = docVsPatients.get(docsID).size();
                docID = docsID;
            }
        }
        ArrayList<Patient> allPatient = docVsPatients.get(docID);
        allPatient.add(p);
        return docDetail.get(docID);
    }

    public void addDoctorToDB(Doctor d){
        String docID = d.doctorID();
        docDetail.put(docID, d);
        docVsPatients.put(docID, new ArrayList<>());
        System.out.println("New doctor is added in the Hospital..");
    }


}
