package com.nowcoder.community.test;
import com.nowcoder.community.CommunityApplication;
import com.nowcoder.community.util.MailClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MailTests {
    @Autowired
    private MailClient mailClient;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void testMail() {
        mailClient.sendMail("2453080254@qq.com", "Hello Boy", "I am you father");
    }

    @Test
    public void HTMLTest() {
        Context context = new Context();
        context.setVariable("username", "王炳炳");
        String s = templateEngine.process("/mail/demo", context);
        System.out.println(s);

        mailClient.sendMail("1636799006@qq.com", "HTML", s);
    }


}
