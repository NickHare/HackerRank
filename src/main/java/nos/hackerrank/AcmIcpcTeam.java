package nos.hackerrank;

import java.util.Arrays;
import java.util.List;

public class AcmIcpcTeam {
    /*
     * Complete the 'acmTeam' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY topic as parameter.
     */

    public static List<Integer> acmTeam(List<String> topics) {
        Integer numTopics;
        String topicA, topicB;
        Integer maxTopics = 0;
        Integer maxTopicTeams = 0;
        List<Integer> result = Arrays.asList(maxTopics, maxTopicTeams);

        if (topics.size() >= 2){
            for (int i = 0; i < topics.size() - 1; i++){
                for (int j = i + 1; j < topics.size(); j++){
                    topicA = topics.get(i);
                    topicB = topics.get(j);
                    numTopics = compareTopics(topicA, topicB);
                    if (numTopics.compareTo(maxTopics) > 0){
                        maxTopics = numTopics;
                        maxTopicTeams = 1;
                        result.set(0, maxTopics);
                        result.set(1, maxTopicTeams);
                    } else if (numTopics.equals(maxTopics)){
                        maxTopicTeams++;
                        result.set(1, maxTopicTeams);
                    }
                }
            }
        }
        return result;
    }

    private static int compareTopics(String topicA, String topicB){
        int result = 0;
        for(int i = 0; i < topicA.length() && i < topicB.length(); i++){
            if (topicA.charAt(i) == '1' || topicB.charAt(i) == '1'){
                result++;
            }
        }
        return result;
    }
}
