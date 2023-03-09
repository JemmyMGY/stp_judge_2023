public class ProgrammingScore extends AbstractScore{
    private final static float TOTAL_PROGRAMMING_WEIGHT = 0.6f;
    private final static float CORE_CONCEPTS_WEIGHT = 0.9f;
    private final static float CORE_PRINCIPLES_WEIGHT = 0.1f;

    private float finalProgrammingScore = 0f;
    ProgrammingScore(float coreConcepts, float corePrinciples){
        float coreConceptsPercent = (coreConcepts/100) * CORE_CONCEPTS_WEIGHT;
        float corePrinciplesPercent = (corePrinciples/100) * CORE_PRINCIPLES_WEIGHT;
        finalProgrammingScore = (coreConceptsPercent + corePrinciplesPercent) * TOTAL_PROGRAMMING_WEIGHT * totalPoints;
    }
    public float getProgrammingScore(){
        return finalProgrammingScore;
    }
    @Override
    public String toString() {
        return String.format("Programming Score = %f %s", finalProgrammingScore, "Pts");
    }
}
