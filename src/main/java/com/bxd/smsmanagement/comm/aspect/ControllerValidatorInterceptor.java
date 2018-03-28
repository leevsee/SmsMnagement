package com.bxd.smsmanagement.comm.aspect;

import com.bxd.smsmanagement.model.R;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

/**
 * Description: TODO:来自于参数校验的异常处理
 * Package: com.bxd.smsmanagement.comm.config
 *
 * @author Leeves
 * @date 2018-03-28
 */
@Aspect
@Component
public class ControllerValidatorInterceptor {

    @Around("execution(* com.bxd.smsmanagement.controller.*.*(..)) && args(..,bindingResult)")
    public Object doAround(ProceedingJoinPoint pjp, BindingResult bindingResult) throws Throwable {
        Object retVal;
        if (bindingResult.hasErrors()) {
            retVal = R.error(bindingResult.getFieldError().getDefaultMessage());
        } else {
            retVal = pjp.proceed();
        }
        return retVal;
    }
}
