package com.situ.task1.service.impl;

import java.util.Date;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.situ.task1.service.Job2Task;




@Service
@EnableScheduling
public class Job2TaskImpl implements Job2Task {
//	//此处可以依赖注入进来Dao层
//	@Override
//	@Scheduled(cron = "0 01 10 * * ?")
//	public void autoJob2() {
//		//可以书写自己的逻辑代码
//		System.out.println("这是通过注释的方式自动调用2的方法"+new Date().toLocaleString());
//		
//	}
//
//	@Override
//	public void autoJob3() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void autoJob() {
//		// TODO Auto-generated method stub
//		
//	}

//@Override
//@Scheduled(cron = "0 0 0/2 * * ?")
////cron = "0 0 0/2 * * ?"==>每隔两小时进行一次
//public void autoJob3() {
//	//可以书写自己的逻辑代码
//	System.out.println("这是通过注释的方式自动调用的方法"+new Date().toLocaleString());
//	
//}
}





























