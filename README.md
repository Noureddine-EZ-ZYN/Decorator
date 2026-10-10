# PatternDeco

Illustration du design pattern **Décorateur** (Decorator) en Java, à travers l'exemple d'un café dont on peut composer la boisson avec des ingrédients supplémentaires.

## Structure du projet

```
src/main/java
├── Test.java                  # Point d'entrée : exemple d'utilisation
├── composants/                # Composants concrets (boissons de base)
│   ├── Boisson.java           # Interface/classe abstraite du composant
│   ├── Deca.java
│   ├── Espresso.java
│   └── Sumatra.java
└── decorateurs/               # Décorateurs (ingrédients ajoutés)
    ├── Decorateur.java        # Décorateur abstrait
    ├── Caremel.java
    └── Chocolat.java
```

## Principe

Un décorateur implémente la même interface que la boisson qu'il enveloppe. On peut ainsi empiler les décorateurs dynamiquement, sans modifier les classes existantes :

```java
Boisson boisson = new Chocolat(new Caremel(new Sumatra()));
System.out.println(boisson.getDescription());
```

## Prérequis

- JDK 26 (voir `pom.xml`)
- Maven

## Compilation et exécution

```bash
mvn compile
java -cp target/classes Test
```
