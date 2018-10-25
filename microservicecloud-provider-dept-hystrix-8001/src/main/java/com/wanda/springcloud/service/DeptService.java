package com.wanda.springcloud.service;

import java.util.List;

import com.wanda.springcloud.entites.Dept;

public interface DeptService {
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
