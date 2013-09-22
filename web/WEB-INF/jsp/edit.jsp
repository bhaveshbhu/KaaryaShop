<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>  
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
    
   
   
 <b>Edit Item Details </b>  
   
  
  <div>  
   <form:form method="post" action="update" modelAttribute="items">  
    <table>  
     <tr>  
      <td>Name :</td>  
      <td><form:input path="name"  
        value="${map.items.name}" />  
      </td>  
     </tr>  
     <tr>  
      <td>Price :</td>  
      <td><form:input path="price" value="${map.items.price}" />  
      </td>  
     </tr>  
       
      
     <tr>  
      <td> </td>  
      <td><input type="submit" value="Save" />  
      </td>  
     </tr>  
    </table>  
    <form:hidden path="id" value="${map.items.id}" />  
  
   </form:form>  
  </div>  
 </center>  
</body>  
</html> 