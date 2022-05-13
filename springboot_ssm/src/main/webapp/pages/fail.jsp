<%@ page contentType="text/html;charset=UTF-8" language="java" buffer="16kb" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ include file="" %>--%>
<html>
<head>
    <title>登录失败</title>
    <!--  css外部文件资源引入  -->
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="/js/jquery-3.2.1.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <!-- 自定义内部css样式-->
    <style>
        h3{
            text-align:center
        }
    </style>

</head>
<body>
<br><br><br>
<h3>登录失败，账户不存在!</h3>
</body>
<script>
    <%--设置表格中所有内容居中 --%>
    $("td,th").addClass("text-center");
</script>
</html>
