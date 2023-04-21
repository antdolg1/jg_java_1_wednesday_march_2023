package students.igors_gergeleziu.lesson_3.level_7.task_29;

class Phone {
    String Corporation;
    String Model;
    String Color;
    double ScreenSize;
    int DisplayResolutionWidth;
    int DisplayResolutionHeight;
    int Memory;

    Phone() {

    }

    Phone(String Corporation, String Model, String Color, double ScreenSize, int DisplayResolutionWidth, int DisplayResolutionHeight, int Memory) {
        this.Corporation = Corporation;
        this.Model = Model;
        this.Color = Color;
        this.ScreenSize = ScreenSize;
        this.DisplayResolutionWidth = DisplayResolutionWidth;
        this.DisplayResolutionHeight = DisplayResolutionHeight;
        this.Memory = Memory;
    }

    void phoneInformation() {
        System.out.println("Phone: " + Corporation + " " + Model);
        System.out.println("Color: " + Color);
        System.out.println("Screen size: " + ScreenSize + "\'\'");
        System.out.println("Resolution: " + DisplayResolutionWidth + "X" + DisplayResolutionHeight);
        System.out.println("Memory: " + Memory + " GB");
    }

    String getPhoneCorporation() {
        return Corporation;
    }

    String getPhoneModel() {
        return Model;
    }

    String getColor() {
        return Color;
    }

    double getScreenSize() {
        return ScreenSize;
    }

    String getPhoneDisplayResolution() {
        return DisplayResolutionWidth + "X" + DisplayResolutionHeight;
    }

    int getMemory() {
        return Memory;
    }

    void call(String contact) {
        System.out.println("Calling: " + contact);
    }

    void message(String message) {
        System.out.println("Message: " + message);
    }
}


