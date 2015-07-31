package recordwriter.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import recordwriter.model.Record;


public interface RecordRepository extends JpaRepository<Record,Integer> {
}
