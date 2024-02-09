package polymorphism;

import java.util.Date;

public class ProductManager extends Employee{

    private String productCode;

    public ProductManager(String employeeID, long salary, Date startDate, String productCode) {
        super(employeeID, salary, startDate);
        this.productCode = productCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @Override
    public void work() {
        System.out.println("나는 물류를 관리해");
    }

    @Override
    public String toString() {
        return "ProductManager{" +
                "productCode='" + productCode + '\'' +
                '}';
    }


}
