<%@ page contentType="text/html;charset=UTF-8" language="java" buffer="16kb" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ include file="" %>--%>
<html>
<head>
    <title>修改联系人</title>
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
<h3>修改联系人</h3>
<br>
<form class="form-horizontal container" action="${pageContext.request.contextPath}/user/update" method="post">
    <input type="hidden" name="id" value="${requestScope.User.id}"> <!--隐藏域-->
    <div class="form-group">
        <label for="name" class="col-md-5 control-label">姓名:</label>
        <div class="col-md-3">
            <input type="text" class="form-control" id="name" name="name"  value="${requestScope.User.name}" >
        </div>
    </div>
    <div class="form-group">
        <div class="col-md-offset-5 col-md-3">
            性别：
            <c:if test="${requestScope.User.sex.contains('男')}">
                <input type="radio" name="sex"  value="男" checked>男
                <input type="radio" name="sex"  value="女" >女
            </c:if>
            <c:if test="${requestScope.User.sex.contains('女')}">
                <input type="radio" name="sex"  value="男" >男
                <input type="radio" name="sex"  value="女" checked>女
            </c:if>

        </div>
    </div>
    <div class="form-group">
        <label for="age" class="col-md-5 control-label">年龄:</label>
        <div class="col-md-3">
            <input type="text" class="form-control" id="age" name="age" value="${requestScope.User.age}" >
        </div>
    </div>

    <div class="form-group">
        <label for="address" class="col-md-5 control-label">籍贯:</label>
        <div class="col-md-3">
            <select class="form-control" id="address" name="address" >
                <c:if test="${requestScope.User.address.contains('成都')}">
                    <option value="成都" selected>成都</option>
                    <option value="重庆" >重庆</option>
                    <option value="长沙">长沙</option>
                    <option value="武汉">武汉</option>
                    <option value="南京">南京</option>
                </c:if>
                <c:if test="${requestScope.User.address.contains('重庆')}">
                    <option value="成都" >成都</option>
                    <option value="重庆" selected>重庆</option>
                    <option value="长沙">长沙</option>
                    <option value="武汉">武汉</option>
                    <option value="南京">南京</option>
                </c:if>
                <c:if test="${requestScope.User.address.contains('成都')}">
                    <option value="成都" selected>成都</option>
                    <option value="重庆" >重庆</option>
                    <option value="长沙">长沙</option>
                    <option value="武汉">武汉</option>
                    <option value="南京">南京</option>
                </c:if>
                <c:if test="${requestScope.User.address.contains('长沙')}">
                    <option value="成都" >成都</option>
                    <option value="重庆" >重庆</option>
                    <option value="长沙" selected>长沙</option>
                    <option value="武汉">武汉</option>
                    <option value="南京">南京</option>
                </c:if>
                <c:if test="${requestScope.User.address.contains('武汉')}">
                    <option value="成都" >成都</option>
                    <option value="重庆" >重庆</option>
                    <option value="长沙">长沙</option>
                    <option value="武汉" selected>武汉</option>
                    <option value="南京">南京</option>
                </c:if>
                <c:if test="${requestScope.User.address.contains('南京')}">
                    <option value="成都" >成都</option>
                    <option value="重庆" >重庆</option>
                    <option value="长沙">长沙</option>
                    <option value="武汉" >武汉</option>
                    <option value="南京" selected>南京</option>
                </c:if>


            </select>
        </div>
    </div>
    <div class="form-group">
        <label for="qq" class="col-md-5 control-label">QQ：</label>
        <div class="col-md-3">
            <input type="text" class="form-control" id="qq" name="qq" value="${requestScope.User.qq}" >

        </div>
    </div>
    <div class="form-group">
        <label for="inputEmail3" class="col-md-5 control-label">Email:</label>
        <div class="col-md-3">
            <input type="email" class="form-control" id="inputEmail3" name="email" value="${requestScope.User.email}" >
        </div>
    </div>
    <div class="form-group">
        <div class="col-md-offset-5 col-md-3">
            <button type="submit" class="btn btn-primary">提交</button>
            <a class="btn btn-default" href="/pages/update.jsp" role="button">重置</a>
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
