<%--
  Created by IntelliJ IDEA.
  User: roman
  Date: 31.01.2018
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/ancetServlet" method="POST">

  <p> Линукс лучше чем винда?</p>
  <p> ДА</p><input type="radio" name="q1"  value="yes">
  <p> НЕТ</p><input type="radio" name="q1"  value="no">

  <p> Дебиан лучше чем Убунту</p>
  <p> ДА</p><input type="radio" name="q2"  value="yes">
  <p> НЕТ</p><input type="radio" name="q2"  value="no">

  <p> Gnome лучше чем KDE?</p>
  <p> ДА</p><input type="radio" name="q3"  value="yes">
  <p> НЕТ</p><input type="radio" name="q3"  value="no">

  <p> Терминал лучше чем GUI?</p>
  <p> ДА</p><input type="radio" name="q4"  value="yes">
  <p> НЕТ</p><input type="radio" name="q4"  value="no">

  <input type="submit" >    Answer      </input>

  </form>


    </body>
</html>
