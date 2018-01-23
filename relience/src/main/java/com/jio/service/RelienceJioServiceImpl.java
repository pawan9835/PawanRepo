package com.jio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jio.dao.RelianceDao;
import com.jio.model.RelienceJio;
@Service
public class RelienceJioServiceImpl implements RelienceJioService{
    @Autowired
	 private RelianceDao relianceDao;
	public int saveJioSimInfo(RelienceJio rJio) {
		
		return relianceDao.saveJioSimInfo(rJio);
	}
	public List<RelienceJio> loadAllData() {
		
		return relianceDao.loadAllData();
	}
	public List<Object[]> loadDatabyStateArea() {
		
		return  relianceDao.loadDatabyStateArea();
	}
	

}
