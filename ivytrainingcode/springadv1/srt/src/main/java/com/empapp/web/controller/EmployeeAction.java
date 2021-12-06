package com.empapp.web.controller;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.empapp.model.dao.Employee;
import com.empapp.model.dao.EmployeeDao;
import com.empapp.model.dao.EmployeeDaoImpl;
import com.empapp.model.forms.EmployeeForm;

public class EmployeeAction extends Action {
	
	private EmployeeDao dao=new EmployeeDaoImpl();
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, ServletRequest request,
			ServletResponse response) throws Exception {
		EmployeeForm empForm = (EmployeeForm) form;

		Employee emp=getEmployee(empForm);
		//hit db to add emp to the databases
		dao.addEmployee(emp);
		
		return mapping.findForward("success");

		// return mapping.findForward("failure");

	}
	
	public Employee getEmployee(EmployeeForm employeeForm) {
		return new Employee(employeeForm.getId(), employeeForm.getName(),
				employeeForm.getSalary());
	}

}
