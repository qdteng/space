package cn.com.ylpw.web.crm.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import cn.com.ylpw.web.crm.util.Contact;
@Component
public class ApplicationStartup   implements ApplicationListener<ApplicationReadyEvent> {
	private static final Logger logger = LoggerFactory.getLogger(ApplicationStartup.class);
	
	@Override
    public void onApplicationEvent(final ApplicationReadyEvent event) {
		Contact.initDicCache();
    }
}