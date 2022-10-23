import java.util.Scanner;

public class EoiCanada {

	public static void main(String[] args) {

		int educationLevelCounter = 0;
		int workExpereinceCounter = 0;
		int ageLevelCounter = 0;
		int ieltsListeningCounter = 0;
		int ieltsReadingCounter = 0;
		int ieltsWritingCounter = 0;
		int ieltsSpeakingCounter = 0;
		int hasRelativesCounter = 0;
		int hasstudiedInCanadaCounter = 0;
		int hasworkNocLevelCounter = 0;

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your education level from the following PhD, Masters, Universitydegree or Diploma:");
		String educationLevel = scn.next().toLowerCase();
		while (!educationLevel.equals("phd") && !educationLevel.equals("masters")
				&& !educationLevel.equals("universitydegree") && !educationLevel.equals("diploma")) {
			System.out.println(
					"The data you have entered is incorrect; Please try from the following: PhD, Masters, Universitydegree or Diploma:");
			educationLevel = scn.next().toLowerCase();
			educationLevelCounter++;

			if (!educationLevel.equals("phd") && !educationLevel.equals("masters")
					&& !educationLevel.equals("universitydegree") && !educationLevel.equals("diploma")
					&& ageLevelCounter >= 2) {
				System.out.println("Program terminated, please talk to customer desk");
				System.exit(0);
			}
		}

		System.out.println("Enter your experience in years");
		int experienceInYears = scn.nextInt();
		while ((experienceInYears < 0) || (experienceInYears > 100)) {
			System.out.println("The data you have entered is invaid; Please try again");
			experienceInYears = scn.nextInt();
			workExpereinceCounter++;

			if (((experienceInYears > 0) || (experienceInYears < 100)) && workExpereinceCounter >= 2) {
				System.out.println("Program terminated, please talk to customer desk");
				System.exit(0);
			}}

			System.out.println("Enter your age in years");
			int ageInYears = scn.nextInt();
			while ((ageInYears <= 15) || (ageInYears >= 100)) {
				System.out.println("The data you have entered is invaid; Please try again");
				ageInYears = scn.nextInt();
				ageLevelCounter++;

				if (((ageInYears <= 15) || (ageInYears >= 100 )) && ageLevelCounter >= 2) {
					System.out.println("Program terminated, please talk to customer desk");
					System.exit(0);
				}}

				System.out.println("Enter your IELTS Score for Listening:");
				float ieltsListeningScore = scn.nextFloat();
				while ((ieltsListeningScore < 0) || (ieltsListeningScore > 10)) {
					System.out.println("The score you have entered is invaid; Please try again");
					ieltsListeningScore = scn.nextFloat();
					ieltsListeningCounter++;

					if (((ieltsListeningScore < 0) || (ieltsListeningScore > 10)) && ieltsListeningCounter >= 2) {
						System.out.println("Program terminated, please talk to customer desk");
						System.exit(0);
					}}
				
				System.out.println("Enter your IELTS Score for Speaking:");
				float ieltsSpeakingScore = scn.nextFloat();
				while ((ieltsSpeakingScore < 0) || (ieltsSpeakingScore > 10)) {
					System.out.println("The score you have entered is invaid; Please try again");
					ieltsSpeakingScore = scn.nextFloat();
					ieltsSpeakingCounter++;

					if (((ieltsSpeakingScore < 0) || (ieltsSpeakingScore > 10)) && ieltsSpeakingCounter >= 2) {
						System.out.println("Program terminated, please talk to customer desk");
						System.exit(0);
					}}
				System.out.println("Enter your IELTS Score for Reading:");
				float ieltsReadingScore = scn.nextFloat();
				while ((ieltsReadingScore < 0) || (ieltsReadingScore > 10)) {
					System.out.println("The score you have entered is invaid; Please try again");
					ieltsReadingScore = scn.nextFloat();
					ieltsReadingCounter++;

					if (((ieltsReadingScore < 0) || (ieltsReadingScore > 10)) && ieltsReadingCounter >= 2) {
						System.out.println("Program terminated, please talk to customer desk");
						System.exit(0);
					}}
				System.out.println("Enter your IELTS Score for Writing:");
				float ieltsWritingScore = scn.nextFloat();
				while ((ieltsWritingScore < 0) || (ieltsWritingScore > 10)) {
					System.out.println("The score you have entered is invaid; Please try again");
					ieltsWritingScore = scn.nextFloat();
					ieltsWritingCounter++;

					if (((ieltsWritingScore < 0) || (ieltsWritingScore > 10)) && ieltsWritingCounter >= 2) {
						System.out.println("Program terminated, please talk to customer desk");
						System.exit(0);
					}}
				System.out.println(
						"If you have a relative  in Canada(Parents, Grand Parents, Brother, Sister, Aunt, Uncle, Nephew or Niece) who is a Canadian Citizen or PR holder (Y/N)");
				String hasRelatives = scn.next().toLowerCase();
				while (!(hasRelatives.equals("y")) && !hasRelatives.equals("n")) {
					System.out.println("The data is invaid; Please input either 'Y' or 'N' ");
					hasRelatives = scn.next().toLowerCase();
					hasRelativesCounter++;

					if (!(hasRelatives.equals("y")) && !hasRelatives.equals("n") && hasRelativesCounter >= 2) {
						System.out.println("Program terminated, please talk to customer desk");
						System.exit(0);
					}}
				System.out.println("Have you studied in Canada for atleast 2 years (Y/N)");
				String studiedInCanada = scn.next();
				while (!(studiedInCanada.equals("y")) && !studiedInCanada.equals("n")) {
					System.out.println("The data is invaid; Please input either 'Y' or 'N' ");
					studiedInCanada = scn.next().toLowerCase();
					hasstudiedInCanadaCounter++;

					if (!(studiedInCanada.equals("y")) && !studiedInCanada.equals("n") && hasstudiedInCanadaCounter >= 2) {
						System.out.println("Program terminated, please talk to customer desk");
						System.exit(0);
					}}
				System.out.println("Have you studied in Canada for atleast 2 years at NOC 0, A, B (Y/N)");
				String workNocLevel = scn.next();
				while (!(workNocLevel.equals("y")) && !workNocLevel.equals("n")) {
					System.out.println("The data is invaid; Please input either 'Y' or 'N' ");
					workNocLevel = scn.next().toLowerCase();
					hasworkNocLevelCounter++;

					if (!(workNocLevel.equals("y")) && !workNocLevel.equals("n") && hasworkNocLevelCounter >= 2) {
						System.out.println("Program terminated, please talk to customer desk");
						System.exit(0);
					}}
				
				 EoiCanadaMethods ecm = new EoiCanadaMethods(); 
				 int finalIeltsScore = ecm.ieltsListeningScore(ieltsListeningScore)+ecm.otherIeltsScore(ieltsSpeakingScore)+ecm.otherIeltsScore(ieltsReadingScore)+ecm.otherIeltsScore(ieltsWritingScore); 
				 int finalRelativeStudentScore = ecm.hasRelativesWorkexStudied(hasRelatives,studiedInCanada,workNocLevel); 
				 int finalAgeScore = ecm.ageScoreCalulcation(ageInYears); 
				 int finalExperienceScore = ecm.experienceScore(experienceInYears);  
				 int finalWorkScore = ecm.educationScore(educationLevel);
				  
				 System.out.println(finalIeltsScore);
				 System.out.println(finalRelativeStudentScore);
				 System.out.println(finalAgeScore);
				 System.out.println(finalExperienceScore);
				 System.out.println(finalWorkScore);
				 
				 
				 
				 int totalPoints =
				 finalIeltsScore+finalRelativeStudentScore+finalAgeScore+finalExperienceScore+
				 finalWorkScore;
				 
				 System.out.println("Total Points you have scored: "+totalPoints+" Points");
				 int cuttOffPoint = 80; if(totalPoints>= cuttOffPoint) { System.out.
				 println("You qualify to submit an Expression of Interest (EOI) to Immigration Canada"
				 ); } else {System.out.
				 println("Sorry You donot qualify to submit an Expression of Interest (EOI) to Immigration Canada"
				 );}
				 
				
			}
		
	}

