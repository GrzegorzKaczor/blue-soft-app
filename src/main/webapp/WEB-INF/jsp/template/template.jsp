<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="tilte" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
<%--    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-2">--%>
    <meta http-equiv="X-Ua-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.css"/>
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.21/css/dataTables.bootstrap4.min.css"/>
    <link rel="stylesheet" type="text/css" href="/resources/css/main.css"/>


    <title><tiles:getAsString name="title"/></title>
</head>
<body>
<div id="container">
    <header><tiles:insertAttribute name="header"/></header>
    <nav><tiles:insertAttribute name="nav"/></nav>
    <section><tiles:insertAttribute name="content"/></section>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.21/js/dataTables.bootstrap4.min.js"></script>
<script src="/resources/script/script.js"></script>
</body>
</html>
