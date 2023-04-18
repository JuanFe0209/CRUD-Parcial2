import java.io.Serializable;

public class PointsT implements Serializable {
    private Integer idCustomer;
    private String nameCustomer;
    private double tankValue;
    private Integer acumulatedPoints;

    public PointsT(Integer idCustomer, String nameCustomer, double tankValue, Integer acumulatedPoints){
        idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.tankValue = tankValue;
        this.acumulatedPoints = acumulatedPoints;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public double getTankValue() {
        return tankValue;
    }

    public void setTankValue(double tankValue) {
        this.tankValue = tankValue;
    }

    public Integer getAcumulatedPoints() {
        return acumulatedPoints;
    }

    public void setAcumulatedPoints(Integer acumulatedPoints) {
        this.acumulatedPoints = acumulatedPoints;
    }

    @Override
    public String toString() {
        return "PointsT{" +
                "idCustomer=" + idCustomer +
                ", nameCustomer='" + nameCustomer + '\'' +
                ", tankValue=" + tankValue +
                ", acumulatedPoints=" + acumulatedPoints +
                '}';
    }
}
