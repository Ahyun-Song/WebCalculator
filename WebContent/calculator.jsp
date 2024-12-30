<!DOCTYPE html>
<html>
<head>
	<title>Simple Calculator</title>
</head>
<body>
	<h1>Calculator</h1>
	<form action="CalculatorServlet" method="post">
		<label>Number 1:</label>
		<input type="text" name="num1" required><br><br>
		<label>Number 2:</label>
		<input type="text" name="num2" required><br><br>
		<label>Operation:</label>
		<select name="operation">
			<option value="add">Add</option>
			<option value="subtract">Subtract</option>
			<option value="multiply">Multiply</option>
			<option value="divide">Divide</option>
		</select><br><br>
		<input type="submit" value="Calculate">
	</form>
</body>
</html>
