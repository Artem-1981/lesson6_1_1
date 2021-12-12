public class Registration implements Hospital{
    public Archiv archiv;
    public Plan plan;
    public Schedule schedule;

    public Registration(Archiv archiv, Plan plan, Schedule schedule) {
        this.archiv = archiv;
        this.schedule = schedule;
        this.plan = plan;
    }

    public void goDoctor(Human human) {
        System.out.println("Human go to doctor");
    }


}
