package students.igors_gergeleziu.lesson_8;

class FraudRule4 extends FraudRule {
    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (restrictedCitiesOfJamaica(t)) return true;
        else return false;
    }

    boolean restrictedCitiesOfJamaica(Transaction t) {
        boolean restrictedStatus = false;
        String[] citiesOfJamaica = {"Kingston", "Portmore", "May Pen", "Spanish Town" +
                "Montego Bay", "Half Way Tree", "Mandeville", " Old Harbour", "Linstead" +
                "Savanna - la - Mar", "Ocho Rios", "Port Antonio", "Bog Walk", "Ewarton" +
                "Saint Ann’s Bay", "Port Morant", "Browns Town", "Port Maria", "Falmouth", "Yallahs" +
                "Porus", "Lucea", "Annotto Bay", "Chapelton", "Negril", "Anchovy", "Black River", "Oracabessa" +
                "Frankfield", "Guys Hill", "Morant Bay"};
        for (String city : citiesOfJamaica) {
            if (t.getTrader().getCity().equals(city)) {
                restrictedStatus = true;
            }
        }
        return restrictedStatus;
    }
}
