package com.example.restfultutorialmysql.api;
import com.example.restfultutorialmysql.dto.Accumulated_RangeJsondto;
import com.example.restfultutorialmysql.dto.Accumulated_Resultdto;
import com.example.restfultutorialmysql.dto.RpClientsdto;
import com.example.restfultutorialmysql.dto.RpOperationsdto;
import com.example.restfultutorialmysql.service.AccumulatedCustomersServiceImpl;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class ControllerAccumulatedP2P {
    @Autowired
    AccumulatedCustomersServiceImpl accumulatedCustomersServiceImplService;

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/getAllTimeAccumulated/{DateReport}/{CODEReport}/{Graphics}", produces = "application/json")
    public List<Accumulated_RangeJsondto> getAllTimeAccumulated(@PathVariable("DateReport") String DateReport, @PathVariable("CODEReport") String CODEReport, @PathVariable("Graphics") String Graphics) {
        String CODReport = CODEReport;
        boolean notEqualOne = false;
        boolean notEqualTwo = false;
        boolean notEqualThree = false;
        boolean notEqualFour = false;
        boolean notEqualFive = false;
        String IDGraphics = Graphics;
        String countOne = null;
        String countTwo = null;
        String countThree = null;
        String countFour = null;
        String countFive = null;
        //RPD_CLIENTSP2P        
        List<Accumulated_RangeJsondto> listAccumulated = new ArrayList<Accumulated_RangeJsondto>();
        if (CODEReport.equals("560001")) {
            //RPD_CLIENTSP2P;
            ////560001
            if (IDGraphics.equals("1")) {
                countOne = accumulatedCustomersServiceImplService.getAllAccumulatedCustomersOneP2P(DateReport);
                countTwo = accumulatedCustomersServiceImplService.getAllAccumulatedCustomersTwoP2P(DateReport);
                countThree = accumulatedCustomersServiceImplService.getAllAccumulatedCustomersThreeP2P(DateReport);
                countFour = accumulatedCustomersServiceImplService.getAllAccumulatedCustomersFourP2P(DateReport);
                countFive = accumulatedCustomersServiceImplService.getAllAccumulatedCustomersFiveP2P(DateReport);
            } else {
                countOne = accumulatedCustomersServiceImplService.getAllAccumulatedOperationOneP2P(DateReport, Graphics);
                countTwo = accumulatedCustomersServiceImplService.getAllAccumulatedOperationTwoP2P(DateReport, Graphics);
                countThree = accumulatedCustomersServiceImplService.getAllAccumulatedOperationThreeP2P(DateReport, Graphics);
                countFour = accumulatedCustomersServiceImplService.getAllAccumulatedOperationFourP2P(DateReport, Graphics);
                countFive = accumulatedCustomersServiceImplService.getAllAccumulatedOperationFiveP2P(DateReport, Graphics);
            }
        } else {
            //RPD_CLIENTSP2C; 
            //560050
            if (IDGraphics.equals("1")) {
                countOne = accumulatedCustomersServiceImplService.getAllAccumulatedCustomersOneP2C(DateReport);
                countTwo = accumulatedCustomersServiceImplService.getAllAccumulatedCustomersTwoP2C(DateReport);
                countThree = accumulatedCustomersServiceImplService.getAllAccumulatedCustomersThreeP2C(DateReport);
                countFour = accumulatedCustomersServiceImplService.getAllAccumulatedCustomersFourP2C(DateReport);
                countFive = accumulatedCustomersServiceImplService.getAllAccumulatedCustomersFiveP2C(DateReport);
            } else {
                countOne = accumulatedCustomersServiceImplService.getAllAccumulatedOperationOneP2C(DateReport, Graphics);
                countTwo = accumulatedCustomersServiceImplService.getAllAccumulatedOperationTwoP2C(DateReport, Graphics);
                countThree = accumulatedCustomersServiceImplService.getAllAccumulatedOperationThreeP2C(DateReport, Graphics);
                countFour = accumulatedCustomersServiceImplService.getAllAccumulatedOperationFourP2C(DateReport, Graphics);
                countFive = accumulatedCustomersServiceImplService.getAllAccumulatedOperationFiveP2C(DateReport, Graphics);
            }
        }
        notEqualOne = countOne.equals("0");
        notEqualTwo = countTwo.equals("0");
        notEqualThree = countThree.equals("0");
        notEqualFour = countFour.equals("0");
        notEqualFive = countFive.equals("0");
        if (notEqualOne == false) {
            Accumulated_RangeJsondto json = new Accumulated_RangeJsondto();
            json.setLabel("Primer Bloque");
            json.setValue("00:00:00-06:00:00");
            listAccumulated.add(json);
        }
        if (notEqualTwo == false) {
            Accumulated_RangeJsondto json = new Accumulated_RangeJsondto();
            json.setLabel("Segundo Bloque");
            json.setValue("00:00:00-09:00:00");
            listAccumulated.add(json);
        }
        if (notEqualThree == false) {
            Accumulated_RangeJsondto json = new Accumulated_RangeJsondto();
            json.setLabel("Tercer Bloque");
            json.setValue("00:00:00-12:00:00");
            listAccumulated.add(json);
        }

        if (notEqualFour == false) {
            Accumulated_RangeJsondto json = new Accumulated_RangeJsondto();
            json.setLabel("Cuarto Bloque");
            json.setValue("00:00:00-15:00:00");
            listAccumulated.add(json);
        }

        if (notEqualFive == false) {
            Accumulated_RangeJsondto json = new Accumulated_RangeJsondto();
            json.setLabel("Quinto Bloque");
            json.setValue("00:00:00-18:00:00");
            listAccumulated.add(json);
        }
        return listAccumulated;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/getAllTimeAccumulatedError/{DateReport}/{CODEReport}/{graphicsError}", produces = "application/json")
    public List<Accumulated_RangeJsondto> getAllTimeAccumulatedError(@PathVariable("DateReport") String DateReport, @PathVariable("CODEReport") String CODEReport, @PathVariable("graphicsError") String graphicsError) {
        String CODReport = CODEReport;
        boolean notEqualErrorOne = false;
        boolean notEqualErrorTwo = false;
        boolean notEqualErrorThree = false;
        boolean notEqualErrorFour = false;
        boolean notEqualErrorFive = false;
        String IDGraphics = graphicsError;
        String countOneError = null;
        String countTwoError = null;
        String countThreeError = null;
        String countFourError = null;
        String countFiveError = null;
        //RPD_CLIENTSP2P        
        List<Accumulated_RangeJsondto> listAccumulated = new ArrayList<Accumulated_RangeJsondto>();
        if (CODEReport.equals("560001")) {
            //RPD_DCS_ERRORP2P;
            ////560001
            countOneError = accumulatedCustomersServiceImplService.getAllAccumulatedErrorOneP2P(DateReport, graphicsError);
            countTwoError = accumulatedCustomersServiceImplService.getAllAccumulatedErrorTwoP2P(DateReport, graphicsError);
            countThreeError = accumulatedCustomersServiceImplService.getAllAccumulatedErrorThreeP2P(DateReport, graphicsError);
            countFourError = accumulatedCustomersServiceImplService.getAllAccumulatedErrorFourP2P(DateReport, graphicsError);
            countFiveError = accumulatedCustomersServiceImplService.getAllAccumulatedErrorFiveP2P(DateReport, graphicsError);
        } else {
            //RPD_DCS_ERRORP2C; 
            //560050
            countOneError = accumulatedCustomersServiceImplService.getAllAccumulatedErrorOneP2C(DateReport, graphicsError);
            countTwoError = accumulatedCustomersServiceImplService.getAllAccumulatedErrorTwoP2C(DateReport, graphicsError);
            countThreeError = accumulatedCustomersServiceImplService.getAllAccumulatedErrorThreeP2C(DateReport, graphicsError);
            countFourError = accumulatedCustomersServiceImplService.getAllAccumulatedErrorFourP2C(DateReport, graphicsError);
            countFiveError = accumulatedCustomersServiceImplService.getAllAccumulatedErrorFiveP2C(DateReport, graphicsError);
        }
        notEqualErrorOne = countOneError.equals("0");
        notEqualErrorTwo = countTwoError.equals("0");
        notEqualErrorThree = countThreeError.equals("0");
        notEqualErrorFour = countFourError.equals("0");
        notEqualErrorFive = countFiveError.equals("0");
        if (notEqualErrorOne == false) {
            Accumulated_RangeJsondto json = new Accumulated_RangeJsondto();
            json.setLabel("Primer Bloque");
            json.setValue("00:00:00-06:00:00");
            listAccumulated.add(json);
        }

        if (notEqualErrorTwo == false) {
            Accumulated_RangeJsondto json = new Accumulated_RangeJsondto();
            json.setLabel("Segundo Bloque");
            json.setValue("00:00:00-09:00:00");
            listAccumulated.add(json);
        }
        if (notEqualErrorThree == false) {
            Accumulated_RangeJsondto json = new Accumulated_RangeJsondto();
            json.setLabel("Tercer Bloque");
            json.setValue("00:00:00-12:00:00");
            listAccumulated.add(json);
        }

        if (notEqualErrorFour == false) {
            Accumulated_RangeJsondto json = new Accumulated_RangeJsondto();
            json.setLabel("Cuarto Bloque");
            json.setValue("00:00:00-15:00:00");
            listAccumulated.add(json);
        }

        if (notEqualErrorFive == false) {
            Accumulated_RangeJsondto json = new Accumulated_RangeJsondto();
            json.setLabel("Quinto Bloque");
            json.setValue("00:00:00-18:00:00");
            listAccumulated.add(json);
        }
        return listAccumulated;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/getAllAccumulatedGraphics/{DateReport}/{CODEReport}/{RangeTime}/{Graphics}", produces = "application/json")
    public List<Accumulated_Resultdto> getAllGraphicsAccumulated(@PathVariable("DateReport") String DateReport, @PathVariable("CODEReport") String CODEReport, @PathVariable("RangeTime") String RangeTime, @PathVariable("Graphics") String Graphics) {
        String strFecha = RangeTime;
        String IDGraphics = Graphics;
        String TimeStart = strFecha.substring(0, 8);
        String TimeEnd = strFecha.substring(9, 17);
        List<Accumulated_Resultdto> listAccumulated = new ArrayList<Accumulated_Resultdto>();
        List<RpClientsdto> listRpClients;
        List<RpOperationsdto> listRpOperations;
        if (CODEReport.equals("560001")) {
            //P2P            
            if (IDGraphics.equals("1")) {
                //cliente
                listRpClients = accumulatedCustomersServiceImplService.getAccumulatedClientsP2P(DateReport, TimeStart, TimeEnd);
                for (RpClientsdto n : listRpClients) {
                    Accumulated_Resultdto JsonResultAccumulated = new Accumulated_Resultdto();                    
                    JsonResultAccumulated.setAmount("");
                    JsonResultAccumulated.setCodError("");
                    JsonResultAccumulated.setNumRegister(n.getNumRegister());
                    JsonResultAccumulated.setDescription(n.getDescription());
                    JsonResultAccumulated.setDate_Procces(n.getDate_Proccess());
                    JsonResultAccumulated.setTime_Procces(n.getTime_Proccess());
                    listAccumulated.add(JsonResultAccumulated);
                }
            } else {
                //Reporte Operaciones
                listRpOperations = accumulatedCustomersServiceImplService.getAccumulatedOperationsP2P(DateReport, TimeStart, TimeEnd,Graphics);
                for (RpOperationsdto n : listRpOperations) {
                    Accumulated_Resultdto JsonResultAccumulated = new Accumulated_Resultdto();                    
                    JsonResultAccumulated.setAmount(n.getAmountBS());
                    JsonResultAccumulated.setCodError(n.getCoderror());
                    JsonResultAccumulated.setNumRegister(n.getNumRegister());
                    JsonResultAccumulated.setDescription(n.getDescription());
                    JsonResultAccumulated.setDate_Procces(n.getDate_Proccess());
                    JsonResultAccumulated.setTime_Procces(n.getTime_Proccess());
                    JsonResultAccumulated.setDetail(n.getDetail());
                    listAccumulated.add(JsonResultAccumulated);
                }
            }
        } else {
            //P2C
            if (IDGraphics.equals("1")) {
                //cliente
                listRpClients = accumulatedCustomersServiceImplService.getAccumulatedClientsP2C(DateReport, TimeStart, TimeEnd);
                for (RpClientsdto n : listRpClients) {
                    Accumulated_Resultdto JsonResultAccumulated = new Accumulated_Resultdto();                    
                    JsonResultAccumulated.setAmount("");
                    JsonResultAccumulated.setCodError("");
                    JsonResultAccumulated.setNumRegister(n.getNumRegister());
                    JsonResultAccumulated.setDescription(n.getDescription());
                    JsonResultAccumulated.setDate_Procces(n.getDate_Proccess());
                    JsonResultAccumulated.setTime_Procces(n.getTime_Proccess());
                    listAccumulated.add(JsonResultAccumulated);
                }
            } else {
                //Reporte Operaciones
                listRpOperations = accumulatedCustomersServiceImplService.getAccumulatedOperationsP2C(DateReport, TimeStart, TimeEnd,Graphics);
                for (RpOperationsdto n : listRpOperations) {
                    Accumulated_Resultdto JsonResultAccumulated = new Accumulated_Resultdto();                    
                    JsonResultAccumulated.setAmount(n.getAmountBS());
                    JsonResultAccumulated.setCodError(n.getCoderror());
                    JsonResultAccumulated.setNumRegister(n.getNumRegister());
                    JsonResultAccumulated.setDescription(n.getDescription());
                    JsonResultAccumulated.setDate_Procces(n.getDate_Proccess());
                    JsonResultAccumulated.setTime_Procces(n.getTime_Proccess());
                    JsonResultAccumulated.setDetail(n.getDetail());
                    listAccumulated.add(JsonResultAccumulated);
                }
            }
        }
        return listAccumulated;
    }
    
    @CrossOrigin(origins = "*")
    @GetMapping(value = "/getAllGraphicsErrorAccumulated/{DateReport}/{CODEReport}/{RangeTime}/{graphicsError}", produces = "application/json")
    public List<Accumulated_Resultdto> getAllGraphicsErrorAccumulated(@PathVariable("DateReport") String DateReport, @PathVariable("CODEReport") String CODEReport, @PathVariable("RangeTime") String RangeTime, @PathVariable("graphicsError") String graphicsError) {
        String strFecha = RangeTime;
        String IDGraphicsError = graphicsError;
        String TimeStart = strFecha.substring(0, 8);
        String TimeEnd = strFecha.substring(9, 17);
        List<Accumulated_Resultdto> listAccumulated = new ArrayList<Accumulated_Resultdto>();
        List<RpOperationsdto> listRpOperations;
        if (CODEReport.equals("560001")) {
            //P2P            
            listRpOperations = accumulatedCustomersServiceImplService.getAccumulatedGraphicsErrorP2P(DateReport, TimeStart, TimeEnd,graphicsError);
            for (RpOperationsdto n : listRpOperations) {
                Accumulated_Resultdto JsonResultAccumulated = new Accumulated_Resultdto();                    
                JsonResultAccumulated.setAmount(n.getAmountBS());
                JsonResultAccumulated.setCodError(n.getCoderror());
                JsonResultAccumulated.setNumRegister(n.getNumRegister());
                JsonResultAccumulated.setDescription(n.getDescription());
                JsonResultAccumulated.setDate_Procces(n.getDate_Proccess());
                JsonResultAccumulated.setTime_Procces(n.getTime_Proccess());
                JsonResultAccumulated.setDetail(n.getDetail());
                listAccumulated.add(JsonResultAccumulated);
            }
        } else {
            //P2C
            listRpOperations = accumulatedCustomersServiceImplService.getAccumulatedGraphicsErrorP2C(DateReport, TimeStart, TimeEnd,graphicsError);
            for (RpOperationsdto n : listRpOperations) {
                Accumulated_Resultdto JsonResultAccumulated = new Accumulated_Resultdto();                    
                JsonResultAccumulated.setAmount(n.getAmountBS());
                JsonResultAccumulated.setCodError(n.getCoderror());
                JsonResultAccumulated.setNumRegister(n.getNumRegister());
                JsonResultAccumulated.setDescription(n.getDescription());
                JsonResultAccumulated.setDate_Procces(n.getDate_Proccess());
                JsonResultAccumulated.setTime_Procces(n.getTime_Proccess());
                JsonResultAccumulated.setDetail(n.getDetail());
                listAccumulated.add(JsonResultAccumulated);
            }
        }
        return listAccumulated;
    }        
    
}
