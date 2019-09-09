package org.seckill.dao;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)

//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {


    @Resource
    private SuccessKilledDao successKilledDao;


    @Test
    public void insertSuccessKilled() {
        long seckillId=1000L;
        long userPhone=13476191877L;
        int insertCount=successKilledDao.insertSuccessKilled(seckillId,userPhone);
        System.out.println("insertCount="+insertCount);
    }

    @Test
    public void queryByIdWithSeckill() {
    }
}
