package com.eg.sba;

import java.util.List;
/undo the change in repo
interface CustomerDAO
{
	public List<Customer> getCustomer();
         public Customer createCustomer(Customer cust);	
}
//public Customer createCustomer(Customer cust);
