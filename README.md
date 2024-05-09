# GuiceDemo

A simple application for learning Google Juice

## Project Generation

```
mvn archetype:generate -DgroupId=org.example.demo -DartifactId=guice-demo -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```

## Dependency Injection

The mechanism of providing the logic to some external framework, instead of handling dependencies by ourselves called
Dependency Injection

## Key Learnings

### Object Graph

Google Guice creates a graph of objects while instantiating, that graph is known as object graph.

### Types of Injection

#### 1. Constructor Injection

The @Inject is applied on a constructor

#### 2. Method Injection

The @Inject is applied over a method

#### 3. Field Injection

The @Inject is applied over a field. It uses reflection API for instantiating.

