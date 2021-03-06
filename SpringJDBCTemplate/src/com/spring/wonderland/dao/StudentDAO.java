package com.spring.wonderland.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.wonderland.persistent.Student;

/**
 * This interface provided CRUD rules. Implementor must be apply all rules.
 * 
 * @author Alice
 */

public interface StudentDAO {

	/**
	 * getter for getJdbcTemplate
	 * 
	 * @return JdbcTemplate org.springframework.jdbc.core.JdbcTemplate
	 */
	public abstract JdbcTemplate getJdbcTemplate();

	/**
	 * setter for getJdbcTemplate
	 * 
	 * @param jdbcTemplate org.springframework.jdbc.core.JdbcTemplate
	 */
	public abstract void setJdbcTemplate(JdbcTemplate jdbcTemplate);

	/**
	 * Save Student object to database
	 * 
	 * @param student
	 *            Student type
	 * @return inserting status whether success or not
	 */
	public abstract int insertStudent(Student student);

	/**
	 * Retrieve specific Student data according to unique id
	 * 
	 * @param id
	 *            primary key of Student table
	 * @return all columns of specific student data
	 */
	public abstract Student getStudentByID(int id);

	/**
	 * Retrieve list of Students data
	 * 
	 * @return all Student records
	 */

	public abstract List<Student> retrieveStudentCollection();

	/**
	 * Retrieve specific list Student data according to course name
	 * 
	 * @param course
	 * @return all columns of specific student data joining same course
	 */
	public abstract List<Student> retrieveStudentByCourse(String course);

	/**
	 * Update specific Student data according to unique id
	 * 
	 * @param id
	 *            primary key of Student table
	 * @return updating status whether success or not
	 */
	public abstract int updateStudent(Student student);

	/**
	 * Delete specific Student according to unique id
	 * 
	 * @param id
	 *            primary key of Student table
	 * @return deleting status whether success or not
	 */
	public abstract int deleteStudent(int id);

}
