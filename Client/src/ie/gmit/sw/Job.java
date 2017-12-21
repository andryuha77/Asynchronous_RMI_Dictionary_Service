package ie.gmit.sw;

public class Job {

	// variables
	private int ID;
	private String def;

	// constructor
	public Job(int iD, String def) {
		super();
		ID = iD;
		this.def = def;
	}

	// getters setters
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getdef() {
		return def;
	}

	public void setdef(String def) {
		this.def = def;
	}

	@Override
	public String toString() {
		return "Job ID: " + ID + ", Word: " + def;
	}

}
