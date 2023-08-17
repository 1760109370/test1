import cn.yunhe.enity.User;
import cn.yunhe.mapper.UserMapper;
import cn.yunhe.utils.MybatisUtils;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

public class TestUser {
    @Test
    public  void  showUser(){
        SqlSessionFactory sessionFactory = MybatisUtils.getSessionFactory();
        SqlSession sqlSession = sessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.showUser();
        users.forEach(System.out::println);
        sqlSession.close();

    }

   @Test
    public  void  addUser(){
        SqlSessionFactory sessionFactory = MybatisUtils.getSessionFactory();
        SqlSession sqlSession = sessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("梅佳佳");
        user.setBirthday("2001-10-29");
        user.setSex("女");
        user.setAddress("河南");
        mapper.addUser(user);
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public  void  updateUser(){
        SqlSessionFactory sessionFactory = MybatisUtils.getSessionFactory();
        SqlSession sqlSession = sessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(52);
        user.setUsername("梅佳佳");
        user.setBirthday("2001-10-29");
        user.setSex("男");
        user.setAddress("河南");
        mapper.updateUser(user);
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public  void  deleteUser(){
        SqlSessionFactory sessionFactory = MybatisUtils.getSessionFactory();
        SqlSession sqlSession = sessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(51);
        sqlSession.commit();
        sqlSession.close();

    }

}
