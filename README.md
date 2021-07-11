#Verity Test Automation

## Prerequisites

### Java 
This project runs on Java 8 or newer version
````shell
java version "1.8.0_291"
Java(TM) SE Runtime Environment (build 1.8.0_291-b10)
Java HotSpot(TM) Client VM (build 25.291-b10, mixed mode)
````
set JAVA_HOME environment variable

### Maven
This project runs on Maven 3.6.3
````shell
$ mvn -version
Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
Maven home: C:\Program Files\apache-maven-3.6.3
Java version: 1.8.0_41, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-8\jre
Default locale: en_NZ, platform encoding: Cp1252
OS name: "windows 8.1", version: "6.3", arch: "x86", family: "windows"
````

### Intellij Idea
This project runs on Intellij version 2021.1

### Running test
````shell
maven clean install
````
### Running Allure report
```shell
cd tests/
mvn allure:serve
```