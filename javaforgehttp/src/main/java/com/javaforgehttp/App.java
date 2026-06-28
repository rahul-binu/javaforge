package com.javaforgehttp;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8080);
			System.out.println(server.toString());
			Socket socket = server.accept();
			System.out.println(socket);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
