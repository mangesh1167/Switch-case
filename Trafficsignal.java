package controlflowstatements;

public class Trafficsignal {
	
	  public static void main(String[] args) {
		  String color = "green";
			switch (color) {

			case "Red":
				System.out.println("STOP");
				break;
			case "red":
				System.out.println("STOP");
				break;
			case "green":
				System.out.println("GO");
				break;
			case "Green":
				System.out.println("GO");
				break;
			case "yellow":
				System.out.println("GET READY");
				break;
			case "Yellow":
				System.out.println("GET READY");
				break;

			default:
				System.out.println("Invalid Input");
			}

		}

}

