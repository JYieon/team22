package common_.김수지;

public class login_MemberDTO {
	private String newID, saveID;
	private int newPW, savePW;
	
	public login_MemberDTO() {}
	public login_MemberDTO(String newID, String saveID) {
		this.newID = newID;
		this.saveID = saveID;
	}
	public login_MemberDTO(int newPW, int savePW) {
		this.newPW = newPW;
		this.savePW = savePW;
	}
	
	public String getNewID() {
		return newID;
	}
	public void setNewID(String newID) {
		this.newID = newID;
	}
	public String getSaveID() {
		return saveID;
	}
	public void setSaveID(String saveID) {
		this.saveID = saveID;
	}
	public int getNewPW() {
		return newPW;
	}
	public void setNewPW(int newPW) {
		this.newPW = newPW;
	}
	public int getSavePW() {
		return savePW;
	}
	public void setSavePW(int savePW) {
		this.savePW = savePW;
	}
	

}
