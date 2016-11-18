package com.alfasoft.dao;

import java.util.Map;
import java.util.TreeMap;

import com.alfasoft.model.BustaPaga;

public class BustaPagaDao {
	private Map<Integer, BustaPaga> buste;
	
	
	public BustaPagaDao() {
		buste = new TreeMap<Integer, BustaPaga>();
		
		BustaPaga bp1 = new BustaPaga(1,1200);
		BustaPaga bp2 = new BustaPaga(2,2300);
		BustaPaga bp3 = new BustaPaga(3,3400);
		BustaPaga bp4 = new BustaPaga(4,4500);
		BustaPaga bp5 = new BustaPaga(5,5600);
		
		buste.put(bp1.getId(),bp1);
		buste.put(bp2.getId(),bp2);
		buste.put(bp3.getId(),bp3);
		buste.put(bp4.getId(),bp4);
		buste.put(bp5.getId(),bp5);
				
	}
	
	
	public BustaPagaDao(Map<Integer, BustaPaga> buste) {
		this.buste = buste;
	}

	public Map<Integer, BustaPaga> getBuste() {
		return buste;
	}

	public void setBuste(Map<Integer, BustaPaga> buste) {
		this.buste = buste;
	}
	
	
}
