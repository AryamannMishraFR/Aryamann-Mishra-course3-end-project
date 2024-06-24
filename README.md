# Aryamann-Mishra-course3-end-project

Developer: Aryamann  Mishra

Email: fr.aryamann.mishra@prolim.in

Project: Ecommerce website for SportyShoes (Course 3 end project)

Technologies used: 

  1. Java
  2. OOPS
  3. SpringFramework
  4. GitHub
  5. Html
  6. Maven
  7. MySQL
  8. JDBC

Things to make sure while running the project:

  1. Version management is very important as for this project java version 22 is used, Spring version 3.3.0 is used and all the other versions are mentioned in the pom.xml file.
  2. Port on which application is runnings is 8080, make sure port 8080 is free.
  3. Urls to test:
     
     1. localhost:8080/user/register
     2. localhost:8080/user/login
     3. localhost:8080/product/add
     4. localhost:8080/product/list
     5. localhost:8080/product/delete/{productID} (eg. 1,2,3,4,5,...)
        
  5. Comple using mvn clean/compile, then execute the .jar file. or execute directly from the IDE
  6. Corretly download and load the project and all its dependencies.

Other Notes:
  
  1. There are 4 html files: register.html, login.html, product-form.html and product-list.html
  2. SportyShoesApplication.java is the main class
  3. There are 2 interfaces: ProductRepository.java and UserRepository.java
  4. The SecurityConfig file is made for processing and authorizing requests and encoding passwords
  5. Other packages and files are following professional coding convention

