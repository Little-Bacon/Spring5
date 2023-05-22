package org.example.factorybean;

import org.springframework.beans.factory.FactoryBean;

import java.sql.Connection;
import java.sql.DriverManager;
//注意泛型

public class ConnectionFactoryBean implements FactoryBean<Connection> {
    public Connection getObject()throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/suns","root","123456");
        return conn;
    }

    @Override
    public Class<?> getObjectType() {
        return Connection.class;
    }

    public boolean isSingleton() {
        return false;

    }
}
