package com.james.repository;

import com.james.domain.AlipayConfig;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author cnb
 * @date 2018-12-31
 */
public interface AliPayRepository extends JpaRepository<AlipayConfig,Long> {
}
