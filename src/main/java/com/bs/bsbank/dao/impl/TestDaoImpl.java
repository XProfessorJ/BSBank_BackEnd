package com.bs.bsbank.dao.impl;

import com.bs.bsbank.dao.TestDao;
import org.springframework.stereotype.Component;

@Component
public class TestDaoImpl implements TestDao {
    @Override
    public String testDao() {
        return "testDao";
    }
}
