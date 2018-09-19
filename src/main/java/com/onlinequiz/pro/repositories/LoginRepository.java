package com.onlinequiz.pro.repositories;


import com.onlinequiz.pro.models.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class LoginRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public LoginRepository(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    public Login getLoginDetails(Login login){
        String sql = "select *from register where id=(?)";
        return jdbcTemplate.query(sql, new Object[]{login.getStudentId()}, new ResultSetExtractor<Login>() {
                    @Override
                    public Login extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                        Login login1 = new Login();
                        while (resultSet.next()) {
                           login1.setStudentId( resultSet.getInt("id"));
                           login1.setPassword(resultSet.getString("password"));
                    }
                        return login1;

                    }
    });
    }

//    private Login getRegisterMapper(ResultSet resultSet) throws SQLException {
//        Login login = new Login();
//        while (resultSet.next()) {
//            login.setStudentId(resultSet.getInt("id"));
//            login.setPassword(resultSet.getString("password"));
//        }
//
//        return login;
//    }
}
