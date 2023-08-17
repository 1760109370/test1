import cn.yunhe.enity.Orders;
import cn.yunhe.mapper.OrdersMapper;
import cn.yunhe.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class TestOrders {
    @Test
    public  void  selectOrdersByid(){
        SqlSessionFactory sessionFactory = MybatisUtils.getSessionFactory();
        SqlSession sqlSession = sessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        Orders orders = mapper.selectOrdersByid(2);
        System.out.println(orders);
        sqlSession.close();
    }
}
