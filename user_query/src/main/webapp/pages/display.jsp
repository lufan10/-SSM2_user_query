<%@ page contentType="text/html;charset=UTF-8" language="java" buffer="16kb"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ include file="" %>--%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 定义标题   -->
    <title>首页</title>
    <!--  css外部文件资源引入  -->
    <link href="/css/bootstrap.min.css" rel="stylesheet" >
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="/js/jquery-3.2.1.min.js" ></script>
    <script src="/js/bootstrap.min.js" ></script>
    <!-- 自定义内部css样式-->
    <style>
        div{
            font-weight: 500;
            font-size: 20px;
        }
        h4{
            text-align: center;
        }
    </style>
</head>
<!-- 定义html页面内容-->
<body>
<br><br><br>
<%--<h4>恭喜你！${requestScope.user.username}登录成功！<br><br><br>--%>
<h4>${requestScope.success}<br><br><br>
    <div align="center">
    <a href="${pageContext.request.contextPath}/user/findAll">
        查询所有用户信息
    </a><br><br><br>
        <%--未携带参数所报的异常--%>
     <%--   HTTP Status 500 - Request processing failed; nested exception is java.lang.IllegalStateException:
        Optional int parameter 'currentPage' is present but cannot be translated into a null value due to being declared as a primitive type.
        Consider declaring it as object wrapper for the corresponding primitive type.--%>
    <a href="${pageContext.request.contextPath}/user/findUserByPage?currentPage=1">
        分页查询用户信息
    </a>

    </div>
</h4>





<script>

</script>
</body>
</html>