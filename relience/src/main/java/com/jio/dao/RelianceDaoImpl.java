package com.jio.dao;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.jio.model.RelienceJio;

@Repository
public class RelianceDaoImpl implements RelianceDao {
          @Autowired
	        HibernateTemplate  ht;
         @Transactional
	public int saveJioSimInfo(RelienceJio rJio) {
		return (Integer) ht.save(rJio);
	}
		public List<RelienceJio> loadAllData() {
			
			return ht.loadAll(RelienceJio.class);
		}
		public List<Object[]> loadDatabyStateArea() {
			       
			     //  String query = "select  JIOAREA	 count(JIOAREA) from"+RelienceJio.class+"group by JIOAREA";
			       
			       String query="select jioArea,count(jioArea) "
			    			+ " from  "+RelienceJio.class.getName()
			    			+ " group by jioArea";
			       
			        //    List<Object[]>   areaList = ht.find(values);
			       System.out.println("here ********************");
			       
			    List<Object[]> areaObject =  (List<Object[]>) ht.find(query);
			    
			return areaObject;
		}

}
