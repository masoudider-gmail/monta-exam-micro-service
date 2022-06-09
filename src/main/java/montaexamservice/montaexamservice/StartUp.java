package montaexamservice.montaexamservice;

import montaexamservice.montaexamservice.domain.Exam;
import montaexamservice.montaexamservice.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartUp implements CommandLineRunner {

    @Autowired
    private ExamService service;

    @Override
    public void run(String... args) throws Exception {
        service.save(new Exam(1,"exam1"));
        service.save(new Exam(1,"exam2"));
        service.save(new Exam(1,"exam3"));
        service.save(new Exam(1,"exam4"));
        service.save(new Exam(1,"exam5"));

        service.save(new Exam(2,"exam1"));
        service.save(new Exam(2,"exam2"));
        service.save(new Exam(2,"exam3"));
        service.save(new Exam(2,"exam4"));
        service.save(new Exam(2,"exam5"));

        service.save(new Exam(3,"exam1"));
        service.save(new Exam(3,"exam2"));
        service.save(new Exam(3,"exam3"));
        service.save(new Exam(3,"exam4"));

        service.save(new Exam(4,"exam1"));
        service.save(new Exam(4,"exam2"));
        service.save(new Exam(4,"exam3"));

    }
}
