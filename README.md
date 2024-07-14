# Health-Care-Management-System
To run this run HealthcareManagementSystemApplication.java
<ol>
  <li>   
    Create a patient <ul><li>POST http://localhost:8080/api/patients
Content-Type: application/json

{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "phoneNumber": "1234567890"
}</li></ul>
<li> Update a Patient <ul><li>PUT http://localhost:8080/api/patients/{id}
Content-Type: application/json

{
  "firstName": "Jane",
  "lastName": "Smith",
  "email": "jane.smith@example.com",
  "phoneNumber": "9876543210"
}</li></ul>
</li>
<li> Delete a Patient 
<ul><li>DELETE http://localhost:8080/api/patients/{id}</li></ul></li>
  </li>
</ol>
