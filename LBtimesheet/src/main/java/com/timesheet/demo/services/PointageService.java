package com.timesheet.demo.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.aspectj.weaver.ast.And;
import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.demo.model.DétailsPointage;
import com.timesheet.demo.model.Pointage;
import com.timesheet.demo.repostitories.IDétailsPointageRepository;
import com.timesheet.demo.repostitories.IPointageRepository;

import ch.qos.logback.core.net.SyslogOutputStream;
import net.bytebuddy.description.ModifierReviewable.OfAbstraction;
@Service
public class PointageService implements IPointageService {

	@Autowired
	IPointageRepository repository;
	
	@Autowired
	IDétailsPointageRepository repositoryDetailsPointage;
	
	
	
	
	
	@Override
	public Pointage savePointage(Pointage pointage) {
		return repository.save(pointage);
	}

	@Override
	public Pointage updatePointage(Pointage pointage) {
		return repository.save(pointage);
	}

	
	
	@Override
	public void deletePointage(Pointage pointage) {
		repository.delete(pointage);
	}

	@Override
	public void deletePointageById(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public Pointage getPointage(Integer id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Pointage> getAllPointage() {
		return repository.findAll();
	}
/*
	@Override
	public List<Pointage> getDetailsPointages() {
		List<DétailsPointage> detailsPointages=repository.findAll();
		List<Pointage> pointages =new ArrayList<Pointage>();
		
		detailsPointages.forEach(element->{
			Pointage pointage=new Pointage();
		/*	
			pointage.setStartTimePointage(element.get);
			pointage.setEndTimePointage(null);
			repository.save(pointage);
			pointages.add(pointage);
		});
		
		
		return pointages;
	}
	*/

	@Override
	public List<Pointage> employeePointagePerDay() {
		
		List<DétailsPointage> employeePointageDetails= repositoryDetailsPointage.findAllByOrderByIdAsc();
		
		List<Date> PointageDates =new ArrayList<Date>();
		List<Integer> idPointageEmployees =new ArrayList<Integer>();
		List<Pointage> PointageEmployeesList=new ArrayList<Pointage>();
		
		idPointageEmployees.add(0, employeePointageDetails.get(0).getIdPointageEmployee());
		PointageDates.add(0, employeePointageDetails.get(0).getPointageDate());
		for(int k=1;k<employeePointageDetails.size()-1;k++) {
			
			if((!employeePointageDetails.get(k).getPointageDate().equals(employeePointageDetails.get(k-1).getPointageDate())) ) {
				
				PointageDates.add(employeePointageDetails.get(k).getPointageDate());
			}
			if(!employeePointageDetails.get(k).getIdPointageEmployee().equals(employeePointageDetails.get(k-1).getIdPointageEmployee())) {
				idPointageEmployees.add(employeePointageDetails.get(k).getIdPointageEmployee());
			}
		
		}
		System.out.println(PointageDates);
		
		Integer a1 = new Integer(1);
        Integer b2 = new Integer(2);
       
		for(int j=0;j<PointageDates.size();j++) {
			List<DétailsPointage> PointageEmployeesList0=new ArrayList<DétailsPointage>();
			Pointage pointage=new Pointage();
			
			long timeInOffice=0;
			long totalTime=0;
			long outTime=0;
			
			pointage.setPointageDate(PointageDates.get(j));
			pointage.setIdPointage(j);
			
			for(int k=0;k<idPointageEmployees.size();k++) {
				
				 pointage.setIdPointageEmployee(idPointageEmployees.get(k));
				
			    for(int i=0;i<employeePointageDetails.size()-1;i++) {
			    	
			    	
			    	if((PointageDates.get(j).equals(employeePointageDetails.get(i).getPointageDate()))&& (idPointageEmployees.get(k).equals(employeePointageDetails.get(i).getIdPointageEmployee()))) {
						
			    		
			    		DétailsPointage pointage0=new DétailsPointage();

						pointage0.setTimePointage(employeePointageDetails.get(i).getTimePointage());
						
						PointageEmployeesList0.add(pointage0);
						
						pointage.setStartTimePointage(PointageEmployeesList0.get(0).getTimePointage());
						pointage.setEndTimePointage(PointageEmployeesList0.get(PointageEmployeesList0.size()-1).getTimePointage());
						
						
						
						
						 if((employeePointageDetails.get(i+1).getTypePointage().equals(b2)) && (employeePointageDetails.get(i).getTypePointage().equals(a1)))  {
							
							 
							timeInOffice=timeInOffice+((employeePointageDetails.get(i+1).getTimePointage()).getTime()-(employeePointageDetails.get(i).getTimePointage()).getTime());
							
							
						 }
						
					};
				
					
			}
		    
	 }
			

			totalTime=PointageEmployeesList0.get(PointageEmployeesList0.size()-1).getTimePointage().getTime()-PointageEmployeesList0.get(0).getTimePointage().getTime();
		    outTime=totalTime-timeInOffice;
		    pointage.setTotalTimePointage(timeInOffice);
		    pointage.setOutTimePointage(outTime);
			
		    
		    
			PointageEmployeesList.add(pointage);	
			
			
			
  }
		//System.out.println(PointageEmployeesList);
		
		
		/*
		for(int h=0;h<PointageEmployeesList.size();h++) {
			  repository.save(PointageEmployeesList.get(h));
		  }
		
	    */
	  return PointageEmployeesList;
	 
	  
	}


}
