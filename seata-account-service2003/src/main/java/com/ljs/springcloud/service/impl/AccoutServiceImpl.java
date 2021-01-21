package com.ljs.springcloud.service.impl;

import com.ljs.springcloud.dao.AccountDao;
import com.ljs.springcloud.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @author: Created By lujisen
 * @company China JiNan
 * @date: 2021-01-18 15:12
 * @version: v1.0
 * @description: com.ljs.springcloud.service.impl
 */
@Service
public class AccoutServiceImpl implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccoutServiceImpl.class);

    @Resource
    AccountDao accountDao;
    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("------->account-service中扣减账户余额开始");
        //模拟超时异常，全局事务回滚
        //暂停几秒钟线程
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        accountDao.decrease(userId,money);
        LOGGER.info("------->account-service中扣减账户余额结束");
    }
}
