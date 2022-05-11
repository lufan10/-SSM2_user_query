<%@ page contentType="text/html;charset=UTF-8" language="java" buffer="16kb" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ include file="" %>--%>
<html>
<head>
    <title>添加联系人</title>
    <!--  css外部文件资源引入  -->
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="/js/jquery-3.2.1.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <!-- 自定义内部css样式-->
    <style>
        h3{
            text-align: center;
        }
    </style>

</head>
<body>

<br>
<h3>添加联系人</h3>
<br>
<form class="form-horizontal container" action="${pageContext.request.contextPath}/user/add" method="post">
<%--    <input type="hidden" name="id" value="${requestScope.User.id}" >--%>
    <div class="form-group">
        <label for="name" class="col-md-5 control-label">姓名:</label>
        <div class="col-md-3">
            <input type="text" class="form-control" id="name" name="name" placeholder="请输入姓名">
        </div>
    </div>
    <div class="form-group">
        <div class="col-md-offset-5 col-md-3">
            性别：
            <input type="radio" name="sex" value="男" checked>男
            <input type="radio" name="sex" value="女" >女
        </div>
    </div>
    <div class="form-group">
        <label for="age" class="col-md-5 control-label">年龄:</label>
        <div class="col-md-3">
            <input type="text" class="form-control" id="age" name="age"  placeholder="请输入年龄">
        </div>
    </div>

    <div class="form-group">
        <label for="address" class="col-md-5 control-label">籍贯:</label>
        <div class="col-md-3">
            <select class="form-control" id="address" name="address">
                <option>成都</option>
                <option>重庆</option>
                <option>长沙</option>
                <option>武汉</option>
                <option>南京</option>
            </select>
        </div>
    </div>
    <div class="form-group">
        <label for="qq" class="col-md-5 control-label">QQ：</label>
        <div class="col-md-3">
            <input type="text" class="form-control" id="qq" name="qq" placeholder="请输入QQ号码">
        </div>
    </div>
    <div class="form-group">
        <label for="inputEmail3" class="col-md-5 control-label">Email:</label>
        <div class="col-md-3">
            <input type="email" class="form-control" id="inputEmail3" name="email" placeholder="请输入邮箱地址">
        </div>
    </div>
    <div class="form-group">
        <div class="col-md-offset-5 col-md-3">
            <button type="submit" class="btn btn-primary">提交</button>
            <a class="btn btn-default" href="/pages/add.jsp" role="button">重置</a>
            <a class="btn btn-default" href="${pageContext.request.contextPath}/user/findAll" role="button">返回</a>
        </div>
    </div>
</form>


</body>
<script>
    <%--设置表格中所有内容居中 --%>
    $("td,th").addClass("text-center");
</script>
</html>
