package com.example.restfultutorialmysql.repository;
import com.example.restfultutorialmysql.entity.Business_Rules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
@Repository
public interface BusineesRulesRepository extends JpaRepository<Business_Rules, Long> {
     
    @Query(value = "select * from business_rules order by business_rules.product_code,business_rules.CHANNEL_CODE asc", nativeQuery = true)
    public List<Business_Rules>getBusinessRules();
    
    @Query(value = "select * from business_rules where product_code=?1 order by business_rules.product_code,business_rules.CHANNEL_CODE asc", nativeQuery = true)
    public List<Business_Rules>getBusinessRulesCode(String code);
        
    @Query(value = "select product.product_description from product where product.product_code=?1", nativeQuery = true)
    public String product_description(String product_code);
    
    @Query(value = "select channel_description from channel where channel_code=?1", nativeQuery = true)
    public String channel_description(String channel_code);
    
    @Query(value = "select modality.modality_description from modality where modality.modality_code=?1", nativeQuery = true)
    public String modality_description(String modality_code);
    
    @Query(value = "select * from business_rules where product_code=?1 order by business_rules.product_code,business_rules.CHANNEL_CODE asc", nativeQuery = true)
    public List<Business_Rules> findByProduct_Code(String code); 
    
    @Query(value = "call UpdateBusineesRules_Status(:codeProduct,:P_rowcount)", nativeQuery = true)
    public Integer UpdateBusineesRules_Status(@Param("codeProduct") String codeProduct,@Param("P_rowcount") Integer P_rowcount); 
    
}
