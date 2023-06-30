package students.andrej_mihailicenko.lesson_12.level_5_6;

class ValidationException extends Exception {

    private String ruleName;
    private String exceptionDescription;
    private String fieldName;

    public ValidationException(String ruleName, String exceptionDescription, String fieldName) {
        this.exceptionDescription = exceptionDescription;
        this.fieldName = fieldName;
        this.ruleName = ruleName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public String getExceptionDescription() {
        return exceptionDescription;
    }

    public String getFieldName() {
        return fieldName;
    }


}
