package model;

public class Appointment {
	public int date;
	public int serialNumber;
	public Appointment() {
		
	}
	public Appointment(int date, int serialNumber) {
		super();
		this.date = date;
		this.serialNumber = serialNumber;
	}
	public void addAppointment(int count) {
		if((serialNumber+count)<=20)
		{
			this.serialNumber=serialNumber+count;
		}
		else {
			if((date+1)<=30) {
			this.date=date+1;
			this.serialNumber=1;
			}
			else {
				this.date=1;
				this.serialNumber=1;
			}
		}
	}
}
