package org.example.common.enums;

import lombok.Data;
import org.example.common.exception.BusinessException;

import java.io.Serializable;

/**
 * @Author zhangLe
 * @Description
 */
public enum UserStatusEnum implements Serializable {
    NORMAL(1, "账号正常"),
    EXPIRED(2, "账号失效"),
    LOCKED(3, "账号被锁");

    private Integer code;
    private String desc;

    UserStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据code返回信息
     *
     * @param code
     * @return 用户状态信息
     */
    public static String getDesc(Integer code) {
        for (UserStatusEnum statusEnum : UserStatusEnum.values()) {
            if (code.equals(statusEnum.code)) {
                return statusEnum.desc;
            }
        }
        throw new BusinessException(code + "不存在");
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
