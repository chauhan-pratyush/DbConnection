package com.lumen.microservice.DbConnection.repository;



import java.util.List;

import com.lumen.microservice.DbConnection.model.Data;


public interface DataRepository {
    List<Data> getAllData();
   
}
