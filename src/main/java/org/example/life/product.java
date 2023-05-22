package org.example.life;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class product implements InitializingBean, DisposableBean {
    public void Product(){
        System.out.println("product");
    }
//    初始化操作


    @Override
    public void destroy() throws Exception {
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
