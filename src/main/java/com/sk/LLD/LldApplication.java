package com.sk.LLD;

import com.sk.LLD.Lecture4.Student;
import com.sk.LLD.Lecture4.User;
import com.sk.LLD.Threads.SimpleThreadsUsingRunnable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LldApplication {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Project started @ "+Thread.currentThread().getName());
		SimpleThreadsUsingRunnable simpleThreadsUsingRunnable1=new SimpleThreadsUsingRunnable(6);
		SimpleThreadsUsingRunnable simpleThreadsUsingRunnable2=new SimpleThreadsUsingRunnable(7);
		Thread thread1=new Thread(simpleThreadsUsingRunnable1);
		Thread thread2=new Thread(simpleThreadsUsingRunnable2);
		thread1.start();
		//NOTE: .sleep will create delay before next thread starts
		//thread1.sleep(5000);
		//NOTE: .join will block the upcoming thread to execute until previous one completes
		thread1.join();
		thread2.start();
	}

}
