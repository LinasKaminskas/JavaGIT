package lt.bta.java2.servlets.entites;

public enum Gender {
    M, F;

    public static Gender of(String value) {
        return "M".equals(value) ? Gender.M : "F".equals(value) ? Gender.F : null;
    }
}
