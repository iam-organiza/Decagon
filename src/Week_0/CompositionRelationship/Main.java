package Week_0.CompositionRelationship;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // Tables
        // Table table1 = new Table("Black", 10, 15);
        // Table table2 = new Table("Blue", 10, 15);
        // Table table3 = new Table("Red", 10, 15);

        // Study Room
        // StudyRoom studyRoom = new StudyRoom("#1", new ArrayList<Table>(List.of(table1, table2, table3)));

        // Campus
        // Campus campus = new Campus("Edo Tech Park", "Benin", studyRoom);

        // Displaying the relationship
        // System.out.println("The number of tables in study room with the id: " + campus.studyRoom.roomID + " is " + campus.studyRoom.getNoOfTables() + " on " + campus.name + " campus in " + campus.location + ".");

        // Get User Inputs Rather Than Hard Code The Inputs Your Self
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide the number of tables you will like to add to a study room");
        int numberOfTables = scanner.nextInt();

        ArrayList<Table> tables = new ArrayList<>();
        for (int i = 0; i < numberOfTables; i++) {
            System.out.println("Provide the color for table #" + (i + 1) + "");
            String color = scanner.next();

            System.out.println("Provide the height for table #" + (i + 1) + "");
            int height = scanner.nextInt();

            System.out.println("Provide the width for table #" + (i + 1) + "");
            int width = scanner.nextInt();

            Table table = new Table(color, height, width);
            tables.add(table);
        }

        System.out.println("Provide study room ID: ");
        int studyRoomID = scanner.nextInt();

        StudyRoom studyRoom = new StudyRoom("#" + studyRoomID, tables);

        System.out.println("Provide campus name for study room: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String campusName = bufferedReader.readLine();

        System.out.println("Provide campus location: ");
        String campusLocation = scanner.next();
        scanner.close();

        Campus campus = new Campus(campusName, campusLocation, studyRoom);

        System.out.println("The number of tables in study room with the id: " + campus.studyRoom.roomID + " is " + campus.studyRoom.getNoOfTables() + " on " + campus.name + " campus in " + campus.location + ".");
    }
}
