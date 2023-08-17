package com.yunhe;

import com.yunhe.enity.Orders;
import com.yunhe.mapper.OrderMapper;
import com.yunhe.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

public class OrderMapperTest {
    @Test
    public  void  selectByOneToOne(){
        SqlSessionFactory sessionFactory = MybatisUtils.getSessionFactory();
        SqlSession sqlSession = sessionFactory.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        Orders orders = mapper.selectByOneToOne(2);
        System.out.println(orders.getUid());
        sqlSession.close();
    }
}
