package source;

public class JavaToSql {

	public static void convertStringToQry(String inp) {

 		String[] inpArray = inp.split(" ");

		String Id = "";
		String Name = "";
		String SSN = "";

		for (int i = 0; i < inpArray.length; i++) {
			if (Id.equals("")) {
				Id = inpArray[i];
				i++;
			}
			if (Name.equals("")) {
				Name = inpArray[i];
				i++;
			}
			if (SSN.equals("")) {
				SSN = inpArray[i];
			}

		}

		String query = "Insert into table (Id, Name, SSN) Values(" + Id + "," + "'" + Name + "'" + "," + SSN + ")" + ";";
		System.out.println(query);

	}

	public static void main(String[] args) {
		String inp = "1234 Abc 789-7891-20";

		convertStringToQry(inp);

	}

}
