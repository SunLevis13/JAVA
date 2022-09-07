import java.io.IOException;
import java.util.logging.*;
// import java.util.logging.ConsoleHandler;
// import java.util.logging.Level;
// import java.util.logging.Logger;
// import java.util.logging.SimpleFormatter;
// import java.util.logging.FileHandler;

public class Ex02 {
   public static void main(String[] args) throws SecurityException, IOException {
       Logger logger = Logger.getLogger(Ex02.class.getName());
       logger.setLevel(Level.INFO);
    //    ConsoleHandler ch = new ConsoleHandler();
    //    logger.addHandler(ch);
        FileHandler fh = new FileHandler("log.xml");
        logger.addHandler(fh);
      //  SimpleFormatter sFormat = new SimpleFormatter();
       XMLFormatter xml = new XMLFormatter();
      //  ch.setFormatter(sFormat);
       fh.setFormatter(xml);
       logger.log(Level.WARNING, "Тестовое логирование");
       logger.info("Тестовое логирование");
   }
}