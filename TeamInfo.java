public class TeamInfo implements Comparable<TeamInfo> {

    private ProgrammingScore programmingScore;
    private InnovationScore innovationScore;
    private PersonalScore personalScore;
    private float extraScore = 0f;

    private float finalScore = 0f;
    String teamName = "";
    TeamInfo(String name, ProgrammingScore progScore, InnovationScore innovScore, PersonalScore personScore, float extraPoints){
        teamName = name;
        programmingScore = progScore;
        innovationScore = innovScore;
        personalScore = personScore;
        extraScore = extraPoints;

        finalScore = programmingScore.getProgrammingScore() + innovationScore.getInnovationScore() + personalScore.getPersonalScore() + extraScore;
    }
    public float getFinalScore() {
        return finalScore;
    }

    @Override
    public String toString() {
        return String.format("%s's final score = %f %s", teamName, finalScore , "Pts");
    }

    @Override
    public int compareTo(TeamInfo teamInfo) {
        return (int)(teamInfo.getFinalScore() - this.finalScore);
    }
}
