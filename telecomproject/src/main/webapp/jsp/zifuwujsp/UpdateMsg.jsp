<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>修改个人信息</h1>
		<table>
			<tr>
				<td>真实姓名</td>
				<td>性别</td>
				<td>身份证号码</td>
				<td>账务账号</td>
				<td>密码</td>
				<td>联系方式</td>
				<td>通信地址</td>
				<td>邮编</td>
				<td>QQ</td>
			</tr>
			<tr>
				<td><lable class="name"></lable></td>
				<td><lable class="gender"></lable></td>
				<td><lable class="id"></lable></td>
				<td><lable class="accountNum"></lable></td>
				<td><lable class="pwd"></lable></td>
				<td><lable class="phoneNum"></lable></td>
				<td><lable class="address"></lable></td>
				<td><lable class="postal"></lable></td>
				<td><lable class="qq"></lable></td>
				
			</tr>
			
		</table>
	</div>
	<script>
	$.ajax({
		type:"get",
		url:"/telecomproject/QuyuSelectAllServlet",
		async:true,
		data:{"page":page,"row":row},
		success:function(message){
			//将获取到message字符串转化为json对象
			var jsonObj = JSON.parse(message);
			console.info(jsonObj);
			/* alert(); */
			//用js来处理结果，显示数据，局部刷新
			var s = "";
			for(var i=0;i<jsonObj.data.length;i++){
				s+="<tr><td>"+jsonObj.data[i].qname+"</td><td>"+jsonObj.data[i].linzhong+
				"</td><td>"+jsonObj.data[i].dilei+"</td><td>"+jsonObj.data[i].shuzhong+
				"</td><td>"+jsonObj.data[i].xname+"</td></tr>"
			}
		}
	</script>
</body>
</html>