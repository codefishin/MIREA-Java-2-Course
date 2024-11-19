public class AppSettings {
    // instance
    private static AppSettings instance;
    // settings
    private static String language = "testLang";
    private static String theme = "testTheme";
    private static String fileName = "testFile";

    private AppSettings() {}

    public static AppSettings getInstance() {
        if (instance == null) instance = new AppSettings();
        return instance;
    }
    public static void setSetting(String key, String value) {
        switch (key) {
            case "lang":
                language = value;
                break;
            case "theme":
                theme = value;
                break;
            case "filename":
            case "fileName":
                fileName = value;
                break;
            default:
                System.out.println("Wrong setting");
                break;
        }
    }
    public static String getSetting(String key) {
        switch (key) {
            case "lang":
                return language;
            case "theme":
                return theme;
            case "filename":
            case "fileName":
                return fileName;
            default:
                return null;
        }
    }
}
