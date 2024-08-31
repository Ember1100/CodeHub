package cc.moreluck.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author huangqi
 * @Date 2024/8/31 21:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName("test")
public class Test {
    private Long id;

    private String name;


}
