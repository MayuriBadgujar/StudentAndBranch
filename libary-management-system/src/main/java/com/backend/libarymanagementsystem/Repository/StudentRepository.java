/*package com.backend.libarymanagementsystem.Repository;

public interface StudentRepository {
}*/

package com.backend.libarymanagementsystem.Repository;

import com.backend.libarymanagementsystem.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
