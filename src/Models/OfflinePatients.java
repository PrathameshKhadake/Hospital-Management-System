package Models;

import Interfaces.Patient;

public class OfflinePatients implements Patient {

    String patientID;
    String patientName;
    String decease;
    int patientAge;
    String patientGender;
    String patientAdmitDate;
    int patientBedNo;

    public OfflinePatients(String patientID, String patientName, String decease, int patientAge, String patientGender, String patientAdmitDate, int patientBedNo) {
        this.patientID = patientID;
        this.patientName = patientName;
        this.decease = decease;
        this.patientAge = patientAge;
        this.patientGender = patientGender;
        this.patientAdmitDate = patientAdmitDate;
        this.patientBedNo = patientBedNo;
    }

    public void getMyDetails(){

        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Age: " + patientAge);
        System.out.println("Decease: " + decease);
        System.out.println("Gender: " + patientGender);
        System.out.println("Admit Date: " + patientAdmitDate);

    }

    public String patientID(){
        return patientID;
    }

    public String getPatientName(){
        return patientName;
    }

    public void getMyBedNo(){

        System.out.println("Bed Number: " + patientBedNo);
    }

}
