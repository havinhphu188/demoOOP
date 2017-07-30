package inheritanceandencapsulation;

public class AssociateSoftwareEngineer extends TechnicalEmployee {
	private String mentorName;
	
	@Override
	public void messasge(){
		System.out.println("ASE");
	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		System.out.println("ASE");
	}

	public String getMentorName() {
		return mentorName;
	}

	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}
	
}
