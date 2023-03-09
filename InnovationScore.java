public class InnovationScore extends AbstractScore{
    private final static float TOTAL_INNOVATION_WEIGHT = 0.2f;
    private final static float GAMEPLAY_WEIGHT = 0.3f;
    private final static float IDEA_WEIGHT = 0.15f;
    private final static float UX_UI_WEIGHT = 0.25f;
    private final static float FEATURES_WEIGHT = 0.3f;

    private float finalInnovationScore = 0f;
    InnovationScore(float gamePlay, float idea, float ux_ui, float features){
        float gamePlayPercent = (gamePlay/100)*GAMEPLAY_WEIGHT;
        float ideaPercent = (idea/100)*IDEA_WEIGHT;
        float UxUiPercent = (ux_ui/100)*UX_UI_WEIGHT;
        float FeaturesPercent = (features/100)*FEATURES_WEIGHT;
        finalInnovationScore = (gamePlayPercent + ideaPercent + UxUiPercent + FeaturesPercent) * TOTAL_INNOVATION_WEIGHT * totalPoints;
    }
    public float getInnovationScore(){
        return finalInnovationScore;
    }
    @Override
    public String toString() {
        return String.format("Innovation Score = %f %s", finalInnovationScore, "Pts");
    }
}
