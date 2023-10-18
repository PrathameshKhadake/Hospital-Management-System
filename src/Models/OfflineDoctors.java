package Models;

import Interfaces.Doctor;

public class OfflineDoctors implements Doctor {

    String doctorID;
    String doctorName;
    String doctorDegree;
    String doctorSpeciality;
    int doctorAge;

    public OfflineDoctors(String doctorID, String doctorName, String doctorDegree, String doctorSpeciality, int doctorAge) {
        this.doctorID = doctorID;
        this.doctorName = doctorName;
        this.doctorDegree = doctorDegree;
        this.doctorSpeciality = doctorSpeciality;
        this.doctorAge = doctorAge;
    }

    public void diagnosis(){

        System.out.println("Diagnosis the Patient");
    }

    public String getDoctorName(){
        return doctorName;
    }

    public String doctorID(){
        return doctorID;
    }
    public void getMyDetails(){

        System.out.println("Name: " + doctorName);
        System.out.println("ID: " + doctorID);
        System.out.println("Age: " + doctorAge);
        System.out.println("Degree: " + doctorDegree);
        System.out.println("Speciality: " + doctorSpeciality);

    }

    public void getMyPatient(){

    }


}
