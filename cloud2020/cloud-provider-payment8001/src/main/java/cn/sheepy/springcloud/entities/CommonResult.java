package cn.sheepy.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Aya
 * Create Time:2020/11/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String meesage;
    private T date;

    public CommonResult(Integer code,String meesage){
        this(code, meesage, null);
    }

}
