package com.example.demo.bean;

import org.springframework.stereotype.Component;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Component
@Named("testBean")
@ViewScoped
public class TestBean implements Serializable {
    
    public String testAction() {
        System.out.println("Test action executed!");
        return null;
    }
} 