package model.domain;

public class RegistrationBean {
	private int number;
	private String name;
	private String attendance;
	
	public RegistrationBean(int number, String name, String attendance) {
		this.number = number;
		this.name = name;
		this.attendance = attendance;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAttendance() {
		return attendance;
	}
	
	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Registration [number=");
		builder.append(number);
		builder.append(", name=");
		builder.append(name);
		builder.append(", attendance=");
		builder.append(attendance);
		builder.append("]");
		return builder.toString();
	}
}