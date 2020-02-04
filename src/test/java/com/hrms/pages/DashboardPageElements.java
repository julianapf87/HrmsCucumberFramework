package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class DashboardPageElements extends CommonMethods {

	@FindBy(linkText = "Leave")
	public WebElement leaveLnk;

	@FindBy(linkText = "Leave List")
	public WebElement leaveListLnk;

	@FindBy(linkText = "PMI")
	public WebElement pmi;

	@FindBy(id = "menu_pim_addEmployee")
	public WebElement addEmp;
	
	@FindBy (id = "menu_core_viewDefinedPredefinedReports")
	public WebElement report;

	public DashboardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	public void navigateToLeaveList () {
		jsClick(leaveLnk);
		jsClick(leaveListLnk);
	}
	public void navigateToAddEmployee() {
		jsClick(pmi);
		jsClick(addEmp);
	}
	public void navigateToReport () {
		jsClick(pmi);
		jsClick(report);
	}
}
