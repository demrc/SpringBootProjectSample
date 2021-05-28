package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstacts.JobCategoryService;
import hrms.hrms.dataAccess.abstracts.JobCategoryDao;
import hrms.hrms.entities.concretes.JobCategory;

@Service
public class JobCategoryManager implements JobCategoryService {

	private JobCategoryDao jobDao;
	
	@Autowired
	public JobCategoryDao getJobDao() {
		return jobDao;
	}

	

	@Override
	public List<JobCategory> getAll() {
		return this.jobDao.findAll();
	}

}
