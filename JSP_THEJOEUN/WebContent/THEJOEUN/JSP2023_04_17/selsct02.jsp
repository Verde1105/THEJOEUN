<%@page import="thejoeun.Servlet2023_04_13.UserInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="thejoeun.Iter2023_04_18.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DB SQL</title>
<link rel="stylesheet" href="resources/css/bootstrap.min.css" />
</head>
<body>
   <div class="container">
      <h1 class="display-5">회원목록</h1>
   </div>
   <div class="container">
      <div style="padding-top: 10px">
         <table class="table table-hover">
            <tr>
               <th>아이디</th>
               <th>비밀번호</th>
               <th>이름</th>
            </tr>
            <%
            List<UserInfo> userInfos = (ArrayList<UserInfo>) request.getAttribute("userinfos");
            for (UserInfo userinfo : userInfos) {
            %>
            <tr>
               <td><%=userinfo.getId()%></td>
               <td><%=userinfo.getPw()%></td>
               <td><%=userinfo.getName()%></td>
            </tr>
            <%
            }
            %>
         </table>
      </div>
      </div>
</body>
</html>