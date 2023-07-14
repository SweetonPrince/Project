package com.gradedproject.q1;

public class HrDepartment extends SuperDepartment {
	String departmentName() {
		return "HR Department";
	}

	String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}

	String getWorkDeadline() {
		return "Complete by EOD";
	}

	String doActivity() {
		return "team Lunch";

	}
}