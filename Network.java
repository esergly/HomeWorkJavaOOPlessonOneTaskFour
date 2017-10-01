package HomeWorkLessonOneTaskFour;

public class Network {

    private Phone[] phonesDataBase = new Phone[0];

    public Network() {
        super();
    }

    public void addPhoneToNetwork(Phone phone) {
        if (addPhoneIntoDataBase(phone) > 0) {
            System.out.println("Duplicate registration action - registration not necessary.");
            return;
        }
        Phone[] extendPhonesDataBase;
        extendPhonesDataBase = new Phone[phonesDataBase.length + 1];
        System.arraycopy(phonesDataBase, 0, extendPhonesDataBase, 0, phonesDataBase.length);
        extendPhonesDataBase[extendPhonesDataBase.length - 1] = phone;
        phonesDataBase = extendPhonesDataBase;
    }

    private int addPhoneIntoDataBase(Phone phone) {
        for (int i = 0; i < phonesDataBase.length; i++) {
            if (phonesDataBase[i].getNumber() == phone.getNumber()) {
                return i;
            }
        }
        return 0;
    }

    public Phone getPhoneFromDataBase(int phoneNumber) {
        for (int i = 0; i < phonesDataBase.length; i++) {
            if (phonesDataBase[i].getNumber() == phoneNumber) {
                return phonesDataBase[i];
            }
        }
        return null;
    }

}
