<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="tilte" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html lang="pl-Pl">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/main.css' />"/>
    <title><tiles:getAsString name="title"/></title>
</head>
<body>
<div id="container">
    <header><tiles:insertAttribute name="header"/></header>
    <nav><tiles:insertAttribute name="nav"/></nav>
    <section><tiles:insertAttribute name="content"/></section>
</div>
</body>
</html>
