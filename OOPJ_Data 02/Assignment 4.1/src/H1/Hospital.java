package H1;

public class Hospital {

	public static int MAX_COUNT = 100;
	private int index = 0;
	PatientRecord arr[] = new PatientRecord[10];
	public void addPatientRecord(PatientRecord patientRecord ) {
		this.arr[ index ] = patientRecord;
		this.index = this.index + 1;
	}
	public void addMedicalRecord( String name, MedicalRecord medicalRecord ) {
		for( int indx = 0; indx < this.index; ++ indx ) {
			if( this.arr[ indx ] != null && this.arr[ indx ].getPatient() != null ) {
				if( this.arr[ indx ].getPatient().getName() == name )
					this.arr[ indx ].addMedicalRecord(medicalRecord);
			}
		}
	}
	public PatientRecord getPatientRecord( String name ) {
		for( int indx = 0; indx < this.index; ++ indx ) {
			if( this.arr[ indx ] != null && this.arr[ indx ].getPatient() != null ) {
				if( this.arr[ indx ].getPatient().getName() == name )
					return this.arr[ indx ];
			}
		}	
		return null;
	}
	public MedicalRecord[] getMedicalRecord( String name ) {
		for( int indx = 0; indx < this.index; ++ indx ) {
			if( this.arr[ indx ] != null && this.arr[ indx ].getPatient() != null ) {
				if( this.arr[ indx ].getPatient().getName() == name )
					return this.arr[ indx ].getMedicalRecords();
			}
		}	
		return null;
	}
	private static Hospital reference;
	public static Hospital getReference() {
		if( reference == null )
			reference = new Hospital();
		return reference;
	}

}
