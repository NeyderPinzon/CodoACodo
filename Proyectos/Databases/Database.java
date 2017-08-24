package com.codoacodo.mysequel;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        try {
            Database db = new Database();
            Connection con = db.createConnection();

            Statement st = con.createStatement();
            //st.execute("create table persona(nombre varchar(10))");
            st.execute("INSERT INTO persona (nombre) values('aa')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
