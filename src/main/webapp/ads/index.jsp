<%--
  Created by IntelliJ IDEA.
  User: raylinares
  Date: 12/14/16
  Time: 3:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var="ad" items="${ads}"> <%-- ads comes from AdsIndexServlet --%>
    <h1>${ad.title}</h1>    <%-- from Ad class --%>
    <p>${ad.description}</p>    <%-- from Ad class --%>
</c:forEach>

<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="List of all ads" />
    </jsp:include>
</head>
<body>

</body>
</html>
