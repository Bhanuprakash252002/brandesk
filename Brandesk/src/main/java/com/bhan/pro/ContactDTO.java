package com.bhan.pro;

public class ContactDTO {
	String name;
	String mobilenum;
	String select0;
	String select1;
	String select2;
	String select3;
	String note;
	public ContactDTO(int sno,String name, String mobilenum, String select0, String select1, String select2, String select3,
			String note) {
		super();
		this.name = name;
		this.mobilenum = mobilenum;
		this.select0 = select0;
		this.select1 = select1;
		this.select2 = select2;
		this.select3 = select3;
		this.note = note;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobilenum() {
		return mobilenum;
	}
	public void setMobilenum(String mobilenum) {
		this.mobilenum = mobilenum;
	}
	public String getSelect0() {
		return select0;
	}
	public void setSelect0(String select0) {
		this.select0 = select0;
	}
	public String getSelect1() {
		return select1;
	}
	public void setSelect1(String select1) {
		this.select1 = select1;
	}
	public String getSelect2() {
		return select2;
	}
	public void setSelect2(String select2) {
		this.select2 = select2;
	}
	public String getSelect3() {
		return select3;
	}
	public void setSelect3(String select3) {
		this.select3 = select3;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	

}
