public enum Season {

    WINTER("Zima", new String[]{"grudzień", "styczeń", "luty"}),
    SPRING("Wiosna", new String[]{"marzec", "kwiecień", "maj"}),
    SUMMER("Lato", new String[]{"czerwiec", "lipiec", "sierpień"}),
    AUTUMN("Jesień", new String[]{"wrzesień", "październik", "listopad"});


    private final String name;
    private final String[] months;

    Season(String name, String[] months) {
        this.name = name;
        this.months = months;
    }

    public String getName() {
        return name;
    }

    public String[] getMonths() {
        return months;
    }

    static Season convertSeason(String name) {
        Season[] values = values();
        for (Season season : values) {
            if (season.name.equalsIgnoreCase(name))
                return season;
        }
        throw new IllegalArgumentException("Unexpected value");
    }
}
