package students.jegors_rutkovskis.lesson_8.level_7.pattern_builder;

class BankAccount {
        private String firstName;
        private String lastName;
        private String personalCode;
        private String country;
        private String city;
        private String street;
        private int id;

        BankAccount(String firstName, String lastName, String personalCode,
                           String country, String city, String street, int id) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.personalCode = personalCode;
            this.country = country;
            this.city = city;
            this.street = street;
            this.id = id;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();

            builder.append("Bank account ID: ").append(id).append("\n");
            builder.append("Personal code: ").append(personalCode).append("\n");
            builder.append("Name: ").append(firstName).append(", ")
                    .append(lastName).append("\n");
            builder.append("Address: ").append(street).append(", ")
                    .append(city).append(", ").append(country).append("\n");

            return builder.toString();
        }
}
