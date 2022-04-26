package model;

public class DoctorInfo {
	public String name;
	public String medicalSpeciality;
	public String chamber;
	public DoctorInfo() {
		
	}
	public DoctorInfo(String name, String medicalSpeciality, String chamber) {
		super();
		this.name = name;
		this.medicalSpeciality = medicalSpeciality;
		this.chamber = chamber;
	}
}
