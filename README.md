# Quarkus
Quarkus is another framework with a similar approach as the Spring mentioned above Boot, but with an additional promise of delivering smaller artifacts with fast boot time, better resource utilization, and efficiency. It's optimized for cloud, serverless, and containerized environments.

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
