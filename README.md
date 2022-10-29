#### Quarkus

Quarkus was created to enable Java developers to create applications for a modern, cloud-native world. Quarkus is a Kubernetes-native Java framework
Both Quarkus and Spring Boot offer a comprehensive stack of technologies and tools to build modern Java applications. Spring Boot is a more mature framework traditionally used in both monolithic and microservice architectures. Quarkus is more used in cloud and serverless contexts


**jar plugin**
 ```
<plugin>
  <groupId>io.quarkus</groupId>
  <artifactId>quarkus-maven-plugin</artifactId>
  <version>${quarkus.platform.version}</version>
  <executions>
  <execution>
  <goals>
  <goal>build</goal>
  </goals>
  </execution>
  </executions>
</plugin>
```
**header**

```
  <dependency>
      <groupId>io.quarkus</groupId>
      <artifactId>quarkus-reactive-routes</artifactId>
  </dependency>
```  
  
  **MediaType.APPLICATION_JSON**
  
  
  ```
     <dependency>
      <groupId>io.quarkus</groupId>
      <artifactId>quarkus-resteasy-jsonb</artifactId>
    </dependency>

```
    
