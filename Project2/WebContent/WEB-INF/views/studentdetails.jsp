<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table id="details">
<tr>
<th>Student Id : </th>
<th>Student Name : </th>
<th>Course : </th>
<th>Staff Id : </th>
<th>Parent Name : </th>
<th>Mobile Number : </th>
<th>Gender : </th>
<th>Add</th>
<th>Delete</th>
</tr>
<tr>
<td><input type="text" name = "stu_id"></td>
<td><input type="text" name = "stu_name"></td>
<td><input type="text" name = "course"></td>
<td><input type="text" name = "staff_id"></td>
<td><input type="text" name = "parent_name"></td>
<td><input type="text" name = "mobile_num"></td>
<td><input type="text" name = "gender"></td>
<td><button type="button" onclick="insRow()">Add</button></td>
<td><button type="button" onclick="deleteRow(this)">Delete</button></td>

</tr>
</table>
<script>
function insRow()
{
    var x=document.getElementById('details');
    var new_row = x.rows[1].cloneNode(true);
    var inp0 = new_row.cells[0].getElementsByTagName('input')[0];
    
    var inp1 = new_row.cells[1].getElementsByTagName('input')[0];   
    var inp4 = new_row.cells[4].getElementsByTagName('input')[0];
    var inp5 = new_row.cells[5].getElementsByTagName('input')[0];
    var inp6 = new_row.cells[6].getElementsByTagName('input')[0];
    
    inp0.value='';
    inp1.value='';
    inp4.value='';
    inp5.value='';
    inp6.value='';
    x.appendChild(new_row);
}
function deleteRow(row)
{
    var i=row.parentNode.parentNode.rowIndex;
    document.getElementById('details').deleteRow(i);
}
</script>
</body>
</html>