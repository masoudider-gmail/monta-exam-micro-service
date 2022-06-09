package montaexamservice.montaexamservice.service.serviceImp;

import montaexamservice.montaexamservice.domain.Exam;
import montaexamservice.montaexamservice.domain.repository.ExamRepository;
import montaexamservice.montaexamservice.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ExamServiceImp implements ExamService {

    @Autowired
    private ExamRepository repository;

    @Override
    public Exam save(Exam exam) {
        return repository.save(exam);
    }

    @Override
    public Map<Integer, Integer> numberOfExamPerUser() {

        Map<Integer, Integer> map = new HashMap<>();

        repository.findAll().forEach(exam -> {
            int userId = exam.getUserId();

            if (map.containsKey(userId)) {

                map.replace(userId, map.get(userId) + 1);

            } else {
                map.put(userId, 1);
            }
        });

        return map;
    }

}
