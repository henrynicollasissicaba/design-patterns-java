package dio.com;

import dio.com.facade.Facade;
import dio.com.singleton.SingletonEager;
import dio.com.singleton.SingletonLazy;
import dio.com.singleton.SingletonLazyHolder;
import dio.com.strategy.*;

public class Main {
    public static void main(String[] args) {
        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);

        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        // Strategy

        Behavior aggressive = new AggressiveBehavior();
        Behavior normal = new NormalBehavior();
        Behavior defensive = new DefensiveBehavior();

        Robot robot = new Robot();

        robot.setBehavior(normal);
        robot.move();
        robot.setBehavior(aggressive);
        robot.move();
        robot.setBehavior(defensive);
        robot.move();

        // Facade

        Facade facade = new Facade();
        facade.migrateClient("Henry", "1234567890");
    }
}
