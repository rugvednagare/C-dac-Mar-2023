package H1;
import java.sql.Date;

public class MedicalRecord {
	
	private Date date;
	private String doctorName;
	private String diagnosis;
	private String treatment;

	MedicalRecord(){
		
	}
	public MedicalRecord(Date date, String doctorName, String diagnosis, String treatment) {
		super();
		this.date = date;
		this.doctorName = doctorName;
		this.diagnosis = diagnosis;
		this.treatment = treatment;
	}
	
	@Override
	public String toString() {
		return "MedicalRecord [date=" + date + ", doctorName=" + doctorName + ", diagnosis=" + diagnosis
				+ ", treatment=" + treatment + "]";
	}
	
	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public String getDiagnosis() {
		return diagnosis;
	}


	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}


	public String getTreatment() {
		return treatment;
	}


	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}


	public MedicalRecord(PatientRecord patientRecord) {
		// TODO Auto-generated constructor stub
	}

}
