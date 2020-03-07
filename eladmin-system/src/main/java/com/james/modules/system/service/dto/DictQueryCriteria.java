package com.james.modules.system.service.dto;

import lombok.Data;
import com.james.annotation.Query;

/**
 * @author cnb
 * 公共查询类
 */
@Data
public class DictQueryCriteria {

    @Query(blurry = "name,remark")
    private String blurry;
}
