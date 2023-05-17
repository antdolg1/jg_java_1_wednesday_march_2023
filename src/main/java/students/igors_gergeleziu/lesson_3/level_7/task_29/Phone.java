package students.igors_gergeleziu.lesson_3.level_7.task_29;

class Phone {
    String corporation;
    String model;
    String color;
    double screenSize;
    int displayResolutionWidth;
    int displayResolutionHeight;
    int memory;

    Phone(String corporation, String model, String color, double screenSize, int displayResolutionWidth, int displayResolutionHeight, int memory) {
        this.corporation = corporation;
        this.model = model;
        this.color = color;
        this.screenSize = screenSize;
        this.displayResolutionWidth = displayResolutionWidth;
        this.displayResolutionHeight = displayResolutionHeight;
        this.memory = memory;
    }

    void printPhoneInformation() {
        System.out.println("Phone: " + corporation + " " + model);
        System.out.println("Color: " + color);
        System.out.println("Screen size: " + screenSize + "\'\'");
        System.out.println("Resolution: " + displayResolutionWidth + "X" + displayResolutionHeight);
        System.out.println("Memory: " + memory + " GB");
    }

    String getCorporation() {
        return corporation;
    }

    String getModel() {
        return model;
    }

    String getColor() {
        return color;
    }

    double getScreenSize() {
        return screenSize;
    }

    String getDisplayResolution() {
        return displayResolutionWidth + "X" + displayResolutionHeight;
    }

    int getMemory() {
        return memory;
    }

    void call(String contact) {
        System.out.println("Calling: " + contact);
    }

    void message(String message) {
        System.out.println("Message: " + message);
    }
}


