package cc.moreluck;

import cc.moreluck.domain.entity.Order;
import cc.moreluck.infrastructure.OrderMapper;
import cc.moreluck.infrastructure.TestMapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author huangqi
 * @Date 2024/8/31 21:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingSphereTest {

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    TestMapper testMapper;


    @Test
    public void contextLoads() {
//        cc.moreluck.domain.entity.Test ts = new cc.moreluck.domain.entity.Test();
//        ts.setId(1L);
//        ts.setName("CC");
//        testMapper.insert(ts);
        List<cc.moreluck.domain.entity.Test> tests = testMapper.selectList(null);
        for (cc.moreluck.domain.entity.Test test : tests) {
            System.out.println(test);
        }

    }

    String cp = "Ak123";
    @Test
    public void insertTest() {
        Order order = new Order();


        for (int i = 1; i <= 4; i++) {
            order.setId(null);
            order.setOrderId(cp);
            order.setBuyerId("buyer-"+i);
            order.setGoodsId("goods-"+i);
            System.out.println(order);
            orderMapper.insert(order);
        }
    }

    @Test
    public void selectTest() {
        int  num = Math.abs(cp.hashCode()) % 4 ;
        System.out.println(num);
        List<Order> orders = orderMapper.selectList(new LambdaQueryWrapper<Order>().eq(Order::getOrderId, cp));
        for (Order order : orders) {
            System.out.println(order);
        }


    }
}
