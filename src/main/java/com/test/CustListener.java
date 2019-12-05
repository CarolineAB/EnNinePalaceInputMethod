package com.test;

import org.springframework.context.ApplicationListener;
/**
 * 自定义监听
 * @author A
 *
 */
public class CustListener implements ApplicationListener<PrintlnServiceImpl> {

	@Override
	public void onApplicationEvent(PrintlnServiceImpl event) {
		// TODO Auto-generated method stub
		event.writer();
	}

}
