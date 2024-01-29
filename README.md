
How to reproduce bug.

1) Open two console

2) In first console execute command:

```
mvn clean jerry:run
```

3) In second console execute command:

```
mvn compiler:testCompile surefire:test
```

Failed test in second console is the problem