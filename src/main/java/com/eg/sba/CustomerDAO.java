package com.eg.sba;

import java.util.List;

interface CustomerDAO
{
	public List<Customer> getCustomer();
	public Customer createCustomer(Customer cust);
}
