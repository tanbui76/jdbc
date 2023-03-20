package model;

import javax.print.attribute.standard.JobOriginatingUserName;

public class tk {
	private int id;
	private String username ;
	private String psd ;
	private String fullname;
	public tk() {
		
	}
	public tk(int id, String username, String psd, String fullname) {
		this.id = id;
		this.username = username;
		this.psd = psd;
		this.fullname = fullname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPsd() {
		return psd;
	}
	public void setPsd(String psd) {
		this.psd = psd;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	@Override
	public String toString() {
		return "tk [id=" + id + ", username=" + username + ", psd=" + psd + ", fullname=" + fullname + "]";
	}
	
	
	
}

