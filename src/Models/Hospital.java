package Models;


import Database.DoctorDB;
import Database.PatientDB;
import Interfaces.Doctor;

public class Hospital {

    private String hospitalName;
    private String hospitalAddress;
    private int hospitalPhoneNo;
    private int totalNoOfBeds;

    DoctorDB doctorDatabase;
    PatientDB patientDatabase;

    public Hospital(String hospitalName, String hospitalAddress, int hospitalPhoneNo, int totalNoOfBeds) {
        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
        this.hospitalPhoneNo = hospitalPhoneNo;
        this.totalNoOfBeds = totalNoOfBeds;
        doctorDatabase = new DoctorDB();
        patientDatabase = new PatientDB();
    }

    public void getHospitalName(){
        System.out.println(hospitalName);
    }
    public void getHospitalAddress(){

        System.out.println(hospitalAddress);
    }
    public void getHospitalPhoneNo(){
        System.out.println(hospitalPhoneNo);
    }
    public void getTotalNoOfBeds(){
        System.out.println(totalNoOfBeds);
    }

    public void getTotalNoOfPatient(){

    }
    public void getToatalNoOfDoctors(){

    }
    public void getPatientDetails(String patientID){

    }
    public void getDoctorDetails(String doctorID){

    }
    public void admitPatient(String patientName, String deceases, int age, String gender, String date){

    }
    public void appointDoctor(String doctorName, String doctorDegree, int age, String gender, String speciality){

        int totalDoc = doctorDatabase.getTotalDoctors();
        String doctorID = "HSP" + (totalDoc + 1);
        Doctor doc = new OfflineDoctors(doctorID, doctorName, doctorDegree, speciality, age);
        doctorDatabase.addDoctorToDB(doc);
    }


}
