package wzy.dao;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import wzy.pojo.Employee;

import java.util.List;
import java.util.Map;
@Repository
public interface EmployeeDao {
	
	public Employee queryEmpById(int id);
	
	public int updateEmp(Employee employee);
	
	public int insertEmp(Employee employee);
	
	public boolean deleteEmpById(int id);

	public List<Employee> queryAllEmpToList();

	@MapKey("id")
	public Map<Integer,Employee> queryAllEmpToMap();

	public int insertBatch(@Param("emp") List<Employee> list);


}
