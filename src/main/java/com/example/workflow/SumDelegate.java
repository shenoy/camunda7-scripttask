package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SumDelegate implements JavaDelegate {

    public void execute(DelegateExecution execution) throws Exception {
        Integer x = (Integer) execution.getVariable("x");

        System.out.println("the value of sum is  : " + x);

        // do something
    }

}