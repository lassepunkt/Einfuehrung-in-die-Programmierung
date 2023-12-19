public abstract class Person implements Druckbar {
    protected String name;
    protected String vorname;
    protected String email;
    
    public Person(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }
    
    public abstract boolean hatUrlaub();
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getName() {
        return this.vorname+" "+this.name;
    }
}
