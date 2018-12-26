package com.sysyu.cmis.service.impl;

import com.sysyu.cmis.bean.Order;
import com.sysyu.cmis.dao.TestMapper;
import com.sysyu.cmis.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;

    public List<Order> getAll() {
        return testMapper.findOrderList();
    }

}
