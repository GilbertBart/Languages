import java.util.ResourceBundle;

public class I18NManager {
    private static I18NManager instance;


    ResourceBundle es;
    ResourceBundle eng;
    ResourceBundle ca;
    ResourceBundle pt;
    ResourceBundle fr;



    public I18NManager() {
        this.es = ResourceBundle.getBundle("es");
        this.eng = ResourceBundle.getBundle("eng");
        this.ca = ResourceBundle.getBundle("ca");
        this.pt = ResourceBundle.getBundle("pt");
        this.fr = ResourceBundle.getBundle("fr");
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
        else if (language.equals("es"))
        {
            ret = this.es.getString(key);
        }
        else if (language.equals("eng"))
        {
            ret = this.eng.getString(key);
        }
        else if(language.equals("fr"))
        {
            ret=this.fr.getString(key);
        }
        else if(language.equals("pt"))
        {
            ret=this.pt.getString("pt");
        }

        return ret;
    }

    public void clear() {
    }
}
