package peaksoftlms.peaksoft.repository;

import com.example.peaksoftlmsb8.peaksoft.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}