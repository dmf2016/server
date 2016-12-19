package com.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import com.thread.TestRunning;

public class RunnableDemo8 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ThreadPoolTaskExecutor taskExecutor = applicationContext.getBean("threadPoolTaskExecutor",
                ThreadPoolTaskExecutor.class);
        for (int i = 0; i < 100; i++) {
            taskExecutor.execute(new TestRunning("R" + i, 5));
        }
    }
}
