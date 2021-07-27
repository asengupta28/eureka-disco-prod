package com.autodiscoprod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@EnableDiscoveryClient
public class AppProducer
{
	public static void main(String[] args)
	{
		SpringApplication.run(AppProducer.class, args);
	}
}

@Controller
class AppController
{
    @RequestMapping(value="/process", method = RequestMethod.GET)
    public @ResponseBody String  showLoginPage(ModelMap model)
	{
		System.out.println("APP 1 Producer Called");
        return "Processing aap1";
    }
}