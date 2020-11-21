<html>
<body>
<h2>Hello World!</h2>
<form id="detailForm" method="post">
    <textarea id="content" name="content"></textarea>
    <input type="button" value="Save" id="save" onclick="save()" />
</form>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/ckeditor/ckeditor.js"></script>
<script type="text/javascript">
    var editor = null;
    window.onload = function(){
        editor = CKEDITOR.replace('content'); //The parameter ‘content’ is the name attribute value of the textarea element, not the id attribute value
    }
</script>
</html>
