package org.kireshvanth;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class EmployeeDAO {
    private final JdbcTemplate jdbcTemplate;

    public EmployeeDAO(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Employee> findAll() {
        return jdbcTemplate.query("SELECT * FROM employees", new EmployeeRowMapper());
    }

    public Employee findById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM employees WHERE id = ?", new EmployeeRowMapper(), id);
    }

    public int save(Employee employee) {
        return jdbcTemplate.update("INSERT INTO employees (name, department) VALUES (?, ?)",
                employee.getName(), employee.getDepartment());
    }

    public int update(Employee employee) {
        return jdbcTemplate.update("UPDATE employees SET name = ?, department = ? WHERE id = ?",
                employee.getName(), employee.getDepartment(), employee.getId());
    }

    public int deleteById(int id) {
        return jdbcTemplate.update("DELETE FROM employees WHERE id = ?", id);
    }

    private static final class EmployeeRowMapper implements RowMapper<Employee> {
        @Override
        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
            Employee employee = new Employee();
            employee.setId(rs.getInt("id"));
            employee.setName(rs.getString("name"));
            employee.setDepartment(rs.getString("department"));
            return employee;
        }
    }
}
