package H1;
public class PatientRecord {
	public PatientRecord(String name, int age, String gender, String address) {

	}
	PatientRecord(){
		
	}
	
	Patient PI=new Patient();
	int Max_Count= 10;

	MedicalRecord[] mrr = new MedicalRecord[Max_Count];
	
	
	public Patient getPatient() {
		return PI;
	}
	public void setPatient(Patient PI) {
		this.PI = PI;
	}
	public MedicalRecord[] getMedicalRecords() {
		return mrr;
	}
	public void setMedicalRecords(MedicalRecord[] medicalRecords) {
		this.mrr = mrr;
	}
	
	public void addMedicalRecord(MedicalRecord mrr) {

		this.mrr [Max_Count]=mrr;
		this.Max_Count = Max_Count +1;
		
	}


}
