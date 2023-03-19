package com.howoo.simplerpc.server;

import com.howoo.simplerpc.Request;
import com.howoo.simplerpc.common.utils.ReflectionUtils;

//调用具体服务
public class ServiceInvoker {
    public Object invoke(ServiceInstance service, Request request) {
        return ReflectionUtils.invoke(
                service.getTarget(),
                service.getMethod(),
                request.getParameters());
    }
}
