<%@page import="dto.UserDTO"%>
<%@page import="dao.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%long mob =Long.parseLong(request.getParameter("mob"));
UserDAO dao= new UserDAO();
UserDTO dto =dao.find(mob);
%>

<form action="update" method="post">
Email :<input type="email" placeholder="Emai" name="email" value="<%=dto.getEmail()%>"><br><br>
Name :<input type="Text" placeholder="Name" name="name" value="<%=dto.getName()%>"><br><br>
Phone : <input type="number" placeholder="Phone" name="mob" value="<%=dto.getMobile()%>"><br><br>
Password :<input type="password" placeholder="Password" name="pwd" value="<%=dto.getPassword()%>"><br><br>
<button type="reset">Cancel</button> <button>Update</button>
</form>

</body>
</html>