package com.sysyu.cmis.dao;

import com.sysyu.cmis.bean.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TestMapper {

    List<Order> findOrderList();
}
