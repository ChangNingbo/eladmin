package com.james.repository;

import com.james.domain.EmailConfig;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author cnb
 * @date 2018-12-26
 */
public interface EmailRepository extends JpaRepository<EmailConfig,Long> {
}
