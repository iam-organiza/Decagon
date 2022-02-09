package Week_0.CompositionRelationship;

import java.util.ArrayList;
import java.util.List;

public class Campus {

    public String name;
    public String location;
    public StudyRoom studyRoom;

    Campus (String name, String location, StudyRoom studyRoom) {
        this.name = name;
        this.location = location;
        this.studyRoom = studyRoom;
    }

}
