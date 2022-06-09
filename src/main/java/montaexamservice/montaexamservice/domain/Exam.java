package montaexamservice.montaexamservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Entity class of EXam
 * @author MasoudIder
 */

@Entity
@Table(name = "Exams")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int userId;
    private String examName;

    public Exam(int userId, String examName) {
        this.userId = userId;
        this.examName = examName;
    }
}
