package intermdiate;

public class Encapsulation {

	 private String empName;
	 private int age;
	 private String address;
	 private int cellPhone;
	 
	 
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
		 
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(int cellPhone) {
		this.cellPhone = cellPhone;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Encapsulation [empName=" + empName + ", age=" + age + ", address=" + address + ", cellPhone="
				+ cellPhone + "]";
	}
	 
	
	 
 
	 
	 

}
