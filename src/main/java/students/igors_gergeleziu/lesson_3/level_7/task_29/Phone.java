package students.igors_gergeleziu.lesson_3.level_7.task_29;

class Phone {
    String phoneCorporation;
    String phoneModel;
    String phoneColor;
    double phoneScreenSize;
    int phoneDisplayResolutionWidth;
    int phoneDisplayResolutionHeight;
    int phoneMemory;

    public Phone() {

    }

    public Phone(String phoneCorporation, String phoneModel, String phoneColor, double phoneScreenSize, int phoneDisplayResolutionWidth,int phoneDisplayResolutionHeight, int phoneMemory) {
        this.phoneCorporation = phoneCorporation;
        this.phoneModel = phoneModel;
        this.phoneColor = phoneColor;
        this.phoneScreenSize = phoneScreenSize;
        this.phoneDisplayResolutionWidth = phoneDisplayResolutionWidth;
        this.phoneDisplayResolutionHeight = phoneDisplayResolutionHeight;
        this.phoneMemory = phoneMemory;
    }

    void phoneInformation() {
        System.out.println("Phone: " + phoneCorporation + " " + phoneModel);
        System.out.println("Color: " + phoneColor);
        System.out.println("Screen size: " + phoneScreenSize+"\'\'");
        System.out.println("Resolution: " + phoneDisplayResolutionWidth+"X"+phoneDisplayResolutionHeight);
        System.out.println("Memory: " + phoneMemory+" GB");
    }

    public String getPhoneCorporation() {
        return phoneCorporation;
    }

    String getPhoneModel() {
        return phoneModel;
    }

    String getPhoneColor() {
        return phoneColor;
    }

    double getPhoneScreenSize() {
        return phoneScreenSize;
    }

    String getPhoneDisplayResolution() {
        return phoneDisplayResolutionWidth+"X"+phoneDisplayResolutionHeight;
    }

    public int getPhoneMemory() {
        return phoneMemory;
    }

    void call(String contact) {
        System.out.println("Calling: " + contact);
    }

    void message(String message) {
        System.out.println("Message: " + message);
    }
}


