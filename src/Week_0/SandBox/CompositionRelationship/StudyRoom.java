package Week_0.SandBox.CompositionRelationship;

import java.util.ArrayList;

public class StudyRoom {
    public String roomID;
    public ArrayList<Table> tables;

    StudyRoom (String roomID, ArrayList<Table> tables) {
        this.roomID = roomID;
        this.tables = tables;
    }

    public int getNoOfTables() {
        return this.tables.size();
    }
}
