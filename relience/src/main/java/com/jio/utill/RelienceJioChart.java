package com.jio.utill;

import java.io.File;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;
@Component
public class RelienceJioChart {
	/*public void chartGenerator(String path, List<Object[]> lst) {
		DefaultPieDataset dps = new DefaultPieDataset();

		for (Object[] objects : lst) {

			dps.setValue(objects[0].toString(), new Double(objects[1].toString()));

		}

		JFreeChart jfree = ChartFactory.createPieChart3D("JioUserInformation", dps, true, true, false);
		try {
			System.out.println("Hereeeee :) ");
			ChartUtilities.saveChartAsJPEG(new File("E://jioReports.jpeg"), jfree, 500, 400);

		} catch (Exception e) {
		System.out.println("inside OF UtilClass############### "+e+"#########&&&&&&&&&&&&&&&&&&&");
		}*/

		
		public void chartGenerator(String path,List<Object[]> list){
			//1.construct data set
			DefaultCategoryDataset dataset=new DefaultCategoryDataset();
			for(Object[] ob:list){
				dataset.setValue(new Double(ob[1].toString()),ob[0].toString(),"");
			}
			//2.convert to JFreeChart ob using ChartFactory
			JFreeChart chart=ChartFactory.createBarChart3D("Locationwise Report", "Location Type", "Location count", dataset, null, false, false, false);
			//3.save As Image using ChartUtils
			try {
				ChartUtilities.saveChartAsJPEG(new File("E://reportB.jpg"), chart, 400, 300);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	

}
