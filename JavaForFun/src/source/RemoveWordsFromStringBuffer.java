package source;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class RemoveWordsFromStringBuffer {

	public static void addFormSetParametersForAdditionalInformationNeededAcknowledgement(String []input, HashMap storeAllValues , String uniform){
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < input.length; i++) {
			
			sb.append(input[i].replaceAll("\\s", ""));
			
		}
		String temp = sb.toString();
		if(temp.replaceAll("\\s", "").contains(uniform.replaceAll("\\s", ""))){
			temp = temp.replace(uniform.replaceAll("\\s", ""), "");
			if(temp.endsWith(".")){
				temp = temp.replace(".", "");
			}
			String [] store = temp.split(",");
			
			for (int i = 0; i < store.length; i++) {
				temp = store[i];
				if(storeAllValues.containsKey(temp) && temp != null){
					temp = (String) storeAllValues.get(temp.trim());
					System.out.println(temp);
				}
			}
			
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		String[] input = new String[3];
		
		 input[0] = "Support Order(s) - 2 copies,";
		 input[1] =" including1 original certified copy";
		 input[2] = ",Uniform Support Petition - original and 1 copy.";
		 
		 String uniform = "Support Order(s) - 2 copies, including 1 original certified copy";
		 
		 HashMap storeAllValues = new HashMap();
			storeAllValues.put("SupportOrder(s)-2copies,including1originalcertifiedcopy","Support Order(s) - 2 copies, including 1 original certified copy");
			storeAllValues.put("CurrentOrder&Modification-2copies,including1originalcertifiedcopy","Current Order & Modification - 2 copies, including 1 original certified copy");
			storeAllValues.put("AdministrativeNoticeChangeofPayee-2copies,including1originalcertifiedcopy", "Administrative Notice Change of Payee - 2 copies, including 1 original certified copy");
			storeAllValues.put("UniformSupportPetition-originaland1copy", "Uniform Support Petition-original and 1 copy");
			


		addFormSetParametersForAdditionalInformationNeededAcknowledgement(
				input, storeAllValues, uniform);

	}

}
