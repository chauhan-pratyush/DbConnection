package com.lumen.microservice.DbConnection.model;

public class Data2 {
	
	private Long cid;
    private String cname;
    private int cpno;
    private String cadd;
    
    public Data2(Long id, String name, int value, String cadd) {
        this.setCid(id);
        this.setCname(name);
        this.setCpno(value);
        this.setCadd(cadd) ;
    }

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCpno() {
		return cpno;
	}

	public void setCpno(int cpno) {
		this.cpno = cpno;
	}

	public String getCadd() {
		return cadd;
	}

	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
}
