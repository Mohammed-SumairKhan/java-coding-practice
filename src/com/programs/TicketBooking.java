package com.programs;

import java.util.Scanner;

public class TicketBooking {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to ticket booking: ");
		int totalTickets = 100;
		while(totalTickets>0) {
			System.out.println("Enter the number of tickets you want to buy");
			int ticket = scan.nextInt();
			if(ticket > 5) {
				System.out.println("A person can book only 5 tickets at a time");
			} else if (ticket <= 5) {
				totalTickets -= ticket;
				System.out.println("Tickets remaining: " + totalTickets);
			} else {
				System.out.println("Tickets are not available");
			}
			
			if(totalTickets == 0) {
				System.out.println("Tickets are not available");
				break;
			}
		}
	}
}
