package HomeWorkLessonOneTaskFour;

public class Phone {
    private String model;
    private int number;
    private Network network;

    public Phone(String model, int number) {
        super();
        this.model = model;
        this.number = number;
    }

    public Phone() {
        super();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return "Phone {" +
                "model is '" + model + '\'' +
                ", number is " + number +
                " }";
    }

    public void registration(Network network) {
        this.network = network;
        this.network.addPhoneToNetwork(this);
    }

    public void call(int number) {
        Phone activePhone;
        activePhone = this.network.getPhoneFromDataBase(number);
        if (activePhone != null ) {
            activePhone.incomingCall();
        } else {
            System.out.println("The subscriber is not available");
        }
    }

    public void incomingCall() {
        System.out.println("The subscriber "+this +" makes incoming call");
    }

}
