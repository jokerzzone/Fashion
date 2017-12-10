package com.lanou.service;

import java.util.Map;

public interface GoodsService {

	// xy
	// 根据标题进行展示，分页，排序
	public Map<String, Object> titleGoods(int titleId, int chooseId, int pageId, int sortId,int brandId,String[] attr_idAndType);

	// 根据二级分类的商品进行展示，分页，排序
	public Map<String, Object> SecondGoods(int catId, int chooseId, int pageId, int sortId,int brandId,String[] attr_idAndType);

}
