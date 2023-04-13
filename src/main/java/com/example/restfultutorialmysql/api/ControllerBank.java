package com.example.restfultutorialmysql.api;
import com.example.restfultutorialmysql.entity.Bank;
import com.example.restfultutorialmysql.response.MessageResponse;
import com.example.restfultutorialmysql.service.BankServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
public class ControllerBank {
    @Autowired
    BankServiceImpl bankService;
    @CrossOrigin(origins = "*")
    @GetMapping("/banks")
    public ResponseEntity<List<Bank>> getData(){
        return new ResponseEntity<List<Bank>>(bankService.getAllData(), HttpStatus.OK);
    }    
    @CrossOrigin(origins = "*")
    @GetMapping("/banks/{bankcode}")
    public ResponseEntity<Bank> getTutorialById(@PathVariable("bankcode") String bankcode) {
        Optional<Bank> BankData = bankService.findByBankcode(bankcode);
        if (BankData.isPresent()) {
            return new ResponseEntity<>(BankData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/UpdateBank")
    public ResponseEntity<?> UpdateBank(@RequestBody Bank bank) {
        MessageResponse msj = new MessageResponse();
        Optional<Bank> BankData = bankService.findByBankcode(bank.getBankcode());
        if (BankData.isPresent()) {
            Bank _bank = BankData.get();
            _bank.setBankcode(bank.getBankcode());
            _bank.setC2pstatus(bank.getC2pstatus());
            _bank.setBankdescription(bank.getBankdescription());
            _bank.setP2cstatus(bank.getP2cstatus());
            _bank.setP2pstatus(bank.getP2pstatus());
            _bank.setB2bstatus(bank.getB2bstatus());            
            Boolean updateBank= bankService.updateProduct(_bank);
            if (updateBank=true){
                msj.setSuccess(true);
                msj.setMessage("Bank updated successfully");            
            }            
	    return new ResponseEntity<MessageResponse>(msj,HttpStatus.OK);        
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @CrossOrigin(origins = "*")
    @GetMapping("DesactivarAllStatusBank/{bankcode}")
    public ResponseEntity<?> DesactivarAllStatusBank(@PathVariable("bankcode") String bankcode) {
        MessageResponse msj = new MessageResponse();
        Optional<Bank> BankData = bankService.findByBankcode(bankcode);
        if (BankData.isPresent()) {
            Bank _bank = BankData.get();            
            _bank.setC2pstatus("I");            
            _bank.setP2cstatus("I");
            _bank.setP2pstatus("I");
            _bank.setB2bstatus("I");            
            Boolean updateBank= bankService.updateProduct(_bank);
            if (updateBank=true){
                msj.setSuccess(true);
                msj.setMessage("All Options in el the bank are Activated");            
            }            
	    return new ResponseEntity<MessageResponse>(msj,HttpStatus.OK);        
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @CrossOrigin(origins = "*")
    @GetMapping("ActivarAllStatusBank/{bankcode}")
    public ResponseEntity<?> ActivarAllStatusBank(@PathVariable("bankcode") String bankcode) {
        MessageResponse msj = new MessageResponse();
        Optional<Bank> BankData = bankService.findByBankcode(bankcode);
        if (BankData.isPresent()) {
            Bank _bank = BankData.get();            
            _bank.setC2pstatus("A");            
            _bank.setP2cstatus("A");
            _bank.setP2pstatus("A");
            _bank.setB2bstatus("A");            
            Boolean updateBank= bankService.updateProduct(_bank);
            if (updateBank=true){
                msj.setSuccess(true);
                msj.setMessage("All Options in el the bank are Activated");            
            }            
	    return new ResponseEntity<MessageResponse>(msj,HttpStatus.OK);        
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
