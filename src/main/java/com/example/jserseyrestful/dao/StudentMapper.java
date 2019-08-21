package com.example.jserseyrestful.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StudentMapper {
   public List<Map<String, Object>> query();
}
