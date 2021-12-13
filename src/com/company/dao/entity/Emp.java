package com.company.dao.entity;

import java.math.BigDecimal;
import java.sql.Date;

public class Emp {
     int empno;
     String ename;
     BigDecimal sal;
     Date hiredate;
     int deptno;
     int mgr;
     BigDecimal comm;
     int score;
     String job;

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", sal=" + sal +
                ", hiredate=" + hiredate +
                ", deptno=" + deptno +
                ", mgr=" + mgr +
                ", comm=" + comm +
                ", score=" + score +
                ", job='" + job + '\'' +
                '}';
    }

    public Emp() {
    }

    public Emp(int empno, String ename, BigDecimal sal, Date hiredate, int deptno, int mgr, BigDecimal comm, int score, String job) {
        this.empno = empno;
        this.ename = ename;
        this.sal = sal;
        this.hiredate = hiredate;
        this.deptno = deptno;
        this.mgr = mgr;
        this.comm = comm;
        this.score = score;
        this.job = job;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public BigDecimal getComm() {
        return comm;
    }

    public void setComm(BigDecimal comm) {
        this.comm = comm;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
