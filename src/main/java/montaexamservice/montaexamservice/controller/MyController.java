package montaexamservice.montaexamservice.controller;

import montaexamservice.montaexamservice.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Rest Controller in which a get method
 * is provided to handel the http get request of link /exams
 * @author MasoudIder
 */

@RestController
@RequestMapping("/exams")
public class MyController {

    @Autowired
    private ExamService service;

    @GetMapping
    public Map<Integer,Integer> get() {
        return service.numberOfExamPerUser();
    }
}
