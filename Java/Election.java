public class Election 
{

    static String electionType = "General Elections";
    static int totalCandidates = 10;
    static int totalVoters = 500000;
    static boolean isElectronicVoting = true;
    static String location = "Bengaluru";
    static String conductedBy = "Election Commission of India";

    public static void electionInfo() 
    {
        System.out.println("Election Type : " + electionType);
        System.out.println("Total Candidates : " + totalCandidates);
        System.out.println("Total Voters : " + totalVoters);
        System.out.println("Electronic Voting : " + isElectronicVoting);
        System.out.println("Location : " + location);
        System.out.println("Conducted By : " + conductedBy);
        System.out.println("-------------------------------------------------");
    }

    public static void startElection() 
    {
        System.out.println("Starting " + electionType);
        System.out.println("-------------------------------------------------");
    }

    public static void endElection()
    {
        System.out.println("Ending " + electionType);
        System.out.println("-------------------------------------------------");
    }

    public static void facilities() 
    {
        System.out.println("Electronic Voting Available: " + isElectronicVoting);
        System.out.println("-------------------------------------------------");
    }

    public static void candidateInfo() 
    {
        System.out.println("Total Candidates: " + totalCandidates);
        System.out.println("-------------------------------------------------");
    }

    public static void main(String args[]) 
    {
        System.out.println("Running in main method");
        System.out.println("-------------------------------------------------");
        Election.electionInfo();
        Election.startElection();
        Election.endElection();
        Election.facilities();
        Election.candidateInfo();
    }
}
