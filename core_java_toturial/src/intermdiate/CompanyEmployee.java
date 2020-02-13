package intermdiate;

public abstract class CompanyEmployee {
	private String name;
	private int workingHours;
	private int ExtraWorkingHour;
	
	public CompanyEmployee(String name, int workingHours, int extraWorkingHour) {
		super();
		this.name = name;
		this.workingHours = workingHours;
		ExtraWorkingHour = extraWorkingHour;
	}
	
	public abstract int caculateSalary();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	public int getExtraWorkingHour() {
		return ExtraWorkingHour;
	}

	public void setExtraWorkingHour(int extraWorkingHour) {
		ExtraWorkingHour = extraWorkingHour;
	}
		
	

}
