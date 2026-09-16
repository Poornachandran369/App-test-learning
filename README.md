<h1 align="center"> Student Management API</h1>

<p align="center">
A RESTful API built using <b>Spring Boot</b> and <b>MySQL</b> to perform CRUD operations on student records.
</p>

<hr>

<h2>📌 Project Overview</h2>

<p>
Student Management API is a backend application developed using Spring Boot.
It provides REST APIs to create, retrieve, update, and delete student information.
The application follows a layered architecture using Controller, Service, Repository, and Model layers.
</p>

<h2>🚀 Features</h2>

<ul>
  <li> CURD options for student</li>
  <li> MySQL database integration</li>
  <li> RESTful API design</li>
  <li> Basic authorization</li>
  <li> Exception handling</li>
</ul>

<h2>🛠 Technologies Used</h2>

<ul>
  <li>Java 21</li>
  <li>Spring Boot</li>
  <li>Spring Data JPA</li>
  <li>Hibernate</li>
  <li>MySQL</li>
  <li>Maven</li>
  <li>Postman</li>
</ul>

<h2>📂 Project Structure</h2>

<pre>
student-management/
│
├── controller/
├── service/
├── repository/
├── model/
├── resources/
│   └── application.properties
└── StudentManagementApplication.java
</pre>

<h2> Student Entity</h2>

<table>
  <tr>
    <th>Field</th>
    <th>Type</th>
  </tr>
  <tr>
    <td>studentId</td>
    <td>Long</td>
  </tr>
  <tr>
    <td>name</td>
    <td>String</td>
  </tr>
  <tr>
    <td>age</td>
    <td>Integer</td>
  </tr>
  <tr>
    <td>department</td>
    <td>String</td>
  </tr>
  <tr>
    <td>dateOfBirth</td>
    <td>LocalDate</td>
  </tr>
  <tr>
    <td>mobileNum</td>
    <td>String</td>
  </tr>
  <tr>
    <td>email</td>
    <td>String</td>
  </tr>
</table>

<h2>⚙️ API Endpoints</h2>

<table>
  <tr>
    <th>Method</th>
    <th>Endpoint</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>POST</td>
    <td>/student</td>
    <td>Add a new student</td>
  </tr>
  <tr>
    <td>GET</td>
    <td>/student</td>
    <td>Get all students</td>
  </tr>
  <tr>
    <td>GET</td>
    <td>/student/{id}</td>
    <td>Get student by ID</td>
  </tr>
  <tr>
    <td>DELETE</td>
    <td>/student/{id}</td>
    <td>Delete a student</td>
  </tr>
</table>

<h2>🗄 Database Configuration</h2>

<pre>
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=poorna369

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
</pre>

<h2>▶️ How to Run</h2>

<ol>
  <li>Clone the repository.</li>
  <li>Open the project in IntelliJ IDEA or Eclipse.</li>
  <li>Create a MySQL database named <b>student_db</b>.</li>
  <li>Make sure the database is in port 3306</li>
  <li>Update the database credentials in <code>application.properties</code>.</li>
  <li>Run the Spring Boot application.</li>
  <li>Test the API using Postman.</li>
</ol>

<h2>📮 Sample Request</h2>

<pre>
POST /student

{
    "name": "Poornachandran",
    "age": 19,
    "department": "ECE",
    "dateOfBirth": "2006-10-21",
    "mobileNum": "9876543210",
    "email": "poorna@example.com"
}
</pre>

<h2> What i learned from this </h2>

<ul>
  <li>Built REST APIs with Spring Boot</li>
  <li>Connected Spring Boot with MySQL</li>
  <li>Used Spring Data JPA and Hibernate</li>
  <li>Implemented CRUD operations</li>
  <li>Tested APIs using Postman</li>
  <li>Followed layered architecture</li>
  <li>Basics on spring security</li>
  <li>Exception and handling them</li>
</ul>

<hr>

<h2>👨‍💻 Author</h2>

<p>
<b>Poornachandran.M</b><br>
Engineering Student<br>
at AVS engineering college salem, tamilnadu <br>
Java Backend Developer (Beginner)
</p>

<hr>

<p align="center">
⭐ Thanks for reading, consider giving it a star! ⭐ 
</p>
