package com.howoo.simplerpc.server;

import com.howoo.simplerpc.Request;
import com.howoo.simplerpc.ServiceDescriptor;
import com.howoo.simplerpc.common.utils.ReflectionUtils;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.assertNotNull;

public class ServiceManagerTest{
    ServiceManager sm;

    @Before
    public void init() {
        sm = new ServiceManager();
    }

    @Test
    public void testRegister() {
        TestInterface bean = new TestClass();
        sm.register(TestInterface.class, bean);
    }

    @Test
    public void testLookup() {
        TestInterface bean = new TestClass();
        sm.register(TestInterface.class, bean);

        Method method = ReflectionUtils.getPublicMethod(TestInterface.class)[0];
        ServiceDescriptor sdp = ServiceDescriptor.from(TestInterface.class, method);

        Request request = new Request();
        request.setService(sdp);

        ServiceInstance sis = sm.lookup(request);
        assertNotNull(sis);
    }
}