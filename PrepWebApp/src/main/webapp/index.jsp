<%@ page import="java.util.ArrayList"%>
<%@ page import="ie.rc.oouserdb.User" %>
<%@ page import="ie.rc.oouserdb.UserDao" %>
<html>
<body>
<h2><%= "Hello World!" %></h2>

<% 
User u = new User(1, "Alice", "alice@gmail.com", true);

UserDao dao = new UserDao();

ArrayList<User> users = dao.getAll();

dao.close();


%>
</body>
</html>
