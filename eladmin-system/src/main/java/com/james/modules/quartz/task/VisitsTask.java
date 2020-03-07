package com.james.modules.quartz.task;

import com.james.modules.monitor.service.VisitsService;
import org.springframework.stereotype.Component;

/**
 * @author cnb
 * @date 2018-12-25
 */
@Component
public class VisitsTask {

    private final VisitsService visitsService;

    public VisitsTask(VisitsService visitsService) {
        this.visitsService = visitsService;
    }

    public void run(){
        visitsService.save();
    }
}
