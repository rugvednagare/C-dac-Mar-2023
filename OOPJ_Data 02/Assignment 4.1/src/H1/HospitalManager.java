package H1;
import java.util.Scanner;

public class HospitalManager {
	Hospital H1 = new Hospital();
	PatientRecord M1=new PatientRecord();

	static Scanner sc = new Scanner(System.in);
	
	public static void acceptRecord(Patient arr) {

	}
public static void acceptRecord(MedicalRecord mrr) {

	}

       public void addPatientRecord() {
	}{
    	   Patient P1 = new Patient();
    	   HospitalManager.acceptRecord(P1);
    	   HospitalManager H2 = new HospitalManager();
    	   MedicalRecord medicalRecord=new MedicalRecord();
    	   HospitalManager.acceptRecord(medicalRecord);
    	   M1.setPatient(P1);
    	   M1.addMedicalRecord(medicalRecord);
    	    this.H2.addPatientRecord(medicalRecord);
       }
	
	
	

}
