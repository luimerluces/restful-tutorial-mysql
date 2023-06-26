package com.example.restfultutorialmysql.dto;
import java.io.Serializable;
public class BusinessRulesJsondto implements Serializable {
    private static final long serialVersionUID = 1L;    
    private String productCode; 
    private String Product; 
    private String Channel; 
    private String Modality; 
    private String Status; 

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getModality() {
        return Modality;
    }

    public void setModality(String Modality) {
        this.Modality = Modality;
    }

    public String getChannel() {
        return Channel;
    }

    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String Product) {
        this.Product = Product;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
