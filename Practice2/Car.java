public class Car {
    String model;
    String license;
    String color;
    int year;
    public Car(String m_model, String m_license, String m_color, int m_year)
    {
        model = m_model;
        license = m_license;
        color = m_color;
        year = m_year;
    }
    public Car()
    {
        model = null;
        license = null;
        color = null;
        year = 0;
    }
    public Car(String m_model, int m_year)
    {
        model = m_model;
        year = m_year;
        license = null;
        color = null;
    }
    public void To_String()
    {
        if (model == null) System.out.println("Error retrieving model info");
        else System.out.println("Model: " + model);

        if (license == null) System.out.println("Error retrieving license info");
        else System.out.println("License: " + license);

        if (color == null) System.out.println("Error retrieving color info");
        else System.out.println("Color: " + color);

        if (year == 0) System.out.println("Error retrieving year info");
        else System.out.println("Year: " + year);
    }
    public void Modify_Year(int new_year)
    {
        year = new_year;
    }
    public void Modify_Model(String new_model)
    {
        model = new_model;
    }
    public void Modify_License(String new_license)
    {
        license = new_license;
    }
    public void Modify_Color(String new_color)
    {
        color = new_color;
    }
}
