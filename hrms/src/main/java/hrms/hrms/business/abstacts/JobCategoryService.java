package hrms.hrms.business.abstacts;
import java.util.List;

import hrms.hrms.entities.concretes.JobCategory;

public interface JobCategoryService {
	List<JobCategory> getAll();
}
