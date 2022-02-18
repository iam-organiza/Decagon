package Week_0.SandBox.Java_Fundamentals.Exercise_4.GradeBook;

import java.util.HashMap;
import java.util.Map;

/**
 * Students were given a pop quiz, and collectively, they didn't do so great.
 * As a result, the instructor decided to give them a makeup exam to allow them improve their scores.
 *
 * Given two maps of test scores, update the students' grades only if they did better on the makeup exam.
 *
 * Print the final grades.
 */
public class TestResults {
    public static Map getOriginalGrades(){

        Map grades = new HashMap();
        grades.put("Angie", 24);
        grades.put("Dave", 32);
        grades.put("Lisi", 80);
        grades.put("Raja", 50);
        grades.put("Shashi", 79);
        grades.put("Bas", 40);
        grades.put("Carlos", 59);
        grades.put("Amber", 55);
        grades.put("Rex", 95);
        grades.put("Jason", 63);
        grades.put("Nikolay", 32);

        return grades;
    }

    public static Map getMakeUpGrades(){

        Map grades = new HashMap();
        grades.put("Angie", 97);
        grades.put("Dave", 82);
        grades.put("Lisi", 76);
        grades.put("Raja", 89);
        grades.put("Shashi", 79);
        grades.put("Bas", 98);
        grades.put("Carlos", 80);
        grades.put("Amber", 95);
        grades.put("Rex", 90);
        grades.put("Jason", 62);
        grades.put("Nikolay", 79);

        return grades;
    }


    public static void main(String[] args) {

        Map<String, Integer> originalGrades = getOriginalGrades();
        Map<String, Integer> makeUpgrades = getMakeUpGrades();
        Map<String, Integer> finalScores = new HashMap<>();

        for (Map.Entry originalGrade: originalGrades.entrySet()) {
            Integer value = (int) originalGrade.getValue();
            String key = (String) originalGrade.getKey();

            if (makeUpgrades.get(key) > value) {
                finalScores.put(key, makeUpgrades.get(key));
            } else {
                finalScores.put(key, value);
            }
        }
        
        for (Map.Entry finalScore: finalScores.entrySet()) {
            System.out.println(finalScore.getKey() + ": " + finalScore.getValue());
        }
    }
}
