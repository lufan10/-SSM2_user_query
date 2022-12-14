
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" buffer="16kb" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ include file="" %>--%>


<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>登录</title>
  <!--  css外部文件资源引入  -->
  <link href="css/bootstrap.min.css" rel="stylesheet" >
  <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
  <script src="js/jquery-3.2.1.min.js" ></script>
  <script src="js/bootstrap.min.js" ></script>
  <!-- 自定义内部css样式-->
  <style>
    h3{
      text-align: center;
    }
    h4{
      text-align: center;
      color: #ff8c00;
    }
  </style>
</head>
<body>
<br><br><br><br>
<h3>用户登录</h3>
<br>
<div class="form-group">
  <form class="form-horizontal container" action="${pageContext.request.contextPath}/user/login" method="post">
    <div class="form-group">
      <label for="username" class="col-md-5 control-label">姓名:</label>
      <div class="col-md-3">
        <input type="text" class="form-control" id="username" name="username" placeholder="请输入姓名">
      </div>
    </div>
    <div class="form-group">
      <label for="inputPassword2" class="col-md-5 control-label">密码：</label>
      <div class="col-md-3">
        <input type="password" class="form-control" id="inputPassword2" name="password" placeholder="请输入密码">
      </div>
    </div>
    <div class="form-group">
      <label for="security" class="col-md-5 control-label">验证码</label>
      <div class="col-md-2">
        <input type="text" class="form-control" id="security" name="security" placeholder="请输入验证码">
      </div>
      <div class="col-md-0">
        <img id="switch" src="${pageContext.request.contextPath}/user/checkCode" alt="">
      </div>
      <div class="col-md-5">

      </div>
    </div>
    <div class="form-group">
      <div class="col-md-offset-5 col-md-3 ">
        <button type="submit" class="btn btn-primary">登录</button>
      </div>
    </div>
  </form>
  <%-- 提示信息 --%>
  <h4>${requestScope.msg}</h4>
  <h4>${requestScope.login_msg}</h4>




</div>
<script>
  //加载窗口页面
  window.onload=function () {
    //获取图片对象
    let img = document.getElementById("switch");
    //绑定单击事件
    img.onclick=function () {
      //加时间戳
      let date = new Date().getTime();
      img.src="${pageContext.request.contextPath}/checkCode?"+date;

    }
  }

</script>
</body>
</html>
