<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<body>
    <s:form action="login" method="POST">
        <s:textfield name="username" label="用户名"></s:textfield>
        <s:textfield name="password" label="密码"></s:textfield>
        <s:submit value="提交"></s:submit>
    </s:form>

</body>
</html>
