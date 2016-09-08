package cn.ifxcode.utils.test;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.ifxcode.utils.email.service.EmailService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring.xml"})
public class EmailTest {

	@Autowired
	private EmailService emailService;
	
	private String subject = null;
	private String address[] = null;
	private String ccAddress[] = null;
	private String msg = null;
	private File fileList[] = null;
	
	@Before
	public void init() {
		subject = "this is come from xxx's test mail";
		address = new String[]{"xxxxx@qq.com"};
		//ccAddress = new String[]{"xxxxx@qq.com"};
		msg = "this is test content";
		//fileList = ;
	}
	
	@Test
	public void testSendMailAndFile() {
		emailService.sendMailAndFile(subject, address, ccAddress, msg, fileList);
	}
	
	@Test
	public void testSendMail() {
		emailService.sendMail(subject, address, ccAddress, msg);
	}

}
