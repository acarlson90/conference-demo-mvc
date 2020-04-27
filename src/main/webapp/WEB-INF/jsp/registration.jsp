<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="registrationForm" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
    <title>Registration</title>
</head>
<body>
    <h1>Registration</h1>
    <registrationForm:form modelAttribute="registration">
        <table>
            <tr>
                <td>
                    Name:
                </td>
                <td>
                    <registrationForm:input path="name" />
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Add Registration">
                </td>
            </tr>
        </table>
    </registrationForm:form>
</body>
</html>
