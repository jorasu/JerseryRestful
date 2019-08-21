package com.example.jserseyrestful.service.impl;

import com.example.jserseyrestful.dao.StudentMapper;
import com.example.jserseyrestful.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Map<String, Object>> query() {
        return studentMapper.query();
    }
}
