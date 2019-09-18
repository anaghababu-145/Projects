package facegardens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main 
{
	
	public static void main(String[] args) throws IOException {
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofID;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		name=br.readLine();
		address=br.readLine();
		contactNumber=br.readLine();
		email=br.readLine();
		proofType=br.readLine();
		proofID=br.readLine();
Customer customer=new Customer(name,address,contactNumber,email,proofType,proofID);
Customer customer1=new Customer(name,address,contactNumber,email,proofType,proofID);
customer.register(name,address,contactNumber,email,proofType,proofID);
customer1.register(name,address,contactNumber,email,proofType,proofID);
}
	
}
