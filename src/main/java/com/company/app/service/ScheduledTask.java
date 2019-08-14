package com.company.app.service;

import com.company.app.beans.MyBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@EnableScheduling
@Service
public class ScheduledTask {
    private MyBean myBean;

    @Autowired
    public ScheduledTask(MyBean myBean) {
        this.myBean = myBean;
    }

    public void changeText(String text) {
        myBean.setText(text);
    }

    public String getText() {
        return myBean.getText();
    }

    @Scheduled(fixedDelay = 1000)
    public void run() {
        System.out.println(myBean.getText());
        //log.info(myBean.getText());
    }
}