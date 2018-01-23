package com.jio.service;

import java.util.List;

import com.jio.model.RelienceJio;

public interface RelienceJioService {
	   public int saveJioSimInfo(RelienceJio rJio);
	   public List<RelienceJio> loadAllData();
	   public List<Object[]>loadDatabyStateArea();




}
