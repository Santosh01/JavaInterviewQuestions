package source;

public class MaximumNoOfGuest {

	int findMaxGuest(String[] guestInp) {
		int maxGuest = 0;
		
		int DayDiff = 0;
		for (String guest : guestInp) {
			guest = guest.replaceAll("[^0-9?!\\.\\,]", "");

			int temp = Integer
					.parseInt(guest.substring(guest.indexOf(",") + 1))
					- Integer.parseInt(guest.substring(0, guest.indexOf(",")));

			if (temp > DayDiff) {
				DayDiff = temp;
				maxGuest = Integer.parseInt(guest.substring(0, guest.indexOf(",")));
			} 
		}

		System.out.println( maxGuest);
		return maxGuest;
	}

	public static void main(String[] args) {

		MaximumNoOfGuest mx = new MaximumNoOfGuest();
		String[] inp = new String[] { "check-in:1, check-out:4",
				"check-in:2, check-out:5", 
				"check-in:10, check-out:12",
				"check-in:4, check-out:13", 
				"check-in:5, check-out:12" };

		mx.findMaxGuest(inp);

	}

}
