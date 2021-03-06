package com.ordermanagement.service;

import java.util.List;

import com.core.exception.BusinessException;
import com.ordermanagement.dao.OrderDAO;
import com.ordermanagement.model.Order;

public class OrderServiceImpl implements OrderService{
	
	private OrderDAO orderDAO;

	public OrderServiceImpl() {
		super();
		orderDAO = new OrderDAO();		
	}

	@Override
	public void add(List<Order> orderLst) throws BusinessException{
		orderDAO.add(orderLst);		
	}

	@Override
	public List<Order> getAllOrders() throws BusinessException{		
		return orderDAO.getAll();
	}

	@Override
	public Order getOrderById(int orderid)throws BusinessException {		
		return orderDAO.get(orderid);
	}

	@Override
	public void updateOrder(Order order) throws BusinessException{
		orderDAO.update(order);		
	}

	@Override
	public void deleteOrder(int orderid) throws BusinessException{
		orderDAO.delete(orderid);		
	}

}
