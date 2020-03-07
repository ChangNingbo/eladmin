package com.james.modules.quartz.service.dto;

import lombok.Data;
import com.james.annotation.Query;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author cnb
 * @date 2019-6-4 10:33:02
 */
@Data
public class JobQueryCriteria {

    @Query(type = Query.Type.INNER_LIKE)
    private String jobName;

    @Query
    private Boolean isSuccess;

    @Query(type = Query.Type.BETWEEN)
    private List<Timestamp> createTime;
}
