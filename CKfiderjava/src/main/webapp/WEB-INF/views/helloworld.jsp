<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring 5 MVC - HelloWorld</title>
</head>
<body>
<form id="detailForm" method="post">
    <textarea id="content" name="content"></textarea>
    <input type="button" value="Save" id="save" onclick="save()" />
</form>

 </center>	
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/ckeditor/ckeditor.js"></script>
<script type="text/javascript">
    var editor = null;
    window.onload = function(){
        editor = CKEDITOR.replace('content'); //The parameter ‘content’ is the name attribute value of the textarea element, not the id attribute value
    }
</script>
</html>