package com.lumen.microservice.DbConnection.model;


public class Data {
    private Long pid;
    private String pname;
    private int pvalue;
    
    public Data(Long id, String name, int value) {
        this.pid = id;
        this.pname = name;
        this.pvalue = value;
    }
    
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPvalue() {
		return pvalue;
	}
	public void setPvalue(int pvalue) {
		this.pvalue = pvalue;
	}
   
    
	

}
