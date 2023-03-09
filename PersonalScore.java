public class PersonalScore extends AbstractScore{
    private final static float TOTAL_PERSONAL_WEIGHT = 0.2f;
    private final static float PRESENTATION_WEIGHT = 1f;
    private float finalPersonalScore = 0f;
    PersonalScore(float personalSkills){
        float personalPercent = (personalSkills/100) * PRESENTATION_WEIGHT;
        finalPersonalScore = (personalPercent) * TOTAL_PERSONAL_WEIGHT * totalPoints;
    }

    public float getPersonalScore(){
        return finalPersonalScore;
    }

    @Override
    public String toString() {
        return String.format("Personal score = %f %s", finalPersonalScore, "Pts");
    }
}
