import Models.Hospital;

public class Main {
    public static void main(String[] args) {


        Hospital h = new Hospital("Aadhar", "Kolhapur", 12345, 1000);
        h.getHospitalName();
        h.getHospitalAddress();
        h.getTotalNoOfBeds();
        h.getHospitalPhoneNo();

        h.appointDoctor("Prathamesh", "MBBS CGO", 25, "Male", "cardiologist");

    }
}