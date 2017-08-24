package br.edu.unicesumar.service;

import java.util.List;

import br.edu.unicesumar.dao.CustomerDAO;
import br.edu.unicesumar.Model.Customer;

public class CustomerService {
	private CustomerDAO dao;
	
	public CustomerService(){
		dao = new CustomerDAO();
	}
	
	public void insertCustomer(int id, String name, String email, String phone){
		//Chamar a DAO
	}
	
	public List<Customer> listAll(){
		return dao.listAll();
	}
}