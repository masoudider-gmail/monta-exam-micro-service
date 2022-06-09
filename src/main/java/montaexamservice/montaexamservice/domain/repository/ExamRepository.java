package montaexamservice.montaexamservice.domain.repository;

import montaexamservice.montaexamservice.domain.Exam;
import org.springframework.data.repository.CrudRepository;

public interface ExamRepository extends CrudRepository<Exam, Integer> {
}
