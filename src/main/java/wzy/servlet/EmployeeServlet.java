package wzy.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import wzy.dao.EmployeeDao;
import wzy.pojo.Employee;
import wzy.service.EmployeeService;

import java.util.List;

/**
 * @author 网中鱼
 * @date 2021/7/21-1:49
 */
@Controller
public class EmployeeServlet {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("hello")
    public String test(Model model){
        List<Employee> employees = employeeService.queryAllEmpToList();

        model.addAttribute("list",employees);
        return "success";
    }
    @RequestMapping("page")
    public String page(Model model){
        List<Employee> list = employeeService.queryAllEmpToList();
        model.addAttribute("list",list);

        return "success";
    }
}
