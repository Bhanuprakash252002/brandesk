<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ContactDetails Page</title>
</head>
<body>
	<div id="root" style="text-align:center">
	<br><br><br><br><br><br><br>
		<form action="ContactDetails" method="post">
				<h2>Add New</h2>
				Name:
				<input type="text" name="uname"/>
				Mobile Number:
				<input type="number" name="num"/>
				<br><br>
				<select name="select0">
					<option value="Client to Client">Client to Client</option>
					<option value="Google Marketing">Google Marketing</option>
					<option value="Bing Marketing">Bing Marketing</option>
					<option value="Facebook Marketing">Facebook Marketing</option>
					<option value="Instagram Marketing">Instagram Marketing</option>
				</select>
				<select name="select1">
					<option value="FollowUp">FollowUp</option>
					<option value="Client">Client</option>
					<option value="SlowUp">SlowUp</option>
					<option value="RedMark">RedMark</option>
				</select>
				<br><br>
				<select name="select2">
					<option value="Swapna">Swapna</option>
					<option value="Mounika">Mounika</option>
					<option value="Sridevi">Sridevi</option>
				</select>
				<select name="select3">
					<option value="santosh">santosh</option>
					<option value="Mahesh">Mahesh</option>
					<option value="ram">ram</option>
				</select>
				<br><br>
				<input type="text" name="note"/>
				<input type="submit" value ="submit"/>
				
		</form>
	</div>
	

</body>
</html>