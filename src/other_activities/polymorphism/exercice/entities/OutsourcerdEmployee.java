package polymorphism.exercice.entities;

public class OutsourcerdEmployee extends Employee {

    private Double additionalCharger;

    public OutsourcerdEmployee() {
        super();
    }

    public OutsourcerdEmployee(String name, Integer hours, Double value_per_hours, Double additionalCharger) {
        super(name, hours, value_per_hours);
        this.additionalCharger = additionalCharger;
    }

    public Double getAdditionalCharger() {
        return additionalCharger;
    }

    public void setAdditionalCharger(Double additionalCharger) {
        this.additionalCharger = additionalCharger;
    }

    @Override
    public double payment() {
        return super.payment() + additionalCharger * 1.1;
    }

}
