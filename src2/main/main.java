package main;
import javax.swing.JOptionPane;

import controller1.tasker;
public class main {
	public static void main(String[] args) {
		tasker procController = new tasker();
		String osum = null;
		String op = procController.system();
		System.out.println(op);
		
		String process = "cmd.exe";
		procController.callProcess(process);
		
		process = "tasklist";
		tasker.readProcess(process);
		
		String param = JOptionPane.showInputDialog("Insira o numero PID do processo ou seu nome e extensao");
		procController.killProcess(param);
	}
}
