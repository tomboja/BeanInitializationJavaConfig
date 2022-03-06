package edu.miu.cs544.temesgen;

import edu.miu.cs544.temesgen.config.SpringConfig;
import edu.miu.cs544.temesgen.service.Game;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ProjectName: BeanInitializationJavaConfig
 * @Author: Temesgen D.
 * @Date: 3/6/22
 */

public class Main {
    public static void main(String[] args) {
        ApplicationContext springContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        Game game = springContext.getBean(Game.class);
        game.play();
    }
}
