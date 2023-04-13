package com.example.restfultutorialmysql.repository;

import com.example.restfultutorialmysql.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.List;

//this is the implementation of the DAO interface
//data access object which lets you access and modify data
//the parameters are <TypeOfData, TypeOfId>
@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {
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
    
   Optional<Bank> findByBankcode(String bankcode);

   
}
