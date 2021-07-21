package org.example.spring.core.f_spel;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("workersHolder")
class WorkersHolder {
    private List<String> workers = new LinkedList<>();
    private Map<String, Integer> salaryByWorkers = new HashMap<>();
 
    public WorkersHolder() {
        workers.add("John");
        workers.add("Susie");
        workers.add("Alex");
        workers.add("George");
 
        salaryByWorkers.put("John", 35000);
        salaryByWorkers.put("Susie", 47000);
        salaryByWorkers.put("Alex", 12000);
        salaryByWorkers.put("George", 14000);
    }
 
    //Getters and setters
}


@Component
public class F_AccessListAndMapObjects {
	
	@Value("#{workersHolder.salaryByWorkers['John']}")		// 35000
	private Integer johnSalary;
	 
	@Value("#{workersHolder.salaryByWorkers['George']}")	// 14000
	private Integer georgeSalary;
	 
	@Value("#{workersHolder.salaryByWorkers['Susie']}")		// 47000
	private Integer susieSalary;
	 
	@Value("#{workersHolder.workers[0]}")					// John
	private String firstWorker;
	 
	@Value("#{workersHolder.workers[3]}")					// George
	private String lastWorker;
	 
	@Value("#{workersHolder.workers.size()}")				// 4
	private Integer numberOfWorkers;
	
}
