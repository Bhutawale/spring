<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
    <h1>Complex Form</h1>
    
    
    <form action="processform" method="post">
    	
    <div class="form-group">
    <label>Enter Name</label>
    <input type="text" 
    class="form-control" 
    id="name"
    name="name"> 
    <small id="nameHelp" class="form-text text-muted">
    We will keep your name secret.</small>
  </div>
  
  <div class="form-group">
    <label for="exampleFormControlInput1">Enter Id</label>
    <input type="number" class="form-control" id="exampleFormControlInput1" name="id">
  </div>
  
  <div class="form-group">
    <label>Enter DOB</label>
    <input type="text" class="form-control" id="dob" name="dob">
  </div>
  
  <div class="form-group">
    <label>Interested Course</label>
    <select multiple class="form-control" id="course" name="course">
      <option>Java</option>
      <option>C++</option>
      <option>C</option>
      <option>Hibernate</option>
      <option>Spring Boot</option>
    </select>
  </div>
  
  <div class="form-check">
  <input class="form-check-input" type="radio"   value="Male" name="gender">
  <label class="form-check-label" for="exampleRadios1">
    Male
  </label>
</div>
<div class="form-check">
  <input class="form-check-input" type="radio"  value="Female" name="gender">
  <label class="form-check-label" for="exampleRadios2">
    Female
  </label>
</div>

<div class="form-group col-md-4">
      <label>Student Type</label>
      <select id="type" class="form-control" name="type">
        <option selected>Student Type</option>
        <option>Old Student</option>
        <option>New Student</option>
      </select>
    </div>
    
    <div class="form-group">
    <label>Enter City</label>
    <input type="text" class="form-control" id="city" name="address.city">
  </div>
  
  <div class="form-group">
    <label>Enter District</label>
    <input type="text" class="form-control" id="dist" name="address.dist">
  </div>
    
    <div class="col-sm-10">
      <button type="submit" class="btn btn-primary">Submit</button>
    </div>
		
	</form>
	
	
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>