//main class is Index
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Controller {


	Scanner sc = new Scanner(System.in);
	Screen screen = new Screen();
	Company company = new Company("Bus e-Ticket System");
	boolean login = false;

	public void runSystem() {
		String option = "default";
		String menuOption = "default";
		String name = "";
		String contact = "";

		//1. Continue without Login
		while (!option.equals("3")) {
			option = screen.promptWelcomePage(sc, company.getName());
			String from, to;

			if (option.equals("1")) {
				menuOption = screen.promptSearchBusPage1(sc);

				while (!(menuOption.equals("3"))) {

					if (menuOption.equals("1")) {
						String oneWay = "One Way";
						from = screen.promptSearchBusTripPage2(sc);
						to = screen.promptSearchBusTripPage3(sc);
						System.out.println();
						System.out.println("-------------------------------------------------------------");
						System.out.println("Trip ID     Bus      From     To       Time   ETA     Fare");
						System.out.println("-------------------------------------------------------------");
						Trip trip = company.getTrip(from, to);
						
						if (trip == null) {
							screen.tripNotFound();
						} 
						
						else {
							company.displayTrip(from, to);
							System.out.println("-------------------------------------------------------------");
							System.out.println();
							System.out.println("Select Trip ID :");
							String tripId = sc.next();
							System.out.println();
							System.out.print("Number of passenger(s): ");
							int paxnum = sc.nextInt();

							for (int i = 0; i < paxnum; i++) {
								name = screen.requestName(sc);
								contact = screen.requestContact(sc);
								System.out.println("----------");
								company.displayBusSeat(tripId);
								System.out.println("----------");
								screen.selectSeatPage();
								String seatId = sc.next();
								company.bookSeat(tripId, name, contact, seatId);
							}
							company.addTicket();
							System.out.println();
							System.out.println(company.numberOfTicket() + " seat selected.");
						}

						if (company.numberOfTicket() > 0) {
							System.out.println();
							System.out.println("--------------");
							System.out.println("TICKET DETAILS");
							System.out.println("--------------");
							System.out.println();
							company.displayAllTicket();
							String checkoutOption = screen.promptCheckoutOrRepeat(sc);
							Member member = null;
							
							if (checkoutOption.equals("1") && login == false) {
								System.out.println();
								System.out.println("------------------------");
								System.out.println("LOGIN TO PROCEED PAYMENT");
								System.out.println("------------------------");
								
								while (login != true) {
									String memberId = screen.promptMemberId(sc);
									String password = screen.promptPassword(sc);
									member = company.getMember(memberId, password);

									if (member == null) {
										screen.displayIdOrPasswordNotFound();
									}
									else {
										login = true;
									}

								}

								screen.successLogin(member.getFirstName());
								System.out.println();
								System.out.println("Total fare: RM" + company.showTicketPrice());
								System.out.println();
								screen.selectPaymentMethod(sc);
								screen.transactionSuccesful();
								System.out.println("--------------");
								System.out.println("TICKET DETAILS");
								System.out.println("--------------");
								company.displayAllTicket();
								screen.displayGoodByePage();
							}

							else if (checkoutOption.equals("2")) {
								System.out.println("Your transaction is cancelled.");
							}
							
							else if (checkoutOption.equals("3")) {
								screen.displayGoodByePage();
								break;
							}
						}

						else {
							screen.noSeatTrip();
						}
						
						break;
					}

					if (menuOption.equals("2")) {
						screen.displayUnderConstructionPage();
						menuOption = screen.promptSearchBusPage1(sc);
					}
					
					break;
				}
				
				break;
			} 
			
			else if (option.equals("2")) {
				String memberId = screen.promptMemberId(sc);
				String password = screen.promptPassword(sc);
				Member member = company.getMember(memberId, password);

				if (member == null) {
					screen.displayIdOrPasswordNotFound();
				}

				else {
					login = true;
				}
				
			}
			
			else if (option.equals("3")) {
				screen.displayGoodByePage();
				break;
			}
			

			menuOption = screen.promptSearchBusPage1(sc);

			//2. Login
			while (!(menuOption.equals("3"))) {

				if (menuOption.equals("1")) {
					String oneWay = "One Way";
					from = screen.promptSearchBusTripPage2(sc);
					to = screen.promptSearchBusTripPage3(sc);
					System.out.println();
					System.out.println("-------------------------------------------------------------");
					System.out.println("Trip ID     Bus      From     To       Time   ETA     Fare");
					System.out.println("-------------------------------------------------------------");
					Trip trip = company.getTrip(from, to);
					
					if (trip == null) {
						screen.tripNotFound();
					} 
					
					else {
						company.displayTrip(from, to);
						System.out.println("-------------------------------------------------------------");
						System.out.println();
						System.out.println("Select Trip ID :");
						String tripId = sc.next();
						System.out.println();
						System.out.print("Number of passenger(s): ");
						int paxnum = sc.nextInt();

						for (int i = 0; i < paxnum; i++) {
							name = screen.requestName(sc);
							contact = screen.requestContact(sc);
							System.out.println("----------");
							company.displayBusSeat(tripId);
							System.out.println("----------");
							screen.selectSeatPage();
							String seatId = sc.next();
							company.bookSeat(tripId, name, contact, seatId);
						}
						company.addTicket();
						System.out.println();
						System.out.println(company.numberOfTicket() + " seat selected.");
					}

					if (company.numberOfTicket() > 0) {
						System.out.println();
						System.out.println("--------------");
						System.out.println("TICKET DETAILS");
						System.out.println("--------------");
						System.out.println();
						company.displayAllTicket();
						String checkoutOption = screen.promptCheckoutOrRepeat(sc);
						Member member = null;
						
						if (checkoutOption.equals("1") && login == true) {
							System.out.println();
							System.out.println("Total fare: RM" + company.showTicketPrice());
							System.out.println();
							screen.selectPaymentMethod(sc);
							screen.transactionSuccesful();
							System.out.println("--------------");
							System.out.println("TICKET DETAILS");
							System.out.println("--------------");
							company.displayAllTicket();
							screen.displayGoodByePage();
						}

						else if (checkoutOption.equals("2")) {
							System.out.println("Your transaction is cancelled.");
						}

						else if (checkoutOption.equals("3")) {
							screen.displayGoodByePage();
							break;
						}
					}

					else {
						screen.noSeatTrip();
					}
					
					break;
				}

				if (menuOption.equals("2")) {
					screen.displayUnderConstructionPage();
					menuOption = screen.promptSearchBusPage1(sc);
				}
				
				break;
			} 
			
			if (menuOption.equals("3")) {
				screen.displayGoodByePage();
			}
			
			//3. Exit
			break;
		}
	}
}