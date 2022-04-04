package com.springboot.workers.crudapi.repository;

import java.sql.*;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.workers.crudapi.dao.WorkerDAO;
import com.springboot.workers.crudapi.model.Worker;
import com.springboot.workers.crudapi.util.DatabaseConnection;

import java.util.ArrayList;

@Repository
public class WorkerRepository implements WorkerDAO {
    private Connection connection;
    
    public WorkerRepository() throws SQLException {
        this.connection = DatabaseConnection.getConnection();
    }

    @Override
    public int add(Worker worker) throws SQLException {
        String format = "INSERT into worker VALUES (?,?,?,?,?,?,?)";

        try (PreparedStatement prep = connection.prepareStatement(format)) {
        	prep.setInt(1, worker.getWorkerId());
        	prep.setString(2, worker.getFirstName());
        	prep.setString(3, worker.getLastName());
        	prep.setInt(4, worker.getSalary());
        	prep.setDate(5, worker.getJoiningDate());
        	prep.setString(6, worker.getDept());
        	prep.setString(7, worker.getEmail());

            int col = prep.executeUpdate();
            System.out.println(connection + " row added");
            return col;
        }
    }

    @Override
    public void delete(int workerId) throws SQLException {
    	String query = "DELETE FROM Worker WHERE worker_id = "+workerId;
        try (PreparedStatement prep = connection.prepareStatement(query)) {
            int rowDeleted = prep.executeUpdate();
            System.out.println(rowDeleted + " row deleted");
        }
    }

    @Override
    public Worker getWorker(int workerId) throws SQLException {
    	String query = "SELECT * FROM worker WHERE worker_id = "+workerId;
        Worker worker = null;
        try (PreparedStatement prep = connection.prepareStatement(query)) {
            ResultSet result = prep.executeQuery();
            result.next();
			worker =new Worker(result.getInt(1),result.getString(2),result.getString(3),result.getInt(4),result.getDate(5),result.getString(6),result.getString(7));
		}
        return worker;
    }

    @Override
    public List<Worker> getWorkers() throws SQLException {
        List<Worker> list = new ArrayList<>();

        String query = "SELECT * FROM Worker";
		try(PreparedStatement prep = connection.prepareStatement(query)){
			ResultSet result = prep.executeQuery();
			while (result.next()) {
				list.add(new Worker(result.getInt(1), result.getString(2), result.getString(3), result.getInt(4), result.getDate(5),
						result.getString(6), result.getString(7)));
			}
			
			return list;
        }
    }

    @Override
    public void update(Worker worker) throws SQLException {
    	String query = "UPDATE Worker SET worker_id = ?,firstName = ?,lastName = ?,dept = ?,salary = ?,email = ? WHERE worker_id = ?";
    	try(PreparedStatement prep = connection.prepareStatement(query)){
            prep.setString(1, worker.getFirstName());
            prep.setString(2, worker.getLastName());
            prep.setInt(3, worker.getSalary());
            prep.setDate(4, worker.getJoiningDate());
            prep.setString(5, worker.getDept());
            prep.setString(6, worker.getEmail());
            prep.setInt(7, worker.getWorkerId());

            int rowCount = prep.executeUpdate();
            System.out.println(rowCount + " row updated");
        }
    }
    
    @Override
    public boolean updateWorkerEmailById(int workerId, String email) throws SQLException{
    	String update = "UPDATE worker SET email=? where worker_id=?";
    	
    	PreparedStatement prep = connection.prepareStatement(update);
    	prep.setString(1, email);
    	prep.setInt(2, workerId);
    	
    	int rowCount = prep.executeUpdate();
    	
    	return rowCount==1;
    		
    }
}
