package jdbc_study.jdbc.dao;

import java.sql.SQLException;
import java.util.List;

import jdbc_study.jdbc.dto.Department;

public interface DepartmentDao {
	List<Department> selectDepartmentByAll() throws SQLException;
}
