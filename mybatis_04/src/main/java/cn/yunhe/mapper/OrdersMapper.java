package cn.yunhe.mapper;

import cn.yunhe.enity.Orders;
import cn.yunhe.enity.User;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface OrdersMapper {
    @Select("select * from orders where id =#{id}")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "user",column = "uid",one=@One(select = "cn.yunhe.mapper.UserMapper.selectUserByUid"),javaType = User.class)
    })
    Orders selectOrdersByid(Integer id);
}
