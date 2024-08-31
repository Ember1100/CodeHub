package cc.moreluck.infrastructure;


import cc.moreluck.domain.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单Mapper
 *
 * @author Hollis
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {


}
