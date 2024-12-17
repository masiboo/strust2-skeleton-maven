<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Registration Form</title>
</head>
<body>
    <h2>Registration Form</h2>
    <s:form action="register" method="post">
        <s:textfield name="name" label="Name" />
        <s:textfield name="email" label="Email" />
        <s:password name="password" label="Password" />
        <s:submit value="Register" />
    </s:form>
</body>
</html>
