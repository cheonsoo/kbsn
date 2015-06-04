package com.kbsn.restapi.data;

public class USER {
	
	private int USERKEY;
	private String USERNAME;
	private String PASSWORD;
	private int ENABLED;
	
	public int getUSERKEY() {
		return USERKEY;
	}
	public void setUSERKEY(int uSERKEY) {
		USERKEY = uSERKEY;
	}
	public String getUSERNAME() {
		return USERNAME;
	}
	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	public int getENABLED() {
		return ENABLED;
	}
	public void setENABLED(int eNABLED) {
		ENABLED = eNABLED;
	}	
}
