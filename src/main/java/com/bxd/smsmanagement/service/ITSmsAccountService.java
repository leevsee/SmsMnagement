package com.bxd.smsmanagement.service;

import com.bxd.smsmanagement.model.biz.User;
import com.bxd.smsmanagement.model.biz.UserInfo;
import com.bxd.smsmanagement.model.entity.TSmsAccount;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Leeves
 * @since 2018-03-28
 */
public interface ITSmsAccountService extends IService<TSmsAccount> {

    /**
     * 通过用户名和密码查询账号
     */
    TSmsAccount selectByNP(User user);

    /**
     * 新增用户
     */
    Integer insertUser(UserInfo userInfo);

    /**
     * 新增用户
     */
    boolean modifyUser(UserInfo userInfo);

}
