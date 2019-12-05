package com.test;

import org.junit.Test;

public class PrintlnServiceImplTest {

	@Test
	public void test() {
		PrintlnServiceImpl printlnServiceImpl = new PrintlnServiceImpl(1);
		printlnServiceImpl.writer();
	}

}
