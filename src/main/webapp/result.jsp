<%--
  Created by IntelliJ IDEA.
  User: tanubhag
  Date: 9/7/2021
  Time: 12:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
<center>
    <h1>
        Available Brands
    </h1>
        <%
List result= (List) request.getAttribute("bname");
Iterator it = result.iterator();
out.println("<br>We have <br><br>");
while(it.hasNext()){
out.println(it.next()+"<br>");
}
%>
</body>
</html>
