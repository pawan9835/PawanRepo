package com.jio.dao;

import java.util.List;

import com.jio.model.RelienceJio;

public interface RelianceDao {
	
	   public int saveJioSimInfo(RelienceJio rJio);
	   public List<RelienceJio> loadAllData();
	   public List<Object[]> loadDatabyStateArea();

}
