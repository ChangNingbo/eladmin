package com.james.service.dto;

import lombok.Data;
import com.james.annotation.Query;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author cnb
 * @date 2019-6-4 09:54:37
 */
@Data
public class QiniuQueryCriteria{

    @Query(type = Query.Type.INNER_LIKE)
    private String key;

    @Query(type = Query.Type.BETWEEN)
    private List<Timestamp> createTime;
}
