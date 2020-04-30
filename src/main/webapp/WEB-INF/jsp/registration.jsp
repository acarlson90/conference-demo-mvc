<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="registrationForm" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="springTags" uri="http://www.springframework.org/tags" %>

<html lang="en">
<head>
    <title>Registration</title>
    <style>
        .error {
            color: #ff0000;
        }
        .errorblock {
            color: #000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body>
    <h1>Registration</h1>
    <registrationForm:form modelAttribute="registration">
        <registrationForm:errors path="*" cssClass="errorblock" element="div" />
        <table>
            <tr>
                <td>
                    <springTags:message code="name"/>:
                </td>
                <td>
                    <registrationForm:input path="name" />
                </td>
                <td>
                    <registrationForm:errors path="name" cssClass="error" />
                </td>
            </tr>
            <tr>
                <td colspan="3">
                    <input type="submit" value="Add Registration">
                </td>
            </tr>
        </table>
    </registrationForm:form>
</body>
</html>
