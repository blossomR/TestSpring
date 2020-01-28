package com.redwall.mybatis;

import com.redwall.mybatis.dao.UserDao;
import com.redwall.mybatis.dao.UserDaoImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class mybatisTester {

    private SqlSession sqlSession;

    public UserDao userDao;

    @Before
    public void before() throws IOException {
        // 指定全局配置文件
        String resource = "mybatis-config.xml";
        // 读取配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 构建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 获取sqlSession
        this.sqlSession = sqlSessionFactory.openSession();
        this.userDao = new UserDaoImpl(sqlSession);
    }

    @Test
    public void test() throws IOException {
        try {
            // 操作CRUD，第一个参数：指定statement，规则：命名空间+“.”+statementId
            // 第二个参数：指定传入sql的参数：这里是用户id
            User user = sqlSession.selectOne("UserMap.selectUser", 1);
            System.out.println(user);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testDao() {
        System.out.println("all : \n" + userDao.queryUserAll());
        System.out.println("by id  ：\n " + userDao.queryUserById("1"));
    }

    @Test
    public void testInsert(){
        User user  = new User();
        user.setId("1");
        user.setAge(27);
        userDao.updateUser(user);
        sqlSession.commit();
    }
}
