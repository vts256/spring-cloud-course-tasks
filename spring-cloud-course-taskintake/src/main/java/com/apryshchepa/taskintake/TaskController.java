package com.apryshchepa.taskintake;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    private TaskProcessor taskProcessor;

    @RequestMapping(path = "/tasks", method = RequestMethod.POST)
    public @ResponseBody String launchTask(@RequestBody String s) {
        taskProcessor.publishRequest(s);
        System.out.println("Request made");
        return "success";
    }
}
