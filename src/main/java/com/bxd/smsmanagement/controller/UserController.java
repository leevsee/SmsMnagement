package com.bxd.smsmanagement.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.bxd.smsmanagement.model.R;
import com.bxd.smsmanagement.model.biz.User;
import com.bxd.smsmanagement.model.biz.UserInfo;
import com.bxd.smsmanagement.model.entity.TSmsAccount;
import com.bxd.smsmanagement.service.ITSmsAccountService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

/**
 * Description: 用户Controller
 * Package: com.bxd.smsmanagement.controller
 *
 * @author Leeves
 * @date 2018-03-28
 */
@Api(tags = "用户操作", description = "登陆、查询、新增")
@Controller
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private ITSmsAccountService mITSmsAccountService;


    @PostMapping("/login")
    @ResponseBody
    @ApiOperation(value = "登陆", notes = "用户名、密码")
    @ApiImplicitParam(name = "user", value = "用户实体user", required = true, dataType = "User")
    public R login(@RequestBody User user, BindingResult bindingResult) {
        TSmsAccount tSmsAccount = mITSmsAccountService.selectByNP(user);
        if (tSmsAccount != null) {
            return R.ok("登陆成功！");
        }
        return R.error("登陆失败！");
    }


    @PostMapping("/user/add")
    @ResponseBody
    @ApiOperation(value = "新增用户", notes = "用户信息")
    @ApiImplicitParam(name = "userInfo", value = "用户实体userInfo", required = true, dataType = "UserInfo")
    public R addUser(@RequestBody UserInfo userInfo, BindingResult bindingResult) {
        TSmsAccount tSmsAccount = mITSmsAccountService.selectByNP(userInfo);
        if (tSmsAccount == null) {
            Integer integer = mITSmsAccountService.insertUser(userInfo);
            logger.debug("新增用户：" + integer);
            return R.ok("新增成功！");
        }
        return R.error("已存在用户！");
    }


    @PostMapping("/user/update")
    @ResponseBody
    @ApiOperation(value = "修改用户信息", notes = "修改用户信息")
    @ApiImplicitParam(name = "userInfo", value = "用户实体userInfo", required = true, dataType = "UserInfo")
    public R modifyUser(@RequestBody UserInfo userInfo, BindingResult bindingResult) {
        TSmsAccount tSmsAccount = mITSmsAccountService.selectOne(
                new EntityWrapper<TSmsAccount>()
                        .eq("Account_Name", userInfo.getUserName()));
        if (tSmsAccount == null){
            return R.error("用户不存在");
        }
        boolean b = mITSmsAccountService.modifyUser(userInfo);
        logger.debug("insert : " + b);
        return R.ok("新增成功");
    }


}
