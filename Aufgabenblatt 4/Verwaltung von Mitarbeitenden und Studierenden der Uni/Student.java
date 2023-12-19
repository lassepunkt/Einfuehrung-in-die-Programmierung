public class Student extends Person {
    private static int naechsteMatrNr = 200200;
    private int matrNr;
    private int semester;
    
    public Student(String name, String vorname, int semester) {
        super(name, vorname);
        this.semester = semester;
        this.matrNr = naechsteMatrNr++;
    }
    public static int getNaechsteMatrNr() {
        return naechsteMatrNr;
    }
    public int getSemester() {
        return this.semester;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    @Override
    public void drucken() {
        if (super.email == null) {
            System.out.println(super.getName()+", E-Mail: fehlt, Matrikelnummer: "+this.matrNr+", Semester: "+this.semester);
        } else {
            System.out.println(super.getName()+", E-Mail: "+super.email+", Matrikelnummer: "+this.matrNr+", Semester: "+this.semester);
        }
    }
    
    @Override
    public boolean hatUrlaub() {
        return this.semester > 6;
    }
}
