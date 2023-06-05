package com.example.restfultutorialmysql.repository;
import com.example.restfultutorialmysql.entity.Type_Operations_Rp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.List;
@Repository
public interface TypeReportRepository extends JpaRepository<Type_Operations_Rp, Long>{
    
}
