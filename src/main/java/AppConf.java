import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConf {
    @Bean(name = "plan")
    public Plan plan() {
        return new Plan();
    }

    @Bean(name = "archiv")
    public Archiv archiv() {
        return new Archiv();
    }

    @Bean(name = "schedule")
    public Schedule schedule() {
        return new Schedule();
    }

    @Bean(name = "registration")
    public Registration registration(Archiv archiv, Plan plan, Schedule schedule) {
        Registration registration  =new Registration(archiv, plan, schedule);
        registration.archiv.getArc();
        registration.plan.getPlan();
        registration.schedule.getSchedule();
        return registration;
    }

    @Bean(name = "human")
    public Human human(Registration registration) {
        Human human = new Human();
        return human;
    }

}