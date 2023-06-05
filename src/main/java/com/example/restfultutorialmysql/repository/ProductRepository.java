package com.example.restfultutorialmysql.repository;
import com.example.restfultutorialmysql.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

//this is the implementation of the DAO interface
//data access object which lets you access and modify data
//the parameters are <TypeOfData, TypeOfId>
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
    @Query(value ="select product_code,product_description from product where product_code in ('560001','560050')",nativeQuery = true)
    public List<Product> findAllProduct();
    
    //this are JPA additional methods
    //follow the docs to know how to create them
    //https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
    //uncomment this and try to implement them in the Service yourself

//    //get data by email
//    List<DataExample> findDataExampleByEmail(String email);
//
//    //get data by name
//    List<DataExample> findDataExampleByName(String name);
//
//    //get data by id
//    List<DataExample> findDataExampleByDataId(Long id);

    ///public Bank findById(String BankCode);
    

    //public Bank getBankByCode(String CodeBank);
   //List<Bank> findByBANK_CODE(String BANK_CODE);
    
   //Optional<Product> findByBankcode(String bankcode);

   
}
