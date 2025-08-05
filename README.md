# 🧠 Padrões de Design em Java
### Este repositório demonstra três dos principais padrões de design (Design Patterns) em Java:
- Singleton
- Facade
- Strategy

Esses padrões ajudam a organizar melhor o código, tornando-o mais reutilizável, testável e de fácil manutenção.

---

### 🔒 Singleton
Objetivo:
Garantir que uma classe tenha apenas uma instância e fornecer um ponto global de acesso a ela.
Exemplo:

```java
public class Singleton {

    private static Singleton instance;

    private Singleton() {
        super();
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

Uso:
```java
public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        // Verifica se são a mesma instância
        System.out.println(s1 == s2); // true
    }
}
```

---

### 🎭 Facade
Objetivo:
Oferecer uma interface simplificada para um conjunto de subsistemas.

Exemplo:
```java
class SystemAudio {
    public void init() { System.out.println("Audio initialized"); }
}

class SystemVideo {
    public void init() { System.out.println("Video initialized"); }
}

class HomeTheaterFacade {
    private SystemAudio audio = new SystemAudio();
    private SystemVideo video = new SystemVideo();

    public void watchMovie() {
        audio.init();
        video.init();
        System.out.println("Watching movie");
    }
}

```
Uso:
```java
public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade htf = new HomeTheaterFacade();
        htf.watchMovie();
    }
}

```

---

### 🧩 Strategy
Objetivo:
Permitir que algoritmos sejam selecionados em tempo de execução.

Exemplo:
```java
interface Behavior {
    void move();
}

class MoveQuickly implements Behavior {
    public void move() {
        System.out.println("Moving quickly");
    }
}

class MoveSlowly implements Behavior {
    public void move() {
        System.out.println("Moving slowly");
    }
}

class Robot {
    private Behavior behavior;

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public void move() {
        behavior.move();
    }
}

```
Uso:
```java
public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();

        robot.setComportamento(new MoveQuickly());
        robot.move(); // Moving quickly

        robot.setComportamento(new MoveSlowly());
        robot.move(); // Moving slowly
    }
}

```
