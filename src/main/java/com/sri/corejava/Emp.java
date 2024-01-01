package com.sri.corejava;


public class Emp {

    public Emp(){}

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setEsal(double esal) {
        this.esal = esal;
    }

    public String getEname() {
        return ename;
    }

    public double getEsal() {
        return esal;
    }

    public Emp(int eid, String ename, double esal){

        this.eid=eid;
        this.ename=ename;
        this.esal=esal;
    }

    int eid;
    String ename;
    double esal;
}
