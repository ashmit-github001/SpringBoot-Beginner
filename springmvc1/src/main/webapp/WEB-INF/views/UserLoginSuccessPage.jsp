<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login Successful</title>
</head>
<body>
	<p> Congratulations ${userLoginDetails.username}, you are logged in! </p>
	
	<form method="post" action="saveShoppingList">
		<label for="iName">Item Name:</label><br>
		<input type="text" name="itemName" id="iName" placeholder="${shoppingList.itemName}"><br>
		<label for="iType">Item Type:</label><br>
		<input type="text" name="itemType" id="iType" placeholder="${shoppingList.itemType}"><br>
		<label for="iPrice">Item Price:</label><br>
		<input type="text" name="itemPrice" id="iPrice" placeholder="${shoppingList.itemPrice}"><br><br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>