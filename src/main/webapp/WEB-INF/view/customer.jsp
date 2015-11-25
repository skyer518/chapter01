<%@ page pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="cn">
<head>
    <meta charset="UTF-8">
    <title>Customer</title>
</head>
<body>
<h1>客户列表</h1>
<table>
    <tr>
        <td>客户名称</td>
        <td>联系人</td>
        <td>电话号码</td>
        <td>邮箱</td>
        <td>操作</td>
    </tr>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td>${customer.name}</td>
            <td>${customer.contact}</td>
            <td>${customer.telephone}</td>
            <td>${customer.email}</td>
            <td>
                <a href="${BASE}/customer_show?id=${customer.id}">详细</a><a href=""></a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
