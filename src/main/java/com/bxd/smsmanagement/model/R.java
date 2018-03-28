package com.bxd.smsmanagement.model;

import com.bxd.smsmanagement.comm.SMSConst;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: TODO: 返回信息类
 * Package: com.bxd.medicalinsurance.model.payBiz
 *
 * @author Leeves
 * @date 2018-01-14
 */

public class R<T> extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;

	public R() {
		put(SMSConst.RETRUN_CODE, SMSConst.RETRUN_SUCCESS_CODE);
		put(SMSConst.RETRUN_MSG, "处理成功！");
	}

	public static R error() {
		return error(SMSConst.RETRUN_FAIL_CODE, "处理失败！");
	}

	public static R error(String msg) {
		return error(SMSConst.RETRUN_FAIL_CODE, msg);
	}

    public static R error(String code, String msg) {
        R r = new R();
        r.put(SMSConst.RETRUN_CODE, code);
        r.put(SMSConst.RETRUN_MSG, msg);
        return r;
    }

	public static R ok(String msg) {
		R r = new R();
		r.put(SMSConst.RETRUN_MSG, msg);
		return r;
	}

    public static <T> R<T> ok(T t){
        R<T> r = new R<T>();
        r.put(SMSConst.RETRUN_MSG,t);
        return r;
    }

	public static R ok(Map<String, Object> map) {
		R r = new R();
		r.putAll(map);
		return r;
	}

	@Override
	public R put(String key, Object value){
		super.put(key,value);
		return this;
	}

	public static R ok() {
		return new R();
	}


    public static void main(String[] args) {
/*        R ok = R.ok("123");
        String r = ok.get("returnMsg");
        System.out.println(r);*/
    }
}
