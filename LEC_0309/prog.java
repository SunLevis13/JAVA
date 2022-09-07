
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class prog {
   public static void main(String[] args) {
       Logger logger = Logger.getLogger(prog.class.getName());
       logger.setLevel(Level.INFO);
       ConsoleHandler ch = new ConsoleHandler();
       logger.addHandler(ch);
       SimpleFormatter sFormat = new SimpleFormatter();
    //    XMLFormatter xml = new XMLFormatter();
       ch.setFormatter(sFormat);
    //    ch.setFormatter(xml);
       logger.log(Level.WARNING, "Тестовое логирование");
       logger.info("Тестовое логирование");
   }
}