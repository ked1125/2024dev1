<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%> <%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <title>ticket</title>
  </head>
  <body>
    <h2>ticket</h2>
    <form action="./buy_ticket_card">
    고객: <input type="text" name="consumerId"/><br/>
    구매수: <input type="text" name="amount"/><br/>
    <!-- 에러넣기: <input type="text" name="error" value="0"/><br/> -->
    에러넣기: <input type="text" name="error" value="1"/><br/>
    <input type="submit" value="구매"/>
    </form>
  </body>
</html>
