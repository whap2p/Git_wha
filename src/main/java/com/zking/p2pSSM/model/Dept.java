package com.zking.p2pSSM.model;

import lombok.ToString;

import java.util.Date;
@ToString
public class Dept {
    private Integer did;

    private String dname;

    private Date dtime;

    private Integer dstatus;

    private String describes;

    public Dept(Integer did, String dname, Date dtime, Integer dstatus, String describes) {
        this.did = did;
        this.dname = dname;
        this.dtime = dtime;
        this.dstatus = dstatus;
        this.describes = describes;
    }

    public Dept() {
        super();
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Date getDtime() {
        return dtime;
    }

    public void setDtime(Date dtime) {
        this.dtime = dtime;
    }

    public Integer getDstatus() {
        return dstatus;
    }

    public void setDstatus(Integer dstatus) {
        this.dstatus = dstatus;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }
}