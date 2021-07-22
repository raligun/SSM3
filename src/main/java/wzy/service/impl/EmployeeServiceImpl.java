package wzy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wzy.dao.EmployeeDao;
import wzy.pojo.Employee;
import wzy.service.EmployeeService;

import java.util.List;
import java.util.Map;

/**
 * @author 网中鱼
 * @date 2021/7/21-22:13
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
private EmployeeDao employeeDao;

    public Employee queryEmpById(int id) {
        return employeeDao.queryEmpById(id);
    }

    public int updateEmp(Employee employee) {
        return employeeDao.updateEmp(employee);
    }

    public int insertEmp(Employee employee) {
        return employeeDao.insertEmp(employee);
    }

    public boolean deleteEmpById(int id) {
        return employeeDao.deleteEmpById(id);
    }

    public List<Employee> queryAllEmpToList() {
        return employeeDao.queryAllEmpToList();
    }

    public Map<Integer, Employee> queryAllEmpToMap() {
        return employeeDao.queryAllEmpToMap();
    }

    public int insertBatch(List<Employee> list) {
        return employeeDao.insertBatch(list);
    }
}
