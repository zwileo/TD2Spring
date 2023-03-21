<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container text-center">
  <div class="row">
    ;
    <div class="col">Nom</div>
    <div class="col">Référence</div>
    <div class="col">Prix</div>
    <div class="col">Poids</div>
  </div>
</div>


<c:forEach var="prod" items="${listeP}">
	<div class="row">
	    <div class="col"><c:out value="${ prod.getId() }"></c:out></div>
	    <div class="col"><c:out value="${ prod.getNom() }"></c:out></div>
	    <div class="col"><c:out value="${ prod.getReference() }"></c:out></div>
	    <div class="col"><c:out value="${ prod.getPrix() }"></c:out></div>
	    <div class="col"><c:out value="${ prod.getPoids() }"></c:out></div>
  		<div class="col"> 
  			<a href="deleteProduit/${prod.getId()}"></a> <button type="button" class="btn btn-danger">Supprimer</button>
  		</div>
  	</div>
</c:forEach>


</body>
</html>