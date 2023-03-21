<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
<head>
<meta charset="UTF-8">
<title>Ajout produit</title>
</head>
<body>
<form method="post"  action="saveProduit" modelAttribute="prod">
	
		<div class="mb-3">
			<label for="nom" class="form-label">Nom</label> 
			<input type="text" name="nom" class="form-control" id="nom">
	<form>
	
		<div class="mb-3">
			<label for="nom" class="form-label">Nom</label> 
			<input type="text" name="nom" class="form-control" id="nom">
		</div>
		<div class="mb-3">
			<label for="ref" class="form-label">Référence</label> 
			<input type="text" name="ref" class="form-control" id="ref">
		</div>
		<div class="mb-3">
			<label for="prix" class="form-label">Prix</label> 
			<input type="text" name="prix" class="form-control" id="prix">
		</div>
		<div class="mb-3">
			<label for="poids" class="form-label">Poids</label> 
			<input type="text" name="poids" class="form-control" id="poids">
		</div>
		
		<button type="button" class="btn btn-outline-success btn-sm">Valider</button>
		<button type="button" class="btn btn-outline-secondary btn-sm">Annuler</button>
		
		
	
	</form>	
	
	
	</div>
		<div class="mb-3">
			<label for="ref" class="form-label">Référence</label> 
			<input type="text" name="ref" class="form-control" id="ref">
		</div>
		<div class="mb-3">
			<label for="prix" class="form-label">Prix</label> 
			<input type="text" name="prix" class="form-control" id="prix">
		</div>
		<div class="mb-3">
			<label for="poids" class="form-label">Poids</label> 
			<input type="text" name="poids" class="form-control" id="poids">
		</div>
		
		<button type="button" class="btn btn-outline-success btn-sm">Valider</button>
		<button type="button" class="btn btn-outline-secondary btn-sm">Annuler</button>
		
		
	
	</form>
	

</body>
</html>