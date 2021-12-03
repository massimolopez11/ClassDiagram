package Model;

import java.sql.Time;

public class Exam {
    private int roomNumber;
    private int floorLevel;
    private String buildingName;
    private String campusLocation;
    public Time startTime;
    public Time duration;

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getFloorLevel() {
        return floorLevel;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public String getCampusLocation() {
        return campusLocation;
    }

    public Time getStartTime() {
        return duration;
    }

    public Time getDuration() {
        return startTime;
    }
}
