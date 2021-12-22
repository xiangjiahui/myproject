package com.xjh.myproject.config;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 123
 */
public class QuartzJobFactory implements Job {

    Logger logger = LoggerFactory.getLogger(QuartzJobFactory.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        logger.info("=================我是定时任务,每隔1秒执行一次==============");
    }
}
