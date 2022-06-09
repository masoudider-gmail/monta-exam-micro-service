package montaexamservice.montaexamservice.service;

import montaexamservice.montaexamservice.domain.Exam;
import montaexamservice.montaexamservice.domain.repository.ExamRepository;
import montaexamservice.montaexamservice.service.serviceImp.ExamServiceImp;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExamServiceTest {

    @Mock
    ExamRepository repository;

    @InjectMocks
    ExamServiceImp service;

    @Test
    void save() {

        Exam exam = new Exam(1, "Exam_1");
        when(repository.save(any(Exam.class))).thenReturn(exam);

        Exam savedExam = service.save(new Exam());

        verify(repository).save(any(Exam.class));

        assertThat(savedExam).isNotNull();

        assertThat(savedExam.getUserId()).isEqualTo(exam.getUserId());

    }

    @Test
    void numberOfExamPerUser() {
        List list = new ArrayList();
        list.add(new Exam(1, "Exam_1"));
        list.add(new Exam(1, "Exam_2"));

        when(repository.findAll()).thenReturn(list);

        Map<Integer, Integer> numberOfExamPerUser = service.numberOfExamPerUser();

        verify(repository).findAll();

        assertThat(numberOfExamPerUser).isNotEmpty();

        assertThat(numberOfExamPerUser.get(1)).isEqualTo(2);
    }
}