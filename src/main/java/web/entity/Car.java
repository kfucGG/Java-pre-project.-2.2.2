package web.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {

    private String carName;
    private int carPrice;
    private String nameOfOwner;

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carPrice=" + carPrice +
                ", nameOfOwner='" + nameOfOwner + '\'' +
                '}';
    }
}
