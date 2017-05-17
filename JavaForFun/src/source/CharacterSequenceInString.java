package source;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class CharacterSequenceInString {

	static String supportOrdersKey = "SupportOrder(s)-2copies,including1originalcertifiedcopy";
	static String administrativeNoticeChangePayeeKey = "AdministrativeNoticeChangeofPayee-2copies,including1originalcertifiedcopy";
	static String currentOrderAndModificationKey = "CurrentOrder&Modification-2copies,including1originalcertifiedcopy";

	static String administrativeNoticeChangeofPayee = "Administrative Notice Change of Payee - 2 copies, including 1 original certified copy";
	static String CurrentOrderAndModification = "Current Order & Modification - 2 copies, including 1 original certified copy";
	static String supportOrder = "Support Order(s) - 2 copies, including 1 original certified copy";
	
	static String period = ".";
	static String periodSpace = ". ";
	static String colonDelimiter = ":";
	static String freeText = null;
	static String remarks = null;
	static String introductorySentence = null;
	static String parser = null;
	static String commaDelimiter = ",";
	static String otherText = "";
	static String removeWhiteSpace = "";
	static String splitTextByCommalastIndex = "";
	static String tokenKey = "";
	static ArrayList storeText = new ArrayList();

	private static void addFormSetParametersForAdditionalInformationNeededAcknowledgement(
			String[] input, HashMap storeAllValues)

	{
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < input.length; i++) {
			sb.append(input[i]);
		}

		freeText = sb.toString();
		// =============================================================
		removeWhiteSpace = freeText.replaceAll("\\s", "");

		if (freeText.contains(colonDelimiter)) {

			int indexOfcolonDelimiter = StringUtils.indexOf(freeText, colonDelimiter);
			introductorySentence = StringUtils.substring(freeText, 0, indexOfcolonDelimiter + 1);
			removeWhiteSpace = removeWhiteSpace.replace( introductorySentence.replaceAll("\\s", ""), "");
			freeText = freeText.replace(introductorySentence, "");
			storeText.add(introductorySentence);

		}
		if (removeWhiteSpace.contains(supportOrdersKey)) {

			removeWhiteSpace = removeWhiteSpace.replace(supportOrdersKey, "");
			freeText = freeText.replace(supportOrder, "");

		} else {

			supportOrdersKey = "";

		}
		if (removeWhiteSpace.contains(administrativeNoticeChangePayeeKey)) {

			removeWhiteSpace = removeWhiteSpace.replace(administrativeNoticeChangePayeeKey, "");
			freeText = freeText.replace(administrativeNoticeChangeofPayee, "");
		} else {

			administrativeNoticeChangePayeeKey = "";

		}
		if (removeWhiteSpace.contains(currentOrderAndModificationKey)) {

			removeWhiteSpace = removeWhiteSpace.replace(currentOrderAndModificationKey, "");
			freeText = freeText.replace(CurrentOrderAndModification, "");

		} else {

			currentOrderAndModificationKey = "";

		}

		int indexOfPeriodSpace = StringUtils.indexOf(freeText, periodSpace);

		if (freeText.contains(periodSpace)) {

			remarks = StringUtils.substring(freeText, indexOfPeriodSpace, freeText.length());
			otherText = StringUtils.substringBefore(freeText, period);
			
			

		} else {

			if (freeText.contains(period)) {

				remarks = StringUtils.substring(freeText, 0, freeText.length());
			}

		}
		
		

		if (!otherText.contains(commaDelimiter) && !otherText.isEmpty()) {
			
			storeText.add(otherText);

		} else {
	
			if (!otherText.isEmpty()) {
				
				if( !otherText.contains(administrativeNoticeChangeofPayee) || !otherText.contains(supportOrder) || !otherText.contains(CurrentOrderAndModification)){
				
				String[] splitTextByComma = otherText.trim().split(",");
								
					for(int i = 0; i < splitTextByComma.length; i ++){
						String storeCommaSeperatedText = splitTextByComma[i];
					if ((!StringUtils.isEmpty(splitTextByComma[i]) && !(splitTextByComma[i]).equals(" ") )) {
						
						if (storeAllValues.containsKey(storeCommaSeperatedText.replaceAll("\\s", "").trim())) {	
				
							String keyFromMapParser = (String) storeAllValues.get(storeCommaSeperatedText.replaceAll("\\s", ""));
		    				storeText.add(keyFromMapParser);
							}
						
						if (!storeAllValues.containsKey(storeCommaSeperatedText.replaceAll("\\s", "").trim())) {{
							storeText.add(storeCommaSeperatedText);
							}
	    					
						}

						}

					}
				}
			} else {
				if (StringUtils.isBlank(remarks)) {
					
					String[] splitTextByComma = removeWhiteSpace.trim().split(",");
					
					splitTextByCommalastIndex = splitTextByComma[splitTextByComma.length-1];

					for (String storeCommaSeperatedText : splitTextByComma) {
						
						if (!storeCommaSeperatedText.isEmpty()) {

							storeText.add(storeCommaSeperatedText);

						}

					}

				}

			}
		}
		if (StringUtils.isNotBlank(administrativeNoticeChangePayeeKey)) {

			storeText.add(administrativeNoticeChangePayeeKey);

		}

		if (StringUtils.isNotBlank(currentOrderAndModificationKey)) {

			storeText.add(currentOrderAndModificationKey);

		}

		if (StringUtils.isNotBlank(supportOrdersKey)) {

			storeText.add(supportOrdersKey);

		}
		
		for (int i = 0; i < storeText.size(); i++) {
			if(storeText.get(i).equals(splitTextByCommalastIndex)){
				storeText.remove(i);
			}			
		}
		
		if(StringUtils.isNoneEmpty(splitTextByCommalastIndex)){
			storeText.add(splitTextByCommalastIndex);
		}
		if (StringUtils.isNotBlank(remarks)) {

			storeText.add(remarks);

		}

		for (int i = 0; i < storeText.size(); i++) {

			tokenKey = storeText.get(i).toString();

			if (storeAllValues.containsKey(tokenKey)) {

				parser = (String) storeAllValues.get(tokenKey);
				processAdditionalInformation(parser);

			} else {

				processAdditionalInformation(tokenKey);

			}

		}

	}

	private static void processAdditionalInformation(String token) {

		System.out.println(token);
		return;

	}

	public static void main(String[] args) {
		HashMap storeAllValues = new HashMap();

		storeAllValues.put("AcknowledgementofParentage", "Acknowledgement of Parentage");
		storeAllValues.put("AffidavitinSupportofEstablishingPaternity", "Affidavit in Support of Establishing Paternity");
		storeAllValues.put("ArrearsStatement/PaymentHistory", "Arrears Statement/Payment History");
		storeAllValues.put("AssignmentofRights", "Assignment of Rights");
		storeAllValues.put("DescriptionofReal/PersonalProperty", "Description of Real/Personal Property");
		storeAllValues.put("DivorceDecree", "Divorce Decree");
		storeAllValues.put("GeneralTestimony/Affidavit", "General Testimony/Affidavit");
		storeAllValues.put("18-yearOldHighSchoolEnrollmentVerification", "18-year Old High School Enrollment Verification");
		storeAllValues.put("AmendedPetitiontoEstablishPaternity", "Amended Petition to Establish Paternity");
		storeAllValues.put("BirthCertificateforEachChild", "Birth Certificate for Each Child");
		storeAllValues.put("CertifiedMonth-by-MonthAccountingofArrears", "Certified Month-by-Month Accounting of Arrears");
		storeAllValues.put("ChildSupportEnforcementTransmittal", "Child Support Enforcement Transmittal");
		storeAllValues.put("CompletetheGeneralTestimony", "Complete the General Testimony");
		storeAllValues.put("CompletedIncomeandExpenseDeclaration", "Completed Income and Expense Declaration");
		storeAllValues.put("CopyofCaliforniaOrderCopyofCaliforniaOrderorCountyandCaseNumber", "Copy of California Order or County and Case Number");
		storeAllValues.put("CustodyOrder", "Custody Order");
		storeAllValues.put("DeclarationinSupportofEstablishingParentage", "Declaration in Support of Establishing Parentage");
		storeAllValues.put("EvidencePaternityisNotatIssue", "Evidence Paternity is Not at Issue");
		storeAllValues.put("FederalRegistrationStatementforEachOrder", "Federal Registration Statement for Each Order");
		storeAllValues.put("NondisclosureFinding/AffidavitorCPAddress", "Nondisclosure Finding/Affidavit or CP Address");
		storeAllValues.put("PaternityOrder", "Paternity Order");
		storeAllValues.put("PersonalIdentifiableInformation(PII)Form", "Personal Identifiable Information (PII) Form");
		storeAllValues.put("RequestforChangeofSupportPaymentLocation319(b)", "Request for Change of Support Payment Location 319(b)");
		storeAllValues.put("TANFGrantAmount", "TANF Grant Amount");
		storeAllValues.put("OtherDocumentsRelatingtoPaternity", "Other Documents Relating to Paternity");
		storeAllValues.put("PhotographofRespondent", "Photograph of Respondent");
		storeAllValues.put("UniformSupportPetition-originaland1copy", "Uniform Support Petition - original and 1 copy");

		// Comma Seperated values
		storeAllValues.put("SupportOrder(s)-2copies,including1originalcertifiedcopy","Support Order(s) - 2 copies, including 1 original certified copy");
		storeAllValues.put("CurrentOrder&Modification-2copies,including1originalcertifiedcopy","Current Order & Modification - 2 copies, including 1 original certified copy");
		storeAllValues.put("AdministrativeNoticeChangeofPayee-2copies,including1originalcertifiedcopy", "Administrative Notice Change of Payee - 2 copies, including 1 original certified copy");

		// =================TESTING===============================

		// Scenario 1
		String[] input = new String[5];

		input[0] = "Pursuant to 45 CFR 303.7(c)(6), please provide the following within 30 days:Ackn";
		input[1] = "owledgement of Parentage,Affidavit in Support of Establishing Paternity,Arrears";
		input[2] = "Statement/Payment History,Support Order(s) - 2 copies, including 1 original cert";
		input[3] = "ified copy,Uniform Support Petition - original and 1 copy. test1 DCSS.";


//		// Scenario 2
/*		 input = new String[1];
		 input[0] = "fied copy. test1 Hello.";*/

//		 Scenario 3
/*		 input = new String[1];
		 input[0] = "Uniform Support Petition - original and 1 copy,fied copy. test1 Hello.";*/

		// Scenario 4
	/*	 input = new String[1];
		 input[0] = ",Uniform Support Petition - original and 1 copy,fied copy. test1 hello.";*/

		// Scenario 5

/*		input = new String[1];
		input[0] = "test1 Hello.";
*/
		// Scenario 6
/*		 input = new String[3];
		 input[0] = "Petition,";
		 input[1] = "Administrative Notice Change of Payee - 2 copies,";
		 input[2] = " including 1 original certified copy. test1 Hello.";*/

		// Scenario 7
/*		 input = new String[3];
		 input[0] = "Support Order(s) - 2 copies, including 1 original certified copy,";
		 input[1] = "Other Documents Relating to Paternity, Personal Identifiable Information (PII) Form. text1 for test.";
		 input[2] = "Request for Change of Support Payment Location 319(b) , Amended Petition to Establish Paternity. test1";
		 */
//		 Scenario 8
		 input = new String[2];
		 input[0] = "AcknowledgementofParentage. test1.";
		 
		 
//		 Scenario 10
/*		 input = new String[2];
		 input[0] = "AcknowledgementofParentage, AffidavitinSupportofEstablishingPaternity, ";
		 input[1] = "AssignmentofRights, S";*/
		
//		 Scenario 11
/*		 input = new String[1];
		 input[0] = "orm Support Petition - original and 1 copy. test for all the checkboxes.";

*/

		addFormSetParametersForAdditionalInformationNeededAcknowledgement(
				input, storeAllValues);
	}

}
