package cn.yunhe.mapper;

import cn.yunhe.enity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> showUser();
    @Select("select * from user where id =#{id}")
    User  selectUserByUid(Integer uid);
    @Insert("insert into user(username,birthday,sex,address) values(#{username},#{birthday},#{sex},#{address})")
    void addUser(User user);
    @Update("update user set username=#{username},birthday=#{birthday},sex=#{sex},address=#{address} where id =#{id}")
    void  updateUser(User user);
    @Delete("delete from user where id =#{id}")
    void  deleteUser(Integer id);
}
