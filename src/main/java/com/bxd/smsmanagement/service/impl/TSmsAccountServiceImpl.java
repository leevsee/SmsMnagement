package com.bxd.smsmanagement.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.bxd.smsmanagement.model.biz.User;
import com.bxd.smsmanagement.model.biz.UserInfo;
import com.bxd.smsmanagement.model.entity.TSmsAccount;
import com.bxd.smsmanagement.dao.TSmsAccountMapper;
import com.bxd.smsmanagement.service.ITSmsAccountService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Leeves
 * @since 2018-03-28
 */
@Service
public class TSmsAccountServiceImpl extends ServiceImpl<TSmsAccountMapper, TSmsAccount> implements ITSmsAccountService {

    @Autowired
    private TSmsAccountMapper mTSmsAccountMapper;

    @Override
    public TSmsAccount selectByNP(User user) {
        TSmsAccount tSmsAccount = new TSmsAccount();
        tSmsAccount.setAccountName(user.getUserName());
        tSmsAccount.setPasswd(user.getUserPwd());
        return mTSmsAccountMapper.selectOne(tSmsAccount);
    }

    @Override
    public Integer insertUser(UserInfo userInfo) {
        TSmsAccount tSmsAccount = new TSmsAccount();
        tSmsAccount.setAccountName(userInfo.getUserName());
        tSmsAccount.setPasswd(userInfo.getUserPwd());
        tSmsAccount.setAccountCode(userInfo.getOrganization());
        tSmsAccount.setAddress(userInfo.getAddress());
        tSmsAccount.setContactName(userInfo.getContact());
        tSmsAccount.setContactPhone(userInfo.getPhone());
        return mTSmsAccountMapper.insert(tSmsAccount);
    }

    @Override
    public boolean modifyUser(UserInfo userInfo) {
        TSmsAccount tSmsAccount = new TSmsAccount();
        tSmsAccount.setAccountName(userInfo.getUserName());
        tSmsAccount = mTSmsAccountMapper.selectOne(tSmsAccount);
        tSmsAccount.setPasswd(userInfo.getUserPwd());
        tSmsAccount.setAccountCode(userInfo.getOrganization());
        tSmsAccount.setAddress(userInfo.getAddress());
        tSmsAccount.setContactName(userInfo.getContact());
        tSmsAccount.setContactPhone(userInfo.getPhone());
        tSmsAccount.setWhiteIp(userInfo.getWhiteIP());
        return tSmsAccount.updateById();
    }


}
