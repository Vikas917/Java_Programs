/*
1. REGION_VOTE_JAVA

Write a Java code that implements the following

Create a class Region with following:

1.Attributes

Regionid: Integer
RegionName: String
noOfPoliticians: Integer
Politician: List of Politicians for the Region.

2.Getters and Setters Methods
3. Parameterized constructor

Create a class Politician with following.

1.Attributes

PoliticianName: String
PartyName String
votes Integer

2.Getters and Setters Methods
3.Parameterized constructor.

Relationship

Each Region can have multiple Politician objects.

Create a class Service with following methods

1.Find the Politician with maximum votes:

    This method will take a list of Region objects as input. This method finds and
Prints the Politician's Name who has scored the maximum votes for the region in the format specified below:
RegionName with id RegionID = Politician Name

    If two or more politicians within the region have secured equal maximum number of votes then display-"No single politician
found with maximum votes for RegionName" except the double quotes. Here RegionName must be replaced by the name of the region(input).
You need to throw an custom based exception in case of, if the votes associated with a Politician is negative.
The method should throw an exception called votesis NegativeException which includes a message
"Alert: Votes of a certain politician is negative." (without quotes).

2.find Region Name where maximum people have voted :
    This method will take a list of Region objects. Method should print the Regions Name where maximum people have voted
in the format specified below. This can be found by computing the sum total of the votes of a region.
Region with maximum votes = RegionName
    if two or more regions have same number of maximum votes then display "No region found with maximum votes"

Refer sample output for format.

Create a class Tester

1. Take inputs
2. Create Object of Service class to call the methods.

Refer the sample input and output.

Sample Input

3//No. of regions
1001//ld of the first region
Region1//Name of the region
3//No. of politicians who stood for election for region1
Region1 Politician1//Name of the Politician1
Region1_Party1//Party name for the politician 1
375//No. of votes obtained by poltician 1
Region1_Politician2//Name of the Politician2
Region1_Party2//Party name for the plitician2
753//No. of votes obtained by poltician2
Region1 Politician3//Name of the Politician3
Region1_Party3//Party name for the politician3
1375//No. of votes obtained by poltician1
Region2_Politician2//Name of the Politician2
1375//No. of votes obtained by poltician3
2001//ld of the second region
Region2//Name of the region
4//No. of politicians who stood for election for region2
Region2 Politician1//Name of the Politician 1
Region2 Party1//Party name for the politician1
Region2 Party2//Party name for the politician2
4753//No. of votes obtained by poltician2
Region2 Politician3//Name of the Politician3
Region2 Party3//Party name for the politician3
315//No. of votes obtained by poltician3
Region2_Politician4//Name of the Politician4
Region2 Party4//Party name for the politician4
2875//No. of votes obtained by poltician3
3001//ld of the third region
Region3//Name of the region
2//No. of politicians who stood for election for region3
Region3_Politician1//Party name for the politician
Region3_Party1//Party name for the politician 1
6365//No. of votes obtained by poltician 1
Region3_Politician2//Name of the Politician2
Region3_Party2//Party name for the politician2
4733//No. of votes obtained by poltician2

Sample output:

Region1 with id 1001 = Region1_Politician3
Region2 with id 2001 = Region2_Politician2
Region3 with id 3001 = Region3_Politician1
Region with maximum votes = Region3
 */


package Java_PRA;

import java.util.*;

class Region_Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Region> region = new ArrayList<>();

        int n = sc.nextInt();

        for(int i=0;i<n;i++) {
            int regionId = sc.nextInt();sc.nextLine();
            String regionName = sc.nextLine();
            int noOfPoliticians = sc.nextInt();

            List<Politician> politician = new ArrayList<>();
            for(int j =0 ; j< noOfPoliticians;j++) {
                sc.nextLine();
                String politicianName = sc.nextLine();
                String partyName = sc.nextLine();
                int votes = sc.nextInt();

                politician.add(new Politician(politicianName, partyName, votes));
            }
            region.add(new Region(regionId, regionName, noOfPoliticians, politician));
        }
        Services service = new Services();

        try {
            service.politicianWithMaxVotes(region);
        }
        catch (VotesIsNegativeException e) {
            System.out.println(e.getMessage());
        }

        try {
            service.regionNameWithMaxPeopleVoted(region);

        }
        catch (VotesIsNegativeException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Region {
    int regionId, noOfPoliticians;
    String regionName;
    List<Politician> politician;

    public Region(int regionId, String regionName, int noOfPoliticians, List<Politician> politician) {
        this.regionId = regionId;
        this.regionName = regionName;
        this.noOfPoliticians = noOfPoliticians;
        this.politician = politician;
    }

    public int getRegionId() {
        return regionId;
    }
    public String getRegionName() {
        return regionName;
    }
    public int getNoOfPoliticians() {
        return noOfPoliticians;
    }
    public List<Politician> getPoliticians() {
        return politician;
    }
}

class Politician {
    int votes;
    String politicianName, partyName;

    public Politician(String politicianName, String partyName, int votes) {
        this.politicianName = politicianName;
        this.partyName = partyName;
        this.votes = votes;
    }

    public String getPoliticianName() {
        return politicianName;
    }
    public String getPartyName() {
        return partyName;
    }
    public int getVotes() {
        return votes;
    }
}

class VotesIsNegativeException extends Exception {
    public VotesIsNegativeException(String message) {
        super(message);
    }
}

class Services {
    public void politicianWithMaxVotes(List<Region> regions) throws VotesIsNegativeException {

        for(Region r : regions) {

            int maxVotes = Integer.MIN_VALUE;
            String winner = "";
            boolean tie = false;

            for(Politician p : r.getPoliticians()) {
                if(p.getVotes() < 0){
                    throw new VotesIsNegativeException("Alert: Votes of a certain politician is negative.");
                }

                if(maxVotes < p.getVotes()){
                    maxVotes = p.getVotes();
                    winner = p.getPoliticianName();
                    tie = false;
                }

                else if(p.getVotes() == maxVotes){
                    tie = true;
                }

            }

            if(!tie) {
                System.out.println(r.getRegionName() + " with id "+ r.getRegionId() + " = " + winner);
            }
            else {
                System.out.println("No single politician found with maximum votes for "+ r.getRegionName());
            }

        }
    }

    public void regionNameWithMaxPeopleVoted(List<Region> regions) throws VotesIsNegativeException {

        int maxTotalVotes  = Integer.MIN_VALUE;
        String maxRegion  = "";
        boolean tie  = false;

        for(Region r : regions) {

            int totalVotes = 0;

            for(Politician p : r.getPoliticians()) {
                if(p.getVotes() < 0){
                    throw new VotesIsNegativeException("Alert: Votes of a certain region is negative.");
                }
                else {
                    totalVotes += p.getVotes();
                }
            }

            if(totalVotes > maxTotalVotes){
                maxTotalVotes = totalVotes;
                maxRegion = r.getRegionName();
                tie = false;
            }

            else if(totalVotes == maxTotalVotes){
                tie = true;
            }

        }

        if(!tie) {
            System.out.println("Region with maximum votes = " + maxRegion);
        }
        else {
            System.out.println("No region found with maximum votes.");
        }
    }
}