package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstacts.JobCategoryService;
import hrms.hrms.entities.concretes.JobCategory;

@RestController
@RequestMapping("/api/jobs")
public class JobCategoryController {

	private JobCategoryService jobService;

	public JobCategoryController(JobCategoryService jobService) {
		super();
		this.jobService = jobService;
	}
	
	@GetMapping("/getall")
	public List<JobCategory> getAll(){
		return this.jobService.getAll();
	}
	
}
