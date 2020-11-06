<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>OneTech</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="OneTech shop project">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/styles/bootstrap4/bootstrap.min.css"/>">
<link
	href="<c:url value="/resources/plugins/fontawesome-free-5.0.1/css/fontawesome-all.css"/>"
	rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/plugins/OwlCarousel2-2.2.1/owl.carousel.css"/>">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/plugins/OwlCarousel2-2.2.1/owl.theme.default.css"/>">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/plugins/OwlCarousel2-2.2.1/animate.css"/>">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/plugins/slick-1.8.0/slick.css"/>">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/styles/main_styles.css"/>">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/styles/responsive.css"/>">

</head>

<body>
	<fmt:setLocale value="vi_VN" />
	<!-- Header -->
	<jsp:include page="../_header.jsp"></jsp:include>
	<!-- Single Product -->
	<div class="container-wrapper">
    
    <div class="container">
   
  

	   <div class="page-header title">
	              <h1>Login with Username and Paassword</h1>
	              
	              <p class="lead">Fill the below information to login</p>
	    </div>
	    
	    
	   
	     
		<div class="form-layout">
	       <form name="loginForm"  action="<c:url value="/j_spring_security_check" />"   method="post"  class="form-horizontal"  >
						
				 <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
				
				<div class="form-group has-success">
					<label class="col-xs-3 control-label" ></label>
					<div class="col-xs-9">
                           <c:if test="${not empty error}">
                
				                  <div class="error" style="color:#ff0000">
				                    ${error}
				                  </div>
			                </c:if>					
					</div>
				</div>		
			  
				<div class="form-group has-success">
					<label class="col-xs-3 control-label" ></label>
					<div class="col-xs-9">
                           <c:if test="${not empty msg}">
                               <div class="msg">${msg}</div>
                            </c:if>						
					</div>
				</div>
				
				
				<div class="form-group has-success">
					<label class="col-xs-3 control-label" for="username">Username :</label>
					<div class="col-xs-9">
						
					   
					   <input type="text" class="form-control" placeholder="Enter Username" name="username" id="username"/>
					</div>
				</div>
				
				
				
				<div class="form-group has-success">
					<label class="col-xs-3 control-label" for="password">Password :</label>
					<div class="col-xs-9">
						
					   
					   <input type="password" class="form-control"  name="password" placeholder="Enter Password" id="password"/>
					</div>
				</div>
				
	            
	            
	            <div class="form-group has-success">
					<label class="col-xs-3 control-label" ></label>
					<div class="col-xs-9">
						
                     Remember Me: <input type="checkbox" name="remember-me" />					   
					</div>
				</div>
	            
			   
				
				<div class="form-group has-success">
					<label class="col-xs-3 control-label"></label>
					<div class="col-xs-9">
						 <input type="submit" value="Submit" class="btn btn-default">
                        
					</div>
				</div>
			
			 
			</form>
		</div>
    
    </div>

</div>
	<!-- Footer -->
	<jsp:include page="../_footer.jsp"></jsp:include>