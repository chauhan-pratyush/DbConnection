package com.lumen.microservice.DbConnection.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lumen.microservice.DbConnection.model.Data;


import java.util.List;

@Repository
public class JdbcDataRepository implements DataRepository {
    @Autowired
    @Qualifier("jdbcTemplateA")
    private JdbcTemplate jdbcTemplateA;
    
    @Qualifier("jdbcTemplateB")
    private JdbcTemplate jdbcTemplateB;

    @Override
    public List<Data> getAllData() {
        return jdbcTemplateA.query("SELECT * FROM Product", (rs, rowNum) -> new Data( rs.getLong("Pid"), rs.getString("Pname"),rs.getInt("Pvalue")
        		));
    }

}
