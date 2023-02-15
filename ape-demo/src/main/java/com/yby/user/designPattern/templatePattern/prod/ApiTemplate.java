package com.yby.user.designPattern.templatePattern.prod;

import com.yby.bean.Result;
import com.yby.bean.ResultCode;

/**
 * @Author: ChickenWing
 * @Description: api模板
 * @DateTime: 2022/11/19 21:52
 */
public class ApiTemplate {

    public void execute(Result result, final Action action) {
        try {
            action.validate();
            action.execute();
            action.after();
            result.setSuccess(true);
            result.setCode(1024);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setCode(ResultCode.ERROR);
        }
    }

}
