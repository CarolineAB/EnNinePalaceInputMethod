package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

@SpringBootApplication
public class EnNinePalaceInputMethodApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnNinePalaceInputMethodApplication.class, args);
		System.out.println("Service is running...");
		ConsoleListener cs = new ConsoleListener(new Scanner(System.in), new ConsoleListener.Action() {

			@Override
			public void act(String msg) {
//				System.out.println("原样输出" + msg);
				Map<Integer, String> map = new  HashMap<Integer,String>();
				if (!StringUtils.isEmpty(msg)) {//不为空
//					String[] split = msg.split(",");
//						String string = split[i];
						boolean numberic = RegexUtil.isNumberlow3(msg);
						if(numberic){//是数字
							for (int i = 0; i < msg.length(); i++) {
							char c = msg.charAt(i);
							String value = getWordsByNum(c);
							map.put(i, value);
							
							}
						}else{
							System.out.println("输入数据中，存在非法数据！请输入0-99之间的数据");
						}
//						string.p
//						getWordsByNum(Integer.valueOf(string));
					combination(map);
				}else{
					System.out.println("请输入数字！");
				}
			}

		});
		 cs.listenInNewThread();
	        while (true) {
	            try {
	                Thread.sleep(1);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	}
	public static void combination(Map<Integer, String> map) {// 控制台监听
		for (int i = 0; i < map.size(); i++) {
			String s1 = map.get(i);
			String[] sa1 = s1.split(",");
			if(map.size()>1){
			for (int j = i+1; j < map.size(); j++) {
				String s2 = map.get(j);
				String[] sa2 = s2.split(",");
				for (int k = 0; k < sa1.length; k++) {
					for (int k2 = 0; k2 < sa2.length; k2++) {
						String e = sa1[k]+sa2[k2];
						if(!e.equals("11")&&!e.equals("00")){
							System.out.print(e.replaceAll("0", "").replaceAll("1", "")+" ");
						}else{
							System.out.println(e);
						}
					}
				}
			}
			} else {
				for (int d = 0; d < sa1.length; d++) {
					
					System.out.println(sa1[d]+" ");
				}
			}
		}
		System.out.println();
	}
	
	
	public static String getWordsByNum(char num) {
		String strArr = null ;
		switch (num) {
		case '0':
			strArr = "0";
			break;
		case '1':
			strArr = "1";
			break;
		case '2':
			strArr = "a,b,c";
			break;
		case '3':
			strArr = "d,e,f";
			break;
		case '4':
			strArr = "g,h,i";
			break;
		case '5':
			strArr = "j,k,l";
			break;
		case '6':
			strArr = "m,n,o";
			break;
		case '7':
			strArr = "p,q,r,s";
			break;
		case '8':
			strArr = "t,u,v";
			break;
		case '9':
			strArr = "w,x,y,z";
			break;
		}
		return strArr;
	}


}
