package Lab6ClassRelationships;

public class Faculty {
    private int facultyId;
    private String facultyName;
    private String facultyPosition;

    public Faculty() {}
    public Faculty(int i, String n, String p) {
        facultyId = i;
        facultyName = n;
        facultyPosition = p;
    }

    public int getFacultyId()
    {
        return facultyId;
    }
    public String getFacultyName()
    {
        return facultyName;
    }
    public String getFacultyPosition()
    {
        return facultyPosition;
    }
    public void setFacultyId(int i)
    {
        facultyId = i;
    }
    public void setFacultyName(String n)
    {
        facultyName = n;
    }
    public void setFacultyPosition(String p) {
        facultyPosition = p;
    }

    public String toString() {
        return "Faculty Id = " + facultyId + "\nFaculty Name = " + facultyName
                + "\nFaculty Position=" + facultyPosition;
    }

}
