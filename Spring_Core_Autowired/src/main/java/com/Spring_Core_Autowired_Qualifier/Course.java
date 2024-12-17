package com.Spring_Core_Autowired_Qualifier;

public class Course 
{
	private int cid;
	private String cname;
	private String cduration;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCduration() {
		return cduration;
	}
	public void setCduration(String cduration) {
		this.cduration = cduration;
	}
	public Course(int cid, String cname, String cduration) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cduration = cduration;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cduration=" + cduration + "]";
	}
	
	
}
