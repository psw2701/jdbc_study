package jdbc_study.jdbc;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import jdbc_study.jdbc.dao.DepartmentDao;
import jdbc_study.jdbc.dao.DepartmentDaoImpl;
import jdbc_study.jdbc.dto.Department;

public class DepartmentDaoTest {
	static DepartmentDao dao;
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		MySQLjdbcUtilTest.LOG.debug("setUpBeforeClass");
		dao = new DepartmentDaoImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		MySQLjdbcUtilTest.LOG.debug("tearDownAfterClass");
		dao = null;
	
	}

	@Test
	public void testSelectDepartmentByAll() throws SQLException {
		List<Department> list = dao.selectDepartmentByAll();
		for(Department dept : list) {
			MySQLjdbcUtilTest.LOG.debug(dept);
		}
		Assert.assertNotEquals(0, list.size());
	}

}
