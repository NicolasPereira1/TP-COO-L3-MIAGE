package plugin;

/**
 * @author Despelchin and Pereira
 * Plugin interface used by .class plug-in 
 */
public interface Plugin {

    public String transform(String s) ;
    public String getLabel() ;
    public String helpMessage() ;
}
