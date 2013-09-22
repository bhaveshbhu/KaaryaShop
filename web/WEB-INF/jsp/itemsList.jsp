<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
 pageEncoding="ISO-8859-1"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<html>  
<head>  
<title>Being Java Guys | Spring DI Hello World</title>  
<style>  
body {  
 font-size: 20px;  
 color: teal;  
 font-family: Calibri;  
}  
  
td {  
 font-size: 15px;  
 color: black;  
 width: 100px;  
 height: 22px;  
 text-align: center;  
}  
.heading {  
 font-size: 18px;  
 color: white;  
 font: bold;  
 background-color: orange;  
 border: thick;  
}  
</style>  
</head>  
<body>  
 <center>  
    
   
   
 <b>Item  
   List  </b>  
   
  
     
    
  <form:form method="post" action="inserttocart" modelAttribute="items">
  <table border="1">  
   <tr>
    <td class="heading">select to add in cart</td>
    <td class="heading">Item Id</td>  
    <td class="heading">Name</td>    
    <td class="heading">Price</td>  
    <td class="heading">Edit</td>  
    <td class="heading">Delete</td>  
   </tr>  
   <c:forEach var="items" items="${itemsList}">  
    <tr>
     <td><input type="checkbox" name="select" value="ON" /></td>
     <td>${items.id}</td>  
     <td>${items.name}</td>    
     <td>${items.price}</td>  
     <td><a href="edit?id=${items.id}">Edit</a></td>  
     <td><a href="delete?id=${items.id}">Delete</a></td>  
    </tr>  
   </c:forEach>  
   <tr>  
        
      <td><input type="submit" value="Make bill of selectd item" /></td>  
     </tr>
  </table>  
  </form:form>
 </center>
 <a href="register">Add New Item</a>
</body>  
</html>  