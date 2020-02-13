package intermdiate;

public class Teacher {
	
	private String designation = "Teacher";
	private String collegeName = "Harvard";

	protected String getDesignation() {
		return designation;
	}

	protected void setDesignation(String designation) {
		this.designation = designation;
	}

	
	protected String getCollegeName() {
		return collegeName;
	}

	protected void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	void job() {
		System.out.println("teaching students");
	}

}
