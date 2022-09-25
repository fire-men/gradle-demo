package org.example.common.exception;

import java.io.Serializable;

/**
 * @Author zhangLe
 * @Description
 */
public class BusinessException extends RuntimeException implements Serializable {
    public BusinessException(String message) {
        super(message);
    }
}
