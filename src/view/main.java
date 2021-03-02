package view;

import controller.controller;

public class main {	
	
		public main(String[] args) {
			
			controller controller = new controller();
			
			String os = controller.os();
			
			System.out.println(os);
			
			String process = "PING -n 10 www.google.com.br";
			
			controller.readProcess(process);
			
			String process1 = "ipconfig";
			
			controller.readProcess(process1);
		}
}