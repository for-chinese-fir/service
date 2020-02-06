package com.situ.task1.service.impl;

import java.util.Date;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.situ.task1.service.Job3Task;
@Service
@EnableScheduling
public class Job3TaskImpl implements Job3Task {

	@Override
	@Scheduled(cron = "0 29 10 * * ?")
	public void autoJob3() {
		//可以书写自己的逻辑代码
		System.out.println("这是通过注释的方式自动调用2的方法"+new Date().toLocaleString());
		
	}

	@Override
	public void autoJob2() {
		// TODO Auto-generated method stub
		
	}

}
