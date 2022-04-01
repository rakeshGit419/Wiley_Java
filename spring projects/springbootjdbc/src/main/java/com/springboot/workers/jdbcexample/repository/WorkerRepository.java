package com.springboot.workers.jdbcexample.repository;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.workers.jdbcexample.model.Worker;
import com.springboot.workers.jdbcexample.util.DatabaseConnection;
import com.springboot.workers.jdbcexample.dao.WorkerDAO;
@Repository
public class WorkerRepository implements WorkerDAO{
	private Connection connection;
//	private static final Logger log = LoggerFactory.getLogger(WorkerRepository.class);

	public WorkerRepository() throws ClassNotFoundException, SQLException {
		connection = DatabaseConnection.getConnection();
	}

	@Override
	public int add(Worker worker) throws SQLException {
		String query = "INSERT INTO Worker VALUES (?,?,?,?,?,?,?)";
		try(PreparedStatement prep = connection.prepareStatement(query)){
			prep.setInt(1, worker.getWorkerId());
			prep.setString(2, worker.getFirstName());
			prep.setString(3, worker.getLastName());
			prep.setString(4, worker.getDept());
			prep.setDouble(5, worker.getSalary());
			prep.setString(6, worker.getEmail());
			
			return prep.executeUpdate();
		}catch(SQLException e) {
//			log.error(e.toString());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public void delete(int workerId) throws SQLException {
		String query = "DELETE FROM Worker WHERE worker_id = ?";
		try(PreparedStatement prep = connection.prepareStatement(query)){
			prep.setInt(1, workerId);
			
			prep.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Worker getWorker(int workerId) throws SQLException {
		String query = "SELECT * FROM Worker WHERE worker_id = ?";
		try(PreparedStatement prep = connection.prepareStatement(query)){
			prep.setInt(1, workerId);
			ResultSet result = prep.executeQuery();
			result.next();
			return new Worker(result.getInt(1),result.getString(2),result.getString(3),result.getDouble(4),result.getDate(5),result.getString(6),result.getString(7));
		}catch(SQLException e) {
//			log.error(e.toString());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Worker> getWorkers() throws SQLException {
		List<Worker> list = new ArrayList<>();
		String query = "SELECT * FROM Worker";
		try(PreparedStatement prep = connection.prepareStatement(query)){
			
			ResultSet result = prep.executeQuery();
			while (result.next()) {
				list.add(new Worker(result.getInt(1), result.getString(2), result.getString(3), result.getDouble(4), result.getDate(5),
						result.getString(6), result.getString(7)));
			}
			
			return list;
		}catch(SQLException e) {
//			log.error(e.toString());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int update(Worker emp) throws SQLException {
		String query = "UPDATE Worker SET worker_id = ?,firstName = ?,lastName = ?,dept = ?,salary = ?,email = ? WHERE worker_id = ?";
		try(PreparedStatement prep = connection.prepareStatement(query)){
			prep.setInt(1,emp.getWorkerId());
			prep.setString(2,emp.getFirstName());
			prep.setString(3,emp.getLastName());
			prep.setString(4,emp.getDept());
			prep.setDouble(5,emp.getSalary());
			prep.setString(6,emp.getEmail());
			return prep.executeUpdate();
		}catch(SQLException e) {
//			log.error(e.toString());
			e.printStackTrace();
		}
		return 0;
	}
	
}