package com.lumen.microservice.DbConnection.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lumen.microservice.DbConnection.model.Data2;

import java.util.List;

@Repository
public class JdbcData2Repository implements Data2Repository {
    @Autowired
    @Qualifier("jdbcTemplateB")
    private JdbcTemplate jdbcTemplateB;

    @Override
    public List<Data2> getAllData() {
        return jdbcTemplateB.query("SELECT * FROM customer", (rs, rowNum) -> new Data2( rs.getLong("cid"), rs.getString("cname"),rs.getInt("cpno"), rs.getString("cadd")
        		));
    }
}
