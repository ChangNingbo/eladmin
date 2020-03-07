package com.james.exception;

import org.springframework.util.StringUtils;

/**
 * @version v1.0
 * @Description: TODO
 * @Author: cnb
 * @Date: 2020/3/4 20:50
 */
public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(Class clazz, String field, String val) {
        super(EntityNotFoundException.generateMessage(clazz.getSimpleName(), field, val));
    }

    private static String generateMessage(String entity, String field, String val) {
        return StringUtils.capitalize(entity)
                + " with " + field + " "+ val + " does not exist";
    }
}
