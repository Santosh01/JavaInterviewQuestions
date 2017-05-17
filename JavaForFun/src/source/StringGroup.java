package source;

public class StringGroup {

	// ----------------------------------------------------------------

	public static String groupString(String inp, int grpLen) {
		
		String grp = "";
		int stringLen = inp.length();

		StringBuffer inpString = new StringBuffer();

		for (int i = 0; i < inp.length(); i = i + grpLen) {
			
			if (stringLen >= grpLen) {
				
				stringLen = stringLen - grpLen;
				grp = inp.substring(i, i + grpLen);
				inpString.append(grp + "-");

			} else {
				
				grp = inp.substring(i, inp.length());
				inpString.append(grp);
				
			}
		}

		return inpString.toString();
	}

	public static void main(String[] args) {
		
		String inp = "Santosh";
		groupString(inp, 3);
		
	}
}
