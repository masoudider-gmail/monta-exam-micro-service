package montaexamservice.montaexamservice.service;

import montaexamservice.montaexamservice.domain.Exam;

import java.util.Map;

/**
 * Exam Service Class
 * @author MasoudIder
 */
public interface ExamService {
    /**
     * Method provided to save the exam object
     * @param exam
     * @return saved version of the object
     */
    Exam save(Exam exam);

    /**
     * @return a map that its key is user id and the value is the number of exams that the user is attended
     */
    Map<Integer,Integer> numberOfExamPerUser();
}
