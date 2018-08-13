package com.mybatis.generator.demo.mapper;

import com.mybatis.generator.demo.model.Message;
import com.mybatis.generator.demo.model.MessageExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class MessageMapperTest {

    @Autowired
    private MessageMapper messageMapper;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void countByExample() {
    }

    @Test
    public void deleteByExample() {
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByExample() {
        Long id = 1L;
        String message = "999";
        MessageExample messageExample = new MessageExample();
        MessageExample.Criteria criteria = messageExample.createCriteria();
        //criteria.andIdEqualTo(id);
        criteria.andMessageEqualTo(message);
        List<Message> messageList = messageMapper.selectByExample(messageExample);
        //System.out.println("messageList = " + messageList.toString());
        logger.info("messageList={}", messageList.toString());
    }

    @Test
    public void selectByPrimaryKey() {
        Long id = 1L;
        Message message = messageMapper.selectByPrimaryKey(id);
        System.out.println("message = " + message.toString());
        logger.info("message = " + message.toString());
    }

    @Test
    public void updateByExampleSelective() {
    }

    @Test
    public void updateByExample() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}