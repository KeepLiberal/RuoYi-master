package com.ruoyi.framework.web.domain.server;

/**
 * 线程池相关信息
 *
 * @author yay
 */
public class ThreadPool {


    /**
     * 计划线程数
     */
    private double taskCount;

    /**
     * 完成线程数
     */
    private double completedTaskCount;

    /**
     * 排队线程数
     */
    private double queueSize;

    /**
     * 活动线程数
     */
    private double activeCount;

    public double getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(double taskCount) {
        this.taskCount = taskCount;
    }

    public double getCompletedTaskCount() {
        return completedTaskCount;
    }

    public void setCompletedTaskCount(double completedTaskCount) {
        this.completedTaskCount = completedTaskCount;
    }

    public double getQueueSize() {
        return queueSize;
    }

    public void setQueueSize(double queueSize) {
        this.queueSize = queueSize;
    }

    public double getActiveCount() {
        return activeCount;
    }

    public void setActiveCount(double activeCount) {
        this.activeCount = activeCount;
    }
}
