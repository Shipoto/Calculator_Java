public enum Rimlin {
    I("1"), II("2"), III("3");

    private String translation;

    Rimlin(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}
