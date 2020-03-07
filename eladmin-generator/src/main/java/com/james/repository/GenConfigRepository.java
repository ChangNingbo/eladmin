package com.james.repository;

import com.james.domain.GenConfig;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author cnb
 * @date 2019-01-14
 */
public interface GenConfigRepository extends JpaRepository<GenConfig,Long> {

    /**
     * 查询表配置
     * @param tableName 表名
     * @return /
     */
    GenConfig findByTableName(String tableName);
}