package wzy.service;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import wzy.pojo.Employee;

import java.util.List;
import java.util.Map;

/**
 * @author 网中鱼
 * @date 2021/7/21-22:12
 */
@Service
public interface EmployeeService {

    public Employee queryEmpById(int id);

    public int updateEmp(Employee employee);

    public int insertEmp(Employee employee);

    public boolean deleteEmpById(int id);

    public List<Employee> queryAllEmpToList();

    @MapKey("id")
    public Map<Integer,Employee> queryAllEmpToMap();

    public int insertBatch(@Param("emp") List<Employee> list);
}
