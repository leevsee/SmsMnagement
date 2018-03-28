package com.bxd.smsmanagement.controller;

import com.bxd.smsmanagement.model.R;
import com.bxd.smsmanagement.model.biz.User;
import com.bxd.smsmanagement.model.entity.TSmsAccount;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

/**
 * Description: TODO
 * Package: com.bxd.smsmanagement.controller
 *
 * @author Leeves
 * @date 2018-03-28
 */
@Api(tags = "短信服务商操作", description = "短信服务商和模板查询、新增、修改、删除")
@Controller
@RequestMapping("/facilitator")
public class SmsController {

    @PostMapping("/add")
    @ResponseBody
    @ApiOperation(value = "登陆", notes = "用户名、密码")
    @ApiImplicitParam(name = "user", value = "用户实体user", required = true, dataType = "User")
    public R addFacilitator(@RequestBody User user, BindingResult bindingResult) {


    }

}
