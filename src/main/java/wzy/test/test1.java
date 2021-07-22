package wzy.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import wzy.dao.EmployeeDao;
import wzy.pojo.Employee;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author 网中鱼
 * @date 2021/7/21-1:28
 */
public class test1 {

//    private Employee employee = new Employee();
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    public static void commitAndClose(SqlSession openSession) {
        if (openSession != null) {
            openSession.commit();
            openSession.close();
        }
    }

    @Before
    public void init() {
        ApplicationContext ioc =
                new ClassPathXmlApplicationContext("Spring/applicationContext.xml");
        sqlSessionFactory = ioc.getBean(SqlSessionFactory.class);
    }
    @Test
    public void test1(){
        SqlSession sqlSession = sqlSessionFactory.openSession();

        EmployeeDao mapper = sqlSession.getMapper(EmployeeDao.class);

        List<Employee> list = new ArrayList<Employee>(1000);
        for (int i = 0; i < 1000; i++) {
            Employee employee = new Employee("emp" + i, i % 2, UUID.randomUUID().toString().substring(0,6) + "@qq.com");

            list.add(employee);
        }

        int i = mapper.insertBatch(list);
        System.out.println(i);
    }
}
