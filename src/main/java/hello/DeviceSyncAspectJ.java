package hello;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DeviceSyncAspectJ {
    /**
     * 切入点
     */
    @Pointcut("@annotation(DeviceSync)")
    public void pointcut(){

    }
    /**
     * 切入点之后调用的方法
     */
    @After("pointcut()")
    public void after(){
        System.out.println("after**************");
    }

    /**
     * 切入点之前调用的方法
     */
    @Before("pointcut()")
    public void before(){
        System.out.println("before******************");
    }

    @AfterReturning("pointcut()")
    public void afterReturning(){
        System.out.println("after returning************");
    }
}
