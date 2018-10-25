package com.wanda.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.wanda.springcloud.entites.Dept;

@RestController
public class DeptController_Consumer {
	/*private static final String ssdfsd="http://127.0.0.1:8001";*/
	private static final String ssdfsd="http://MICROSERVICECLOUD-DEPT";
	
	
   @Autowired
   private RestTemplate restTemplate;
   
   @RequestMapping(value="/consumer/dept/add")
   public boolean add(Dept dept) {
	   return restTemplate.postForObject(ssdfsd+"/dept/add", dept, Boolean.class);
	   
   }
   
   @RequestMapping(value="/consumer/dept/get/{id}")
   public Dept get(@PathVariable("id") Long id) {
	   return restTemplate.getForObject(ssdfsd+"/dept/get/"+id,Dept.class);
   }
   
   
   @SuppressWarnings("unchecked")
   @RequestMapping(value="/consumer/dept/list")
   public List<Dept> list() {
	   return restTemplate.getForObject(ssdfsd+"/dept/list",List.class);
   }
   @RequestMapping(value="/rest/aa")
   public String test() {
	   return "test";
   }
}
