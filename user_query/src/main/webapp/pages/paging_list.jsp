
<%@ page contentType="text/html;charset=UTF-8" language="java" buffer="16kb" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
<%--<%@ include file="" %>--%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>分页列表</title>
    <!--  css外部文件资源引入  -->
    <link href="/css/bootstrap.min.css" rel="stylesheet" >
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="/js/jquery-3.2.1.min.js" ></script>
    <script src="/js/bootstrap.min.js" ></script>
    <!-- 自定义内部css样式-->
    <style>
        div{
            text-align: center;
        }
    </style>
</head>
<body>
<br><br><br>
<div class="container">
    <h3>分页列表用户信息</h3>
    <form class="form-inline" action="${pageContext.request.contextPath}/user/findByNameAndAddressAndEmail">
        <spon style="float:left;">
        <label for="name">姓名</label>
        <input type="text" class="form-control" id="name" name="name">
        <label for="address">籍贯</label>
        <input type="text" class="form-control" id="address" name="address">
        <label for="email">邮箱</label>
        <input type="email" class="form-control" id="email" name="email" >
        <button type="submit" class="btn btn-default">查询</button>
        </spon>
        <spon style="float: right">
        <a class="btn btn-primary" href="/pages/add.jsp" role="button" >添加联系人</a>
        <a class="btn btn-primary" href="javascript:void(0);" id="a" role="button" >删除选中</a>
        </spon>
    </form>
    <br><br>
    <form id="form" action="${pageContext.request.contextPath}/user/deleteSelect" method="get">
    <table  border="1" class="table table-bordered table-hover" >
        <tr class="success" >
            <th><input type="checkbox" id="first"></th>
            <th>编号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>籍贯</th>
            <th>QQ</th>
            <th>邮箱</th>
            <th>操作</th>
        </tr>
        <%-- 动态获取表格参数--%>
        <c:forEach items="${requestScope.userList}" var="user" varStatus="s">
            <tr>
               <td><input type="checkbox"   name="uid" value="${user.id}"></td>
               <td>${s.count}</td> <!--始终保证列表从1开始 -->
               <td>${user.name}</td>
               <td>${user.sex}</td>
               <td>${user.age}</td>
               <td>${user.address}</td>
               <td>${user.qq}</td>
               <td>${user.email}</td>
               <td>
                   <a class="btn btn-default btn-sm"
                      href="${pageContext.request.contextPath}/user/find?id=${user.id}">
                       修改</a>&nbsp;
                   <a href="javascript:void(0);del(${user.id});"
                      class="btn btn-default btn-sm">删除</a>
               </td>
           </tr>
        </c:forEach>

    </form>
    </table>
    <nav aria-label="Page navigation"  style="float: left">
        <ul class="pagination">
            <li>
                <%-- 动态获取上一页--%>
                <a href="${pageContext.request.contextPath}/user/findUserByPage?currentPage=${requestScope.pageInfo.prePage}" aria-label="Previous">
                <span aria-hidden="true">&laquo;</span>
                </a>
            </li>
                <%-- 动态获取分页条--%>
                <c:forEach begin="1" end="${requestScope.pageInfo.pages}" var="i" step="1">
                    <li><a href="${pageContext.request.contextPath}/user/findUserByPage?currentPage=${i}">${i}</a></li>
                </c:forEach>
            <li>
                <%-- 动态获取下一页--%>
                <a href="${pageContext.request.contextPath}/user/findUserByPage?currentPage=${requestScope.pageInfo.nextPage}" aria-label="Next">
                <span aria-hidden="true">&raquo;</span>
                </a>
            </li>
            <li style="margin: 15px;font-size: 20px">
                共${requestScope.pageInfo.total}条记录,
                共${requestScope.pageInfo.pages}页
            </li>
        </ul>
    </nav>

</div>
<script>
    $("td,th").addClass("text-center");
    function del(id) {
        if (confirm("确定要删除吗！")){
            location.href="${pageContext.request.contextPath}/user/delete?id="+id;
        }
    }
    window.onload=function(){
            let flag=true; //定义一个标记思想
            //判断是否有选中条目
            let uids = document.getElementsByName("uid"); //根据Name属性值获取元素对象们，返回值是一个数组
            for (let i = 0; i < uids.length; i++) {
                if (uids[i].checked){
                    flag=false;
                    break;
                }
            }
            if (flag){ //有条目被选中
                //给删除按钮添加单击事件
                document.getElementById("a").onclick = function () {
                    document.getElementById("form").submit(); //提交表单
                }
            }


    }
    //实现复选框的全选
    document.getElementById("first").onclick=function () {
        let uids = document.getElementsByName("uid"); //根据Name属性值获取元素对象们，返回值是一个数组
        for (let i = 0; i < uids.length; i++) {
            uids[i].checked=this.checked;
        }
    }

</script>
</body>
</html>
