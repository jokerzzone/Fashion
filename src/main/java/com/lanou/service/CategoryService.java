package com.lanou.service;

import java.util.List;
import java.util.Map;

public interface CategoryService {
	
	//wz
	public void addCatData(int navId);
	
	public String selectCat(int catId);
	
	//xy
	public List<Map<String, Object>> selectDesc(Integer parentId);
	
}
