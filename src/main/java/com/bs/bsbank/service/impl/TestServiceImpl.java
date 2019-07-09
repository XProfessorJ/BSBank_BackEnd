package com.bs.bsbank.service.impl;

import com.bs.bsbank.dao.TestDao;
import com.bs.bsbank.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;
    @Override
    public String testService() {
        return testDao.testDao();
    }
}
