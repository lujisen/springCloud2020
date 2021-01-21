package com.ljs.springcloud.service;

import java.math.BigDecimal;
/**
 * @author: Created By lujisen
 * @company China JiNan
 * @date: 2021-01-18 15:11
 * @version: v1.0
 * @description: com.ljs.springcloud.service
 */
public interface AccountService {
    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(Long userId, BigDecimal money);
}
