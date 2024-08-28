dependecy :
 <!-- JWT -->
    <dependency>
      <groupId>io.jsonwebtoken</groupId>
      <artifactId>jjwt-api</artifactId>
      <version>${jwt.version}</version>
    </dependency>
    <dependency>
      <groupId>io.jsonwebtoken</groupId>
      <artifactId>jjwt-impl</artifactId>
      <version>${jwt.version}</version>
      <scope>runtime</scope>
    </dependency>
    <dependency>
      <groupId>io.jsonwebtoken</groupId>
      <artifactId>jjwt-jackson</artifactId>
      <version>${jwt.version}</version>
      <scope>runtime</scope>
    </dependency>

    <!--------security------>
    <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>

  ![image](https://github.com/user-attachments/assets/3ef59dcf-56e6-48ac-880f-f7f8b564d96a)

  Tech use:
  java ,
  my sql,
  postman

  ![image](https://github.com/user-attachments/assets/527bb655-34fa-4fbd-a366-b8be89481257)

  ![image](https://github.com/user-attachments/assets/e8dfe308-e953-402e-8a2e-58574404b0fd)

  ![image](https://github.com/user-attachments/assets/e92fe1c9-8495-4f61-8fce-4a8a527a7f13)

  ![image](https://github.com/user-attachments/assets/79ebd1be-5669-4853-bfbe-065a39abe295)

  Now we have successfully created a JWT token and sent back to user. Now if we want to access any other resource,
  we will get a 403 Forbidden error which means the request is not authenticated.




  

  
