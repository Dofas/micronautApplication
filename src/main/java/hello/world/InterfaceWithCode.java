package hello.world;

import java.util.logging.Logger;

public interface InterfaceWithCode {

    Logger log = Logger.getLogger(InterfaceWithCode.class.getName());
    static void withCode() {
        log.info("This is message from interface");
    }
}
