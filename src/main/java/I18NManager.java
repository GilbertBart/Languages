import java.util.ResourceBundle;

public class I18NManager {
    private static I18NManager instance;


    ResourceBundle es;
    ResourceBundle en;
    ResourceBundle ca;

    XXXX data;



    public I18NManager() {
        this.es = ResourceBundle.getBundle("es");
        this.en = ResourceBundle.getBundle("eng");
        this.ca = ResourceBundle.getBundle("ca");
    }

    public static I18NManager getInstance(){ // Metode Public acces
        if(instance==null)instance= new I18NManager();
        return instance;
    }


    public String getText(String language, String key) {
        String ret = null;
        if (language.equals("ca")) {
            ret = this.ca.getString(key);
        }
        return ret;
    }

    public void clear() {
    }
}
