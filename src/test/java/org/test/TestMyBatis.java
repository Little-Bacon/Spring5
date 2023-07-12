package org.test;

import DAO_example.mybatis.User;
import DAO_example.mybatis.UserDAO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestMyBatis {
    @Test
    public static void main(String[] args) throws IOException {

        InputStream inputStream = Resources.getResourceAsStream("DAOContext/myBatis-config.xml");
//        InputStream inputStream = Resources.getResourceAsStream("DAOContext/UserDAOMapper.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
//        拿到userDAO对象
        UserDAO userDAO = session.getMapper(UserDAO.class);
        userDAO.save(new User(1,"bacon","123456"));
        session.commit();
    }
}
