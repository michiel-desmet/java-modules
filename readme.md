# Zoo modules

Dit is een oefenproject om met de Java modules te werken.
Het is een simple opzetje om te kijken of het werkt en hoe we alles moeten compileren.
Hieronder staan alle calls die moeten gebeuren om iets te compileren.

## Compile

**Feeding module**

```bash
javac -p mods -d feeding/feeding feeding/src/zoo/animal/feeding/*.java feeding/src/module-info.java
jar -cvf mods/zoo.animal.feeding.jar -C feeding/feeding .
```

**Care module**

```bash
javac -p mods -d care/care care/src/zoo/animal/care/details/*.java care/src/zoo/animal/care/medical/*.java care/src/module-info.java
jar -cvf mods/zoo.animal.care.jar -C care/care .
```

**Talks module**

```bash
javac -p mods -d talks/talks talks/src/zoo/animal/talks/content/*.java talks/src/zoo/animal/talks/media/*.java talks/src/zoo/animal/talks/schedule/*.java talks/src/module-info.java
jar -cvf mods/zoo.animal.talks.jar -C talks/talks .
```

**Staff module**

```bash
javac -p mods -d staff/staff staff/src/zoo/*.java staff/src/module-info.java
jar -cvf mods/zoo.staff.jar -C staff/staff .
```

### All calls together
```bash
javac -p mods -d feeding/feeding feeding/src/zoo/animal/feeding/*.java module-info.java
javac -p mods -d care/care care/src/zoo/animal/care/details/*.java care/src/zoo/animal/care/medical/*.java care/src/module-info.java
javac -p mods -d talks/talks talks/src/zoo/animal/talks/content/*.java talks/src/zoo/animal/talks/media/*.java talks/src/zoo/animal/talks/schedule/*.java talks/src/module-info.java
javac -p mods -d staff/staff staff/src/zoo/*.java staff/src/module-info.java
```

```bash
jar -cvf mods/zoo.animal.feeding.jar -C feeding/feeding .
jar -cvf mods/zoo.animal.care.jar -C care/care .
jar -cvf mods/zoo.animal.talks.jar -C talks/talks .
jar -cvf mods/zoo.staff.jar -C staff/staff .
```

## Running

```bash
java --module-path mods --module zoo.animal.feeding/zoo.animal.feeding.Task
java -p mods -m zoo.animal.feeding/zoo.animal.feeding.Task
```
