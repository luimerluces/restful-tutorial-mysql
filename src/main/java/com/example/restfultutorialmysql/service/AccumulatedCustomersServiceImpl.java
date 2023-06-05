package com.example.restfultutorialmysql.service;
import com.example.restfultutorialmysql.dto.Accumulated_Hourdto;
import com.example.restfultutorialmysql.dto.Accumulated_Resultdto;
import com.example.restfultutorialmysql.dto.RpClientsdto;
import com.example.restfultutorialmysql.dto.RpOperationsdto;
import com.example.restfultutorialmysql.entity.RpdClientsP2C;
import com.example.restfultutorialmysql.entity.RpdClientsP2P;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.restfultutorialmysql.repository.AccumulatedCustomersRepository;
import com.example.restfultutorialmysql.repository.AccumulatedCustomersRepository;
@Service
public class AccumulatedCustomersServiceImpl implements AccumulatedCustomersService{
    @Autowired
    AccumulatedCustomersRepository accumulatedCustomersRepositoryP2P;
    /////******************************************************************P2P TIME Y TIMEERROR/////******************************************************************/////******************************************************************///
    @Override
    public String getAllAccumulatedCustomersOneP2P(String DateReport) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedCustomersOneP2P(DateReport);
    }       
    
    @Override
    public String getAllAccumulatedOperationOneP2P(String DateReport,String Graphics) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedOperationOneP2P(DateReport,Graphics);
    }
    @Override
    public String getAllAccumulatedErrorOneP2P(String DateReport,String graphicsError) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedErrorOneP2P(DateReport,graphicsError);
    }
    @Override
    public String getAllAccumulatedCustomersTwoP2P(String DateReport) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedCustomersTwoP2P(DateReport);
    }
    @Override
    public String getAllAccumulatedOperationTwoP2P(String DateReport,String Graphics) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedOperationTwoP2P(DateReport,Graphics);
    }
    @Override
    public String getAllAccumulatedErrorTwoP2P(String DateReport,String graphicsError) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedErrorTwoP2P(DateReport,graphicsError);
    }
    @Override
    public String getAllAccumulatedCustomersThreeP2P(String DateReport) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedCustomersThreeP2P(DateReport);
    }
    @Override
    public String getAllAccumulatedOperationThreeP2P(String DateReport,String Graphics) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedOperationThreeP2P(DateReport,Graphics);
    }
    @Override
    public String getAllAccumulatedErrorThreeP2P(String DateReport,String graphicsError) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedErrorThreeP2P(DateReport,graphicsError);
    }
    @Override
    public String getAllAccumulatedCustomersFourP2P(String DateReport) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedCustomersFourP2P(DateReport);
    } 
    @Override
    public String getAllAccumulatedOperationFourP2P(String DateReport,String Graphics) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedOperationFourP2P(DateReport,Graphics);
    } 
    @Override
    public String getAllAccumulatedErrorFourP2P(String DateReport,String graphicsError) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedErrorFourP2P(DateReport,graphicsError);
    }
    @Override
    public String getAllAccumulatedCustomersFiveP2P(String DateReport) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedCustomersFiveP2P(DateReport);
    }  
    @Override
    public String getAllAccumulatedOperationFiveP2P(String DateReport,String Graphics) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedOperationFiveP2P(DateReport,Graphics);
    }  
    @Override
    public String getAllAccumulatedErrorFiveP2P(String DateReport,String graphicsError) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedErrorFiveP2P(DateReport,graphicsError);
    }
    /////******************************************************************P2C TIME Y TIMEERROR/////******************************************************************/////******************************************************************
    
    @Override
    public String getAllAccumulatedCustomersOneP2C(String DateReport) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedCustomersOneP2C(DateReport);
    }   
    @Override
    public String getAllAccumulatedOperationOneP2C(String DateReport,String Graphics) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedOperationOneP2C(DateReport,Graphics);
    }
    @Override
    public String getAllAccumulatedErrorOneP2C(String DateReport,String graphicsError) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedErrorOneP2C(DateReport,graphicsError);
    }
    @Override
    public String getAllAccumulatedCustomersTwoP2C(String DateReport) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedCustomersTwoP2C(DateReport);
    }
    @Override
    public String getAllAccumulatedOperationTwoP2C(String DateReport,String Graphics) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedOperationTwoP2C(DateReport,Graphics);
    }
    @Override
    public String getAllAccumulatedErrorTwoP2C(String DateReport,String graphicsError) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedErrorTwoP2C(DateReport,graphicsError);
    }
    @Override
    public String getAllAccumulatedCustomersThreeP2C(String DateReport) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedCustomersThreeP2C(DateReport);
    }
    @Override
    public String getAllAccumulatedOperationThreeP2C(String DateReport,String Graphics) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedOperationThreeP2C(DateReport,Graphics);
    }
    @Override
    public String getAllAccumulatedErrorThreeP2C(String DateReport,String graphicsError) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedErrorThreeP2C(DateReport,graphicsError);
    }
    @Override
    public String getAllAccumulatedCustomersFourP2C(String DateReport) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedCustomersFourP2C(DateReport);
    } 
    @Override
    public String getAllAccumulatedOperationFourP2C(String DateReport,String Graphics) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedOperationFourP2C(DateReport,Graphics);
    }
    @Override
    public String getAllAccumulatedErrorFourP2C(String DateReport,String graphicsError) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedErrorFourP2C(DateReport,graphicsError);
    }
    @Override
    public String getAllAccumulatedCustomersFiveP2C(String DateReport) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedCustomersFiveP2C(DateReport);
    }
    @Override
    public String getAllAccumulatedOperationFiveP2C(String DateReport,String Graphics) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedOperationFiveP2C(DateReport,Graphics);
    }
    @Override
    public String getAllAccumulatedErrorFiveP2C(String DateReport,String graphicsError) {
        return accumulatedCustomersRepositoryP2P.getAllAccumulatedErrorFiveP2C(DateReport,graphicsError);
    }
    
    /////******************************************************************P2P/////******************************************************************/////******************************************************************///

    @Override
    public List<RpClientsdto> getAccumulatedClientsP2P(String DateReport, String TimeStart, String TimeEnd) {
        return accumulatedCustomersRepositoryP2P.getAccumulatedClientsP2P(DateReport, TimeStart, TimeEnd);
    }
    
    @Override
    public List<RpClientsdto> getAccumulatedClientsP2C(String DateReport, String TimeStart, String TimeEnd) {
        return accumulatedCustomersRepositoryP2P.getAccumulatedClientsP2C(DateReport, TimeStart, TimeEnd);
    }
    @Override
    public List<RpOperationsdto> getAccumulatedOperationsP2P(String DateReport, String TimeStart, String TimeEnd, String Graphics) {
        return accumulatedCustomersRepositoryP2P.getAccumulatedOperationsP2P(DateReport, TimeStart, TimeEnd,Graphics);
    }
    @Override
    public List<RpOperationsdto> getAccumulatedOperationsP2C(String DateReport, String TimeStart, String TimeEnd,String Graphics) {
        return accumulatedCustomersRepositoryP2P.getAccumulatedOperationsP2C(DateReport, TimeStart, TimeEnd,Graphics);
    }
    @Override
    public List<RpOperationsdto> getAccumulatedGraphicsErrorP2P(String DateReport, String TimeStart, String TimeEnd,String graphicsError) {
        return accumulatedCustomersRepositoryP2P.getAccumulatedGraphicsErrorP2P(DateReport, TimeStart, TimeEnd,graphicsError);
    }
    @Override
    public List<RpOperationsdto> getAccumulatedGraphicsErrorP2C(String DateReport, String TimeStart, String TimeEnd,String graphicsError) {
        return accumulatedCustomersRepositoryP2P.getAccumulatedGraphicsErrorP2C(DateReport, TimeStart, TimeEnd,graphicsError);
    }
    

    
    
    
    
    
    
}
