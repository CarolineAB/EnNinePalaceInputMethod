package com.test;

import org.junit.Test;

public class PrintlnServiceImplTest {

	@Test
	public void test() {
		PrintlnServiceImpl printlnServiceImpl = new PrintlnServiceImpl(1);
		printlnServiceImpl.writer();
//		 System.out.println(52+"\n\r");
		 // 创建一个计时器
//        Timer timer = new Timer();
// 
//        // 开启一个计时调度，延迟 0毫秒（也就是立即开始执行），调度评率： 1秒
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                // 生成随机数逻辑
//                Random r = new Random();
//                int num = r.nextInt(10) + 1;
////                System.out.println("随机数为：" + num);
////                byte[] intToBytes = RegexUtil.intToBytes(num, 2);
////                System.setIn(new ByteArrayInputStream(intToBytes));
//                
//                System.out.println(num+"\n\r");
////                App.main(null);
//            }
//        }, 0L, 1000L);
 
        // timer.cancel();  // 关闭计时器
	}

}
