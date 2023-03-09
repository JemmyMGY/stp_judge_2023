import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static ArrayList<TeamInfo> parseScoresFile(String scoresFilePath){
        ArrayList<TeamInfo> allTeamsInfo = new ArrayList<>();
        try{
            FileInputStream fileStream = new FileInputStream(scoresFilePath);
            Scanner scan = new Scanner(fileStream);
            int i = 0;
            while(scan.hasNextLine()){
                if(i == 0){
                    i++;
                    scan.nextLine();
                    continue;
                }
                String fullTeamRecord = scan.nextLine();
                String [] cleanRecord = fullTeamRecord.split(",");
                ProgrammingScore progScore = new ProgrammingScore(Float.parseFloat(cleanRecord[1]),
                                                                    Float.parseFloat(cleanRecord[2]));
                InnovationScore innovScore = new InnovationScore(Float.parseFloat(cleanRecord[3]),
                                                                    Float.parseFloat(cleanRecord[4]),
                                                                    Float.parseFloat(cleanRecord[5]),
                                                                    Float.parseFloat(cleanRecord[6]));
                PersonalScore personScore = new PersonalScore(Float.parseFloat(cleanRecord[7]));
                float extraPoints = Float.parseFloat(cleanRecord[8]);

                TeamInfo teamDetails = new TeamInfo(cleanRecord[0], progScore, innovScore, personScore, extraPoints);
                allTeamsInfo.add(teamDetails);

                i++;

            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return allTeamsInfo;
    }
    public static void main(String[] args)
    {
        if(args.length != 1){
            System.out.println("Make sure to provide proper argument");
            return;
        }

        String scoresFilePath = args[0];

        ArrayList<TeamInfo> parsedTeams = parseScoresFile(scoresFilePath);
        Collections.sort(parsedTeams);

        for (var team : parsedTeams){
            System.out.println(team.toString());
        }
    }
}