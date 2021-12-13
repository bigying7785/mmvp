package com.company.dao.impl;

import com.company.dao.entity.Emp;
import com.company.dao.entity.Tuser;
import com.company.dao.idao.LoginDao;
import com.company.dao.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LoginDaoImpl implements LoginDao {

    @Override
    public Tuser finduser(String username, String password) throws Exception {
        Connection conn= DBUtil.getConnection();
        String sql="SELECT id,username,`password`,pri FROM tuser WHERE username=? AND `password`=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,username);
        ps.setString(2,password);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            return new Tuser(rs.getInt("id"),rs.getString("username"),rs.getString("password"),rs.getInt("pri"));
        }
        DBUtil.close(rs,ps,conn);
        return null;
    }

    @Override
    public Tuser findByid(int id) throws Exception {
        Connection con = DBUtil.getConnection();
        String sql="SELECT id,username,password,pri FROM tuser WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            return new Tuser(rs.getInt("id"),rs.getString("username"),rs.getString("password"),rs.getInt("pri"));
        }
        DBUtil.close(rs,ps,con);
        return null;
    }

    @Override
    public List<Emp> findByPage(int begin, int size) throws Exception {
         Connection conn = DBUtil.getConnection();
         String sql="SELECT empno,ename,sal,hiredate,deptno,mgr,comm,score,job FROM emp LIMIT ?,?";
         PreparedStatement ps = conn.prepareStatement(sql);
         ps.setInt(1,begin);
         ps.setInt(2,size);
         ResultSet rs = ps.executeQuery();
         ArrayList<Emp> emps = new ArrayList<>();
         while (rs.next()){
             Emp emp = new Emp(
                     rs.getInt("empno"),
                     rs.getString("ename"),
                     rs.getBigDecimal("sal"),
                     rs.getDate("hiredate"),
                     rs.getInt("deptno"),
                     rs.getInt("mgr"),
                     rs.getBigDecimal("comm"),
                     rs.getInt("score"),
                     rs.getString("job")
             );
             emps.add(emp);
         }

        return emps;
    }

    @Override
    public Emp findByempno(Integer emono) throws Exception {
        Connection conn = DBUtil.getConnection();
        String sql="SELECT empno,ename,sal,hiredate,deptno,mgr,comm,score,job FROM emp WHERE empno=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,emono);
        ResultSet rs = ps.executeQuery();
        Emp emp=null;
        while (rs.next()){
           emp = new Emp(
                    rs.getInt("empno"),
                    rs.getString("ename"),
                    rs.getBigDecimal("sal"),
                    rs.getDate("hiredate"),
                    rs.getInt("deptno"),
                    rs.getInt("mgr"),
                    rs.getBigDecimal("comm"),
                    rs.getInt("score"),
                    rs.getString("job")

            );
        }
        return emp;
    }
}
